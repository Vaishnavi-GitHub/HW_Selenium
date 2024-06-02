package Week2.day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	
	public void clicks(WebElement ele) {
		
		ele.click();
		
	}
	public void setText(WebElement ele, String text) {
		
		ele.sendKeys(text);
	}
	public void LaunchBrowser(String url,ChromeDriver driver ) {
		
		//driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
	}
	public void closeBrowser(ChromeDriver driver ) {
		
		driver.close();
		
	}
	
	

}
