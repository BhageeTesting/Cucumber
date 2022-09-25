package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import stepDefination.AddEmp;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},monochrome=true,glue= {"stepDefination"},
plugin= {"pretty","html:target/cucumber-reports"})
public class Runner extends AddEmp {
	

}
