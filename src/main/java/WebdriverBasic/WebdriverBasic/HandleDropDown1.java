package WebdriverBasic.WebdriverBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement month=driver.findElement(By.id("month"));
		Select select=new Select(month);
		//select.selectByIndex(6);
		select.selectByVisibleText("May");
		 List<WebElement> monthlist= driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println(monthlist.size());
		
		for(int i=0;i<monthlist.size();i++)
		{
			System.out.println(monthlist.get(i).getText());
		}
	}

}

