package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/judenys_hidalgo/Desktop/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		Select countrySelection = new Select(browserObject.findElement(By.name("country")));
        
		countrySelection.selectByVisibleText("France");
	        
	    Select skillSelection = new Select(browserObject.findElement(By.name("skill")));
	    
	    skillSelection.selectByVisibleText("Programming");
	    skillSelection.selectByVisibleText("Database");
	    browserObject.close();
	}

}
