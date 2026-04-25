package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:\\demo.cyclos.org");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("login-link")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	driver.findElement(By.xpath("//span[starts-with(text(),'Submit')]")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("/html/body")).getText());
	driver.close();
	
		
}
}
