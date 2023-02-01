package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "/Users/judenys_hidalgo/Desktop/chromedriver");
			// 2. Initialize Webdriver object through ChromeDriver class.
		 WebDriver browserObject = new ChromeDriver();
			// 3. Open the http://www.google.com/ link using get method.
		        browserObject.get("http://www.google.com/");
	}

}
