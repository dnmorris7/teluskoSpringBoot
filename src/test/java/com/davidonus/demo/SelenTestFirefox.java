package com.davidonus.demo;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.SystemUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelenTestFirefox {

	private static WebDriver driver;
	
	//gather the webdriver location. Selenium won't work unless pointed to the bin folder (in this case).
	static String projectLocation = System.getProperty("user.dir");
	
	//if Windows, use this line
	//static String mozillaGecko = projectLocation + "\\bin\\geckodriver.exe";
	//if Linux, use this line
	static String mozillaGecko;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		//GeckoDriver is required. Check to use correct variant; windows or linux.
		if(SystemUtils.IS_OS_LINUX){
			mozillaGecko = projectLocation + "//bin//geckodriver";
		}
		else if (SystemUtils.IS_OS_WINDOWS){
			mozillaGecko = projectLocation + "\\bin\\geckodriver.exe";
		}
		
		
		System.setProperty("webdriver.gecko.driver", mozillaGecko);
		driver = new FirefoxDriver();
		String baseUrl = "http://localhost:9090/home/";
		driver.get(baseUrl);
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
		driver.close();
	}
	
	@Test
	public void testTitle() {
		String expected = "David's Springtime Demo";
		String actual = driver.getTitle();
		
		assertEquals(expected, actual);
	}
	
}
