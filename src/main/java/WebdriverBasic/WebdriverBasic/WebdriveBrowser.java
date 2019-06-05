package WebdriverBasic.WebdriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriveBrowser {

	public static void main(String[] args) {
		
	    ////1. Lunch browser
	System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    
      //2. enter url:
  		//driver.get("http://www.google.com");
  		
  		//3.get title
    
  		String title=driver.getTitle();
  		System.out.println("Get title:" +title);
  		
  		//validate data
  		if(title.equals("Google"))
  		{
  			System.out.println("get the correct title");
  		}
  		
  		else
  		{
  			System.out.println("Title is not correct");
  		}
  	
  		System.out.println(driver.getCurrentUrl());
  		String CurrentURL=driver.getCurrentUrl();
  		
  		if(CurrentURL.contains("google.com"))
  		{
  			System.out.println("Contains is present");
  		}
  		  else
  		   {
  			System.out.println("Contains is not present");
  		     }
  		
  		//System.out.println(driver.getPageSource());
  		
  		driver.quit();
	
	}

}
