package com.stepdefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

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
	public float subTotal,totalBillAmount;
	List<Float> menuPrice = new ArrayList<Float>();
	public int guestCountAOP;
	
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
        capabilities.setCapability(MobileCapabilityType.UDID, "R9PT2034EVV");// R9YT306EJ2F //IR9PAMMZUCIBF6XG //192.168.14.241
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
//            Thread.sleep(100);
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
	    
	       
//	    for (int i = 1; i < 15; i++) {
//	    	 WebElement findElement = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])["+i+"]"));
//	    	 String actText = findElement.getAttribute("content-desc");
//	 	    System.out.println(actText);
//		}
	   
	    
	}
	
	@Then("User should Validate the Selected Menu is Reflected in RHS")
	public void userShouldValidateTheSelectedMenuIsReflectedInRHS() {
		
		//Getting 4th Menus Attribute
	    String text = pma.getPOS_FlowOne_POM().getMenu4().getAttribute("content-desc");
	    String s = text.substring(0,text.length()-7);//Taking Only Menu Name 
	    System.out.println(s);
	    //RHS Side 4th Menu 
	    WebElement findElement = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
   	   String actText = findElement.getAttribute("content-desc");
   	   String s1 = text.substring(0,actText.length()-3);//Taking Only Menu Name
	    System.out.println(s1);
	
	    //Checking both are equals
	    Assert.assertTrue(s.equals(s1));
	
	}
	@Then("User should able to Click on the {string} Button")
	public void userShouldAbleToClickOnTheButton(String string) {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
//		LocalTime currentTime = LocalTime.now();
//		String formattedTime = currentTime.format(formatter);
//		String upperCase = formattedTime.toUpperCase();
//		System.out.println(upperCase);

	}
	@Then("User should Verify the page redirected to active order page")
	public void userShouldVerifyThePageRedirectedToActiveOrderPage() throws InterruptedException {
		Thread.sleep(300);
		pma.getPOS_FlowOne_POM().getActiveOrdersTab().click();
		Thread.sleep(300);
	    String headerAO = pma.getPOS_FlowOne_POM().getActiveOrdersPageHeader().getAttribute("content-desc");
	    Assert.assertEquals(headerAO, "Active Orders");
	}
	@Then("User should able to Validate the Active Order page")
	public void userShouldAbleToValidateTheActiveOrderPage() throws InterruptedException {
		float subTotal1;
		DecimalFormat dF = new DecimalFormat("#.##");
		pma.getPOS_FlowOne_POM().getFirstOrderinAO().click();
//	   System.out.println(pma.getPOS_FlowOne_POM().getFirstOrderinAO().getAttribute("content-desc"));
	   String firstOrderAO = pma.getPOS_FlowOne_POM().getFirstOrderinAO().getAttribute("content-desc");
	   String employeeName = pma.getPOS_FlowOne_POM().getEmployeeName().getAttribute("content-desc");
//	   System.out.println(employeeName);
	   String guestCount = pma.getPOS_FlowOne_POM().getGuestCountRightCorner().getAttribute("content-desc");
	   String substring = guestCount.substring(8, guestCount.length());
	   guestCountAOP=Integer.parseInt(substring);
//	   System.out.println(substring);
	   String orderId = pma.getPOS_FlowOne_POM().getOrderIdRightCorner().getAttribute("content-desc");
//	   System.out.println(orderId);
	   String tableName = pma.getPOS_FlowOne_POM().getTableNameRightside().getAttribute("content-desc");
//	   System.out.println(tableName);
	   
	   
	   Assert.assertTrue(firstOrderAO.contains("Not Paid"));
	   Assert.assertTrue(firstOrderAO.contains(employeeName));
	   Assert.assertTrue(firstOrderAO.contains("Guest: "+substring));
	   Assert.assertTrue(firstOrderAO.contains(orderId));
	   Assert.assertTrue(firstOrderAO.contains("Waiter"));
	   Assert.assertTrue(firstOrderAO.contains(tableName));
//Need Table and Area name validations
	   Assert.assertTrue(firstOrderAO.contains(""));

	   //Menu 1
	   String m1text = pma.getPOS_FlowOne_POM().getFirstMenuRightSide().getAttribute("content-desc");
	   String m1textRep = m1text.replaceAll("[\\r\\n]+", "");
	   String[] m1Split = m1textRep.split("\\$");
	   String menu1str=m1Split[m1Split.length-1];
	   float menu1=Float.parseFloat(menu1str);
	   Float menu1Rnd = Float.valueOf(dF.format(menu1));
	   menuPrice.add(menu1Rnd);
	   
	   
	   //Menu 2
	   String m2text = pma.getPOS_FlowOne_POM().getSecondMenuRightSide().getAttribute("content-desc");
	   String m2textRep = m2text.replaceAll("[\\r\\n]+", "");
	   String[] m2Split = m2textRep.split("\\$");
	   String menu2str=m2Split[m2Split.length-1];
	   float menu2=Float.parseFloat(menu2str);
	   Float menu2Rnd = Float.valueOf(dF.format(menu2));
	   menuPrice.add(menu2Rnd);
	   
	   
	   //Menu 3
	   String m3text = pma.getPOS_FlowOne_POM().getThirdMenuRightSide().getAttribute("content-desc");
	   String m3textRep = m3text.replaceAll("[\\r\\n]+", "");
	   String[] m3Split = m3textRep.split("\\$");
	   String menu3str=m3Split[m3Split.length-1];
	   float menu3=Float.parseFloat(menu3str);
	   Float menu3Rnd = Float.valueOf(dF.format(menu3));
	   menuPrice.add(menu3Rnd);
	   
	   
	   //Menu 4
	   String m4text = pma.getPOS_FlowOne_POM().getFourthMenuRightSide().getAttribute("content-desc");
	   String m4textRep = m4text.replaceAll("[\\r\\n]+", "");
	   String[] m4Split = m4textRep.split("\\$");
	   String menu4str=m4Split[m4Split.length-1];
	   float menu4=Float.parseFloat(menu4str);
	   Float menu4Rnd = Float.valueOf(dF.format(menu4));
	   menuPrice.add(menu4Rnd);
	   
	   
	   subTotal1=menu1Rnd+menu2Rnd+menu3Rnd+menu4Rnd;
	   subTotal= Float.valueOf(dF.format(subTotal1));
	   
	   
	   
//	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
//		LocalTime currentTime = LocalTime.now();
//		String formattedTime = currentTime.format(formatter);
//		String upperCase = formattedTime.toUpperCase();
//		System.out.println(upperCase);
	}
	@Then("User should able to Click Recieve Payment Button")
	public void userShouldAbleToClickRecievePaymentButton() {
		pma.getPOS_FlowOne_POM().getReceivePaymentBtn().click();
	}
	
	@Then("User should Verify the page redirected to Payment Detail Page")
	public void userShouldVerifyThePageRedirectedToPaymentDetailPage() throws IOException {
		
		String paymentDetailsHdr = pma.getPOS_FlowOne_POM().getPaymentDetailsHeader().getAttribute("content-desc");
		Assert.assertEquals(paymentDetailsHdr, "Payment details");
		
		String subTotPD = pma.getPOS_FlowOne_POM().getSubtotalPayDetails().getAttribute("content-desc");
		String SubTreplace= subTotPD.replaceAll("[\\r\\n]+", "");
		Assert.assertEquals(SubTreplace, "Subtotal$"+subTotal);
		float salesTax=0,gratuityValue=0,serFee=0,serFeeTax=0,gratuityTaxValue=0;
		//Sales tax validations
		String SalTxFromExcel = getDataFromExcel("Bill Configuration", 1, 1); 
		float percentageSaltx = Float.parseFloat(SalTxFromExcel);
		if (!(percentageSaltx==0)) {
			String salesTxPD = pma.getPOS_FlowOne_POM().getSalesTaxPayDetails().getAttribute("content-desc");
			String salTxreplace = salesTxPD.replaceAll("[\\r\\n]+", "");
			salesTax = salesTax(subTotal,percentageSaltx);
			//format for Assert
			String roundStringsalesTax = roundStringValue(salesTax);
			
			
			Assert.assertEquals(salTxreplace, "Sales Tax$"+roundStringsalesTax);	
			System.out.println("ExecutedST");
		}
		
		//Service Fee Validations
				String SerFeeFromExcel = getDataFromExcel("Bill Configuration", 4, 1); 
				float percentageSerFee = Float.parseFloat(SerFeeFromExcel);
				if (!(percentageSerFee==0)) {
					String serFeePD = pma.getPOS_FlowOne_POM().getServiceFeePayDetails().getAttribute("content-desc");
					String serFeereplace = serFeePD.replaceAll("[\\r\\n]+", "");
					serFee = serviceFee(subTotal,percentageSerFee);
					//format for Assert
					String roundStringserFee = roundStringValue(serFee);
					
					Assert.assertEquals(serFeereplace, "Service Fee$"+roundStringserFee);
					System.out.println("ExecutedSF");
				}
		//Service Fee tax Validations
				String SerFeeTXCheckBx = getDataFromExcel("Bill Configuration", 5, 1);
				if (SerFeeTXCheckBx.equals("ON")) {
					String SerFeeTaxFromExcel = getDataFromExcel("Bill Configuration", 6, 1);
					float percentageSerFeeTx = Float.parseFloat(SerFeeTaxFromExcel);
						String serFeeTxPD = pma.getPOS_FlowOne_POM().getServiceFeeTaxPayDetails().getAttribute("content-desc");
						String serFeeTaxreplace = serFeeTxPD.replaceAll("[\\r\\n]+", "");
						serFeeTax = serviceFeeTax(salesTax,percentageSerFeeTx);
						//format for Assert
						String roundStringserFeeTax = roundStringValue(serFeeTax);
						
						Assert.assertEquals(serFeeTaxreplace, "Service Fee Tax$"+roundStringserFeeTax);
						System.out.println("ExecutedSFT");
				}
		//Gratuity
				//Condition - enabled - Amount/Guest Count reaches
				String gratuityState = getDataFromExcel("Bill Configuration", 8, 1); // ON/OFF
				String gratuityBasedOn = getDataFromExcel("Bill Configuration", 9, 1); // Order Amount/GuestCount/Nil
				String takeAwayCBx = getDataFromExcel("Bill Configuration", 14, 1); // ON/OFF
				String dineInCBx = getDataFromExcel("Bill Configuration", 15, 1); // ON/OFF
				String gratuityPercent = getDataFromExcel("Bill Configuration", 10, 1); 
				String gratuityTaxPercent = getDataFromExcel("Bill Configuration", 13, 1); 
				String subTotalReaches = getDataFromExcel("Bill Configuration", 12, 1); 
				String GuestCntReaches = getDataFromExcel("Bill Configuration", 11, 1);
				
		if (gratuityState.equals("ON")||gratuityState.equals("OFF")) {
			if (gratuityBasedOn.equals("Order Amount")) {
				if (Float.parseFloat(gratuityPercent)>0) {
					if (subTotal>=Float.parseFloat(subTotalReaches)) {
						if (takeAwayCBx.equals("ON")||dineInCBx.equals("ON")) {//need to get current order type + button takeAway & dineIn status
						gratuityValue = gratuity(subTotal, Float.parseFloat(gratuityPercent));
						String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetails().getAttribute("content-desc");
						String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
						//format for Assert
						String roundStringgratuityValue = roundStringValue(gratuityValue);
						
						Assert.assertEquals(gratuityreplace, "Gratuity$"+roundStringgratuityValue);
						System.out.println("ExecutedGty");
						}
					}
				}
			}else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityPercent)>0) {
					if (guestCountAOP>=Float.parseFloat(GuestCntReaches)) {
						gratuityValue = gratuity(subTotal, Float.parseFloat(gratuityPercent));
						String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetails().getAttribute("content-desc");
						String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
						//format for Assert
						String roundStringgratuityValue = roundStringValue(gratuityValue);
						
						Assert.assertEquals(gratuityreplace, "Gratuity$"+roundStringgratuityValue);
						System.out.println("ExecutedGty");
					}
				}
			}
		}
		
		//gratuity Tax
		if (gratuityState.equals("ON")||gratuityState.equals("OFF")) {
			if (gratuityBasedOn.equals("Order Amount")) {
				if (Float.parseFloat(gratuityPercent)>0) {
					if (subTotal>=Float.parseFloat(subTotalReaches)) {
						if (takeAwayCBx.equals("ON")||dineInCBx.equals("ON")) {
//need to get CURRENT ORDER TYPE + button takeAway & dineIn status
							gratuityTaxValue = gratuity(gratuityValue, Float.parseFloat(gratuityTaxPercent));
							String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetails().getAttribute("content-desc");
							String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
							//format for Assert
							String roundStringgratuityTaxValue = roundStringValue(gratuityTaxValue);
							
							Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$"+roundStringgratuityTaxValue);
							System.out.println("ExecutedGtyTx");
						}
					}
				}
			}else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityPercent)>0) {
					if (guestCountAOP>=Float.parseFloat(GuestCntReaches)) {
						gratuityTaxValue = gratuity(gratuityValue, Float.parseFloat(gratuityTaxPercent));
						String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetails().getAttribute("content-desc");
						String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
						//format for Assert
						String roundStringgratuityTaxValue = roundStringValue(gratuityTaxValue);
						
						Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$"+roundStringgratuityTaxValue);
						System.out.println("ExecutedGtyTx");
					}
				}
			}
		}
		
		//Bill Amount Validation
		totalBillAmount = subTotal+salesTax+serFee+serFeeTax+gratuityValue+gratuityTaxValue;
		String billAmount = pma.getPOS_FlowOne_POM().getBillAmountPayDetails().getAttribute("content-desc");
		Assert.assertEquals(billAmount,"$"+roundStringValue(totalBillAmount));
		
	}
	@Then("User should able to click Cash option and Collect Button")
	public void userShouldAbleToClickCashOptionAndCollectButton() {
		pma.getPOS_FlowOne_POM().getCollectCashBtnPayDetails().click();
		
		String tipPopHeaderAmount = pma.getPOS_FlowOne_POM().getTipPopupBillAmt().getAttribute("content-desc");
		Assert.assertEquals("Bill Amount: $"+totalBillAmount, tipPopHeaderAmount);
		
		pma.getPOS_FlowOne_POM().getTipPopupNoTip().click();
		
	}
	@Then("User should able to enter TIP and Validate the TIP reflection")
	public void userShouldAbleToEnterTIPAndValidateTheTIPReflection() {
	   
		String billAmount = pma.getPOS_FlowOne_POM().getBillAmountPayDetails().getAttribute("content-desc");
		Assert.assertEquals(billAmount,"$"+roundStringValue(totalBillAmount));
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
//17-04-2023 19:26