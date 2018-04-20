package dslengineering

/**
 * dslengineering.Closures & Currying
 *
 * dslengineering.Closures are (anonymous) codeBlock that can be passed as parameters
 *
 * Currying refers to partly applying a codeBlocktion. Basicaly you party bind a parameter of a closure to
 * a specific parameter. You are actually creating a configurable codeBlocktion.
 */

def printSum = { a, b -> println a + b }
println "Type of printSum ${printSum.class.name}"

printSum(5, 7)




//closure as last parameter == syntactical niceness
def filterList(list, closure){
	def returnList = []

	//iterate over list
	list.each{
		// the closure must return something that evaluates to boolean (boolean, string, integrater, ...)
		if(closure(it)){
			returnList += it
		}
	}

	//return the list
	returnList
}

def mixedList = [1, 7, 8, 10]
def unevenList = filterList (mixedList) {a -> a%2 != 0}

println "the uneven list: $unevenList"
println ""
/**
 * Currying aka partial execution
 */

def nCopies = { int n, String str -> str*n }
def twice = nCopies.curry(2)

println twice("bla")












