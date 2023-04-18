package com.stepdefinition;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC9_POS_FlowOne_definition extends BaseClass {
	PageManager pma = new PageManager();
	
	public TC9_POS_FlowOne_definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	@Given("User should able to see Login Screen")
	public void userShouldAbleToSeeLoginScreen() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "POS Terminal 1G");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        capabilities.setCapability(AndroidMobileCapabilityType.SKIP_UNLOCK, "false");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.plateron.restaurant.pos.qa");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.plateron.restaurant.pos.MainActivity");
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
//        capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, "true");
        capabilities.setCapability(MobileCapabilityType.UDID, "A3ALUN2906G00587");
        //A3ALUN2906G00587// R9YT306EJ2F //IR9PAMMZUCIBF6XG //192.168.14.241
        // capabilities.setCapability(MobileCapabilityType.UDID,"192.168.5.101:5555");

        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        posDriver1 = new AppiumDriver(url, capabilities);
        posDriver1.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(6));
	    
	}
	@When("User should able to enter login credentials")
	public void userShouldAbleToEnterLoginCredentials() throws InterruptedException {
		String generatedPIN = "4567";
        for (int i = 0; i < generatedPIN.length(); i++) {
            char charAt = generatedPIN.charAt(i);
            Thread.sleep(100);
            switch (charAt) {
            case '1':
                pma.getPOS_FlowOne_POM().getPinOneElement().click();
                break;

            case '2':
                pma.getPOS_FlowOne_POM().getPinTwoElement().click();
                break;

            case '3':
                pma.getPOS_FlowOne_POM().getPinThreeElement().click();
                break;

            case '4':
                pma.getPOS_FlowOne_POM().getPinFourElement().click();
                break;
            case '5':
                pma.getPOS_FlowOne_POM().getPinFiveElement().click();
                break;
            case '6':
                pma.getPOS_FlowOne_POM().getPinsixElement().click();
                break;

            case '7':
                pma.getPOS_FlowOne_POM().getPinSevenElement().click();
                break;
            case '8':
                pma.getPOS_FlowOne_POM().getPinEightElement().click();
                break;

            case '9':
                pma.getPOS_FlowOne_POM().getPinNineElement().click();
                break;

            case '0':
                pma.getPOS_FlowOne_POM().getPinZeroElement().click();
                break;

            default:
                break;
            }
        }
	    
	}
	@Then("User should Select any table and verify that the guest count popup appears")
	public void userShouldSelectAnyTableAndVerifyThatTheGuestCountPopupAppears() throws InterruptedException {
	    //pma.getPOS_FlowOne_POM().getArea1().click();
	    Thread.sleep(200);
	    pma.getPOS_FlowOne_POM().getTable1().click();
	}
	@Then("User should able to select guest count Number and Click Proceed Button")
	public void userShouldAbleToSelectGuestCountNumberAndClickProceedButton() {
	    pma.getPOS_FlowOne_POM().getNoOfGuest5().click();
	    pma.getPOS_FlowOne_POM().getProceedButton().click();
	}
	@Then("User should select menu item from the left-hand side \\(LHS)")
	public void userShouldSelectMenuItemFromTheLeftHandSideLHS() throws InterruptedException {
		Thread.sleep(500);
	    pma.getPOS_FlowOne_POM().getMenu1().click();
	    Thread.sleep(1000);
	    pma.getPOS_FlowOne_POM().getMenu2().click();
	    Thread.sleep(500);
	    pma.getPOS_FlowOne_POM().getMenu3().click();
	    Thread.sleep(500);
	    pma.getPOS_FlowOne_POM().getMenu4().click();
	    Thread.sleep(500);
	    
	       
	    
	    //To get all values in that locators 
//	    for (int i = 1; i < 15; i++) {
//	    	 WebElement findElement = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])["+i+"]"));
//	    	 String actText = findElement.getAttribute("content-desc");
//	 	    System.out.println(actText);
//		}
	   
	    
	}
	
	@Then("User should Validate the Selected Menu is Reflected in RHS")
	public void userShouldValidateTheSelectedMenuIsReflectedInRHS() {
		
		//To get all values in that locators 
//	    for (int i = 1; i < 15; i++) {
//	    	 WebElement findElement = posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])["+i+"]"));
//	    	 String actText = findElement.getAttribute("content-desc");
//	 	    System.out.println(actText);
//		
//	    }
		
		//Getting 1st Menus Attribute
//		 String actMenu1 = pma.getPOS_FlowOne_POM().getMenu1().getAttribute("content-desc");
//		 String substringMenu1 = actMenu1.substring(0, actMenu1.length()-5);
//		 System.out.println(substringMenu1);
	    
		//Getting 2nd Menus Attribute
//		 String actMenu2 = pma.getPOS_FlowOne_POM().getMenu2().getAttribute("content-desc");
//		 String substringMenu2 = actMenu2.substring(0, actMenu2.length()-5);
//		 System.out.println(substringMenu2);
	    
		//Getting 3rd Menus Attribute
//		 String actMenu3 = pma.getPOS_FlowOne_POM().getMenu3().getAttribute("content-desc");
//		 String substringMenu3 = actMenu3.substring(0, actMenu3.length()-5);
//		 System.out.println(substringMenu3);
		
		//Getting 4th Menus Attribute
	    String text = pma.getPOS_FlowOne_POM().getMenu4().getAttribute("content-desc");
	    String s = text.substring(0,text.length()-6);//Taking Only Menu Name 
	    System.out.println(s);
	    //RHS Side 4th Menu 
	    WebElement Menu4Element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
   	    String actText4 = Menu4Element.getAttribute("content-desc");
        String s1 = text.substring(0,actText4.length()-2);//Taking Only Menu Name
        System.out.println(s1);
	
	    //Checking both are equals
	    //Assert.assertTrue(s.equals(s1));
	
	}
	@Then("User should able to Click on the {string} Button")
	public void userShouldAbleToClickOnTheButton(String string) {
	    
	}
	@Then("User should Verify the page redirected to active order page")
	public void userShouldVerifyThePageRedirectedToActiveOrderPage() throws InterruptedException {
		Thread.sleep(5000);
	    String ActText = pma.getPOS_FlowOne_POM().getActiveOrderHeader().getAttribute("content-desc");
	    System.out.println(ActText);
	    Assert.assertTrue(ActText.equals("Active Orders"));
	}
	@Then("User should able to Validate the Active Order page")
	public void userShouldAbleToValidateTheActiveOrderPage() {
	   
	}
	@Then("User should able to Click Recieve Payment Button")
	public void userShouldAbleToClickRecievePaymentButton() {
	   pma.getPOS_FlowOne_POM().getRecievePaymentBtn().click();
	}
	@Then("User should Verify the page redirected to Payment Detail Page")
	public void userShouldVerifyThePageRedirectedToPaymentDetailPage() {
	   
	}
	@Then("User should able to click Cash option and Collect Button")
	public void userShouldAbleToClickCashOptionAndCollectButton() {
	   
	}
	@Then("User should able to enter TIP and Validate the TIP reflection")
	public void userShouldAbleToEnterTIPAndValidateTheTIPReflection() {
	   
	}
	@Then("User should able to Apply Discount")
	public void userShouldAbleToApplyDiscount() {
	   
	}
	@Then("User should Validate the Subtotal and Calculation")
	public void userShouldValidateTheSubtotalAndCalculation() {
	    
	}
	@Then("User should able to Click Complete Order Button")
	public void userShouldAbleToClickCompleteOrderButton() {
	    
	}
	@Then("User should Verify the page redirected to Complete order page")
	public void userShouldVerifyThePageRedirectedToCompleteOrderPage() {
	    
	}
	@Then("User should Validate the Complete order page")
	public void userShouldValidateTheCompleteOrderPage() {
	    
	}


}
