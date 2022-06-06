package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This class stores all the elements and gives getters along with Business logic
 * @author vinay
 *
 */
public class DatePage {

	@FindBy(xpath="//button[@aria-label='Thursday, June 9, 2022']")
	private WebElement SpecificDate;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement NextBtn;
	
	/**
	 * This method consists of webdriver initialization
	 * @param driver
	 */
	public DatePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getSpecificDate() {
		return SpecificDate;
	}

	public WebElement getNextBtn() {
		return NextBtn;
	}
	
//Business Logic
	public void selectDate(){
		SpecificDate.click();
		NextBtn.click();
	}
	
	
}
