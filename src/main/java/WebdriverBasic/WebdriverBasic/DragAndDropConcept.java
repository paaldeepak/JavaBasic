package WebdriverBasic.WebdriverBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Java_Ecllipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");

		

		//driver.switchTo().frame(0);//switch to frame if its present
        driver.switchTo().frame(0);

		

	Actions action = new Actions(driver);

		

		/*action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))

		.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))

		.release()

		.build()

		.perform();*/
	action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
	.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();

		//driver.quit();
	driver.close();

	}

	}


