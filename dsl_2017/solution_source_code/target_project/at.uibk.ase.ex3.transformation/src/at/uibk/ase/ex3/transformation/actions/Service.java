//generated
package at.uibk.ase.ex3.transformation.actions;

import java.util.List;
import at.uibk.ase.ex3.transformation.entities.Component;
import at.uibk.ase.ex3.transformation.entities.Project;

public class Service{
	
	public Component createComponent(String name, String version){
		return new Component(name, version);
	}
	
	public Project createProject(String name, String version){
		return new Project(name, version);
	}
	
	public void addMemberToGroup(Project member, Component group){
		group.add(member);
	}
	
	public List<Project> getOrder(Component c){
		throw new UnsupportedOperationException("Not implemented!");
	}
	
	private boolean isRightDependency(Project p1, Project p2){
		for (Project p : p1.getDependencies()){
			if(p.getName().equals(p2.getName()) && p.getVersion().equals(p2.getVersion())){
				return true;
			}
		}
		return false;
	}
	
	private boolean isLeftDependency(Project p1, Project p2){
		for (Project p : p2.getDependencies()){
			if(p.getName().equals(p1.getName()) && p.getVersion().equals(p1.getVersion())){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasCycles(Component c1, Component c2){
		boolean right = false;
		boolean left = false;
		
		for (Project p1 : c1.getProjects()){
			for (Project p2 : c2.getProjects()){
				right = right || isRightDependency(p1, p2);
				left = left || isLeftDependency(p1, p2);
			}
		}
				
		return right && left;
	}
}
