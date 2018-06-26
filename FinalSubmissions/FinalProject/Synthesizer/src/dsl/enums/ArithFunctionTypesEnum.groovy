import dsl.Operation

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

	public static boolean isValidArithFunctionType(Operation op){
		boolean found = false;
		ArithFunctionTypes.values().each { ct ->
			if (ct.name == op.name){
				found = true;
			}
		}
		return found;
	}
	
	public static List getEnumNames(){
		List<String> allNames = new ArrayList<String>()
		ArithFunctionTypes.values().each{ ct ->
			allNames.add(ct.name)
		}
		allNames
	}
}
