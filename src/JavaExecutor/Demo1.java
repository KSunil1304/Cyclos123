package JavaExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:\\www.google.co.in");
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("alert('Hello')");

}
}
