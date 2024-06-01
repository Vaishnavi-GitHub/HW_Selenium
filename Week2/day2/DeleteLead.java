package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();		
		// - Enter the username. 
		// - Enter the password. 
		//- Click the Login button.
		// - Click the "crm/sfa" link. 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		driver.findElement(By.linkText("CRM/SFA")).click();
		 //- Click the "Leads" link.
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 //- Click "Find leads."
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		 //- Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 //- Enter the phone number. 
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		 //- Click the "Find leads" button. 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 //- Capture the lead ID of the first resulting lead. 
		Thread.sleep(1000);
		WebElement firstElement=driver.findElement(By.cssSelector(".x-grid3-row  a"));
		Thread.sleep(1000);
		String Fid=firstElement.getText();
		
		 //- Click the first resulting lead. 
		firstElement.click();
		 //- Click the "Delete" button. 
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		 //- Click "Find leads" again. 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		 //- Enter the captured lead ID. 
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Fid);
		 //- Click the "Find leads" button. 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		 //- Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
		System.out.println("state us of deleted record " +driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).isDisplayed()); 
		//- Close the browser. 
		driver.close();

	}

}
