package excelDatawithTestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends baseclass{
	
@Test(dataProvider="create")
	public  void createlead(String cn,String fn,String ln) {

		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cn);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fn);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ln);
		driver.findElement(By.name("submitButton")).click();
	
}
@DataProvider(name="create")
public String[][] fetchdata() throws IOException {

	
return ReadDatafromExcel.readata();
}

}






