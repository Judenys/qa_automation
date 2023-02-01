package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/judenys_hidalgo/Desktop/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		WebElement radioButtonFemale = browserObject.findElement(By.xpath("//input[@value='female']"));
		radioButtonFemale.click();
		Thread.sleep(2000);
		WebElement radioButtonMale = browserObject.findElement(By.xpath("//input[@value='male']"));
		radioButtonMale.click();
		Thread.sleep(2000);
		WebElement radioButtonOther = browserObject.findElement(By.id("other"));
		radioButtonOther.click();
		Thread.sleep(2000);
		browserObject.close();
	}

}
