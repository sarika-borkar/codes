package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project11.class1imdb;
import project11.class2wiki;

public class task {
	
WebDriver driver;
	
	@BeforeClass 

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aditya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.imdb.com/title/tt9389998/releaseinfo?ref_=tt_dt_rdat");
		
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("beforeMethod");
	}
	
         @Test
         
         public void verifydates() {
        	class1imdb i = new class1imdb();
        	 
            String rname = i.imdbname();
            
             class2wiki w = new class2wiki();
            String wname = w.wikiname();
            
            Assert.assertEquals(rname, wname);
        	 
         }
         
         
         @AfterMethod
     	public void AfterMethod() {
     		System.out.println("AeforeMethod");
     	}
         
         @AfterClass
         
         public void afterclass() {
        	 
        	 System.out.println("afterclass");
         }
         
         
         

}
