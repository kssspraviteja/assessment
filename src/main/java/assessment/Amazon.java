package assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");

	ChromeDriver browser = new ChromeDriver();

	browser.manage().window().maximize();
	browser.get("https://www.amazon.in/");
	browser.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
	browser.findElementByXPath("(//input[@class = 'nav-input'])[1]").click();
	Thread.sleep(2000);
	String Mobileprice = browser.findElementByXPath("(//span[@class = 'a-offscreen'])[1]").getText();
	System.out.println("The mobile price is" + Mobileprice);
	browser.findElementByXPath("(//div[@class = 'a-section aok-relative s-image-fixed-height'])[1]").click();
	Set<String> windowHandles = browser.getWindowHandles();
	List<String> lst = new ArrayList<String>(windowHandles);
	int numwind = lst.size();
	browser.switchTo().window(lst.get(lst.size()-1));
	 System.out.println(browser.getTitle());
	System.out.println("Number of ratings are " + browser.findElementByXPath("//span[@id = 'acrCustomerReviewText']").getText());
	browser.findElementById("add-to-cart-button").click();
	Thread.sleep(2000);
	System.out.println(browser.findElementByXPath("//h1[@class = 'a-size-medium a-text-bold']").getText());
	browser.findElementById("hlb-ptc-btn-native").click();
	System.out.println("The title is " + browser.getTitle());
	browser.findElementById("continue").click();
	System.out.println(browser.findElementByXPath("(//div[@class = 'a-alert-content'])[2]").getText());
	browser.quit();
	
}
	
	
	
}