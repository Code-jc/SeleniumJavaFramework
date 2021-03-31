package com.Amazon.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Amazon.BaseFramework.BaseClass;

public class TestScripts {

	@Test
	public void readPropertyTest() {
		String filePath = System.getProperty("user.dir") + "/src/main/java/com/Amazon/Config/config.properties";
		BaseClass.initializeProperties(filePath);
		System.out.println("Property Read: " + BaseClass.readProperty("ApplicationURL"));

		BaseClass.launchBrowser();
	}

	@BeforeTest (enabled=false)
	public void beforeTest() {
		System.out.println("In BeforeTest Annotation");

	}

	@BeforeMethod (enabled=false)
	public void beforeMethod() {
		System.out.println("In BeforeMethod Annotation");
	}

	@BeforeClass (enabled=false)
	public void beforeClass() {
		System.out.println("In BeforeClass Anotation");
	}

	@AfterTest (enabled=false)
	public void afterTest() {
		System.out.println("In AfterTest Annotation");
	}

	@AfterClass (enabled=false)
	public void afterClass() {
		System.out.println("In AfterClass Annotation");

	}

}
