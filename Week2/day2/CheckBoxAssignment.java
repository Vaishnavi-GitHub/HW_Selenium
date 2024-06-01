package Week2.day2;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// - Click on the "Basic Checkbox.”
		WebElement basicCheckbox = driver.findElement(By.xpath("//h5[text()='Basic Checkbox']/following::div[3]"));
		basicCheckbox.click();
		// - Click on the "Notification Checkbox."
		WebElement notificationCheckbox = driver.findElement(By.xpath("//h5[text()='Notification']/following::div[3]"));
		notificationCheckbox.click();
		// - Verify that the expected message is displayed.
		Thread.sleep(2000);
		WebElement msg = driver.findElement(By.cssSelector(".ui-growl-message"));
		// WebElement msg=driver.findElement(By.xpath("//div[@role='alert']"));
		System.out.println("First alert" + msg.getText());
		Thread.sleep(2000);
		// - Click on your favorite language (assuming it's related to checkboxes).
		WebElement favLang = driver.findElements(By.cssSelector(".ui-selectmanycheckbox.ui-widget td")).get(0);
		favLang.click();
		// - Click on the "Tri-State Checkbox." - Verify which tri-state option has been
		// chosen.
		WebElement triState = driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[3]"));
		triState.click();
		System.out.println("Tri  state button is clicked," + driver
				.findElement(By.cssSelector(".ui-growl.ui-widget[id*='id_container']>div [class='ui-growl-message']"))
				.getText());
		triState.click();
		Thread.sleep(1000);
		System.out.println("Tri  state button is clicked," + driver
				.findElement(By.cssSelector(".ui-growl.ui-widget[id*='id_container']>div [class='ui-growl-message']"))
				.getText());
		triState.click();
		Thread.sleep(1000);
		System.out.println("Tri  state button is clicked," + driver
				.findElement(By.cssSelector(".ui-growl.ui-widget[id*='id_container']>div [class='ui-growl-message']"))
				.getText());

		// - Click on the "Toggle Switch." - Verify that the expected message is
		// displayed.
		WebElement toggleSwitch = driver.findElement(By.cssSelector(".ui-toggleswitch.ui-widget"));
		toggleSwitch.click();
		System.out.println(
				"Toggle clicked, Status is " + driver.findElement(By.cssSelector(".ui-growl-message")).getText());
		toggleSwitch.click();
		Thread.sleep(1000);
		System.out.println(
				"Toggle clicked again, status is " + driver.findElement(By.cssSelector(".ui-growl-message")).getText());
		// - Verify if the Checkbox is disabled. - Select multiple options on the page
		// (details may be needed).
		WebElement disabledCheck = driver
				.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::div/div/input[1]"));
		if (disabledCheck.getAttribute("aria-disabled").equals("true")) {
			System.out.println("Checkbox is disabled");
		} else {
			System.out.println("Checkbox is enabled");
		}
		// - Perform any additional actions or verifications required. - Close the web
		// browser when don
		driver.close();
	}

}
