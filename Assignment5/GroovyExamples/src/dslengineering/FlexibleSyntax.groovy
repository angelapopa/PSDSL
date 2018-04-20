package dslengineering
// optional parenthesis for single param method invocation
println("optional")
println "optional"

//optional parenthesis for no param method invocation prefixed with "get"
def getDoIt() {println "doIt"}
doIt

//What can we use this for?
// reduction of syntactic noise, for example when working with currencies

class UsDollar{
	def value
	UsDollar(val){
		value = val
	}
}



//Optional parentheses (via getter)
Integer.metaClass.getDollar = { -> new UsDollar(delegate) }

println 12.dollar
println 12.getDollar()
println 12.dollar() //brrzzzzzzz doesn't work



























