package org.example.xtend.examples;

import java.util.List
import java.util.ArrayList
import java.util.Collections

class ExtensionMethods {
	def myListMethod(List<?> list) {
		// some implementation
		var someThing = Collections.emptyList
	}
	
	def m(){
		val list = new ArrayList<String>
		list.myListMethod
	}
}
