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
public class HomePage extends WebDriverUtils{
	
	@FindBy(xpath="//button[normalize-space(text())='Go']")
	private WebElement GoBtn;
	
	@FindBy(xpath="//div[@data-test='close_button']")
	private WebElement ClosePop;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement NextBtn;
	
	@FindBy(xpath="//div[@data-test='cancel_button']")
	private WebElement CancelLnk;
	
	public WebElement getClosePop() {
		return ClosePop;
	}

	public WebElement getCancelLnk() {
		return CancelLnk;
	}

	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getGoBtn() {
		return GoBtn;
	}
	
//Business Logics
	public void SelectLocAndGo(String Loc){
		ClosePop.click();
		CancelLnk.click();
		GoBtn.click();
		NextBtn.click();
	}
}
