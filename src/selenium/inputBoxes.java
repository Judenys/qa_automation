package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/judenys_hidalgo/Desktop/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		browserObject.findElement(By.name("name")).sendKeys("Judy");
		browserObject.findElement(By.name("email")).sendKeys("test@test.com");
		browserObject.findElement(By.name("website")).sendKeys("Testing");
		browserObject.findElement(By.name("comment")).sendKeys("Testing the comment field");
		browserObject.close();
	}

}
