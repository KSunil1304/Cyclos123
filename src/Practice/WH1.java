package Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.antlr.v4.runtime.misc.EqualityComparator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH1 {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String parentWindow = driver.getWindowHandle();
		System.out.println("This is parentWindow");
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		Set<String> childWindow = driver.getWindowHandles();
		for (String handle : childWindow) {
			if(!childWindow.equals(parentWindow)) {
				System.out.println("this is childWindow");
				driver.switchTo().window(handle);
			}	
		}
		driver.findElement(By.id("inputEmail")).sendKeys("jaysudheer71@example.com");
		driver.findElement(By.id("inputPassword")).sendKeys("8790098500");
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
	}
}