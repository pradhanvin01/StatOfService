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
public class WhatProblemPage {


	@FindBy(xpath="//div[.='Leak in a pipe']")
	private WebElement CheckBox;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement Nextbtn;
	
	/**
	 * This method consists of webdriver initialization
	 * @param driver
	 */
	public WhatProblemPage(WebDriver driver){
		PageFactory.initElements(driver, this);	
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getNextbtn() {
		return Nextbtn;
	}
	
//Business Logic
	public void selectWhatProblem(){
		CheckBox.click();
		Nextbtn.click();
	}
	
	
	
}
