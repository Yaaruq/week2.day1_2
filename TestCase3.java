package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementusername = driver.findElement(By.id("username"));
		elementusername.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/9/99");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("2000000");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("44");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("3652412558");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("00");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("6565");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Mohammed Yaaruq");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Yaaruq");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("5/537 D- K.A Newline");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Kamaraj Nagar Suramangalam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Salem");
		WebElement drop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select a = new Select(drop);
		a.selectByVisibleText("84057");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("636005");
		WebElement drop1 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select b = new Select(drop1);
		b.selectByVisibleText("Argentina");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("636005");
		driver.findElement(By.className("smallSubmit")).click();
		
}
}
