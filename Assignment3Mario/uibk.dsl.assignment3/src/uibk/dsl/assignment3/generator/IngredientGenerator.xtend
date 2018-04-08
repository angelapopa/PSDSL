package uibk.dsl.assignment3.generator

import uibk.dsl.assignment3.game.Attribute
import org.eclipse.emf.common.util.EList

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
  	
  	def String getFormattedName(String name){
		if (name.contains("_")){
			return name.split("_").map[toFirstUpper].join();
		}
		return name.toFirstUpper;
	}
	
	def String getAttributeType(String attrValue){
		try {
			Integer.parseInt(attrValue);
			return "int";
		} catch (NumberFormatException ex){
			return "String";
		}
	}
	
	def String getFormattedParameter(Attribute attr){
		return "".concat(getAttributeType(attr.value)).concat(" ").concat(attr.name);
	}
	
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
}