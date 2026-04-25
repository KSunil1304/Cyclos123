package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.jqueryui.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//a[text()='Accordion']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Section 3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Section 4']")).click();
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("Hi! Sunil");

	}
}
