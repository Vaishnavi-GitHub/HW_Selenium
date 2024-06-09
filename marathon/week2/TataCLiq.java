package marathon.week2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TataCLiq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement brands=driver.findElements(By.cssSelector(".DesktopHeader__arrow")).get(1);
		Actions ac=new Actions(driver);
		Thread.sleep(1000);
		ac.moveToElement(brands).perform();
		ac.moveToElement(driver.findElement(By.xpath("//div[@class='DesktopHeader__categoryDetailsValue'] [text()='Watches & Accessories']")))
		.moveToElement(driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']")))
		.click()
		.perform();
		Thread.sleep(1000);
		
	Select dd=new Select(driver.findElement(By.cssSelector(".SelectBoxDesktop__hideSelect")));
    dd.selectByVisibleText("New Arrivals");
	Thread.sleep(1000);
	//print the listed prices of all items
	List<WebElement> priceList=driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3[@class='ProductDescription__boldText']"));
	for(WebElement e: priceList) {
		System.out.println(e.getText());
	}
	String firstItemPrice=priceList.get(0).getText();
	//click on the first item
	driver.findElement(By.cssSelector(".PlpComponent__base")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	Set<String> windows=driver.getWindowHandles();
	List<String> windowsList=new ArrayList<>(windows);
	driver.switchTo().window(windowsList.get(1));
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ProductDescriptionPage__buttonWrapper>div:nth-child(2) span")));
	
	//click on add to cart
	driver.findElement(By.cssSelector(".ProductDescriptionPage__buttonWrapper>div:nth-child(2) span")).click();
	
	//Validating toast message
	if(driver.findElement(By.cssSelector(".Toast__base>div.Toast__textHolder")).getText().equals("The item has been added to your bag"))
	
		{
		System.out.println("Item got added to the cart");
		}
	driver.findElement(By.cssSelector(".ProductDescriptionPage__buttonWrapper>div:nth-child(2) span")).click();
	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".SecondaryLoader__loader"))));
	//Take screenshot and
	Thread.sleep(2000);
	// Validating bag total and first item price
	String bagTotal=driver.findElement(By.cssSelector(".DesktopCheckout__section >div.DesktopCheckout__row:nth-child(1).DesktopCheckout__row div.DesktopCheckout__info.DesktopCheckout__label")).getText();	
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("TataCliqCart.png"));
	if(bagTotal.split(Pattern.quote("."))[0].trim().equals(firstItemPrice.trim())){
		System.out.println("Bag Total matches");
		}
	else {
		System.out.println("Bag Total is not matching");
		System.out.println("bagTotal " +bagTotal.split(Pattern.quote("."))[0]);
		System.out.println("firstItemPrice " +firstItemPrice);
		
	}
	
	driver.quit();
	}

}
