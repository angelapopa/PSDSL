package sql.dsl
import java.nio.channels.SelectableChannel;

class SQLStatement3{

	static String ALL = '*';
	static String SELECT = 'SELECT'
	static String FROM = 'FROM'
	static String WHERE = 'WHERE'
	
	static operations = ['is greater than' : '>', 'is smaller than': '<', 'equals': '=']
	static logical_op = ['and', 'or']
}

class SelectStatement3 extends SQLStatement3 {
	
	def field
	
	def table
	
	def expression

	def printStatement() {
		def newExpression = replace(expression)
		println "$SELECT $field $FROM $table $WHERE $newExpression"
	}
	
	def replace(String userExpression) {
		operations.each { key, operation ->
			if (userExpression.contains(key)){
				userExpression = userExpression.replace(key, operation)
				if (operation == '=') {  // handle int and strings differently
					String[] parts = userExpression.split(operation)
					userExpression = parts[0].concat(operation).concat(" ").concat(convertToString(parts[1]))
				}
			}
		}
		logical_op.each { op ->
			if (userExpression.contains(op)) {
				String[] sub_expr = expression.split(op)
				userExpression = userExpression.replace(op, op.toUpperCase())
			}
		}
		return userExpression;
	}
	
	def convertToString(String stringToConvert){
		try{
			return Integer.parseInt(stringToConvert.trim()).toString()
		}catch (NumberFormatException ex){
			return "'".concat(stringToConvert.trim()).concat("'")
		}
	}
}

def select(name) {
	name == 'all records' ? name = SQLStatement3.ALL : name
	[from : {
		table ->
		[ where: { condition ->
			new SelectStatement3(field: name, table: table, expression: condition).printStatement();
		}]
	}]
	
}

select 'all records' from "MyTable" where "name is greater than 1"
select 'name' from 'newTable' where 'name equals John'
//select 'name' from 'newTable' where 'name = John' and 'firstname = Smith'

select 'name' from 'newTable' where 'name = John and firstname = Smith or x > 3'
select 'name' from 'newTable' where 'name = John or firstname = Smith'