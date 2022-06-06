package GenericLibraries;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class consists of all web driver generic methods
 * @author vinay
 */
public class WebDriverUtils {

	/**
	 * This method will maximize the window
	 */
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will wait for 20 seconds for page to be loaded
	 * @param driver
	 */
	
	public void pageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
	 * This method will wait for 10 seconds for the element to be loaded
	 * @param driver
	 * @param element
	 */
	
	public void waitForElementToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method will wait for 20 seconds for element to be cliable
	 * @param driver
	 * @param element
	 */
	
	public void waitForElementToBeVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method will select the element in dropdown by index
	 * @param element
	 * @param index
	 */
	
	public void select(WebElement element, int index)
	{
		Select sel= new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * This method will select the element in dropdown by text
	 * @param element
	 * @param text
	 */
	
	public void select(String text, WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * This method will select the element in dropdown by value
	 * @param element
	 * @param Value
	 */
	
	public void select(WebElement element, String Value)
	{
		Select sel=new Select(element);
		sel.selectByValue(Value);
	}
	
	/**
	 * This method will performmouse hover action
	 * @param driver
	 * @param element
	 */
	
	public void mouseHover(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This method will drag and drop the element
	 * @param driver
	 * @param src
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	
	/**
	 * This method is used to perform right click
	 * @param driver
	 */

	public void rightClick(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	
	/**
	 * This method is used to right click on the paticular element
	 * @param driver
	 * @param element
	 */
	
	public void rightClickElement(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * This method is used to perform keyboard enter action
	 * @param driver
	 */
	
	public void keyboardAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	
	/**
	 * This method is used to perform double click action
	 * @param driver
	 */
	
	public void doubleClick(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	
	/**
	 * This method is used to perform double click action on particular element 
	 * @param driver
	 * @param element
	 */
	
	public void doubleClickOnElement(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element);
	}
	
	/**
	 * This method perform keyboard enter click action 
	 * @throws Throwable
	 */
	
	public void enterKeyPress() throws Throwable
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	/**
	 * This method will perform keyboard enterrealse action 
	 * @throws Throwable
	 */
	
	public void enerKeyRelease() throws Throwable
	{
		Robot rb=new Robot();
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	/**
	 * This method will perform switch frame action by index 
	 * @param driver
	 * @param index
	 */
	
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method will perform switch frame action by name0rid
	 * @param driver
	 * @param nameorid
	 */
	
	public void switchTOFrame(WebDriver driver, String nameorid)
	{
		driver.switchTo().frame(nameorid);
	}
	
	/**
	 * This method will perform switch frame action by element
	 * @param driver
	 * @param address
	 */
	
	public void switchToFrame(WebDriver driver, WebElement address)
	{
		driver.switchTo().frame(address);
	}
	
	/**
	 * This method will accept the alert
	 * @param driver
	 */
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method will cancel the allert
	 * @param driver
	 */
	
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method will switch the window to the next child browser and get the id and title
	 * @param driver
	 * @param PartialWinTitle
	 */
	
	public void switchToWindo(WebDriver driver, String PartialWinTitle)
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		while(it.hasNext())
		{
			String winid = it.next();
			
			String CurrentWinTitle = driver.switchTo().window(winid).getTitle();
			
			if(CurrentWinTitle.contains(PartialWinTitle))
			{
				break;
			}
		}

	}	
		
	/**
	 * This method wull take the screen shot and store it in the specified folder
	 * @param driver
	 * @param ScreenShotName
	 * @throws Throwable
	 */
	public String getScreenShot(WebDriver driver, String ScreenShotName) throws Throwable
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 String path = ".\\ScreenShot\\"+ScreenShotName+".png";
		 File dst=new File(path);
		 FileUtils.copyFile(src, dst);
		 
		 return dst.getAbsolutePath();
	}
	
	/**
	 * This method will scroll randomly until the specified axis
	 * @param driver
	 */
	
	public void scrollAction(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(o, 500)", "");
	}
	
	/**
	 * This method will scroll until the specified element is found
	 * @param driver
	 * @param element
	 */
	
	public void scrollAction(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int Y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+Y+")", element);
		//js.executeScript("argument[0], scrollIntoView()", element);
	}	
}
