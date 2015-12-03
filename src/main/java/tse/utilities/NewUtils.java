package tse.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




public class NewUtils {
    
    private WebDriver driver;
    
    
    
    public NewUtils(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void pause(int millisecs) {
        try {
            Thread.sleep(millisecs);
        } catch (InterruptedException e) {
        }
    }
    
    public boolean waitForElementDisiplayed(String locator, int seconds) {
        boolean elementEditable = false;
        for (int second = 0;; second++) {

            // If loop is reached 60 seconds then break the loop.
            if (second >= seconds)
                break;

            // Search for element "link=ajaxLink" and if available then break
            // loop.
            try {
                if (driver.findElement(By.cssSelector(locator)).isDisplayed()) {
                    elementEditable = true;
                    break;
                }

            } catch (Exception e) {
            }

            // Pause for 1 second.
            pause(1000);
        }

        return elementEditable;

    }
        
	public void testTakesScreenshot(WebDriver driver) {
		try {
			File srcFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("c:\\screenshot.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}
    




}
