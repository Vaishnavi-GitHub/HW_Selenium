package week1;

import java.time.Duration;
import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Type "Bags for b" in the Search box
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Bags for b");
		Thread.sleep(1000);
		//Choose the 	 item in the result (bags for boys)
		driver.findElement(By.cssSelector(".s-suggestion-container")).click();
		Thread.sleep(1000);
		//Print the total number of results (like 50000)
		System.out.println("Results "+driver.findElements(By.cssSelector(".a-section.a-spacing-small.a-spacing-top-small")).get(0).getText());
		//Select the first 2 brands in the left menu
		List<WebElement> brand=driver.findElements(By.cssSelector("#brandsRefinements span[data-csa-c-type=\"element\"] .a-spacing-micro input + i"));
		brand.get(0).click();
		Thread.sleep(2000);
		driver.findElements(By.cssSelector("#brandsRefinements span[data-csa-c-type=\"element\"] .a-spacing-micro input + i")).get(1).click();
		//Choose New Arrivals (Sort)
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".a-button-text.a-declarative")).click();
		Thread.sleep(1000);
		driver.findElements(By.cssSelector("a#s-result-sort-select_4")).get(0).click();
		Thread.sleep(1000);
		//Print the first resulting bag info
		System.out.println("Bag Name is "+driver.findElements(By.cssSelector("span.a-size-base-plus.a-color-base.a-text-normal")).get(0).getAttribute("innerHTML"));
		System.out.println("Price is "+driver.findElements(By.cssSelector(".a-price .a-offscreen")).get(0).getAttribute("innerHTML"));
		//Get the page title and close the browser(driver.close())
		System.out.println("Title of the page is " +driver.getTitle());
		Thread.sleep(1000);
		driver.close();
		
	}

}
