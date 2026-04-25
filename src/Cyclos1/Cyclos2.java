package Cyclos1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cyclos2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\demo.cyclos.org");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("login-link")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//span[starts-with(text(),'Submit')]")).click();
		driver.findElement(By.id("menu_marketplace")).click();
		driver.findElement(By.xpath("//div[text()='My advertisements']")).click();
		driver.findElement(By.xpath("//a[@href='/ui/marketplace/view/7762070814172696127']")).click();
		driver.findElement(By.xpath("//div[text()='Edit']")).click();
		driver.findElement(By.xpath("//button[@type='button']/span[contains(text(),'Upload a new image')]")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\dell\\Desktop\\Sunil123\\File.exe");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
	}
}
