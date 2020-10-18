package com.ccb.dp.nosql.reflect;

public interface ObjectWrapper {

	Object get(String porp) throws ReflectionException;
	Object get(String porp, Object value) throws ReflectionException;
}
