# PSDSL
A DSL project for a jsonld converter.

Level: assignment 2

# Description

todo. here comes the description.



# Ideas not implemented

* Some properties like `url` should be of Type `URL`, so that we constrain the user to only use valid urls. Another situation where we want to restrict the user, is on the property of type `Date`, where a certain pattern should be used. We have difficulties linking a property `url` to a terminal type `URL`.

* A property of an entity should not appear twice in the editor.
Is such a validation possible in a grammar definition?

* A list should contain only elements of the same type. How do we instantiate a list of entities? Do we create the entities first, and then add the identifier to the object list?
