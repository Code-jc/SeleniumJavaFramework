package com.Amazon.BaseFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

	// WebDriver

	// Code for PropertiesFile
	static File file;
	static Properties prop;
	static FileInputStream fileInputStream;

	public static void initializeProperties(String filePath) {
		file = new File(filePath);
		try {

			fileInputStream = new FileInputStream(file);
			prop = new Properties();
			prop.load(fileInputStream);

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException found in initializeProperties: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException found in initializeProperties: " + e.getMessage());
		}

	}

	public static String readProperty(String property) {
		return prop.getProperty(property);

	}

}
