package TestType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import mainpage.Category_est;

import util.FirstTest;

public class Testpage {
	WebDriver driver;
	FirstTest first_test;
	Category_est categoary_test;
	
	
@Test
	public void browser() throws Exception {
		driver=FirstTest.launch();
	Category_est	categoary_test=PageFactory.initElements(driver, Category_est.class);
		categoary_test.submit();
		
		categoary_test.addCategory();
		
		categoary_test.validatingAddCategory();
		
		

}


}


