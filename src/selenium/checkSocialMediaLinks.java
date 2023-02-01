package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkSocialMediaLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/judenys_hidalgo/Desktop/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
		browserObject.get("https://www.itlearn360.com/");
        browserObject.findElement(By.className("fa-facebook")).click();
        System.out.println(browserObject.getTitle());
        browserObject.navigate().back();
        browserObject.findElement(By.className("fa-twitter")).click();
        System.out.println(browserObject.getTitle());
        browserObject.navigate().back();
        browserObject.findElement(By.className("fa-linkedin")).click();
        System.out.println(browserObject.getTitle());
        browserObject.navigate().back();
        browserObject.findElement(By.className("fa-youtube")).click();
        System.out.println(browserObject.getTitle());
        browserObject.navigate().back();
        browserObject.close();
	}

}
