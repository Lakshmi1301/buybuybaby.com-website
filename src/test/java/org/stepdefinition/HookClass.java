package org.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass{
	 
@Before(order=2)
	public void beforeScenario() throws IOException, ATUTestRecorderException
{
	    System.out.println("This will run before the every Scenario");
	  
		
	} 

@Before(order=0)
    public void beforeScenarioStart()
{
    System.out.println("-----------------Start of Scenario-----------------");
    

} 

@Before(order=1)
public void beforeExe()  
{
	System.out.println("welcome");
	launchBrowser();
	windowMax();
	
	
}
@After(order=2)
public void afterExe() throws IOException 
{
	System.out.println("end");
	
}

@After(order=0)
public void afterScenarioFinish() throws IOException, ATUTestRecorderException
{
    System.out.println("-----------------End of Scenario-----------------");
    
} 
@After(order=1)
public void afterScenario()
{
    System.out.println("This will run after the every Scenario");
} 

}


