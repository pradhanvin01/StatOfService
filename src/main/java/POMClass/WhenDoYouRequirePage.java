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
public class WhenDoYouRequirePage {

	@FindBy(xpath="//div[.='On a specific date']")
	private WebElement RadioBtn;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement NextBtn;
	
	/**
	 * This method consists of webdriver initialization
	 * @param driver
	 */
	public WhenDoYouRequirePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadioBtn() {
		return RadioBtn;
	}

	public WebElement getNextBtn() {
		return NextBtn;
	}
	
//Business Logic	
	public void selectRadioBtn(){
		RadioBtn.click();
		NextBtn.click();
	}
}
