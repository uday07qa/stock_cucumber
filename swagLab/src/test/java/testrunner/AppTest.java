package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions (dryRun = false,monochrome = true,
features= {"C:\\cucumberpratice\\swagLab\\feature\\exestinguser.feature"},
glue = {"C:\\cucumberpratice\\swagLab\\src\\test\\java\\StepDefination\\exestinguser_login.java"},
tags=("@exestinguser"),
        plugin = {"pretty","html:target/report/cucumber",
        		"junit:target/report/cucumber.xml",
        		"json:target/report/cucumber.json"})
        		                                                        

public class AppTest extends AbstractTestNGCucumberTests{

}
