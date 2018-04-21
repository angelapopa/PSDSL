package sql.dsl;

import java.nio.channels.SelectableChannel;

class SQLStatement{

	def ALL = '*';
	
	def SELECT = 'SELECT';
	
	
	def SQLDsl(value){
		return value;
	}
	
	def select(String value){
		return value == null ? new SelectStatement(ALL) : new SelectStatement(value);
	}
	
}

class SelectStatement{
	
	def selectSt;
	
	def table;
	
	def SelectStatement(String value){
		this.selectSt = value;
	}
	
	def from(table){
		this.table = table;
		return this
	}
	
	def printSelectStatement() {println "Select $selectSt from $table"}
}


def result = new SQLStatement().select().from('MyTable')
result.printSelectStatement()

//def result2 = new SQLStatement().select from 'MyTable'

