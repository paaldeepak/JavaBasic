package WebdriverBasic.WebdriverBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUpconcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.linkText("Channel Opener")).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String parentWindowID=it.next();
		System.out.println("Parent window id :" +parentWindowID);	
		Thread.sleep(50000);
	
		
		String ChildWindowId=it.next();
		
		System.out.println("Child window id :"+ChildWindowId);
		
		
		driver.switchTo().window("ChildWindowId");
		
		System.out.println("Child window title is :"+ driver.getTitle());
		driver.close();/// interview question difference between close and quit.
		
		driver.switchTo().window("parentWindowID");
	
		System.out.println("Parent window title is :"+driver.getTitle());
		//driver.quit();
	}

}
