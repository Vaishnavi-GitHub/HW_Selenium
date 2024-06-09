package marathon.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {		
		/*
		 * Credential:
===========
Instance URL:https://dev207867.service-now.com

Username: admin
Current password: xT9tG^*1pwTO
*/

	 ChromeDriver driver= new ChromeDriver();
	 String uName="admin"; String pWd="xT9tG^*1pwTO";
	 driver.get("https://dev207867.service-now.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.cssSelector("#user_name")).sendKeys(uName);
	 driver.findElement(By.cssSelector("#user_password")).sendKeys(pWd);
	 driver.findElement(By.cssSelector("#sysverb_login")).click();
	// click on All f51912f4c700201072b211d4d8c26010
	 Thread.sleep(1000);            
	 WebElement All=driver.findElement(By.xpath("//macroponent-f51912f4c700201072b211d4d8c26010")).getShadowRoot()
			 .findElement(By.cssSelector("sn-polaris-layout")).getShadowRoot()
			 .findElement(By.cssSelector("sn-polaris-header")).getShadowRoot()
			 .findElement(By.cssSelector("nav.polaris-layout > div.polaris-header.can-animate.polaris-enabled div.sn-polaris-navigation.polaris-header-menu > div[aria-label='All']"));
			All.click();
			Thread.sleep(2000);
			// click on service catalog
			WebElement serviceCatalog=driver.findElement(By.xpath("//macroponent-f51912f4c700201072b211d4d8c26010")).getShadowRoot()
					 .findElement(By.cssSelector("sn-polaris-layout")).getShadowRoot()
					 .findElement(By.cssSelector("sn-polaris-header")).getShadowRoot()
					 .findElement(By.cssSelector("nav.polaris-layout > div > sn-polaris-menu")).getShadowRoot()
					 .findElement(By.cssSelector("nav div div sn-collapsible-list")).getShadowRoot()
			         .findElement(By.cssSelector("div > div >ul > li.sn-polaris-nav-list-item.is-collapsible-item.can-animate:nth-child(3) > span > a"));
			serviceCatalog.click();
			Thread.sleep(4000);
           // click on mobile
		        SearchContext mobileShadowRoot=driver.findElement(By.xpath("//macroponent-f51912f4c700201072b211d4d8c26010")).getShadowRoot();
				driver.switchTo().frame(mobileShadowRoot.findElement(By.cssSelector("iframe#gsft_main")));
			    WebElement el=driver.findElement(By.cssSelector("#dropzone2>div:nth-child(4)> div td a"));
                el.click();
		        Thread.sleep(4000);
		        driver.switchTo().parentFrame();
		  // click on Apple iphone 13
		        driver.switchTo().frame(mobileShadowRoot.findElement(By.cssSelector("iframe#gsft_main")));
			    WebElement el_link=driver.findElement(By.cssSelector("a>h2>strong"));
			    el_link.click();
			    Thread.sleep(3000);
			    
        //Filling necessary details
			    WebElement radioNo=driver.findElement(By.cssSelector("fieldset span:nth-child(2) label"));
			    radioNo.click();
			    
			    Select dd= new Select(driver.findElement(By.cssSelector("select.form-control.cat_item_option ")));
			    dd.selectByValue("Unlimited");
			    
       //Add to cart
       driver.findElement(By.cssSelector("#oi_add_to_cart_button")).click();
       String subTotalInDollars=driver.findElement(By.cssSelector(".sc_cart_subtotal_value.sc_cart_cell_right>strong")).getText();
       System.out.println(subTotalInDollars);
       // Proceed to checkout
       WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
       wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#catalog_cart_proceed_checkout")));
       driver.findElement(By.cssSelector("#catalog_cart_proceed_checkout")).click();
       Thread.sleep(2000);
       //Request number
       String reqNo=driver.findElement(By.cssSelector("a#requesturl")).getText();
       System.out.println("The Order Request no. is " +reqNo);
       String totalInDollars=driver.findElement(By.cssSelector("td.checkoutTotalLabel+td.checkoutTotalSum")).getText();
       if(totalInDollars.equals(subTotalInDollars)) {
    	   System.out.println("the Total and subtotal price matches");   	   
       }
       else{
    	   System.out.println("SubTotal and total price mismatch" + "totol is " +totalInDollars+ "sub +totol is " +subTotalInDollars );    	     	   
       }
       driver.quit();
           
	
	 
	 
	 
	 
	 
	}

}
