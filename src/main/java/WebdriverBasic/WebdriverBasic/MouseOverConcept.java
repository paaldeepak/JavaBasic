package WebdriverBasic.WebdriverBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
driver.get("http://spicejet.com/");

		

		Actions action = new Actions(driver);

		

		action.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();

		

		Thread.sleep(3000);

		

		driver.findElement(By.linkText("Fleet")).click();

		
	}

}
