package dsl.enums

import java.util.List;

public enum FilterTypes {
	LINEAR_RAMP("LinearRamp"),
	HIGH_PASS("FilterHighPass"),
	LOW_PASS("FilterLowPass")
	
	String name

	private FilterTypes(String name) {
		this.name = name
	}	
	
	/*
	 * Static utility methods
	 * are needed for the transformation scripts
	 */
	public static String printAllControlTypeNames(){
		def StringBuilder allNames = new StringBuilder()
		FilterTypes.values().each{ ct ->
			allNames.append(ct.name + ", ")
		}
		allNames
	}

	public static boolean isValidControlType(String name){
		def found = false
		FilterTypes.values().each { ct ->
			if (ct.name == name){
				found = true
			}
		}
		found
	}
	
	public static List getEnumNames(){
		List<String> allNames = new ArrayList<String>()
		FilterTypes.values().each{ ct ->
			allNames.add(ct.name)
		}
		allNames
	}
}
