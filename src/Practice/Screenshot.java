package Practice;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class Screenshot {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		Thread.sleep(5000);
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("C:\\Users\\dell\\eclipse-workspace\\Cyclos123\\Screenshots\\Google1.jpg"));
		}
}
