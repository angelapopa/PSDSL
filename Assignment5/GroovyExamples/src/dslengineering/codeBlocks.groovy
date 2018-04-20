package dslengineering
;
//Example from http://docs.groovy-lang.org/docs/latest/html/documentation/core-domain-specific-languages.html#_command_chains

def calculate = { println it } // <- code block
def square_root = { Math.sqrt(it) } // <- code block
def square = { it * it } // <- code block

def please(action) {
	[the: { operation ->
			[of: { number -> action(operation(number)) }]
		}]
}

// equivalent to: please(show).the(square_root).of(100)
please calculate the square_root of 100

please calculate the square of 100