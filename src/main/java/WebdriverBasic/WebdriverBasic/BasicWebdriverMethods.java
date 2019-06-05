package WebdriverBasic.WebdriverBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicWebdriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver","E:\\Java_Ecllipse\\msedgedriver.exe" );
		WebDriver driver1=new EdgeDriver();
		
		
	   //  driver.manage().window().maximize();//to maximise window	
		driver.manage().deleteAllCookies();
		 //driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);//only for page loading
          driver.get("https://www.irctc.co.in/nget/train-search");
         driver.navigate().refresh();
	}

}
