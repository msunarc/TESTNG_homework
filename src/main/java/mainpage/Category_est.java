package mainpage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
//Test 1: Validate a user is able to add a category and once the category is added it should display.

public class Category_est {

	WebDriver driver;
	Random rnd = new Random();
	String input;

	public Category_est(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.CSS, using = "input[name='categorydata']")
	WebElement AddCategory;

	@FindBy(how = How.XPATH, using = "//span[@id='extra']/child::input[@name='submit']")
	WebElement Submit;

	@FindBy(how = How.XPATH, using = "//html/body/div[3]")
	WebElement Validating;

	public void addCategory() {
		input = "Sun" + rnd.nextInt(999);
		AddCategory.sendKeys(input);

	}

	public void submit() {
		Submit.click();

	}

	public void validatingAddCategory() {

		int i = 0;
		boolean validation = false;
		// String path = driver.findElement(By.xpath("/html/body/div[3]")).getText();
		String path = Validating.getText();
		for (i = 0; i < path.length(); i++) {

			if (path.contains(input)) {
				validation = true;
			}
		}
		System.out.println(input);
		Assert.assertTrue(validation);
	}
}



	
	
	




