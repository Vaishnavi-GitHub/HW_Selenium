package Week2.day2;

//import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement confirmTitle=driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following :: button[1]"));
		
		//Click on the button with the text ‘Click and Confirm title.’ 
		confirmTitle.click();
		
		//- Verify that the title of the page is ‘dashboard.’ 
		if(driver.getTitle().equals("Dashboard")) {
			System.out.println("the title of the page is Dashboard");
			
		}
		//Navigating back to Button page
		driver.navigate().back();
		
		
		//- Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		WebElement disabledButton= driver.findElement(By.xpath("//button[contains(@class,'ui-state-disabled')]"));
		boolean state=disabledButton.isEnabled();
		if(state==false) {
				System.out.println("The button is disabled");
			}
				
			else {
				System.out.println("The button is enabled");	
			}
		 //- Find and print the position of the button with the text ‘Submit.’	
		WebElement submitButton=driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following :: button[1]"));
		Thread.sleep(2000);
		System.out.println("The Location is"+submitButton.getLocation());
		//submitButton.click();

		//- Find and print the background color of the button with the text ‘Find the Save button color.’
		WebElement saveButton= driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following :: button[1]"));
		System.out.println("The color of the button"+saveButton.getCssValue("background-color"));
		//- Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
		WebElement hwOfButton=driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following :: button[1]"));
		Dimension hw= hwOfButton.getSize();
		System.out.println("The height is " +hw.height +". The width is "+hw.width);
		//- Close the browser window. 
			driver.close();



		
		
		
		
		
	
	}

}
