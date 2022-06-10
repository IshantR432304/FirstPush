package Library;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass 
{
	 public WebDriver driver;
	 
	 @BeforeSuite
	 public void beforeSuite() {
	  DOMConfigurator.configure("D:\\Ishu java\\Demo\\src\\main\\resource\\log4j2.xml");
	  Log.info("This is beforeSuite Method");
	 }
	 
	 @BeforeMethod
	 public void setup() 
	 {
	  System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver_win32\\chromedriver94.exe\\");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	 }
	 
	 @AfterMethod
	 public void tearDown() {
	  driver.close();
	 }
	 
	 @AfterSuite
	 public void afterSuite() {
	  Log.info("This is afterSuite Method");
	 }

}
