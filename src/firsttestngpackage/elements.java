
package firsttestngpackage;

 class SelectorRepo{
	
	 
	   public static String subheading;
	   public static String url ;
	   public static String buttonSelenium ;
	   public static String buttonSeleniumCheck ;
	   public static String deviceMenu ;
	   public static String deviceMenuCheck;
	   public static String PC;
	   public static String PCCheck;
	   public static String OSMenubtn;
	   public static String OSMenuCheck;
	   public static String xpElem;
	   public static String browserMenu;
	   public static String browserMenuCheck;
	   public static String chromeTab;
	   public static String chromeTabCheck;
	   public static String select40;
	   public static String select40Check;
	   public static String javaTab;
	   public static String javaTabCheck;
	   public static String copyButton;
	   
	static {
		 	
		subheading="#main-content > div > ng-view > div > div:nth-child(1) > div.choice-buttons.choice-api > h3";
		url = "https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/";
		buttonSelenium = "#main-content > div > ng-view > div > div:nth-child(1) > div.choice-buttons.choice-api > div:nth-child(2)";
		 buttonSeleniumCheck = "#main-content > div > ng-view > div > div:nth-child(1) > div.choice-buttons.choice-api > div:nth-child(2)";
		 deviceMenu ="button.btn.btn-default.btn-display.select-logo.select-a-device";
		 deviceMenuCheck= "#desktop > div > div:nth-child(1) > div";
		 PC= "#desktop > div > div:nth-child(1) > div";
		 PCCheck="#desktop > div > div:nth-child(1) > div";
		 OSMenubtn= "#main-content > div > ng-view > div > div.spc-item.choice-os.configurator-select.col-md-12 > spc-select > div > button.btn.btn-default.btn-display.select-logo.select";
		 OSMenuCheck="#operating-system > div > div:nth-child(5) > div > span.el-text.ng-scope > span";
		   xpElem= "#operating-system > div > div:nth-child(5) > div > span.el-text.ng-scope > span";
		  //browserMenu="#main-content > div > ng-view > div > div.spc-item.configurator-select.col-md-12.webapp-browsers > div.choice-browser.fadein.fadeout > spc-select > div > button.btn.btn-default.btn-display.select-logo.select-a-browser";
		  browserMenu = ".btn.btn-default.btn-display.select-logo.select-a-browser";
		  browserMenuCheck="#main-content > div > ng-view > div > div.spc-item.configurator-select.col-md-12.webapp-browsers > div.choice-browser.fadein.fadeout > spc-select > div > div > ul > li:nth-child(2) > a";
		  chromeTab="#main-content > div > ng-view > div > div.spc-item.configurator-select.col-md-12.webapp-browsers > div.choice-browser.fadein.fadeout > spc-select > div > div > ul > li:nth-child(2) > a";
		             
		  chromeTabCheck="#chrome > div:nth-child(2) > div:nth-child(4) > div > span.el-text.ng-scope > span";
		  select40="#chrome > div:nth-child(2) > div:nth-child(4)";
		   select40Check="#chrome > div:nth-child(2) > div:nth-child(4) > div";
		   javaTab="#main-content > div > ng-view > div > div.spc-item.choice-code.configurator-select.col-md-12 > div > ul > li:nth-child(1) > a";
		    javaTabCheck="#main-content > div > ng-view > div > div.spc-item.choice-code.configurator-select.col-md-12 > div > ul > li.ng-scope.active";
		 copyButton="#copy-code";
	}
	
	
}