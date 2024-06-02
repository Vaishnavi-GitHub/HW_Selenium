package Week2.day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterfaceAjio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// - Launch the URL https://www.ajio.com/ 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ajio.com/");
		// - In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys(Keys.ENTER);
		// - To the left of the screen under "Gender" click on "Men" 
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);
		// - Under "Category" click "Fashion Bags" 
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(1000);
		//- Print the count of the items found. 
		System.out.println(driver.findElement(By.xpath("//div [@class='filter']//strong")).getText());
		// - Get the list of brand of the products displayed in the page and print the list. 
		List<WebElement> brand=driver.findElements(By.xpath("//div [@class='brand']//strong"));
		List<String> brandName= new ArrayList<>();
		for(int i=0;i<brand.size();i++) {
			brandName.add(brand.get(i).getText());	
		}
		System.out.println(brandName);
		
		// - Get the list of names of the bags 
		List<WebElement> bag=driver.findElements(By.xpath("//div [@class='nameCls']"));
		List<String> bagName= new ArrayList<>();
		for(int i=0;i<bag.size();i++) {
			bagName.add(bag.get(i).getText());
			
		}
		System.out.println(bagName);
		driver.close();

	}

}
