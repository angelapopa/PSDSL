package dslengineering
//simple object literal
def user = [
	first: "The other",
	last: "Hofer",
	// here we don't have access to "this"
	printName: { user -> println "${user.first} ${user.last}"}
]

//print it
user.printName(user)

//but its ugly since we don't have access to "this" in the object literal
// -> Expando class to the rescue!

def userExpando = new Expando(
		first: "The other",
		last: "Hofer",
		// here we have access to "this"
		printName: { -> println "Expando: ${first} ${last}"}
		)
//thats better
userExpando.printName()


/**
 * Object literals for DSLs
 *
 */
//In order to achieve this syntax without dots and parenthesis:
// hide 2000 IN "Panama"
class MyInvestment{
	def money, country
	def printInvestment() { println "Hiding $money in $country"}
}

def hide(money){
	// this is last line in method invest() so it will be returned
	// return an object literal with the method "IN"
	[IN : { 	 // country is the paremeter
			country ->
			//it returns a new investment
			new MyInvestment(money: money, country: country)
		}]
}


def investment = hide 2000 IN "Panama"

investment.printInvestment()







