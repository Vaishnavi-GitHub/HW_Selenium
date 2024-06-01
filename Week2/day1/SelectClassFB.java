package Week2.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassFB {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String fn="Tello"; String ln="Ti"; String mailID=fn+ln+"@gmail.com";
		//click on new account button
		driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
		//Enter first name, last name
		driver.findElement(By.name("firstname")).sendKeys(fn);
		driver.findElement(By.name("lastname")).sendKeys(ln);
		//enter email/mobile
		driver.findElement(By.name("reg_email__")).sendKeys(mailID);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(mailID);
		//set new password
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		//Entering DOB
		WebElement dropDay= driver.findElement(By.name("birthday_day"));
		WebElement dropMonth= driver.findElement(By.name("birthday_month"));
		WebElement dropYear= driver.findElement(By.name("birthday_year"));
		Select s1= new Select(dropDay);
		Select s2= new Select(dropMonth);
		Select s3=new Select(dropYear);
		s1.selectByValue("2");
		s2.selectByIndex(2);
		s3.selectByVisibleText("2000");
		//Selecting Gender
		WebElement radiobtnGender= driver.findElement(By.cssSelector("[data-name='gender_wrapper'] > span input[value='1']"));
		boolean genderSelected=radiobtnGender.isSelected();
		if(genderSelected==false) {
			radiobtnGender.click();
		}
		
		//clicking on sign up
		
		driver.findElement(By.cssSelector("button[type='submit']"));
		Thread.sleep(3000);
		driver.quit();
		

	}

}
