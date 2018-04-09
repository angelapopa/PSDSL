package uibk.dsl.assignment3.generator

import uibk.dsl.assignment3.game.Attribute
import org.eclipse.emf.common.util.EList
import java.util.Map

class IngredientGenerator {
	
	val String generatedPackageNamePath;
	val String generatedPackageNamePathDecl;
	
	new(String packageName) {
		this.generatedPackageNamePath = packageName.replace(".", "/").toLowerCase;
    	this.generatedPackageNamePathDecl = packageName.toLowerCase;
  	}
  	
  	def String getGeneratedPackageNamePath(){
  		return this.generatedPackageNamePath;
  	}
  	
  	def String getGeneratedPackageNamePathDecl(){
  		return this.generatedPackageNamePathDecl;
  	}
  	
  	/*
  	 * useful_object turns into UsefulObject
  	 * 
  	 */
  	def String getFormattedName(String name){
		if (name.contains("_")){
			return name.split("_").map[toFirstUpper].join();
		}
		return name.toFirstUpper;
	}
	
	/*
	 * pick up turns into pickup
	 */
  	def String getPlainName(String name){
		if (name.contains("_")){
			return name.split("_").map[toLowerCase].join();
		}
		if (name.contains(" ")){
			return name.split(" ").map[toLowerCase].join();
		}
		return name.toLowerCase;
	}
	
	/*
	 * integer type returns the literal 'int'
	 */
	def String getAttributeType(String attrValue){
		try {
			Integer.parseInt(attrValue);
			return "int";
		} catch (NumberFormatException ex){
			return "String";
		}
	}
	
	/*
	 * returns 'int healthPoints' or 'String description'
	 */
	def String getFormattedParameter(Attribute attr){
		return "".concat(getAttributeType(attr.value)).concat(" ").concat(attr.name);
	}
	
	/*
	 * returns 'int healthPoints, String description'
	 */
	def String getFormattedParameterList(EList<Attribute> attributes){
		var String niceParams = "";
		
		if (attributes.size > 0){
			niceParams = niceParams.concat(getFormattedParameter(attributes.get(0)));
		}
		
		var k = 1;
		while (k <= attributes.size - 1){
			niceParams = niceParams.concat(", ").concat(getFormattedParameter(attributes.get(k)));
			k = k+1;
		}
		return niceParams;
	}
	
		/*
	 * returns 'int healthPoints, String description'
	 */
	def String getFormattedParameterList(Map<String, String> attributes){
		var String niceParams = "";
		
		if (attributes.size > 0){
			niceParams = niceParams.concat(attributes.entrySet.get(0).value).concat(" ").concat(attributes.entrySet.get(0).key);
		}
		
		var k = 1;
		while (k <= attributes.size - 1){
			niceParams = niceParams.concat(", ").concat(attributes.entrySet.get(k).value).concat(" ").concat(attributes.entrySet.get(k).key);
			k = k+1;
		}
		return niceParams;
	}
}