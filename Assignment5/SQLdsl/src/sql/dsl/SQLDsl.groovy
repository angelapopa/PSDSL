/* This is groupwork of Nga Pham, Angela Popa */
package sql.dsl
import java.nio.channels.SelectableChannel;

class SQLStatement3{

	static String ALL = '*';
	static String SELECT = 'SELECT'
	static String FROM = 'FROM'
	static String WHERE = 'WHERE'
	
	static operations = ['is greater than' : '>', 'is smaller than': '<', 'is greater equal than' : '>=', 'is smaller equal than': '<=','equals': '=']
	static logical_op = ['and', 'or']
}

class SelectStatement3 extends SQLStatement3 {
	
	def field
	
	def table
	
	def expression

	def printStatement() {
		replaceName(field)
		expression = replace(expression)
		println "$SELECT $field $FROM $table $WHERE $expression"
	}
	
	def replaceName(String name) {
		name == 'all records' ? field = SQLStatement3.ALL : name
	}
	
	def replace(String userExpression) {
		// Replace user-defined operation with corresponding symbol
		operations.each { key, operation ->
			if (userExpression.contains(key)){
				userExpression = userExpression.replace(key, operation)
				
				if (operation == '=') {  // strings need to be wrapped around ''
					String[] parts = userExpression.split(operation)
					userExpression = parts[0].concat(operation).concat(" ").concat(convertToString(parts[1]))
				}
			}
		}
		// Uppercase logical operations
		logical_op.each { op ->
			if (userExpression.contains(op)) {
				String[] sub_expr = userExpression.split(op)
				userExpression = userExpression.replace(op, op.toUpperCase())
			}
		}
		return userExpression;
	}
	
	// Add single quotation mark to literal string
	def convertToString(String stringToConvert){
		if (isInteger(stringToConvert) || isBoolean(stringToConvert)){
			return stringToConvert.trim()
		}
		return "'".concat(stringToConvert.trim()).concat("'")
	}
	
	def isBoolean(String s){
		try{
			Boolean.parseBoolean(s.trim())
		}catch (NumberFormatException ex){
			return false
		}
		return true
	}
	
	def isInteger(String s){
		try{
			Integer.parseInt(s.trim())
		}catch (NumberFormatException ex){
			return false
		}
		return true
	}
}

def select(name) {
	
	[from : {
		table ->
		[ where: { condition ->
			new SelectStatement3(field: name, table: table, expression: condition).printStatement();
		}]
	}]
	
}

select 'all records' from "MyTable" where "x is greater than 1"
select 'all records' from "MyTable" where "y equals true"

select 'name' from 'newTable' where 'name equals John'

select 'name' from 'newTable' where 'name equals John and firstname = Smith or x is smaller than 3'
select 'name' from 'newTable' where 'name = John or firstname = Smith'