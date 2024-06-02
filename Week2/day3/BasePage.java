package Week2.day3;

import org.openqa.selenium.WebElement;

public class BasePage {
	
	public void findElement(WebElement el) {
		
		if(el.isDisplayed()) {System.out.println("Element is present");}
		else {System.out.println("Element is not present");}
		
	}
	public void clickElement(WebElement el) {
		el.click();
	}
	public void enterText(WebElement el, String text) {
		el.sendKeys(text);
		
	}
	public void performCommonTasks() {
		System.out.println("Perform tasks from BasePage");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePage bp= new BasePage();
		bp.performCommonTasks();

	}

}
