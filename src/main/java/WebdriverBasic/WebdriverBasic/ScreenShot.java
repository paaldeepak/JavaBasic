package WebdriverBasic.WebdriverBasic;

import java.io.File;
//import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	//private static final String FileUtils = null;

	//private static final String FileUtils = null;


	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com");

		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
	//Files.copy(src, new File("E:\\Java_Ecllipse\\04.jpg"));
		
		


	}

}
