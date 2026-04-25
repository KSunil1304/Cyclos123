package Cyclos1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {
public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.radpdf.com/demo/upload/");
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("js-file-input")).click();
	Runtime.getRuntime().exec("C:\\Users\\dell\\Desktop\\Sunil123\\Myfirstscript1.exe");
	Thread.sleep(5000);
	driver.close();
}
}
