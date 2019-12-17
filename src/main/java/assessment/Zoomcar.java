package assessment;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomcar {


	public static void main(String[] args) throws InterruptedException {

		//		



		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();
		// Implicitly wait
		browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		browser.get("https://www.zoomcar.com/chennai/");
		browser.manage().window().maximize();
		browser.findElementByXPath("//a[text() = 'Start your wonderful journey']").click();
		browser.findElementByXPath("(//div[@class = 'items'])[3]").click();
		browser.findElementByClassName("proceed").click();

		Thread.sleep(1000);

		//		Take today's date and capture the date only
		java.util.Date today = new java.util.Date();
		int date = today.getDate();
		int tomorrow = date +1;
		System.out.println(tomorrow); //conforminng tomorrow's date

		//Convert Integer to String to add to Xpath
		String Stom = Integer.toString(tomorrow);
		String xpath = "//div[contains( text()," + Stom + ")]";
		System.out.println(xpath);
		//Click on tomorrow's date
		browser.findElementByXPath(xpath).click();
		browser.findElementByClassName("proceed").click();
		System.out.println("The date is " + browser.findElementByXPath("(//div[@class = 'label time-label'])[1]").getText());
		browser.findElementByClassName("proceed").click();
		Thread.sleep(3000);

		//Check the number of search results
		List<WebElement> searchresults = browser.findElementsByXPath("//div[@class = 'details']");
		System.out.println("The number of cars available are " + searchresults.size());



		//		Thread.sleep(2000);
		//		browser.findElementByXPath("//div[text() = ' Price: High to Low ']").click();
		//		System.out.println("Highest priced Car ride is " + browser.findElementByXPath("(//div[@class = 'price'])[1]").getText());

		// Find the price details
		List<WebElement> priceelements = browser.findElementsByXPath("//div[@class = 'price']");
		priceelements.size();
		//Create an empty list for price details

		List<Integer> pricedetails = new ArrayList<Integer>();
		for (int i = 0; i < priceelements.size(); i++) {
			//remove the unwanted characters
			String text = priceelements.get(i).getText().replace("₹ ", "").replace(",", "");
			//convert an String into Integer
			int parseInt = Integer.parseInt(text);
			//Add the price values to list
			pricedetails.add(parseInt);
		}
		System.out.println(pricedetails);

		// capture the car names
		List<WebElement> carelements = browser.findElementsByXPath("//h3");
		//Create a new list to capture car names
		List<String> cardetails = new ArrayList<String>();
		for (int i = 0; i < carelements.size(); i++) {
			String cars = carelements.get(i).getText();
			cardetails.add(cars);
		}

		//List of cars
		System.out.println(cardetails);

		//To capture and display in the order
		Map<Integer, String> selection = new LinkedHashMap<Integer, String>();
		for (int i = 0; i < carelements.size(); i++) {
			//Add the list items into Map
			selection.put(pricedetails.get(i), cardetails.get(i));
		}
		System.out.println(selection);

//		Set<Integer> Priceset = selection.keySet();
		//Sort the Price list
		Collections.sort(pricedetails);
		System.out.println(pricedetails);

		System.out.println("The highest of the car is " + pricedetails.get(priceelements.size()-1));

		System.out.println("The booking is for car " + selection.get(pricedetails.get(priceelements.size()-1)));

		Integer Highestprice = pricedetails.get(priceelements.size()-1);

		String highestpricestring = NumberFormat.getIntegerInstance().format(Highestprice);


		//		String highestpricestring = Integer.toString(Highestprice);

		String xpathfinalprice = "//div[contains( text(),'" +highestpricestring + "')]/following-sibling::button";

		System.out.println(xpathfinalprice);
		browser.findElementByXPath(xpathfinalprice).click();


		//		browser.findElementByXPath("(//button[@class = 'book-car'])[1]").click();




	}
}
