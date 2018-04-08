entity Component extends Group{
	String name
	String version
	String responsible	
	Project[] projects
}

entity Project extends Member{
	String name
	String version
	String responsible
	Project[] dependencies
}

//==== creating entities ======
create Component("component1", 1.0.0)
create Component("component2", 2.0.0)

create Project("project1", 1.2.0)
create Project("project1", 1.9.0)

create Project("project2", 1.8.0)
create Project("project2", 1.9.0)

create Project("project4", 1.9.0)
create Project("project5", 1.3.0)

//==== connecting entities ======
add Project("project1",1.9.0) to Component("component1", 1.0.0)
add Project("project2",1.9.0) to Component("component2", 1.0.0)
add dependency Project("project1", 1.2.0) to Project("project2", 1.0.0)

//==== adding responsibility =====
add responsibility ("John Smith") to Component("component1", 1.0.0)
add responsibility ("Mary James") to Project("project1", 1.2.0)

//==== performing calculations ====
size of Component("component1", 1.0.0)
project order for Component("component1", 1.0.0)
cycle between Component("component1",1.0.0) and Component("component2", 2.0.0)

//=== not allowed statements ====
//only entity types can be created
//create some_other_thing("test", 1.0.0)

//only already created instances should be used in actions
//add Project("non-existing",1.9.0) to Component("component1", 1.0.0)
//add Project("project5",9.9.0) to Component("component1", 1.0.0)
//add Project("project1",1.2.0) to Component("non-existing-component", 1.0.0)
//add Project("project4",1.9.0) to Component("component1", 1.0.5)
//add Project("project5",1.9.0) to Component("component1", 1.0.0)

//versions should comply to semantic versioning
//create Component("component9", 123)

//an entity with same version should not be created twice
//currently only error message only visible in the log
//create Component("component1", 1.0.0)
//create Project("project1", 1.2.0)

//only projects can be added to components
//add Component("component1", 1.0.0) to Component("component1", 1.0.0)
//add Component("component1", 1.2.0) to Project("project1", 1.2.0)

//dependency relation can be configured by user only for projects
//add dependency Component("component2", 1.2.3) to Component("component1", 1.0.0)
//add dependency Component("component2", 1.2.3) to Project("component1", 1.0.0)
//add dependency Project("component2", 1.2.3) to Component("component1", 1.0.0)

//one project can exist only once in a component
//add Project("project1",1.9.0) to Component("component1", 1.0.0)

//versions of all projects inside a component should be the same
//add Project("project4",1.3.0) to Component("component1", 1.0.0)

//size, order and cycle can be computed only for created components
//size of Project("project1", 1.2.0)
//size of Component("component9", 1.0.0)
//project order for Project("project1", 1.2.0)
//project order for Component("component10", 1.0.0)
//cycle between Project("project1",1.0.0) and Component("component2", 2.0.0)
//cycle between Component("component1",1.0.0) and Component("component10", 2.0.0)

//cycle generating entries
//add Project("project4",1.9.0) to Component("component1", 1.0.0)
//add dependency Project("project2", 1.8.0) to Project("project4", 1.9.0)