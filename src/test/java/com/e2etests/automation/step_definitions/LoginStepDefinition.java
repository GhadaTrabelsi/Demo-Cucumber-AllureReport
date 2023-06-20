package com.e2etests.automation.step_definitions;




import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Validations;
import com.e2etests.automation.utils.Wait;


import java.time.Duration;

import org.openqa.selenium.Keys;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public ConfigFileReader configFileReader;
	public SeleniumUtils utils;
	public Validations validation;
	public LoginPage loginPage;
    public Wait wait;
    
	public LoginStepDefinition() {

		configFileReader = new ConfigFileReader();
		utils = new SeleniumUtils();
		validation = new Validations();
		loginPage = new LoginPage();
		wait = new Wait(Setup.getDriver());

	}



	@Given("On the Google Search Page")
	public void onTheGoogleSearchPage() {
		
		utils.get(configFileReader.getProperties("home.url"));
	}
	@SuppressWarnings("static-access")
	@When("Type Ducks and click on the Search")
	public void typeDucksAndClickOnTheSearch() {
	 utils.clearField(loginPage.input);
	 utils.writeText(loginPage.input,configFileReader.getProperties("Duck"));
	 utils.sendKeys(loginPage.input, Keys.ENTER);
	}
	@Then("Check for the Search Results")
	public void checkForTheSearchResults() {
		wait.forPresenceOfElement(Duration.ofSeconds(20), loginPage.searchResult, "searchResult");
		validation.assertTrue(loginPage.searchResult,configFileReader.getProperties("Duck"));
	  System.out.println("yes");
	}

	


	
	





}
