package com.davidonus.demo;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.SystemUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelenTestChrome {

	private static WebDriver driver;
	
	
	static String projectLocation = System.getProperty("user.dir");
	static String chromeGecko = projectLocation + "\\bin\\chromedriver.exe";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		if(SystemUtils.IS_OS_LINUX){
			chromeGecko = projectLocation + "//bin//chromedriver";
		}
		else if (SystemUtils.IS_OS_WINDOWS){
			chromeGecko = projectLocation + "\\bin\\chromedriver.exe";
		}
		
		
		System.setProperty("webdriver.chrome.driver", chromeGecko);
		driver = new ChromeDriver();
		String baseUrl = "http://localhost:9090/home/";
		driver.get(baseUrl);
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void testTitle() {
		String expected = "David's Springtime Demo";
		String actual = driver.getTitle();
		
		assertEquals(expected, actual);
	}
	
}