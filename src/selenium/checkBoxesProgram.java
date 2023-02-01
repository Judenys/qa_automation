package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/judenys_hidalgo/Desktop/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		WebElement checkBoxButtonBike = browserObject.findElement(By.xpath("//input[@value='Bike']"));
		checkBoxButtonBike.click();
		WebElement checkBoxButtonBoat = browserObject.findElement(By.xpath("//input[@value='boat']"));
		checkBoxButtonBoat.click();
		WebElement checkBoxButtonHorse = browserObject.findElement(By.xpath("//input[@value='horse']"));
		checkBoxButtonHorse.click();
		
		browserObject.close();
	}

}
