package week2.day1.classroom;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "./drivers/Geckodriver/geckodriver_64 bit.exe");
//		ChromeDriver driver = new ChromeDriver();
		
		FirefoxDriver driver = new FirefoxDriver(); 
		
driver.get("http://leaftaps.com/opentaps/control/main");
driver.findElementById("username").sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByPartialLinkText("Create").click();
driver.findElementByName("companyName").sendKeys("EY");

WebElement source = driver.findElementByName("dataSourceId");

Select value = new Select(source);

List<WebElement> options = value.getOptions();
int option = options.size();
 value.selectByIndex(option-12);

 
 WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");

 Select In1 = new Select(Industry);
In1.selectByValue("IND_SOFTWARE");

WebElement Ownership = driver.findElementByName("ownershipEnumId");

Select OS =new Select(Ownership);

OS.selectByVisibleText("partnership");





  

 
 
	}
}
