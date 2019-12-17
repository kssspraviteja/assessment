package week4.classroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		
		ChromeDriver browser = new ChromeDriver();
		
		browser.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		browser.switchTo().frame("iframeResult");
		browser.findElementByXPath("//button[text() = 'Try it']").click();
		Alert alert = browser.switchTo().alert();
		alert.sendKeys("Ravi Teja");
		alert.accept();
		browser.switchTo().defaultContent();
		Thread.sleep(3000);
		
		boolean displayed = browser.findElementByXPath("//p[contains(text(), 'Ravi Teja')]").isDisplayed();
		
		System.out.println(displayed);
		
	}
		
		
		
}
