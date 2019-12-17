package assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACME {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");

		ChromeDriver browser = new ChromeDriver();

		browser.get("https://acme-test.uipath.com/account/login");
		browser.manage().window().maximize();
		browser.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		browser.findElementById("email").sendKeys(Keys.TAB);
		browser.findElementById("password").sendKeys("leaf@12");
		browser.findElementById("buttonLogin").click();
		Thread.sleep(2000);
		WebElement vendors = browser.findElementByXPath("(//button[@class = 'btn btn-default btn-lg'])[4]");

		Actions builder = new Actions(browser);

		builder.moveToElement(vendors).perform();

		Thread.sleep(1000);
		browser.findElementByXPath("//a[text() = 'Search for Vendor']").click();
		browser.findElementById("vendorName").sendKeys("Blue Lagoon");
		browser.findElementById("buttonSearch").click();
		WebElement webtable = browser.findElementByXPath("//table [@class = 'table']");
//		
//		List<WebElement> row = webtable.findElements(By.tagName("tr"));
//		System.out.println(row);
//		List<WebElement> col = row.get(0).findElements(By.tagName("td"));
//		System.out.println(col);
//		System.out.println(col.get(1).getText());
		
		String country = browser.findElementByXPath("//table/tbody/tr/td[5]").getText();
		System.out.println(country);
		
		
		
		
	}
}
