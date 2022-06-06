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
public class NeedPage {

	@FindBy(xpath="//div[.='Replace']")
	private WebElement CheckBox;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement NextBtn;
	
	public NeedPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getNextBtn() {
		return NextBtn;
	}
	
//Business Logic
	public void selectNeed(){
		CheckBox.click();
		NextBtn.click();
	}
}
