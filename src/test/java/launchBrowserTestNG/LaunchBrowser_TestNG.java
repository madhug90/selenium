package launchBrowserTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchBrowser_TestNG {

 
	@Test
	  public void LaunchBrowser() throws InterruptedException{
		
		
		

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true); 
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/root/selenium/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		WebDriver driver = new PhantomJSDriver(caps);
		System.out.println("PhantomJS Headless Driver launched");
		
		// Write your script here
		driver.get("http://35.200.186.214:9200/project-1.0-RAMA/");
		Thread.sleep(5000);
		System.out.println("Launch Browser is successful ");
		System.out.println("Page Title : " + driver.getTitle());	

		//Verify page title
		System.out.println("Verify if the page title is Welcome to Continous Integration with Jenkins in AWS Yottabyte session");
		Assert.assertEquals(driver.getTitle(), "Welcome to Continous Integration with Jenkins in AWS Yottabyte session");

		//Verify Page text
		System.out.println("Verify if the page contains text - Hello DevOps Engineers and Architects!");
		Assert.assertEquals(String.valueOf(driver.getPageSource().contains("Hello DevOps Engineers and Architects!")), "true");
		
/*		driver.findElement(By.name("q")).sendKeys("Fresco Play");
                driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
                Thread.sleep(5000);
                System.out.println("Page Title : " + driver.getTitle());

	
		//Searching for "Fresco Play" in Google search
		driver.findElement(By.name("q")).sendKeys("Fresco Play");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("Page Title : " + driver.getTitle());
					
					
		//Click "Fresco Apps" link from search list
			
		driver.findElement(By.linkText("Fresco Apps")).click();
		Thread.sleep(5000);
		System.out.println("Page Title : " + driver.getTitle());
		driver.quit();
*/
	}
}

      
