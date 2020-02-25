package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.Generic_test;
import POM.Gmail_signin_page;

public class Signin_Test extends Generic_test {

	@Test
	public void Gmailopen() {

		String Title = driver.getTitle();

		System.out.println("Before Entering credential and the title is :" + Title);
	}

	@Test
	public void signin() throws InterruptedException {

		Gmail_signin_page GSP = new Gmail_signin_page(driver);

		GSP.email("maheshprakash92");
		Reporter.log("Email id provided");

		GSP.next();
		Reporter.log("Next button clicked");
		
		Thread.sleep(2000);

		GSP.password("M@hesh92");
		Reporter.log("password provided");

		GSP.next();
		Reporter.log("Next button clicked");
		
		Thread.sleep(2000);
		
		String Title = driver.getTitle();
		Reporter.log("Got the pagetitle");

		System.out.println("After Entering credential and the title is :" + Title);
		
		
	}

}
