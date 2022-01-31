package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	WebElement elementusername = driver.findElement(By.id("username"));
	elementusername.sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Mohammed Yaaruq");
	driver.findElement(By.id("lastNameField")).sendKeys("Y");
	driver.findElement(By.className("smallSubmit")).click();
	String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
	System.out.println(text);
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();	
			
}
}
