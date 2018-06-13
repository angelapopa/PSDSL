package dsl.enums;

enum ArithFunctionTypes {
	ADD("Addition"),
	SUB("Substract"),
	MUL("Multiply"),
	DIV("Division");
	
	String name;

	ArithFunctionTypes(String name) {
		this.name = name;
	}
	
}
