package WebdriverBasic.WebdriverBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("E:\\Java_Ecllipse\\test.txt");

	}

}
//https://phppot.com/demo/jquery-custom-dropdown-with-checkbox/