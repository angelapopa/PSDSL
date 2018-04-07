//generated
package at.uibk.ase.ex3.transformation.entities;

import java.util.List;
import java.util.ArrayList;
import at.uibk.ase.ex3.transformation.entities.Group;

public class Component implements Group{
	private String name;
	private String version;
	private String responsible;
	private List<Project> projects;
	
	//constructor
	public Component(String name, String version){
		this.name = name;
		this.version=version;
	}
	
	//methods
	public void add(Project element){
		getProjects().add(element);
	}
	
	public int getSize(){
		if (projects == null){
			return 0;
		}
		return projects.size();
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
	public List<Project> getProjects(){
		if (projects == null){
			projects = new ArrayList<Project>();
		}
		return projects;
	}
	
	public void setProjects(List<Project> _arg) {
		this.projects = _arg;
	}
}
