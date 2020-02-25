package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_signin_page {
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailtxtfld;
	
	@FindBy(xpath="(//span[.='Next'])[1]")
	private WebElement clicknext;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordtxtfld;
	
	public Gmail_signin_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void email(String Email){
		emailtxtfld.sendKeys(Email);
	}
	
	public void password(String Password){
		passwordtxtfld.sendKeys(Password);
	}
	
	public void next(){
		clicknext.click();
	}

}
