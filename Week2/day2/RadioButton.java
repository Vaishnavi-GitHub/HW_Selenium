package Week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//-select 'Your most favourite browser' from the radio buttons 
		WebElement favBrowser= driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/following::label[text()='Chrome'][1]"));
		favBrowser.click();
		Thread.sleep(1000);
		//-Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
		WebElement unSelectable=driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::span[1]"));
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::span[1][contains(@class,'blank')]")).isDisplayed()) {
			System.out.println("the state of the Radio button is false");
		}
		else if(driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::span[1][contains(@class,'bullet')]")).isDisplayed()) {
			System.out.println("the state of the Radio button is true");
		}
		
		Thread.sleep(2000);
		unSelectable.click();
		if(driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::span[1][contains(@class,'bullet')]")).isDisplayed()) {
			System.out.println("the state of the Radio button is true");
		}
		Thread.sleep(1000);
		//-Identify the radio button that is initially selected by default. 
		System.out.println("The radio buttons which are enabled by default is/are");
		List<WebElement> checkedByDefault=driver.findElements(By.xpath("//div[@class='ui-helper-hidden-accessible']/input[not(@onchange)] [@checked]/following::label[1]"));
		for(int i=0;i<checkedByDefault.size();i++) {
			System.out.println(checkedByDefault.get(i).getText());
			
		}
		//-Check and select the age group (21-40 Years) if not already selected. 
		
		WebElement ageGroup1 = driver.findElement(By.xpath("//input[@value='21-40 Years']"));
		WebElement ageGroup2=driver.findElement(By.xpath("//input[@value='21-40 Years']/following::span[contains(@class,'bullet')]"));
		System.out.println(ageGroup1.isSelected());
		System.out.println(ageGroup2.isSelected());
		//System.out.println(ageGroup1.getAttribute("checked"));
		//Thread.sleep(2000);
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", ageGroup1);
//		Thread.sleep(2000);
//		System.out.println(ageGroup1.isSelected());
//		//ageGroup1.click();
		//Thread.sleep(2000);
		//ageGroup2.click();
		//Thread.sleep(2000);
		
		
	if(ageGroup1.isSelected()) 
		{System.out.println("age group (21-40 Years)is already selected");}
		else {
			ageGroup2.click();
			Thread.sleep(2000);
		    System.out.println("The radio button age group (21-40 Years)is "+ageGroup1.isSelected());			
	}
		//close browser
		driver.close();

	}

}
