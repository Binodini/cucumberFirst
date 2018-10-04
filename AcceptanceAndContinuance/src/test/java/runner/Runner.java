package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
//plugin = {"pretty","html:target/html/automation"},
features="Features/features",
glue= "testCases",
tags={"@Login,@Search,@AuditProcess,@MATPricingProfile,@Engagements"},
monochrome=true)
@RunWith(Cucumber.class)
public class Runner {

}










//snippets=SnippetType.CAMELCASE)
//tags= {"@CreateLead","@createcontact"},
//,dryRun=true,snippets=SnippetType.CAMELCASE