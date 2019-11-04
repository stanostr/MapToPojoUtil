package com.stanostrovskii;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Example {
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("firstName", "Silky");
		map.put("lastName", "Ostrovskii");
		map.put("age", new Integer(97));
		map.put("salary", 110000);
		map.put("dateNow", new Date());
		map.put("someAttribute", null); //unknown type will be declared as Object
		//with package declaration
		System.err.println(MapToPojoUtil.mapToClassSimple("Employee", "com.stan", map));
		System.err.println();
		//without package declaration
		System.err.println(MapToPojoUtil.mapToClassSimple("Employee", map));

	}

}
