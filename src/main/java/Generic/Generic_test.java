package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_test {

	public WebDriver driver;

	@BeforeMethod
	public void beforetest() {

		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Reporter.log("Gmail sign-in page opened");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void aftertest() {

		driver.close();
	}

}
