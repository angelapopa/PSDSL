//package dsl.enums causes problems for the transformation groovy script

enum ArithFunctionTypes {
	ADD("Addition"),
	SUB("Subtraction"),
	MUL("Multiplication"),
	DIV("Division");
	
	String name;

	ArithFunctionTypes(String name) {
		this.name = name;
	}
	
	/*
	 * Static utility methods
	 * are needed for the transformation scripts
	 */
	public static String printAllArithFunctionTypeNames(){
		def StringBuilder allNames = new StringBuilder()
		ArithFunctionTypes.values().each{ ct ->
			allNames.append(ct.name + ", ")
		}
		allNames
	}

	public static boolean isValidArithFunctionType(String name){
		boolean found = false;
		ArithFunctionTypes.values().each { ct ->
			if (ct.name == name){
				found = true;
			}
		}
		return found;
	}
}
