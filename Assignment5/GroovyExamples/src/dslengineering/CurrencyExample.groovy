package dslengineering

// Enums to hold literals for banks and tax havens
enum TaxHaven { Panama, Switzerland, Lichtenstein, CaymanIslands }
enum Bank { RipOffTrust, KHGInternational }

// Import enum values as constants.
import static TaxHaven.*
import static Bank.*

// Class to hold investment data
class Investment {
	TaxHaven taxHaven
	Bank client
	Currency value
}

// Meta programming to to enable simple usage of $ and €
Number.metaClass.get$ = { -> new USD(delegate) }
Number.metaClass.'get€' = { -> new Euro(delegate) }




//script local list of investments
investments = []

def invest(money) {

	//Object literals, common in, e.g. JavaScript
	['IN': { TaxHaven haven ->
			//return another object literal
			['AT': { Bank client ->
					// return nothing. just add the new investment to the list of investments
					investments << new Investment(taxHaven: haven, client: client, value: money)
				}
			]

		}]
}

// -----------------------------------
// Using the DSL
// -----------------------------------

/*
 * Using the static imports in the DSL 
 */
invest 20000.$ IN Switzerland AT KHGInternational
invest 43403.$ IN Switzerland AT RipOffTrust
def x = invest 2000.$ 


def printTotal() {
	print "Total dslengineering.Investment into Taxhavens: "
	investments.sum { it.value}.getPrintValue()

	println "\nYOU ARE A STAR!"
}

printTotal()














