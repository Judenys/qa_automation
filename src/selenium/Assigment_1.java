package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assigment_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/judenys_hidalgo/Desktop/chromedriver");
		// 1. Open the browser.
		WebDriver browserObject = new ChromeDriver();
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		// 2. Enter the URL.
		browserObject.get("http://practice.automationtesting.in/");
		browserObject.manage().window().maximize();
		
		
		// 3. Click on the shop button.
		browserObject.findElement(By.linkText("Shop")).click();
		browserObject.navigate().to("https://practice.automationtesting.in/shop/");
		System.out.println(browserObject.getTitle());
		
		// 4. Click on home button
		browserObject.findElement(By.id("site-logo")).click();
		System.out.println(browserObject.getTitle());
		
		// 5. Testing homepage is having three sliders or not.
		browserObject.findElement(By.id("n2-ss-6-arrow-next")).click();
		browserObject.findElement(By.id("n2-ss-6-arrow-next")).click();
		
		// 6. Clicking the image in the arrivals works or not.
		browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
		
		System.out.println(browserObject.getTitle());
		browserObject.navigate().back();
		
		browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img")).click();
		System.out.println(browserObject.getTitle());
		browserObject.navigate().back();
		
		browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
		System.out.println(browserObject.getTitle());
		
		// 7. Test whether it is navigating to next page where the user can add that book into his basket or not.
		browserObject.findElement(By.className("single_add_to_cart_button")).submit();
		System.out.println(browserObject.getTitle());
		WebElement addedMessage =browserObject.findElement(By.className("woocommerce-message"));
		System.out.println(addedMessage.getText());
		
		// 8. Clicking on Reviews tab for the book you clicked on works or not.
		Actions action = new Actions(browserObject);
		WebElement reviewsTab = browserObject.findElement(By.xpath("//a[@href='#tab-reviews']"));
		action.click(reviewsTab).build().perform();
		
		
		
		// 9.The description regarding that book the user clicked on should showing details or not.
		
		
		browserObject.close();
	}

}
