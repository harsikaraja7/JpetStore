package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SingInPage extends BaseClass{
	public SingInPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}
	@FindBy(xpath = "//button[text()=\"Login\"]")
	WebElement login;

	public WebElement getLogin() {
		return login;
	}

	

	public void signIn() throws InterruptedException {
		Click(getSignIn());
		Thread.sleep(3000);
		Click(getLogin());
		Thread.sleep(3000);
//        driver.switchTo().alert().accept();
//		Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(text(),'My Orders')]")).click();
	}

}