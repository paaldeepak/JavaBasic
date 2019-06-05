package WebdriverBasic.WebdriverBasic;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		
driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
//	driver.findElement(By.linkText("Good PopUp #3")).click();
	//driver.close();
		//driver.quit();
		
		
		Set<String> handles = driver.getWindowHandles();
      //  Set<String> handle=driver.getWindowHandles();
       //Iterator<String> it1= handle.iterator();
		
		Iterator<String> it = handles.iterator();
       
		
		String parentWindowId = it.next();
		System.out.println("parent window id is: "+ parentWindowId);
		
		String childWindowID = it.next();
		System.out.println("child window id is: "+ childWindowID);
		
	driver.switchTo().window(childWindowID);
		System.out.println("child window title is: "+ driver.getTitle());
		
		driver.close(); //close the pop up window
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("parent window title is: "+ driver.getTitle());
		
		//driver.quit();
	}

}
