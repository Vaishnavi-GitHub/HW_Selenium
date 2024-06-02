package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elements ele = new Elements();
		ChromeDriver driver;
		driver= new ChromeDriver();
		ele.LaunchBrowser("http://leaftaps.com/opentaps/control/main", driver);
		WebElement uName=driver.findElement(By.id("username"));
		WebElement uPwd=driver.findElement(By.id("password"));
		WebElement loginBtn=driver.findElement(By.className("decorativeSubmit"));
		ele.setText(uName, "Demosalesmanager");
		ele.setText(uPwd, "crmsfa");
		ele.submit(loginBtn);
		ele.closeBrowser(driver);

	}

}
