package com.aurionpro.model;
import java.lang.reflect.*;
import com.aurionpro.test.*;

public class Reflection {
	public void methods(Class className) {
		Method[] methods = className.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}
	public void fields(Class className) {
		Field[] fields = className.getDeclaredFields();
	      for(int i = 0; i < fields.length; i++) {
	         System.out.println(fields[i].toString());
	      }
	}
}
