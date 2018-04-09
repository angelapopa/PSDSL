# PSDSL
A DSL project for a jsonld converter.

Level: assignment 2

# Description

We construct a grammar that enables users to define their own structured data relevant to Schema.org entities. These entities could be used for JsonLdConverter project, as described in Assignment 1 (Author: Nga Pham). The grammar consists of: 
* The entry rules of our DSL.
* Types that our DSL supports.
* Definition of Entity, Enum, Datatype type, Property (represents properties of Entity object), EnumItem (represents item of Enum object).
* One-to-one and one-to-many relationships with relevant keywords, defined in Property class. A property could be one element with a certain type or a list of elements of the same type.
* New terminal rules defining the regex for URL and DATE types respectively.

We also provide a sample Editor generated from the grammar, in which the default functionality for code completion, syntax highlighting, find references etc... has been tested.


# Ideas not implemented

* Some properties like `url` should be of Type `URL`, so that we constrain the user to only use valid urls. Another situation where we want to restrict the user, is on the property of type `Date`, where a certain pattern should be used. We have difficulties linking a property `url` to a terminal type `URL`.

* A property of an entity should not appear twice in the editor.
Is such a validation possible in a grammar definition?

* A list should contain only elements of the same type. How do we instantiate a list of entities? Do we create the entities first, and then add the identifier to the object list?
