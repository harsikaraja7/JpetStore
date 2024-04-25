package com.stepdefinitions;

import com.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testing_step extends BaseClass{
	testing_step Testing_PO = new testing_step();
	     String chrome = "chrome";
		@Given("User launch the browser")
		public void user_launch_the_browser() {
			Testing_PO.launchBrowser(chrome);
			
		}
		@When("User login the application")
		public void user_login_the_application() {
			
		}
		@Then("User gives the uName and pWord")
		public void user_gives_the_u_name_and_p_word() {
			
			
		}
		@Then("User verify the success msg")
		public void user_verify_the_success_msg() {
			
		}



	

}
