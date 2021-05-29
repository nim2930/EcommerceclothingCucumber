package cuccumbertests;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(format= "pretty", features="features", monochrome=true, glue= {"stepDefinitions"})
public class TestRunner {

	@Test
	public void test() {
		
	}

}
