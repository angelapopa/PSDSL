//generated
package at.uibk.ase.ex3.transformation.entities;

import java.util.List;
import java.util.ArrayList;
import at.uibk.ase.ex3.transformation.entities.Member;

public class Project implements Member{
	private String name;
	private String version;
	private String responsible;
	private List<Project> dependencies;
	
	//constructor
	public Project(String name, String version){
		this.name = name;
		this.version=version;
	}
	
	//methods
	public void addDependency(Project element){
		getDependencies().add(element);
	}
	
	//getters and setters
	public String getName(){
		return name;
	}
	
	public void setName(String _arg) {
		this.name = _arg;
	}
	public String getVersion(){
		return version;
	}
	
	public void setVersion(String _arg) {
		this.version = _arg;
	}
	public String getResponsible(){
		return responsible;
	}
	
	public void setResponsible(String _arg) {
		this.responsible = _arg;
	}
	public List<Project> getDependencies(){
		if (dependencies == null){
			dependencies = new ArrayList<Project>();
		}
		return dependencies;
	}
	
	public void setDependencies(List<Project> _arg) {
		this.dependencies = _arg;
	}
}
