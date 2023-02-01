package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/judenys_hidalgo/Desktop/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		browserObject.manage().window().maximize();
		
		browserObject.findElement(By.id("alert")).click();

		Alert a = browserObject.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		
		browserObject.findElement(By.id("confirm")).click();
		
		Alert a1 = browserObject.switchTo().alert();
		System.out.println(a1.getText());
		Thread.sleep(2000);
		a1.dismiss();
		
		browserObject.findElement(By.id("prompt")).click();
		
		Alert a2 = browserObject.switchTo().alert();
		System.out.println(a2.getText());
		Thread.sleep(2000);
		a2.sendKeys("Judy");
		Thread.sleep(2000);
		a2.accept();
		
		browserObject.close();
	}

}
