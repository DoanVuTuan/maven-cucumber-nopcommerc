package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//trỏ vào thư mục chứa các file .features
		features = "src/test/resources/features",
		
		//Trỏ file features mapping với thư mục chứa code java(Steps) 
		glue = "stepDefinitions",
		
		// Show console cho dễ đọc hơn 
		monochrome = true,
		
		// Nếu có bất kì 1 step nào chưa implement thì nó ko chạy
		//dryRun = true,
		
		// Generate report (HTML / JSON / ...)
		plugin = {"pretty",
				"html:target/site/cucumber-reporrt-default",
				"json:target/site/cucumber.json"},
		
		// Generate method with type : camelCase, under_score
		snippets = SnippetType.CAMELCASE,
		
		// run matching with condition : AND / OR
		tags = {"@login"}
		)

public class CucumberTestRunner {

}
