package Week2.day3;

import org.openqa.selenium.By;


public class LoginTestData extends TestData {
	//ChromeDriver driver= new ChromeDriver();
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
	}
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LoginTestData ltd= new LoginTestData();
      ltd.navigateToHomePage();
      ltd.enterUsername();
      ltd.enterPassword();
      ltd.enterCredentials();
      ltd.navigateToHomePage();
      ltd.driver.close();
    
	}

}
