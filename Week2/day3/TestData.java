package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestData {
	ChromeDriver driver= new ChromeDriver();
	
	
	public void enterCredentials() {
		driver.findElement(By.className("decorativeSubmit")).click();	
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	public void navigateToHomePage() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestData td= new TestData();
		td.navigateToHomePage();

	}

}
