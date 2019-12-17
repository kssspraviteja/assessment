package week3.concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailLists {

	public static void main(String[] args) throws InterruptedException {


		ArrayList<String> a = new ArrayList<String>();

		Set<String> b = new LinkedHashSet<String>();

		List<String> traindetails = new ArrayList<String>();


		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");

		ChromeDriver browser = new ChromeDriver();

		browser.get("https://erail.in");
		browser.manage().window().maximize();


		browser.findElementById("buttonFromTo").click();
		Thread.sleep(3000);
		browser.findElementById("chkSelectDateOnly").click();

		WebElement traintable = browser.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rowelelements = traintable.findElements(By.tagName("tr"));
		int rowsize = rowelelements.size();
		for (int i = 0; i < rowsize; i++) {

			List<WebElement> colelements = rowelelements.get(i).findElements(By.tagName("td"));

			a.add(colelements.get(1).getText());
			b.add(colelements.get(1).getText());

			//			String trainnane = colelements.get(1).getText();
		}

		List<WebElement> traininfo = rowelelements.get(1).findElements(By.tagName("td"));
		for (int i = 0; i < traininfo.size(); i++) {

			//			System.out.println(traininfo.get(i).getText());
			String details = traininfo.get(i).getText();
			traindetails.add(details);
			

		}

System.out.println(traindetails);

//		System.out.println(a.size());
//		System.out.println(b.size());
//		System.out.println(a);
//		System.out.println(b);


	}

}
