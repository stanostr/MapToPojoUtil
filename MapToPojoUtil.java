package com.stanostrovskii;

import java.util.Map;

/**
 * A utility to generate a String representation of a POJO from a java Map. 
 * The keys must be of type String, but the values can be of any type.
 * It is expected that using this code you can generate 
 * setters, getters, toString, hashCode, etc using your IDE functionality
 * @author Stanislav Ostrovskii
 *
 */
public class MapToPojoUtil {
	public static String mapToClass(String className, Map<String, Object> map)
	{
		String classCode = "public class " + className + " {\n";
		for(String key: map.keySet())
		{
			if(map.get(key)!=null)
				classCode = classCode + "\t" + "private " + map.get(key).getClass().getName()
					+ " " + key + ";\n";
			else
				classCode = classCode + "\t" + "private Object " + key + ";\n";

		}
		return classCode + "}";
	}
	
	public static String mapToClass(String className, String packageName, Map<String, Object> map)
	{
		return "package " + packageName + ";\n\n" + mapToClass(className, map);
	}
	
	private MapToPojoUtil() {}
}
