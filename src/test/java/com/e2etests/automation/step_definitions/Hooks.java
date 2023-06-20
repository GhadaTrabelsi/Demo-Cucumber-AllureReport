package com.e2etests.automation.step_definitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.e2etests.automation.utils.Setup;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	@AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException
    {
        WebDriver driver = Setup.getDriver();
        if(scenario.isFailed())
        {
        File sourcePath=    ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
        scenario.attach(fileContent, "image/png", "image");
        }
    }

}
