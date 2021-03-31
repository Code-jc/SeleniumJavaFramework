package com.Amazon.TestCases;

import org.testng.annotations.Test;

import com.Amazon.BaseFramework.BaseClass;

public class TestScripts {
	/*
	 * public static void main(String args[]) { String filePath =
	 * System.getProperty("user.dir") +
	 * "/src/main/java/com/Amazon/Config/config.properties";
	 * BaseClass.initializeProperties(filePath);
	 * System.out.println("Property Read: " +
	 * BaseClass.readProperty("ApplicationURL")); }
	 */
	
	@Test
	public void readPropertyTest() {
		String filePath = System.getProperty("user.dir") + "/src/main/java/com/Amazon/Config/config.properties";
		BaseClass.initializeProperties(filePath);
		System.out.println("Property Read: " + BaseClass.readProperty("ApplicationURL"));
		
	}

}
