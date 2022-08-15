package com.runner;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(features="src\\test\\resources\\"
				,glue= {"com.stepdefinition"}  //,glue= {"com.stepdefinition","com.utility"}
               ,tags= {"@login or @sampletest"} //   ,tags= {"@tag or @tag1"}   .......... ,tags= {"@tag1","com.utility"} 
				,monochrome=true
				,dryRun=false
		)
public class TestRunner extends AbstractTestNGCucumberTests {

// or @MT_RuleFailure or @MX_RuleFailureN or @MX_RuleFailureN 
}
