package in.plumbers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericLibraries.ExcelUtils;
import GenericLibraries.PropertiesUtils;
import GenericLibraries.WebDriverUtils;
import POMClass.DatePage;
import POMClass.HomePage;
import POMClass.IsThereAnythingPage;
import POMClass.NeedPage;
import POMClass.ProblemPage;
import POMClass.ProblemPopUp;
import POMClass.ProblemWithPage;
import POMClass.ProblemWithpage;
import POMClass.TimePage;
import POMClass.WhatProblemPage;
import POMClass.WhenDoYouRequirePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectLocAndAssignTask {

	@Test
	public void selectLocAndAssign() throws Throwable{
		
		PropertiesUtils pLib=new PropertiesUtils();
		ExcelUtils eLib=new ExcelUtils();
		WebDriverUtils wLib=new WebDriverUtils();
		
		String Browser = pLib.readdatafromPropertyFile("browser");
		String URL = pLib.readdatafromPropertyFile("url");
		
		String City = eLib.readTestData("HomePage", 1, 0);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=null;
		if(Browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid input");
		}
		
		wLib.maximizeWindow(driver);
		wLib.pageLoad(driver);
		driver.get(URL);
		
		HomePage hp=new HomePage(driver);
		hp.SelectLocAndGo(City);
		
		ProblemWithpage pwp=new ProblemWithpage(driver);
		pwp.selectProblem();
		
		NeedPage np=new NeedPage(driver);
		np.selectNeed();
		
		WhatProblemPage wpp=new WhatProblemPage(driver);
		wpp.selectWhatProblem();
		
		IsThereAnythingPage ita=new IsThereAnythingPage(driver);
		ita.anythingElse();
		
		WhenDoYouRequirePage req=new WhenDoYouRequirePage(driver);
		req.selectRadioBtn();
		
		DatePage dp=new DatePage(driver);
		dp.selectDate();
		
		TimePage tp=new TimePage(driver);
		tp.selectTime();
		
	}
}
