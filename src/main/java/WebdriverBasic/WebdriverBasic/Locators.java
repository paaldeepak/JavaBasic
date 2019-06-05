package WebdriverBasic.WebdriverBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	   // driver.get("https://login.yahoo.com/");
		driver.get("https://accounts.google.com/");
	    
	    //1.Id
	    
	//  WebElement email=driver.findElement(Bysinh.id("identifierId"));
	  // email.sendKeys("sinha.psnehal@gmail.com");
		
		
	   //2.Name
		Thread.sleep(1000);
	   driver.findElement(By.name("identifier")).sendKeys("sinha.psnehal@gmail.com");
	  
		
		//3.Xpath
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sinha.psnehal@gmail.com");
		
		//4.css selector
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("sinha.psnehal@gmail.com");
		
		//5.Linktext: it is used only for link
		//driver.findElement(By.linkText("Learn more")).sendKeys("sinha.psnehal@gmail.com");
		
		//6.Class Name:
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("sinha.psnehal@gmail.com");
	   
	   //7.PartialLink text
		driver.findElement(By.partialLinkText("more")).sendKeys("sinha.psnehal@gmail.com");
		
		//tag
	   
	    
	    
	    //driver.quit();
	    
	    
		

	}

}
