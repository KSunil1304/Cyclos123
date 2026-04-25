package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
public static void main(String[] args) throws Exception {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https:\\www.jqueryui.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//a[text()='Draggable']")).click();
	driver.switchTo().frame(0);
	Actions action = new Actions(driver);
	action.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
	action.moveByOffset(30, 80).build().perform();
	action.release().build().perform();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	driver.switchTo().frame(0);
	action.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
	action.moveToElement(driver.findElement(By.id("droppable"))).build().perform();
	action.release().build().perform();
	//Thread.sleep(3000);
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//a[text()='Resizable']")).click();
	driver.switchTo().frame(0);
	action.clickAndHold(driver.findElement(By.xpath("//div[@id='resizable']//div[3]"))).build().perform();
	action.moveByOffset(80, 50).build().perform();
	action.release().build().perform();
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//a[text()='Selectable']")).click();
	driver.switchTo().frame(0);
	action.moveToElement(driver.findElement(By.xpath("//li[text()='Item 3']"))).build().perform();
	action.click().build().perform();
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	driver.switchTo().frame(0);
	action.clickAndHold(driver.findElement(By.xpath("//li[text()='Item 1']"))).build().perform();
	action.moveToElement(driver.findElement(By.xpath("//li[text()='Item 1']")), 0, 50);
	//action.moveToElement(driver.findElement(By.xpath("//li[text()='Item 3']")), 0, 100);
	//action.release().build().perform()
//	action.dragAndDrop(driver.findElement(By.xpath("//li[text()='Item 1']")), driver.findElement(By.xpath("//li[text()='Item 3']"))).build().perform();
	action.release().build().perform();
	driver.switchTo().defaultContent();
	
}
}
