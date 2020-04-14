package testleafcareforyou;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC002_CreateAccount_Negative {
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
	
	
	WebElement eleDropdown = driver.findElement(By.name("industryEnumId"));
//	eleDropdown.sendKeys("Media");
	
	Select dd1 = new Select(eleDropdown);
	//Index
//	dd1.selectByIndex(1);
	//Text
//	dd1.selectByVisibleText("Press");
	//value
	dd1.selectByValue("IND_INSURANCE");
	
	
	driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9876543210");
	driver.findElement(By.className("smallSubmit")).click();
	String errormsg = driver.findElement(By.className("errorMessage")).getText();
	System.out.println(errormsg);

}
}
