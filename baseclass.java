package excelDatawithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseclass {
	public RemoteWebDriver driver;

	@Parameters({"browser","url","username","password"})

	@BeforeMethod
	public void precondtion(String browser,String url,String username,String password) {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}

		else if(browser.equalsIgnoreCase("edge")){
			EdgeOptions options = new EdgeOptions(); 
			options.addArguments("--remote-allow-origins=*"); 
			driver=new RemoteWebDriver(options);
		}
		{

		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@AfterMethod
	public void postcondition() {
		driver.close();

	}
}
