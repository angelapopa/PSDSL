//generated
package at.uibk.ase.ex3.transformation.actions;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import at.uibk.ase.ex3.transformation.entities.Component;
import at.uibk.ase.ex3.transformation.entities.Project;

public class ComponentTest {
	private Service service = new Service();
	private List<Component> components = new ArrayList<>();
		
		@Before
		public void setup(){
							
			//FIXME create action is not like the rest actions; extracting entity types not possible
			
			Component c1 = service.createComponent("component1", "1.0.0");
			Component c2 = service.createComponent("component2", "2.0.0");
			
			Project p1 = service.createProject("project1", "1.9.0");
			Project p2 = service.createProject("project2", "1.0.0");
			
			c1.add(p1);
			c1.add(p2);
			
			components.add(c1);
			components.add(c2);
			
		}
		
		@Test
		public void testSize(){
			assertEquals(2, components.get(0).getSize());
			assertEquals(0, components.get(1).getSize());
		}
	
}
