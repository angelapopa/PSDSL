package dslengineering
/**
 * An example showing operator overloading, the "pimp my library"  pattern,
 * and using implicit getters to get rid of the () as syntactic noise.
 *
 * @author Matthias Farwick
 *
 */
abstract class  Currency{
	//currency prefix
	def prefix

	//value
	double value

	Currency(Double value){
		this.value = value
	}

	
	def getPrintValue(){
		print "${prefix}$value"
	}

	//shorthand notations
	static $(val){
		new USD(val)
	}

	static '€'(val){
		new Euro(val)
	}
}

// dslengineering.USD implementation
class USD extends Currency{

	USD(Double value){
		super(value)
		prefix = "\$"
	}

	/***************************
	 * Operator overloading of "+" 
	 **************************/
	def plus(Currency other){
		if(other instanceof Euro)
			value = value + (other.value * 1.13)
		else
			value = value + other.value

		return this
	}
}

class Euro extends Currency{
	Euro(Double value){
		super(value)
		prefix = "€"
	}


	/***************************
	 * Operator overloading of "+" 
	 **************************/
	def plus(Currency other){
		if(other instanceof USD)
			value = value + (other.value * 0.87)
		else
			value = value +  other.value

		return this
	}
}

// A class to add currency features to numbers
class CurrencyPimping{

	//this way the $ can be called with $()
	static def $(Number self){
		new USD(self)
	}
	static def '€'(Number self){
		new Euro(self)
	}

	//by using the getter we can remove the 12.$() to 12.$
	static def get$(Number self){
		new USD(self)
	}


	static def 'get€'(Number self){
		new Euro(self)
	}

}

//Technique 4

//Lets use it the Category

use(CurrencyPimping){
	def usdUgly = 11.$()
	def euroUgly = 11.'€'()


	/**
	 * Usage of overloaded operator
	 */
	def usd = 12.$ + 12.$
	println usd.dump()

	def euro = 12.€ + 12.$

	println euro.dump()

	def usdNoParenthesis = Currency.$ 12
	println usdNoParenthesis.dump()
}




