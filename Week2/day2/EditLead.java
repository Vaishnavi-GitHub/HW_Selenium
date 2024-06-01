package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
		
		//- Enter the Username as "DemoSalesManager" and the Password as "crmsfa". 
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
        //- Click on the Login Button. - Click on the CRM/SFA Link. 
driver.findElement(By.className("decorativeSubmit")).click();	
driver.findElement(By.linkText("CRM/SFA")).click();
		//- Click on the Leads Button. 
driver.findElement(By.xpath("//a[text()='Leads']")).click();
//- Click on Create Lead. 
driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//- Enter the CompanyName Field Using Xpath. 
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("LeadWTe");
		//- Enter the FirstName Field Using Xpath. 
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("FNamew");
		//- Enter the LastName Field Using Xpath.
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("LName");
		//- Enter the FirstName (Local) Field Using Xpath. 
driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("LocalFNAme");
		// - Enter the Department Field Using any Locator of Your Choice. 
driver.findElement(By.cssSelector("input[name=\"departmentName\"]")).sendKeys("Department");
		// - Enter the Description Field Using any Locator of your choice. 
driver.findElement(By.cssSelector("textarea[name=\"description\"]")).sendKeys("Description");
		// - Enter your email in the E-mail address Field using the locator of your choice.
driver.findElement(By.cssSelector("input#createLeadForm_primaryEmail[name=\"primaryEmail\"]")).sendKeys("sample123@gmail.com");		
// - Select State/Province as NewYork Using Visible Text.
WebElement proviceDD=driver.findElement(By.cssSelector("select[name='generalStateProvinceGeoId']"));
Select sd=new Select(proviceDD);
sd.selectByVisibleText("New York");
		// - Click on the Create Button. 
driver.findElement(By.cssSelector(".smallSubmit")).click();
		// - Click on the edit button. 
Thread.sleep(1000);
driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// - Clear the Description Field.
driver.findElement(By.cssSelector("textarea[name=\"description\"]")).clear();

		// - Fill the Important Note Field with Any text.
driver.findElement(By.cssSelector("textarea[name='importantNote']")).sendKeys("important");
		// - Click on the update button.
driver.findElement(By.cssSelector("input[value='Update']")).click();
		// - Get the Title of the Resulting Page.  
Thread.sleep(1000);
System.out.println(driver.getTitle());
		// - Close the browser window.
driver.close();
	}

}
