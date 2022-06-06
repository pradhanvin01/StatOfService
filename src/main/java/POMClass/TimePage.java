package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverUtils;

/**
 * This class stores all the elements and gives getters along with Business logic
 * @author vinay
 *
 */

public class TimePage extends WebDriverUtils{

	@FindBy(xpath="//option[.='09:30']")
	private WebElement SpecificTime;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement NextBtn;
	
	/**
	 * This method consists of webdriver initialization
	 * @param driver
	 */
	public TimePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getSpecificTime() {
		return SpecificTime;
	}

	public WebElement getNextBtn() {
		return NextBtn;
	}

//Business Logic
	public void selectTime(){
		SpecificTime.click();
		NextBtn.click();
	}
	
}
