package TestNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import browser.BrowserSetup;

public class Facebook123 extends BrowserSetup{
	
	WebDriver driver;
	SignUpPage signUpPage ;
    LoginOrsignUppage loginOrSignUpPage;
    
    @parameters ("browser")
    
    @BeforeTest
    
    public void launchBrowser(String browserName) {
    System.out.println(browserName);
    System.out.println(browserName);
    if(browserName.equals("Chrome"));
    {
    	BrowserName =openChromeBrowser();
    }
    if(browserName.equals("Firefox"));
    {
       BrowserName =openFirefoxBrowser();
    }

    if(browserName.equals("MicrosoftEdges"));
    {
    	BrowserName =openMiceosoftEdgesBrowser();
    
    }
    
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    driver.manage().window().maximize();
}
    
}
    		
   @BeforeClass
   

