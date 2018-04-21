package uibk.dsl.assignment5
import java.nio.channels.SelectableChannel;

class SQLStatement{

	static String ALL = '*';
	static String SELECT = 'SELECT'
	static String FROM = 'FROM'
	static String WHERE = 'WHERE'
}

class SelectStatement extends SQLStatement {
	
	def field
	
	def table, expression

	def printStatement() { println "$SELECT $field $FROM $table $WHERE $expression"}
}

def select(name) {
	name == 'all records' ? name = SQLStatement.ALL : name
	[from : {
		table -> new SelectStatement(field: name, table: table).printStatement();
	}]
	
}

select 'all records' from "MyTable"
select 'name' from 'newTable'
