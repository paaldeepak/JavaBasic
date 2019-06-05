package SeleniiumWebdriver.SeleniiumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Snehal S\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//To upload the file from local machine . 90% file type should be available in webelment then we can automate otherwise we cannot upload window based 
		//file since selenium doesnot allowed. if file is not present in web elment then with the help of 3rd part tool like SIKULLI, AutoIT we can do it.
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		driver.findElement(By.name("files[]")).sendKeys("D:\\Snehal S\\Test.txt");

	}

}
