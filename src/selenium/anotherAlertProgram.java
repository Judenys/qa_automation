package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class anotherAlertProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/judenys_hidalgo/Desktop/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
		browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		browserObject.findElement(By.className("signinbtn")).click();
		
		Alert a = browserObject.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		browserObject.findElement(By.id("login1")).sendKeys("Hello");
		browserObject.findElement(By.className("signinbtn")).click();
		Alert a1 = browserObject.switchTo().alert();
		System.out.println(a.getText());
		a1.accept();
		browserObject.close();
	}

}
