package com.Amazon.BaseFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Amazon.Config.ConstantsFile;

public class BaseClass {

	// WebDriver
	public static WebDriver driver;

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
	
	public static void launchBrowser() {		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Resources/chromedriver");
		driver = new ChromeDriver();
		driver.get(readProperty(ConstantsFile.APPLICATION));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.MILLISECONDS);
	}

}
