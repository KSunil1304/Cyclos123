package Cyclos1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Instagram {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kommayella_sunil13");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sunil@1304insta");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@tabindex='0']/img")).click();
		driver.findElement(By.xpath("//div[text()='Profile']")).click();
		driver.findElement(By.xpath("//a[text()='Edit profile']")).click();
		driver.findElement(By.xpath("//button[text()='Change profile photo']")).click();
		driver.findElement(By.xpath("//button[text()='Upload Photo']")).click();
		Runtime.getRuntime().exec("C:\\Users\\dell\\Desktop\\Sunil123\\INSTA_MAA.exe");
		//Thread.sleep(10000);
		//driver.close();
		
		
		
		//driver.findElement(By.xpath("//div[text()='Log Out']")).click();
		//driver.close();
	}
}
