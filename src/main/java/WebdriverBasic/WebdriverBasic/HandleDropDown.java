package SeleniiumWebdriver.SeleniiumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
 
	//1.how to handle (select based dropdown) e.g facebook date,year,month
		System.setProperty("webdriver.chrome.driver", "D:\\Snehal S\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement month=driver.findElement(By.id("month"));
		Select select=new Select(month);
		select.selectByIndex(3);//generally we dont used index..because incase of the another option like country then we wont be able to automate 
		                         //because index would be different .so visible text is usefull also we have to pass exact text,if it is capital then capital.
		//it will be work only when it will be select option.
		select.selectByVisibleText("May");
	//to print all the values of dropdown
		List<WebElement> monthlist=driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println(monthlist.size());
		
		for(int i=0;i<monthlist.size();i++){
			
			System.out.println(monthlist.get(i).getText());
		}
		
	}
	

}
