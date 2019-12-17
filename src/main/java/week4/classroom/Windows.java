package week4.classroom;


import java.util.ArrayList;
import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		
		ChromeDriver browser = new ChromeDriver();
		
		browser.get("http://leafground.com/pages/Window.html");
		
		browser.findElementByXPath("//button[text() = 'Open Multiple Windows']").click();
		
		Set<String> windowHandles = browser.getWindowHandles();
		System.out.println("Number of browsers opened is " + windowHandles.size());
		
		List<String> aList = new ArrayList<String>(windowHandles);
		
		System.out.println(aList);
		aList.size();
		
		aList.get(windowHandles.size()-1);
		browser.switchTo().window(aList.get(windowHandles.size()-1));
		System.out.println(browser.getTitle());
		
		
		
		
		
	}
}
