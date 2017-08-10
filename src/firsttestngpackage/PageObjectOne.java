package firsttestngpackage;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import firsttestngpackage.DriverInitiate;

public class PageObjectOne{
	
	 static WebDriver WDriver;
	
	public  WebDriver driver =  getWebDriver();
   
	/*
	public static  WebDriver getWebDriver() throws MalformedURLException {
		DriverInitiate getDriver  =  DriverInitiate.getInstance();
		d = getDriver.InitiateDriver();
	     return d;
	  }  */

	public   WebDriver getWebDriver()  {
		try{
		DriverInitiate getDriver  =  DriverInitiate.getInstance();
		WDriver = getDriver.InitiateDriver();
	      }
		catch(Exception e){
			
			System.err.println(  e.getMessage());
		}
		return WDriver;
	  }
	
	
	public void goTo(){
		 System.out.println("DRIVER :  " + driver); 
		 driver.get(SelectorRepo.url);
	}
	
	
	  public List<WebElement> clickSelenium(){
		  
		  WebElement buttonSelenium = driver.findElement(By.cssSelector(SelectorRepo.buttonSelenium));
		  WebElement buttonSeleniumCheck = driver.findElement(By.cssSelector(SelectorRepo.buttonSeleniumCheck));
		  List<WebElement> seleniumclickAndCheck = new ArrayList<WebElement>();
		  seleniumclickAndCheck.add(buttonSelenium);
		  seleniumclickAndCheck.add(buttonSeleniumCheck);
		 
		  return seleniumclickAndCheck;
		 
	  }
	  
	  public List<WebElement> clickDeviceMenu(){
		  
		  WebElement DeviceMenuClick = driver.findElement(By.cssSelector(SelectorRepo.deviceMenu));
		  WebElement DeviceMenuCheck = driver.findElement(By.cssSelector(SelectorRepo.deviceMenuCheck));
		  List<WebElement>  DeviceMenuClickAndCheck = new ArrayList<WebElement>();
		  DeviceMenuClickAndCheck.add(DeviceMenuClick);
		  DeviceMenuClickAndCheck.add(DeviceMenuCheck);
		  return DeviceMenuClickAndCheck;
		 
		 
		 // Assert.assertEquals("api-button blue_over blue_select", clickDeviceMenu.getAttribute("class"));
	  }
	  
	  
    public WebElement SelectPC(){
		  
		  WebElement SelectPC = driver.findElement(By.cssSelector(SelectorRepo.PC));
		  return SelectPC;
		
	  }


   public List<WebElement> ClickOSMenu(){
	  
	  WebElement ClickOSMenu = driver.findElement(By.cssSelector(SelectorRepo.OSMenubtn));
	  WebElement CheckOSMenu = driver.findElement(By.cssSelector(SelectorRepo.OSMenuCheck));
	  List<WebElement>  OSMenuClickAndCheck = new ArrayList<WebElement>();
	  OSMenuClickAndCheck.add(ClickOSMenu);
	  OSMenuClickAndCheck.add(CheckOSMenu);
	  return OSMenuClickAndCheck;

}


    public WebElement SelectWinXP(){
	  
	  WebElement SelectWinXP = driver.findElement(By.cssSelector(SelectorRepo.xpElem));
	 return  SelectWinXP;
	 
}

    public WebElement ClickBrowserMenu(){
	  
	  WebElement ClickBrowserMenu = driver.findElement(By.cssSelector(SelectorRepo.browserMenu));
	  return ClickBrowserMenu;

	 // Assert.assertEquals("Chrome", browserMenuCheck.getText());
}
    
 
    public WebElement ClickChromeTab(){
    	  
    	  WebElement ClickChromeTab = driver.findElement(By.cssSelector(SelectorRepo.chromeTab));
    	  return ClickChromeTab;
    	
    }
    
    public WebElement Select40(){
  	  
  	  WebElement Select40 = driver.findElement(By.cssSelector(SelectorRepo.select40));
  	  return Select40;
  	  //Select40.click();
  	 
  	 // Assert.assertEquals("list-element selected", select40Check.getAttribute("class"));
  }
    
    public WebElement ClickJavaTab(){
    	  
    	  WebElement ClickJavaTab = driver.findElement(By.cssSelector(SelectorRepo.javaTab));
    	  return ClickJavaTab;
    	 
    	 // Assert.assertEquals("ng-scope active", javaTabCheck.getAttribute("class"));
    }
    
    public WebElement ClickCopyButton(){
  	  
  	  WebElement ClickCopyButton = driver.findElement(By.cssSelector(SelectorRepo.copyButton));
  	return ClickCopyButton;
  	 
  	 // Assert.assertEquals("ng-scope active", javaTabCheck.getAttribute("class"));
  }
	
}