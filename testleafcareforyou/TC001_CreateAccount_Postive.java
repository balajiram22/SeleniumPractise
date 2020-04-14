package testleafcareforyou;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_CreateAccount_Postive {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Accounts")).click();
	
	driver.findElement(By.linkText("Create Account")).click();
	
	driver.findElement(By.id("accountName")).sendKeys("Balaji C");
	driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9876543210");
	driver.findElement(By.className("smallSubmit")).click();
	
	
	String text = driver.findElement(By.xpath("(//table[@class='fourColumnForm']//span)[2]")).getText();
	
	String accountNumber = text.replaceAll("[^0-9]", "");
	System.out.println(accountNumber);
}
}
