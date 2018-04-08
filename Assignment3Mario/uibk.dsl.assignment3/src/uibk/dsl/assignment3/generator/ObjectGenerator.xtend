package uibk.dsl.assignment3.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.List
import uibk.dsl.assignment3.game.Object
import uibk.dsl.assignment3.game.Attribute
import org.eclipse.emf.common.util.EList
import java.util.HashSet
import java.util.Set

class ObjectGenerator {
	val generatedObjectPackageName = "objects";
	val String generatedPackageNamePath;
	val String generatedPackageNamePathDecl;
	
	new(String generatedPackageNamePath) {
		this.generatedPackageNamePath = generatedPackageNamePath;
    	this.generatedPackageNamePathDecl = generatedPackageNamePath.replace("/", ".");
  	}
		
	def generateObjects(List<Object> objects, IFileSystemAccess2 fsa) {
		generateAllObjects(objects, fsa);
	}
	
	def generateAllObjects(List<Object> objects, IFileSystemAccess2 fsa){
		
		val Set<Object> superClassObjects = new HashSet();
		
		//calculate all super type objects, they will be generated as interfaces
		for (o : objects){
			if (o.superType !== null){
				superClassObjects.add(o.superType);
			}
		}
		
		//generate all objects
		for (o : objects){
			fsa.generateFile(generatedPackageNamePath + "/" + generatedObjectPackageName + "/" 
				+ getFormattedName(o.name) + ".java", compile(o, superClassObjects.contains(o))
			);
		}
	
	}
	
	def String getFormattedName(String name){
		if (name.contains("_")){
			return name.split("_").map[toFirstUpper].join();
		}
		return name.toFirstUpper;
	}
	
	// « »
	def CharSequence compile(Object object, Boolean isSuperClass){
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		import java.lang.*;
		
		««« if object is a super class»»»
		«IF isSuperClass»
		interface «getFormattedName(object.name)»{
		«ENDIF»
		
		««« if object is a class
		«IF !isSuperClass»
		public class «getFormattedName(object.name)» «IF object.superType !== null»implements «getFormattedName(object.superType.name)»«ENDIF»{
			
			«FOR attribute : object.attributes»
			private «getAttributeType(attribute.value)» «attribute.name» = «attribute.value»;
			«ENDFOR»
			
			
			//constructors
			public «getFormattedName(object.name)»(){
				super();
			}
			
			«IF object.attributes.size > 0»
			public «getFormattedName(object.name)»(«getFormattedParameterList(object.attributes)»){
				«FOR attribute : object.attributes»
					this.«attribute.name» = «attribute.name»;
				«ENDFOR»
			}
			«ENDIF»
			
			//getters and setters
			«FOR attribute : object.attributes»
			public «getAttributeType(attribute.value)» get«attribute.name.toFirstUpper»(){
				return «attribute.name»;
			}
			«ENDFOR» 
			
			//TODO add actions
			
			«ENDIF»  
		««« end if object is a class
			
		}
			
		'''
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