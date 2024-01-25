package com.stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;
import com.pageobectmanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn extends BaseClass{
	PageObjectManager pom = new PageObjectManager();
	
	@Given("User is on the Jpetstore page")
	public void user_is_on_the_jpetstore_page() throws FileNotFoundException, IOException {
		

	}
	@When("User signin {string} and {string}")
	public void user_signin_and(String string, String string2) throws InterruptedException {
		pom.getSignin().signIn();

	}
	
	@Then("User should verify success message after SignIn {string}")
	public void user_should_verify_success_message_after_sign_in(String string) {
		   }

	
	@When("User signin userName and passWord")
	public void user_signin_user_name_and_pass_word() {
	}





}
