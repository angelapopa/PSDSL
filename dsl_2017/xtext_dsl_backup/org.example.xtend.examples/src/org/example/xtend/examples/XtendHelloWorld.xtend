package org.example.xtend.examples

class XtendHelloWorld {
	def static void main(String[] args) {
		println("Hello World")
		
		
		val test = "my string".toFirstUpper
		val same = StringExtensions.toFirstUpper("my string")
		
		println(test)
		println(same)
	}	
}