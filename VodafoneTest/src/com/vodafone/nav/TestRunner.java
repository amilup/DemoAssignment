package com.vodafone.nav;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(/*format = {
		
			"json:target/cucumber-report.json"
	},*/
	
	features = {
			"src/com/vodafone/nav/LoginTest.feature"
	},
	
	tags = {
			
			"@LoginTest"
	}

		)

@RunWith(Cucumber.class)
public class TestRunner {

}
