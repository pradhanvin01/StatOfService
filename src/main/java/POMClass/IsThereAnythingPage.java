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
public class IsThereAnythingPage {

	@FindBy(xpath="//button[.='Skip']")
	private WebElement Skipbtn;
	
	/**
	 * This method consists of webdriver initialization
	 * @param driver
	 */
	public IsThereAnythingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getSkipbtn() {
		return Skipbtn;
	}
	
//Business Logic
	public void anythingElse(){
		Skipbtn.click();
	}
	
	
	
}
