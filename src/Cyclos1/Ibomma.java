package Cyclos1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ibomma {
	public static void main(String[] args) throws AWTException, Exception   {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String parentwindow= driver.getWindowHandle();
		driver.get("https://ww1.ibomma.one");

	
		driver.manage().window().maximize();
		Robot rb = new Robot();
		driver.findElement(By.xpath("//button[text()='ENTER']")).click();
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);	
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		//	rb.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(3000);
		Actions action = new Actions(driver); 
		action.contextClick().perform();
		Set<String> childwindow = driver.getWindowHandles();
		for(String handle : childwindow ) {
			if(!childwindow.equals(parentwindow));
			driver.switchTo().window(parentwindow);
		}
		rb.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);	
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		action.contextClick().perform();
		//		driver.navigate().back();

	}
}
