package WebdriverBasic.WebdriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.getTitle();
		
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();

	}

}
