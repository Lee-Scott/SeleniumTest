import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.jna.platform.FileUtils;

public class TestWikipedia {
	/*
	 
 	@arthor Lee Scott
 
 	This is a simple selenium webdriver that goes to Wikipedia and searches for "Software"
 	must download Selenium: http://docs.seleniumhq.org/download/
  
	*/
	
		
		public static void main(String[] args) throws InterruptedException {
			
		
			
			//Path to wedriver for chrome must be downloaded 
			//https://sites.google.com/a/chromium.org/chromedriver/downloads
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lhs49\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
					
			//Instantiate the webDriver
			WebDriver driver = new ChromeDriver();
			
			//go to a certain web site
			driver.get("http://wikipedia.org");
			
			//maximize the window
			driver.manage().window().maximize();
			
			WebElement link;
			
			//Element can be found by inspecting on chrome 
			link = driver.findElement(By.id("js-link-box-en"));
			link.click();
			Thread.sleep(5000);
			WebElement searchBox;
			searchBox = driver.findElement(By.id("searchInput"));
			
			//type out software into the search bar
			searchBox.sendKeys("Software");
			Thread.sleep(5000);
			link = driver.findElement(By.id("searchButton"));
			link.click();
			
			//Copy the body of the webpage
			String bodyText = driver.findElement(By.id("bodyContent")).getText();
			
			System.out.println(bodyText);
			
		
			Thread.sleep(50000);
			
			driver.quit();
		}
		 
		  
		}

		
			
			
			
			
			
	


