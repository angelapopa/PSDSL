# PSDSL
Assignment 5 - SQL DSL

This is groupwork of Nga Pham and Angela Popa.

Level: assignment 5

# The Grammar Definition in Groovy

```
class SQLStatement{

	static String ALL = '*';
	static String SELECT = 'SELECT'
	static String FROM = 'FROM'
	static String WHERE = 'WHERE'

	static operations = ['is greater than' : '>', 'is smaller than': '<', 'is greater equal than' : '>=',
		'is smaller equal than': '<=','equals': '=', 'is unequal': '<>']
	static logical_op = ['and', 'or']
}

class SelectStatement extends SQLStatement {

	def field
	def table
	def expression

	def printStatement() {...}

def select(name) {

	[from : {
		table ->
		[ where: { condition ->
			new SelectStatement(field: name, table: table, expression: condition).printStatement();
		}]
	}]
}
```


# The Grammar usage
```
select 'all records' from "MyTable" where "x is greater than 1"
select 'all records' from "MyTable" where "x is greater equal than 1"
select 'all records' from "MyTable" where "x is unequal 1"
select 'all records' from "MyTable" where "y equals true"

select 'name' from 'newTable' where 'name equals John'

select 'name' from 'newTable' where 'name equals John and firstname equals Smith or x is smaller than 3'
select 'name' from 'newTable' where 'name equals John or firstname equals Smith'

```

# The Output
```
SELECT * FROM MyTable WHERE x > 1
SELECT * FROM MyTable WHERE x >= 1
SELECT * FROM MyTable WHERE x <> 1
SELECT * FROM MyTable WHERE y = true
SELECT name FROM newTable WHERE name = 'John'
SELECT name FROM newTable WHERE name = 'John' AND firstname = 'Smith' OR x < 3
SELECT name FROM newTable WHERE name = 'John' OR firstname = 'Smith'
```

# Improvement ideas:
1. A more userfriendly grammar, e.g.

* instead of
`select 'all records' from "MyTable" where "x is greater than 1"`

* maybe
`from 'MyTable' get 'name equals John'`
or `from 'MyTable' get all 'name equals John'`

2. Separate the print functionality from the grammar definition

3. Building up an AST like tree for the expression part of the SQL statement

* for converting the literals, it should work if the tree is traversed
and at every right hand side of the `=` node, the corresponding literal is wrapped around `''` if it is a string

* for the resulting expression output, traverse the whole tree
and print all nodes in left right order
