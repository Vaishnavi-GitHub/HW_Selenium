package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Entering incorrect username and password. 
		driver.findElement(By.id("username")).sendKeys("Demo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("hello");
		//- Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		//-printing error log
		System.out.println(driver.findElement(By.className("serviceError")).getText()); 
		//Enter correct username and password. 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//- Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();		
		//- Click on the "CRM/SFA" link. 
		driver.findElement(By.linkText("CRM/SFA")).click();
		//- Click on the "Accounts" tab. 
		driver.findElement(By.linkText("Accounts")).click();
		//- Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		//- Enter an account name. 
		String ac_input="Angelone";
		driver.findElement(By.id("accountName")).sendKeys(ac_input);
		//- Enter a description as "Selenium Automation Tester." 
		driver.findElement(By.cssSelector("textArea[name=\"description\"]")).sendKeys("Selenium Automation Tester." );
		//- Select "ComputerSoftware" as the industry. 
		WebElement dropDownIndustry= driver.findElement(By.name("industryEnumId"));
		Select sl= new Select(dropDownIndustry);
		sl.selectByIndex(2);
		//- Select "S-Corporation" as ownership using SelectByVisibleText. 
		WebElement dropDownOwnership= driver.findElement(By.name("ownershipEnumId"));
		Select sl2= new Select(dropDownOwnership);
		sl2.selectByVisibleText("S-Corporation");		
		//- Select "Employee" as the source using SelectByValue. 
		WebElement dropDownSource=driver.findElement(By.id("dataSourceId"));
		Select sl3= new Select(dropDownSource);
		sl3.selectByValue("LEAD_EMPLOYEE");
		//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement dropDownMarketingCampaign=driver.findElement(By.id("marketingCampaignId"));
		Select sl4=new Select(dropDownMarketingCampaign);
		sl4.selectByIndex(6);
		//- Select "Texas" as the state/province using SelectByValue. 
		WebElement dropDownState=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sl5=new Select(dropDownState);
		sl5.selectByValue("TX");
		//- Click the "Create Account" button. 
		driver.findElement(By.className("smallSubmit")).click();
		//- Verify that the account name is displayed correctly.
		String ac_name=driver.findElement(By.cssSelector("td[class='titleCell'] + td")).getText();
		String inp[]=ac_name.split("\\(");
		if(inp[0].trim().equals(ac_input)) {
			System.out.println("Account name displayed correctly");
			
		}
		//- Close the browser window.
		driver.close();
		
	}

}
