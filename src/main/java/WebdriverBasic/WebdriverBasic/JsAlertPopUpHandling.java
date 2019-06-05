package WebdriverBasic.WebdriverBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		//How to handle alert:using alert API in selenium
		//alert API is available in form of alert interface
		//Accept,dismiss,gettext
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();//go button
	Alert alert=driver.switchTo().alert();//we handle alert with switchto.
		
		String text=alert.getText();
		System.out.println("alert message"+text);
	if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct error msg");
		}
		else{
			System.out.println("incorrect message");
		}
		Thread.sleep(5000);
		alert.accept();//want to click on ok button
		//cancle
		//alert.dismiss();*/
		
		
		

	}

}
