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
public class ProblemWithpage {

	@FindBy(xpath="//div[.='Toilet']")
	private WebElement CheckBox;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement NextBtn;

	public ProblemWithpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getNextBtn() {
		return NextBtn;
	}

//Business Logic
	public void selectProblem(){
		CheckBox.click();
		NextBtn.click();
	}
	
}
