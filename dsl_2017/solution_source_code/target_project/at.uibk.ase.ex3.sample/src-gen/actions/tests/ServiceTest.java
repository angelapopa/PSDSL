//generated
package at.uibk.ase.ex3.transformation.actions;

import static org.junit.Assert.*;
import java.util.List;

import org.junit.Test;

import at.uibk.ase.ex3.transformation.entities.Component;
import at.uibk.ase.ex3.transformation.entities.Project;

public class ServiceTest {
	private Service service = new Service();
	
	@Test
	public void testCreate(){
		String name = "component1";
		String version = "1.0.0";
		Component c = service.createComponent(name, version);
		
		assertEquals(name, c.getName());
		assertEquals(version, c.getVersion());
	}

	//FIXME take created components and check cycle dependencies
	@Test
	public void testCycleValid(){
		Component c1 = service.createComponent("component1", "1.0.0");
		Component c2 = service.createComponent("component2", "2.0.0");
	
		Project p1 = service.createProject("project1", "1.9.0");
		Project p2 = service.createProject("project2", "1.0.0");
	
		c1.add(p1);
		c1.add(p2);
	
		assertFalse(service.hasCycles(c1, c2));
	}

	//FIXME take created components and check cycle dependencies
	@Test
	public void testCycleInvalid(){
		Component c1 = service.createComponent("component1", "1.0.0");
		Component c2 = service.createComponent("component2", "2.0.0");
	
		Project p1 = service.createProject("project1", "1.9.0");
		Project p2 = service.createProject("project2", "1.0.0");
		Project p4 = service.createProject("project4", "1.9.0");
	
		p2.addDependency(p1);
		p4.addDependency(p2);
	
		c1.add(p1);
		c1.add(p4);
		c2.add(p2);
	
		assertTrue(service.hasCycles(c1, c2));
	}

	@Test
	public void testOrder(){
		//FIXME get created entities
		Component c1 = service.createComponent("component1", "1.0.0");
		Project p1 = service.createProject("project1", "1.9.0");
		Project p2 = service.createProject("project2", "1.0.0");
		//END FIXME
		
		c1.add(p1);
		c1.add(p2);
		
		p2.addDependency(p1);
	
		List<Project> projects = service.getOrder(c1);
		assertEquals("project1", projects.get(0).getName());
		assertEquals("project2", projects.get(1).getName());
	}

	@Test(expected = Exception.class)
	public void testOrderEmpty(){
		service.getOrder(service.createComponent("component2", "2.0.0"));
	}
}
