package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1wed28 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Private");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Stark");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Industry");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("samplemail.8@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("976545654");
	    driver.findElement(By.name("submitButton")).click();
	    	
	
	}
}

