package firsttestngpackage;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.ITestContext;
import java.util.Arrays;
import java.util.List;

import firsttestngpackage.SelectorRepo;
import org.openqa.selenium.WebElement;
import firsttestngpackage.PageObjectOne;


public class FirstTestNGFile {
	WebDriver driver;
	String baseUrl, nodeURL;
	private String suiteParam;
	
	 PageObjectOne pageObjOne = new PageObjectOne();
	 SelectorRepo selectors = new SelectorRepo();
	
	 
  @BeforeTest
  public void setUp() throws MalformedURLException {
	 
	  driver=pageObjOne.driver;
  }
 
  @AfterTest
	public void afterTest(){
     driver.quit();

  }
  
  @BeforeClass
  @Parameters({"testParam"})
  public void init(String suiteParam) {
    this.suiteParam = suiteParam;
  }
  
  @Test (priority=1)
  public void gotoURL(){
	  
	  pageObjOne.goTo();
  }
 
  @Test (priority=2)
  public void clickSelenium(){
	  List<WebElement>  clickSeleniumHandler = pageObjOne.clickSelenium();
	  clickSeleniumHandler.get(0).click();
	  Assert.assertEquals("api-button blue_over blue_select", clickSeleniumHandler.get(1).getAttribute("class"));
  }
  
  @Test  (priority=3)
  public void clickDeviceMenu(){
	  List<WebElement>   deviceMenuHandler = pageObjOne.clickDeviceMenu();
	  deviceMenuHandler.get(0).click();
	  //Assert.assertEquals("", deviceMenuHandler.get(1).getAttribute("class"));
  }
  
  @Test  (priority=4)
  public void SelectPC(){
	  WebElement  PCSelect = pageObjOne.SelectPC();
	  PCSelect.click();
	  //Assert.assertEquals("api-button blue_over blue_select", PCSelect.getAttribute("class"));
  }
  
  
  @Test (priority=5)
  public void ClickOSMenu(){
	  List<WebElement>  OSMenuHandler = pageObjOne.ClickOSMenu();
	  OSMenuHandler.get(0).click();
	  Assert.assertEquals("ng-binding", OSMenuHandler.get(1).getAttribute("class"));
  }
  
  @Test (priority=6)
  public void SelectWinXP(){
	  WebElement  XPSelectWin = pageObjOne.SelectWinXP();
	  XPSelectWin.click();
	  // Assert.assertEquals("ng-binding", OSMenuCheck.getAttribute("class"));
  }
  
  @Test (priority=7)
  public void ClickBrowserMenu(){
	  WebElement  BrowserMenuClick = pageObjOne.ClickBrowserMenu();
	  BrowserMenuClick.click();
	// Assert.assertEquals("Chrome", browserMenuCheck.getText());
  }
  
  
  
  @Test(priority=8)
  public void ClickChromeTab(){
	  WebElement  ChromeTabClick = pageObjOne.ClickChromeTab();
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selectors.chromeTab)));
	  ChromeTabClick.click();
 	 // Assert.assertEquals("40.0", chromeTabCheck.getText());
  }
  
  @Test(priority=9)
  public void Select40(){
	  WebElement  select40 = pageObjOne.Select40();
	  select40.click();
	// Assert.assertEquals("list-element selected", select40Check.getAttribute("class"));
  }
  
  @Test(priority=10)
  public void ClickJavaTab(){
	  WebElement  JavaTabClick = pageObjOne.ClickJavaTab();
	  JavaTabClick.click();
	// Assert.assertEquals("list-element selected", select40Check.getAttribute("class"));
  }
  
  
  @Test(priority=11)
  public void ClickCopyButton(){
	  WebElement  CopyButtonClick = pageObjOne.ClickCopyButton();
	  CopyButtonClick.click();
	// Assert.assertEquals("list-element selected", select40Check.getAttribute("class"));
  }
  
  
  @Test(priority=12)
  public  void test1(ITestContext c) {
	  
	    System.out.println("FirstTestNGFile.test1 parameter:" + c.getCurrentXmlTest().getParameter("testParam"));

	  }
  
  @DataProvider(name = "testDataProvider")
  public Object[][] createData1(ITestContext context) {
	  String testParam = context.getCurrentXmlTest().getParameter("testParam");
	  
	   int theNums[][] = new int[][] {{10,20},{100,110}};
	  
	  
   return new Object[][] {
	   
	   { testParam, theNums }
  
  };
   
  }
  
  @Parameters({"testParam"})
  @Test(dataProvider = "testDataProvider") 

  public  void testingParam( String DPparam1, int[][] DPparam2) {
	  
	  System.out.println("xml param through data provider:  " + DPparam1);
	  System.out.println("configured param from data provider: " + DPparam2[0][0]);
	  System.out.println("xml param from @beforeclass: " + suiteParam);
	  }
  
  
}
