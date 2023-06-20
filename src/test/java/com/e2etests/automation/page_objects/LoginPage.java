package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPage {
	public ConfigFileReader configFileReader;
	public LoginPage loginPage;

	/* Retrieve Element */

	

     @FindBy(how = How.NAME, using = "q")
 	public  WebElement input ; 
     @FindBy(how = How.XPATH, using = "//h3[contains(text(),'DuckDuckGo — Privacy, simplified.')]")
  	public  WebElement searchResult ; 
   
	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	

}
