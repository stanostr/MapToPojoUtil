# MapToPojoUtil
A utility to generate a String representation of a POJO from a java Map. 

The keys in the map must be of type String, but the values can be of any type. 

It is expected that using this code you can generate setters, getters, toString, hashCode, etc using your IDE functionality. It only generates the instance variables.

If you want to get rid of the fully qualified class name just search and delete all the relevant code and then import the necessary classes OR change the "getName" to "getSimpleName" within the utility code.

I encountered the need for this utility dealing with database tables with very many columns that needed to be converted into POJOS (which were not yet written). I am sure there are other use cases as well.


