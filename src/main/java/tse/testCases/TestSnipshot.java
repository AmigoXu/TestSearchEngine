package tse.testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tse.utilities.NewUtils;

public class TestSnipshot {

	public String url = "http://www.baidu.com";
	public WebDriver driver = new FirefoxDriver();
		
	private NewUtils           utils;
	
	@BeforeTest
	public void	setUp() {
		driver.get(url);
	}
	
	
	@Test
	public void testSnapshot() {
		
		utils = new NewUtils(driver);
		
		utils.testTakesScreenshot(driver);
		
	}
	
	
	@AfterTest
	public void	tearDown() {
		driver.quit();
	}

}
