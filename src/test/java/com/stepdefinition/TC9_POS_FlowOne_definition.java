package com.stepdefinition;

import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput.Origin;
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
	public float subTotal, totalBillAmount;
	List<Float> menuPrice = new ArrayList<Float>();
	String orderType = "";
	String noOfGuest = "",orderId="",randomName="",randomNumber="";
	public int guestCountAOP;
	
	float salesTax = 0, gratuity = 0, serviceFee = 0, serviceFeeTax = 0, gratuityTax = 0, discountAmt = 0,totalBillAmountADis=0;

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
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				"com.plateron.restaurant.pos.MainActivity");
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
//        capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, "true");
//		capabilities.setCapability(MobileCapabilityType.UDID, "A3ALUN2906G00587");
		capabilities.setCapability(MobileCapabilityType.UDID, "R9PT2034EVV");
		// A3ALUN2906G00587// R9YT306EJ2F //IR9PAMMZUCIBF6XG //192.168.14.241
		// capabilities.setCapability(MobileCapabilityType.UDID,"192.168.5.101:5555");

		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		posDriver1 = new AppiumDriver(url, capabilities);
		posDriver1.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(7));
	}

	@When("User should able to enter login credentials")
	public void userShouldAbleToEnterLoginCredentials() throws InterruptedException {
//		posLoginWithEmployeePin("2353");
		String employeePIN = "7115";

		for (int i = 0; i < employeePIN.length(); i++) {
			char charAt = employeePIN.charAt(i);
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
		// pma.getPOS_FlowOne_POM().getArea1().click();
		Thread.sleep(900);
		pma.getPOS_FlowOne_POM().getArea1Table1().click();
	}

	@Then("User should able to select guest count Number and Click Proceed Button")
	public void userShouldAbleToSelectGuestCountNumberAndClickProceedButton() throws InterruptedException {
		Thread.sleep(1000);
		pma.getPOS_FlowOne_POM().getNoOfGuest5().click();

		noOfGuest = pma.getPOS_FlowOne_POM().getNoOfGuest5().getAttribute("Content-desc");
		System.out.println(noOfGuest);
		pma.getPOS_FlowOne_POM().getProceedButton().click();
		orderType = "Dine-In";
		//pma.getPOS_FlowOne_POM().getProceedButton().click();
		Thread.sleep(500);
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
		// To get all values in that locators
//	    for (int i = 1; i < 15; i++) {
//	    	 WebElement findElement = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])["+i+"]"));
//	    	 String actText = findElement.getAttribute("content-desc");
//	 	    System.out.println(actText);
//		}

	}

	@Then("User should Validate the Selected Menu is Reflected in RHS")
	public void userShouldValidateTheSelectedMenuIsReflectedInRHS() {

		// To get all values in that locators
//	    for (int i = 1; i < 15; i++) {
//	    	 WebElement findElement = posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])["+i+"]"));
//	    	 String actText = findElement.getAttribute("content-desc");
//	 	    System.out.println(actText);
//		
//	    }

		// Getting 1st Menus Attribute
//		 String actMenu1 = pma.getPOS_FlowOne_POM().getMenu1().getAttribute("content-desc");
//		 String substringMenu1 = actMenu1.substring(0, actMenu1.length()-5);
//		 System.out.println(substringMenu1);

		// Getting 2nd Menus Attribute
//		 String actMenu2 = pma.getPOS_FlowOne_POM().getMenu2().getAttribute("content-desc");
//		 String substringMenu2 = actMenu2.substring(0, actMenu2.length()-5);
//		 System.out.println(substringMenu2);

		// Getting 3rd Menus Attribute
//		 String actMenu3 = pma.getPOS_FlowOne_POM().getMenu3().getAttribute("content-desc");
//		 String substringMenu3 = actMenu3.substring(0, actMenu3.length()-5);
//		 System.out.println(substringMenu3);

		// Getting 4th Menus Attribute
		String text = pma.getPOS_FlowOne_POM().getMenu4().getAttribute("content-desc");
		String s = text.substring(0, text.length() - 6);// Taking Only Menu Name
		System.out.println(s);
		// RHS Side 4th Menu
		WebElement Menu4Element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
		String actText4 = Menu4Element.getAttribute("content-desc");
		String s1 = text.substring(0, actText4.length() - 2);// Taking Only Menu Name
		System.out.println(s1);

		// Checking both are equals
		// Assert.assertTrue(s.equals(s1));

	}

	@Then("User should able to Click on the {string} Button")
	public void userShouldAbleToClickOnTheButton(String string) throws InterruptedException {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
//		LocalTime currentTime = LocalTime.now();
//		String formattedTime = currentTime.format(formatter);
//		String upperCase = formattedTime.toUpperCase();
//		System.out.println(upperCase);

//		Actions acc = new Actions(driverPos);
//     	acc.dragAndDropBy(pma.getPos_Terminal_POM().getCompleteOrderSwipeElement(), 600, 0).perform();
		
		Thread.sleep(300);
		String text = pma.getPOS_FlowOne_POM().getSTK1().getAttribute("content-desc");
		System.out.println(text);
		Thread.sleep(3000);
		Actions act = new Actions(posDriver1);
		WebElement aElement = pma.getPOS_FlowOne_POM().getSTK1();
		int a = ((aElement.getSize().width) / 2) * -1;

		dragAndDropBy(act, pma.getPOS_FlowOne_POM().getSTK1(), a, 600, 0).perform();
		Thread.sleep(1500);

	}

	public Actions dragAndDropBy(Actions act, WebElement source, int startOffset, int xOffset, int yOffset) {
		return act
				.tick(act.getActivePointer().createPointerMove(Duration.ofMillis(100),
						Origin.fromElement(pma.getPOS_FlowOne_POM().getSTK1()),(startOffset + 25), 0))
				.tick(act.getActivePointer().createPointerDown(LEFT.asArg())).tick(act.getActivePointer()
						.createPointerMove(Duration.ofMillis(250), Origin.pointer(), xOffset, yOffset))
				.tick(act.getActivePointer().createPointerUp(LEFT.asArg()));
	}

	@Then("User should Verify the page redirected to active order page")
	public void userShouldVerifyThePageRedirectedToActiveOrderPage() throws InterruptedException {
//		Thread.sleep(2000);
//		pma.getPOS_FlowOne_POM().getActiveOrdersTab().click();
		Thread.sleep(1500);
		String headerAO = pma.getPOS_FlowOne_POM().getActiveOrdersPageHeader().getAttribute("content-desc");
		Assert.assertEquals(headerAO, "Active Orders");
	}

	@Then("User should able to Validate the Active Order page")
	public void userShouldAbleToValidateTheActiveOrderPage() throws InterruptedException {
		if (orderType.equals("Dine-In")) {
			float subTotal1;
			DecimalFormat dF = new DecimalFormat("#.##");
			pma.getPOS_FlowOne_POM().getFirstOrderinAO().click();
			// System.out.println(pma.getPOS_FlowOne_POM().getFirstOrderinAO().getAttribute("content-desc"));
			String firstOrderAO = pma.getPOS_FlowOne_POM().getFirstOrderinAO().getAttribute("content-desc");
			String employeeName = pma.getPOS_FlowOne_POM().getEmployeeName().getAttribute("content-desc");
			// System.out.println(employeeName);
			if (employeeName.contains("Clocked In:")) {
				String replaceAll = employeeName.replaceAll("[\\r\\n]+", "");
				String[] split = replaceAll.split("Clocked In:");
				employeeName = split[0];
			}

			String guestCount = pma.getPOS_FlowOne_POM().getGuestCountRightCorner().getAttribute("content-desc");
			String substring = guestCount.substring(8, guestCount.length());
			guestCountAOP = Integer.parseInt(substring);
//		   System.out.println(substring);
			orderId = pma.getPOS_FlowOne_POM().getOrderIdRightCorner().getAttribute("content-desc");
//		   System.out.println(orderId);
			String tableName = pma.getPOS_FlowOne_POM().getTableNameRightside().getAttribute("content-desc");
//		   System.out.println(tableName);

			Assert.assertTrue(firstOrderAO.contains("Not Paid"));
			Assert.assertTrue(firstOrderAO.contains(employeeName));
			Assert.assertTrue(firstOrderAO.contains("Guest: " + substring));
			Assert.assertTrue(firstOrderAO.contains(orderId));
			Assert.assertTrue(firstOrderAO.contains("Waiter"));
			Assert.assertTrue(firstOrderAO.contains(tableName));
	//Need Table and Area name validations
	//Need Time 
			Assert.assertTrue(firstOrderAO.contains(""));

			// Menu 1
			String m1text = pma.getPOS_FlowOne_POM().getFirstMenuRightSide().getAttribute("content-desc");
			String m1textRep = m1text.replaceAll("[\\r\\n]+", "");
			String[] m1Split = m1textRep.split("\\$");
			String menu1str = m1Split[m1Split.length - 1];
			float menu1 = Float.parseFloat(menu1str);
			Float menu1Rnd = Float.valueOf(dF.format(menu1));
			menuPrice.add(menu1Rnd);

			// Menu 2
			String m2text = pma.getPOS_FlowOne_POM().getSecondMenuRightSide().getAttribute("content-desc");
			String m2textRep = m2text.replaceAll("[\\r\\n]+", "");
			String[] m2Split = m2textRep.split("\\$");
			String menu2str = m2Split[m2Split.length - 1];
			float menu2 = Float.parseFloat(menu2str);
			Float menu2Rnd = Float.valueOf(dF.format(menu2));
			menuPrice.add(menu2Rnd);

			// Menu 3
			String m3text = pma.getPOS_FlowOne_POM().getThirdMenuRightSide().getAttribute("content-desc");
			String m3textRep = m3text.replaceAll("[\\r\\n]+", "");
			String[] m3Split = m3textRep.split("\\$");
			String menu3str = m3Split[m3Split.length - 1];
			float menu3 = Float.parseFloat(menu3str);
			Float menu3Rnd = Float.valueOf(dF.format(menu3));
			menuPrice.add(menu3Rnd);

			// Menu 4
			String m4text = pma.getPOS_FlowOne_POM().getFourthMenuRightSide().getAttribute("content-desc");
			String m4textRep = m4text.replaceAll("[\\r\\n]+", "");
			String[] m4Split = m4textRep.split("\\$");
			String menu4str = m4Split[m4Split.length - 1];
			float menu4 = Float.parseFloat(menu4str);
			Float menu4Rnd = Float.valueOf(dF.format(menu4));
			menuPrice.add(menu4Rnd);

			subTotal1 = menu1Rnd + menu2Rnd + menu3Rnd + menu4Rnd;
			subTotal = Float.valueOf(dF.format(subTotal1));
		}
		else if (orderType.equals("Take-Out")) {
			
			float subTotal1;
			DecimalFormat dF = new DecimalFormat("#.##");
			pma.getPOS_FlowOne_POM().getFirstOrderinAO().click();
			// System.out.println(pma.getPOS_FlowOne_POM().getFirstOrderinAO().getAttribute("content-desc"));
			String firstOrderAO = pma.getPOS_FlowOne_POM().getFirstOrderinAO().getAttribute("content-desc");
			String employeeName = pma.getPOS_FlowOne_POM().getEmployeeName().getAttribute("content-desc");
			// System.out.println(employeeName);
			if (employeeName.contains("Clocked In:")) {
				String replaceAll = employeeName.replaceAll("[\\r\\n]+", "");
				String[] split = replaceAll.split("Clocked In:");
				employeeName = split[0];
			}

			orderId = pma.getPOS_FlowOne_POM().getOrderIdRightCornerTakeOut().getAttribute("content-desc");
//		   System.out.println(orderId);
			//String tableName = pma.getPOS_FlowOne_POM().getTableNameRightside().getAttribute("content-desc");
//		   System.out.println(tableName);

			Assert.assertTrue(firstOrderAO.contains("Not Paid"));
			Assert.assertTrue(firstOrderAO.contains(employeeName));
//			Assert.assertTrue(firstOrderAO.contains("Guest: " + substring));
			Assert.assertTrue(firstOrderAO.contains(orderId));
			Assert.assertTrue(firstOrderAO.contains("Waiter"));
			Assert.assertTrue(firstOrderAO.contains(randomName));
			
	//Need Table and Area name validations
	//Need Time 
			Assert.assertTrue(firstOrderAO.contains(""));

			// Menu 1
			String m1text = pma.getPOS_FlowOne_POM().getFirstMenuRightSide().getAttribute("content-desc");
			String m1textRep = m1text.replaceAll("[\\r\\n]+", "");
			String[] m1Split = m1textRep.split("\\$");
			String menu1str = m1Split[m1Split.length - 1];
			float menu1 = Float.parseFloat(menu1str);
			Float menu1Rnd = Float.valueOf(dF.format(menu1));
			menuPrice.add(menu1Rnd);

			// Menu 2
			String m2text = pma.getPOS_FlowOne_POM().getSecondMenuRightSide().getAttribute("content-desc");
			String m2textRep = m2text.replaceAll("[\\r\\n]+", "");
			String[] m2Split = m2textRep.split("\\$");
			String menu2str = m2Split[m2Split.length - 1];
			float menu2 = Float.parseFloat(menu2str);
			Float menu2Rnd = Float.valueOf(dF.format(menu2));
			menuPrice.add(menu2Rnd);

			// Menu 3
			String m3text = pma.getPOS_FlowOne_POM().getThirdMenuRightSide().getAttribute("content-desc");
			String m3textRep = m3text.replaceAll("[\\r\\n]+", "");
			String[] m3Split = m3textRep.split("\\$");
			String menu3str = m3Split[m3Split.length - 1];
			float menu3 = Float.parseFloat(menu3str);
			Float menu3Rnd = Float.valueOf(dF.format(menu3));
			menuPrice.add(menu3Rnd);

			// Menu 4
			String m4text = pma.getPOS_FlowOne_POM().getFourthMenuRightSide().getAttribute("content-desc");
			String m4textRep = m4text.replaceAll("[\\r\\n]+", "");
			String[] m4Split = m4textRep.split("\\$");
			String menu4str = m4Split[m4Split.length - 1];
			float menu4 = Float.parseFloat(menu4str);
			Float menu4Rnd = Float.valueOf(dF.format(menu4));
			menuPrice.add(menu4Rnd);

			subTotal1 = menu1Rnd + menu2Rnd + menu3Rnd + menu4Rnd;
			subTotal = Float.valueOf(dF.format(subTotal1));
		}
		
		

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
	public void userShouldVerifyThePageRedirectedToPaymentDetailPage() throws IOException, InterruptedException {
		Thread.sleep(1000);
		String roundStringsalesTax="";
		String paymentDetailsHdr = pma.getPOS_FlowOne_POM().getPaymentDetailsHeader().getAttribute("content-desc");
		Assert.assertEquals(paymentDetailsHdr, "Payment details");

		String subTotPD = pma.getPOS_FlowOne_POM().getSubtotalPayDetails().getAttribute("content-desc");
		String SubTreplace = subTotPD.replaceAll("[\\r\\n]+", "");
		Assert.assertEquals(SubTreplace, "Subtotal$" + subTotal);
		float salesTax = 0, gratuityValue = 0, serFee = 0, serFeeTax = 0, gratuityTaxValue = 0;
		// Sales tax validations
		String SalTxFromExcel = getDataFromExcel("Bill Configuration", 1, 1);
		float percentageSaltx = Float.parseFloat(SalTxFromExcel);
		if (!(percentageSaltx == 0)) {
			String salesTxPD = pma.getPOS_FlowOne_POM().getSalesTaxPayDetails().getAttribute("content-desc");
			String salTxreplace = salesTxPD.replaceAll("[\\r\\n]+", "");
			salesTax = salesTax(subTotal, percentageSaltx);
			// format for Assert
			roundStringsalesTax = roundStringValue(salesTax);

			Assert.assertEquals(salTxreplace, "Sales Tax$" + roundStringsalesTax);
			System.out.println("ExecutedST");
		}

		// Service Fee Validations
		String SerFeeFromExcel = getDataFromExcel("Bill Configuration", 4, 1);
		float percentageSerFee = Float.parseFloat(SerFeeFromExcel);
		if (!(percentageSerFee == 0)) {
			String serFeePD = pma.getPOS_FlowOne_POM().getServiceFeePayDetails().getAttribute("content-desc");
			String serFeereplace = serFeePD.replaceAll("[\\r\\n]+", "");
			serFee = serviceFee(subTotal, percentageSerFee);
			// format for Assert
			String roundStringserFee = roundStringValue(serFee);

			Assert.assertEquals(serFeereplace, "Service Fee$" + roundStringserFee);
			System.out.println("ExecutedSF");
		}
		// Service Fee tax Validations
		String SerFeeTXCheckBx = getDataFromExcel("Bill Configuration", 5, 1);
		if (SerFeeTXCheckBx.equals("ON")) {
			String SerFeeTaxFromExcel = getDataFromExcel("Bill Configuration", 6, 1);
			float percentageSerFeeTx = Float.parseFloat(SerFeeTaxFromExcel);
			String serFeeTxPD = pma.getPOS_FlowOne_POM().getServiceFeeTaxPayDetails().getAttribute("content-desc");
			String serFeeTaxreplace = serFeeTxPD.replaceAll("[\\r\\n]+", "");
			serFeeTax = serviceFeeTax(Float.parseFloat(roundStringsalesTax), percentageSerFeeTx);
			// format for Assert
			String roundStringserFeeTax = roundStringValue(serFeeTax);

			Assert.assertEquals(serFeeTaxreplace, "Service Fee Tax$" + roundStringserFeeTax);
			System.out.println("ExecutedSFT");
		}
		// Gratuity
		// Condition - enabled - Amount/Guest Count reaches
		String gratuityState = getDataFromExcel("Bill Configuration", 8, 1); // ON/OFF
		String gratuityBasedOn = getDataFromExcel("Bill Configuration", 9, 1); // Order Amount/GuestCount/Nil
		String takeAwayCBx = getDataFromExcel("Bill Configuration", 14, 1); // ON/OFF
		String dineInCBx = getDataFromExcel("Bill Configuration", 15, 1); // ON/OFF
		String gratuityPercent = getDataFromExcel("Bill Configuration", 10, 1);
		String gratuityTaxPercent = getDataFromExcel("Bill Configuration", 13, 1);
		String subTotalReaches = getDataFromExcel("Bill Configuration", 12, 1);
		String GuestCntReaches = getDataFromExcel("Bill Configuration", 11, 1);

		if (gratuityState.equals("ON") || gratuityState.equals("OFF")) {
			if (gratuityBasedOn.equals("Order Amount")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (subTotal >= Float.parseFloat(subTotalReaches)) {
						if (takeAwayCBx.equals("ON") || dineInCBx.equals("ON")) {// need to get current order type +
																					// button takeAway & dineIn status
							gratuityValue = gratuity(subTotal, Float.parseFloat(gratuityPercent));
							String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetails()
									.getAttribute("content-desc");
							String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
							// format for Assert
							String roundStringgratuityValue = roundStringValue(gratuityValue);

							Assert.assertEquals(gratuityreplace, "Gratuity$" + roundStringgratuityValue);
							System.out.println("ExecutedGty");
						}
					}
				}
			} else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (guestCountAOP >= Float.parseFloat(GuestCntReaches)) {
						gratuityValue = gratuity(subTotal, Float.parseFloat(gratuityPercent));
						String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetails()
								.getAttribute("content-desc");
						String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
						// format for Assert
						String roundStringgratuityValue = roundStringValue(gratuityValue);

						Assert.assertEquals(gratuityreplace, "Gratuity$" + roundStringgratuityValue);
						System.out.println("ExecutedGty");
					}
				}
			}
		}

		// gratuity Tax
		if (gratuityState.equals("ON") || gratuityState.equals("OFF")) {
			if (gratuityBasedOn.equals("Order Amount")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (subTotal >= Float.parseFloat(subTotalReaches)) {
						if (takeAwayCBx.equals("ON") || dineInCBx.equals("ON")) {
//need to get CURRENT ORDER TYPE + button takeAway & dineIn status - ####-Pass Global OrderType String-####
							gratuityTaxValue = gratuity(gratuityValue, Float.parseFloat(gratuityTaxPercent));
							String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetails()
									.getAttribute("content-desc");
							String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
							// format for Assert
							String roundStringgratuityTaxValue = roundStringValue(gratuityTaxValue);

							Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$" + roundStringgratuityTaxValue);
							System.out.println("ExecutedGtyTx");
						}
					}
				}
			} else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (guestCountAOP >= Float.parseFloat(GuestCntReaches)) {
						gratuityTaxValue = gratuity(gratuityValue, Float.parseFloat(gratuityTaxPercent));
						String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetails()
								.getAttribute("content-desc");
						String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
						// format for Assert
						String roundStringgratuityTaxValue = roundStringValue(gratuityTaxValue);

						Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$" + roundStringgratuityTaxValue);
						System.out.println("ExecutedGtyTx");
					}
				}
			}
		}

		// Bill Amount Validation
		totalBillAmount = subTotal + salesTax + serFee + serFeeTax + gratuityValue + gratuityTaxValue;
		System.out.println(subTotal);
		System.out.println(salesTax);
		System.out.println(serFee);
		System.out.println(serFeeTax);
		System.out.println(gratuityValue);
		System.out.println(gratuityTaxValue);
		
		String billAmount = pma.getPOS_FlowOne_POM().getBillAmountPayDetails().getAttribute("content-desc");
		Assert.assertEquals(billAmount, "$" + roundStringValue(totalBillAmount));

	}

	@Then("User should able to click Cash option and Collect Button")
	public void userShouldAbleToClickCashOptionAndCollectButton() {
		pma.getPOS_FlowOne_POM().getCollectCashBtnPayDetails().click();

		String tipPopHeaderAmount = pma.getPOS_FlowOne_POM().getTipPopupBillAmt().getAttribute("content-desc");
		Assert.assertEquals("Bill Amount: $" + roundStringValue(totalBillAmount), tipPopHeaderAmount);
		// No Tip
		pma.getPOS_FlowOne_POM().getTipPopupNoTip().click();

	}

	@Then("User should able to enter TIP and Validate the TIP reflection")
	public void userShouldAbleToEnterTIPAndValidateTheTIPReflection() {
		String billAmount = pma.getPOS_FlowOne_POM().getBillAmountPayDetails().getAttribute("content-desc");
		Assert.assertEquals(billAmount, "$" + roundStringValue(totalBillAmount));
	}
  
	@Then("User should able to Apply Discount and Validate the Subtotal and Calculation")
	public void userShouldAbleToApplyDiscountAndValidateTheSubtotalAndCalculation() throws IOException, InterruptedException {
		

		pma.getPOS_FlowOne_POM().getDiscountDropDown().click();
		String discountName = pma.getPOS_FlowOne_POM().getFirstEligibleDiscountTemplate().getAttribute("content-desc");
		System.out.println(discountName);
		pma.getPOS_FlowOne_POM().getFirstEligibleDiscountTemplate().click();
		int tempCellValue = 0;
		try {
			for (int i = 1; i < 15; i++) {
				String discountTemplateName = getDataFromExcel("Discount", i, 0);
				if (discountTemplateName.equals(discountName)) {
					tempCellValue = i;
					break;
				}
			}
		} catch (NullPointerException e) {
		}
		float discountPercentage = Float.parseFloat(getDataFromExcel("Discount", tempCellValue, 1));
		float discountMinimumOrderAmt = Float.parseFloat(getDataFromExcel("Discount", tempCellValue, 2));
		// Below Items are required in Future Orders
		String discountDineIn = getDataFromExcel("Discount", tempCellValue, 3);
		String discountTakeOut = getDataFromExcel("Discount", tempCellValue, 4);
		String discountExcludeHH = getDataFromExcel("Discount", tempCellValue, 5);
		String discountExcludeMenuList = getDataFromExcel("Discount", tempCellValue, 6);
		

		if (subTotal >= discountMinimumOrderAmt) {
			discountAmt = subtotalAfterApplyingDiscountWOExcludeItems(menuPrice, discountPercentage);
//			System.out.println(roundStringValue(discountAmt));
		} else {
			System.out.println("Discount not Calculated");
		}
		float updatedSubTotal = subTotal - discountAmt;
		
		// SubTotal - Here we show original Subtotal only
		String subTotTxt = pma.getPOS_FlowOne_POM().getSubtotalPayDetailsAfterDis().getAttribute("content-desc");
		String subRepTxt = subTotTxt.replaceAll("[\\r\\n]+", "");
		Assert.assertEquals(subRepTxt, "Subtotal$" + subTotal);//SubTotal - Here we show original Subtotal only
		// Discount
		String discTxt = pma.getPOS_FlowOne_POM().getDiscountAmtPayDetails().getAttribute("content-desc");
		String discRepTxt = discTxt.replaceAll("[\\r\\n]+", "");
		Assert.assertEquals(discRepTxt, "Discount-$" + roundStringValue(discountAmt));
		// SalesTax - Wont Change so that Calculated from subtotal
		String salTxText = pma.getPOS_FlowOne_POM().getSalesTaxPayDetailsAfterDis().getAttribute("content-desc");
		String salTxRepTxt = salTxText.replaceAll("[\\r\\n]+", "");
		String SalTxFromExcel = getDataFromExcel("Bill Configuration", 1, 1);
		float salesTaxPer = Float.parseFloat(SalTxFromExcel);
		salesTax = salesTax(subTotal, salesTaxPer);
		String salesTax1 = roundStringValue(salesTax);
		Assert.assertEquals(salTxRepTxt, "Sales Tax$" + salesTax1);
		// Service Fee
		String SerFeeFromExcel = getDataFromExcel("Bill Configuration", 4, 1);
		float percentageSerFee = Float.parseFloat(SerFeeFromExcel);
		if (!(percentageSerFee == 0)) {
			serviceFee = serviceFee(subTotal, percentageSerFee);
			// format for Assert
			String roundStringserFee = roundStringValue(serviceFee);
			String serFeeTxt = pma.getPOS_FlowOne_POM().getServiceFeePayDetailsAfterDis().getAttribute("content-desc");
			String serFeeRepTxt = serFeeTxt.replaceAll("[\\r\\n]+", "");
			Assert.assertEquals(serFeeRepTxt, "Service Fee$" + roundStringserFee);
			System.out.println("ExecutedSF");
		}
		// Service Fee Tax
		String SerFeeTXCheckBx = getDataFromExcel("Bill Configuration", 5, 1);
		if (SerFeeTXCheckBx.equals("ON")) {
			String SerFeeTaxFromExcel = getDataFromExcel("Bill Configuration", 6, 1);
			float percentageSerFeeTx = Float.parseFloat(SerFeeTaxFromExcel);
			String serFeeTxPD = pma.getPOS_FlowOne_POM().getServiceFeeTaxPayDetailsAfterDis()
					.getAttribute("content-desc");
			String serFeeTaxreplace = serFeeTxPD.replaceAll("[\\r\\n]+", "");
			serviceFeeTax = serviceFeeTax(salesTax, percentageSerFeeTx);
			
			// format for Assert
			String roundStringserFeeTax = roundStringValue(serviceFeeTax);
			Assert.assertEquals(serFeeTaxreplace, "Service Fee Tax$" + roundStringserFeeTax);
			System.out.println("ExecutedSFT");
		}
		// Gratuity
		// Condition - enabled - Amount/Guest Count reaches
		String gratuityState = getDataFromExcel("Bill Configuration", 8, 1); // ON/OFF
		String gratuityBasedOn = getDataFromExcel("Bill Configuration", 9, 1); // Order Amount/GuestCount/Nil
		String takeAwayCBx = getDataFromExcel("Bill Configuration", 14, 1); // ON/OFF
		String dineInCBx = getDataFromExcel("Bill Configuration", 15, 1); // ON/OFF
		String gratuityPercent = getDataFromExcel("Bill Configuration", 10, 1);
		String gratuityTaxPercent = getDataFromExcel("Bill Configuration", 13, 1);
		String subTotalReaches = getDataFromExcel("Bill Configuration", 12, 1);
		String GuestCntReaches = getDataFromExcel("Bill Configuration", 11, 1);

		if (gratuityState.equals("ON") || gratuityState.equals("OFF")) {
			if (gratuityBasedOn.equals("Order Amount")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (updatedSubTotal >= Float.parseFloat(subTotalReaches)) {
						if (takeAwayCBx.equals("ON") || dineInCBx.equals("ON")) {// need to get current order type +
																					// button takeAway & dineIn status
							gratuity = gratuity(updatedSubTotal, Float.parseFloat(gratuityPercent));
							String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetailsAfterDis()
									.getAttribute("content-desc");
							String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
							// format for Assert
							String roundStringgratuityValue = roundStringValue(gratuity);

							Assert.assertEquals(gratuityreplace, "Gratuity$" + roundStringgratuityValue);
							System.out.println("ExecutedGty");
						}
					}
				}
			} else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (guestCountAOP >= Float.parseFloat(GuestCntReaches)) {
						gratuity = gratuity(updatedSubTotal, Float.parseFloat(gratuityPercent));
						String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetailsAfterDis()
								.getAttribute("content-desc");
						String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
						// format for Assert
						String roundStringgratuityValue = roundStringValue(gratuity);

						Assert.assertEquals(gratuityreplace, "Gratuity$" + roundStringgratuityValue);
						System.out.println("ExecutedGty");
					}
				}
			}
		}
		// Gratuity Tax
		if (gratuityState.equals("ON") || gratuityState.equals("OFF")) {
			if (gratuityBasedOn.equals("Order Amount")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (updatedSubTotal >= Float.parseFloat(subTotalReaches)) {
						if (takeAwayCBx.equals("ON") || dineInCBx.equals("ON")) {
//need to get CURRENT ORDER TYPE + button takeAway & dineIn status - ####-Pass Global OrderType String-####
							gratuityTax = gratuity(gratuity, Float.parseFloat(gratuityTaxPercent));
							String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetailsAfterDis()
									.getAttribute("content-desc");
							String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
							// format for Assert
							String roundStringgratuityTaxValue = roundStringValue(gratuityTax);

							Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$" + roundStringgratuityTaxValue);
							System.out.println("ExecutedGtyTx");
						}
					}
				}
			} else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (guestCountAOP >= Float.parseFloat(GuestCntReaches)) {
						gratuityTax = gratuity(gratuity, Float.parseFloat(gratuityTaxPercent));
						String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetailsAfterDis()
								.getAttribute("content-desc");
						String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
						// format for Assert
						String roundStringgratuityTaxValue = roundStringValue(gratuityTax);

						Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$" + roundStringgratuityTaxValue);
						System.out.println("ExecutedGtyTx");
					}
				}
			}
		}

		// Bill Amount Validation
		totalBillAmountADis = updatedSubTotal + salesTax + serviceFee + serviceFeeTax + gratuity + gratuityTax;
		String billAmount = pma.getPOS_FlowOne_POM().getBillAmountPayDetailsAfterDis().getAttribute("content-desc");
		Assert.assertEquals(billAmount, "$" + roundStringValue(totalBillAmountADis));
		

	}


	@Then("User should able to Click Complete Order Button")
	public void userShouldAbleToClickCompleteOrderButton() throws InterruptedException {
		Actions act = new Actions(posDriver1);
        WebElement aElement = pma.getPOS_FlowOne_POM().getCompleteOrderSwipe();
        int a = (((aElement.getSize().width) / 2) * -1)+2;

        dragAndDropBy1(act, pma.getPOS_FlowOne_POM().getCompleteOrderSwipe(), a, 400, 0).perform();
        
        Thread.sleep(1500);
    }
	
    public Actions dragAndDropBy1(Actions act, WebElement source, int startOffset, int xOffset, int yOffset) {//Swipe
        return act
                .tick(act.getActivePointer().createPointerMove(Duration.ofMillis(1000),
                        Origin.fromElement(pma.getPOS_FlowOne_POM().getCompleteOrderSwipe()),(startOffset + 25), 45))
                .tick(act.getActivePointer().createPointerMove(Duration.ofMillis(1000),
                        Origin.fromElement(pma.getPOS_FlowOne_POM().getCompleteOrderSwipe()),(startOffset + 15), 35))
                .tick(act.getActivePointer().createPointerDown(LEFT.asArg())).tick(act.getActivePointer()
                        .createPointerMove(Duration.ofMillis(1000), Origin.pointer(), xOffset, yOffset))
                .tick(act.getActivePointer().createPointerUp(LEFT.asArg()));
    }

	@Then("User should Verify the page redirected to Complete order page")
	public void userShouldVerifyThePageRedirectedToCompleteOrderPage() throws InterruptedException {
		Thread.sleep(1500);
		pma.getPOS_FlowOne_POM().getCompleteOrderSection().click();
		Thread.sleep(1000);
        String actHeadr = pma.getPOS_FlowOne_POM().getCompleteOrderHeadr().getAttribute("content-desc");    
        Assert.assertTrue(actHeadr.equals("Completed Orders"));
	}

	@Then("User should Validate the Complete order page")
	public void userShouldValidateTheCompleteOrderPage() throws InterruptedException, IOException {
//		writeValueToCell("Reports", 0, 0, "OrderType");
//		writeValueToCell("Reports", 0, 1, "OrderID");
//		writeValueToCell("Reports", 0, 2, "Customer Name");
//		writeValueToCell("Reports", 0, 3, "Mobile Number");
//		writeValueToCell("Reports", 0, 4, "Order Time");
//		writeValueToCell("Reports", 0, 5, "Order Status");
//		writeValueToCell("Reports", 0, 6, "Payment Mode");
//		writeValueToCell("Reports", 0, 7, "SubTotal");
//		writeValueToCell("Reports", 0, 8, "Sales Tax");
//		writeValueToCell("Reports", 0, 9, "Service Fee");
//		writeValueToCell("Reports", 0, 10, "Service Fee Tax");
//		writeValueToCell("Reports", 0, 11, "Gratuity");
//		writeValueToCell("Reports", 0, 12, "Gratuity Tax");
//		writeValueToCell("Reports", 0, 13, "Grand Total");
//		writeValueToCell("Reports", 0, 14, "Discount");
//		writeValueToCell("Reports", 0, 15, "Happy Hour Sale");
		
		
		if (orderType.equals("Dine-In")) {
	        DecimalFormat dF = new DecimalFormat("#.##");
	        pma.getPOS_FlowOne_POM().getSearchBarCO().click();
	        pma.getPOS_FlowOne_POM().getSearchBarCO().sendKeys(orderId.substring(7, orderId.length()));
	        Thread.sleep(1000);
	        
	        pma.getPOS_FlowOne_POM().getCompleteOrderHeadr().click();
	        Thread.sleep(300);
	        pma.getPOS_FlowOne_POM().getFirstOrderinCO().click();
	        Thread.sleep(500);
	        
	       System.out.println(pma.getPOS_FlowOne_POM().getFirstOrderinCO().getAttribute("content-desc"));
	        String firstOrderCO = pma.getPOS_FlowOne_POM().getFirstOrderinCO().getAttribute("content-desc");
	        String employeeName = pma.getPOS_FlowOne_POM().getEmployeeName().getAttribute("content-desc");
	       System.out.println(employeeName);
	        String guestCount = pma.getPOS_FlowOne_POM().getGuestCountRightCornerCO().getAttribute("content-desc");
	        String substring = guestCount.substring(8, guestCount.length());
	        guestCountAOP = Integer.parseInt(substring);
	       System.out.println(substring);
	        String orderId = pma.getPOS_FlowOne_POM().getOrderIdRightCorneCO().getAttribute("content-desc");
	       System.out.println(orderId);
	        String tableName = pma.getPOS_FlowOne_POM().getTableNameRightsideCO().getAttribute("content-desc");
	       System.out.println(tableName);

	         Assert.assertTrue(firstOrderCO.contains("Paid - Cash"));
	         
	         if (employeeName.contains("Clocked In:")) {
	        	 String replaceAll = employeeName.replaceAll("[\\r\\n]+", "");
	 			String[] split = replaceAll.split("Clocked In:");
	 			employeeName = split[0];
			}
	        Assert.assertTrue(firstOrderCO.contains(employeeName));
	        Assert.assertTrue(firstOrderCO.contains("Guest: " + substring));
	        Assert.assertTrue(firstOrderCO.contains(orderId));
	        Assert.assertTrue(firstOrderCO.contains("Waiter"));
	        Assert.assertTrue(firstOrderCO.contains(tableName));
	       //Need Table and Area name validations

	        
	        //Order Status
	        String orStatus = pma.getPOS_FlowOne_POM().getCompleteOrderStatus().getAttribute("content-desc");
	        Assert.assertTrue(orStatus.equals("Delivered"));
			
			//Order Summary Validation
			pma.getPOS_FlowOne_POM().getTotAmountCOSummary().click();
			Thread.sleep(600);
			String subTotalSMRY = pma.getPOS_FlowOne_POM().getSubTotalValueCOSummary().getAttribute("content-desc");
			String discountSMRY = pma.getPOS_FlowOne_POM().getDiscountValueCOSummary().getAttribute("content-desc");
			String salesTxSMRY = pma.getPOS_FlowOne_POM().getSalesTaxCOSummary().getAttribute("content-desc");
			String serviceFeeSMRY = pma.getPOS_FlowOne_POM().getServiceFeeCOSummary().getAttribute("content-desc");
			String serviceFeeTXSMRY = pma.getPOS_FlowOne_POM().getServiceFeeTaxCOSummary().getAttribute("content-desc");
			String gratuitySMRY = pma.getPOS_FlowOne_POM().getGratuityCOSummary().getAttribute("content-desc");
			String gratuityTxSMRY = pma.getPOS_FlowOne_POM().getGratuityTaxCOSummary().getAttribute("content-desc");
			
			
			Assert.assertEquals(subTotalSMRY, "$"+roundStringValue(subTotal));
			Assert.assertEquals(discountSMRY, "-$"+roundStringValue(discountAmt));
			Assert.assertEquals(salesTxSMRY, "$"+roundStringValue(salesTax));
			Assert.assertEquals(serviceFeeSMRY, "$"+roundStringValue(serviceFee));
			Assert.assertEquals(serviceFeeTXSMRY, "$"+roundStringValue(serviceFeeTax));
			Assert.assertEquals(gratuitySMRY, "$"+roundStringValue(gratuity));
			Assert.assertEquals(gratuityTxSMRY, "$"+roundStringValue(gratuityTax));
			
			
			String totalAmountTxt = pma.getPOS_FlowOne_POM().getTotAmountCOSummary().getAttribute("content-desc");
			System.out.println(totalAmountTxt);
			
			Assert.assertTrue(totalAmountTxt.contains("Paid - Cash"));
			Assert.assertTrue(totalAmountTxt.contains("Total Amount"));
			Assert.assertTrue(totalAmountTxt.contains(roundStringValue(totalBillAmountADis)));
			
			//Store Order information in Excel
			for (int i = 1; i < 100; i++) {
				try {
					if (getDataFromExcel("Reports", i, 0).equals(null)) {
						writeValueToCell("Reports", i, 0, orderType);
					break;}
				} catch (NullPointerException e) {
				}
			}
			
			
		
		} else if (orderType.equals("Take-Out")) {


	        
	        DecimalFormat dF = new DecimalFormat("#.##");
	        pma.getPOS_FlowOne_POM().getSearchBarCO().click();
	        pma.getPOS_FlowOne_POM().getSearchBarCO().sendKeys(orderId.substring(7, orderId.length()));
	        Thread.sleep(1000);
	        
	        pma.getPOS_FlowOne_POM().getCompleteOrderHeadr().click();
	        Thread.sleep(300);
	        pma.getPOS_FlowOne_POM().getFirstOrderinCO().click();
	        Thread.sleep(500);
	        
	       System.out.println(pma.getPOS_FlowOne_POM().getFirstOrderinCO().getAttribute("content-desc"));
	        String firstOrderCO = pma.getPOS_FlowOne_POM().getFirstOrderinCO().getAttribute("content-desc");
	        String employeeName = pma.getPOS_FlowOne_POM().getEmployeeName().getAttribute("content-desc");
	       System.out.println(employeeName);
	        String orderId = pma.getPOS_FlowOne_POM().getOrderIdRightCorneCO().getAttribute("content-desc");
	       System.out.println(orderId);

	         Assert.assertTrue(firstOrderCO.contains("Paid - Cash"));
	         
	         if (employeeName.contains("Clocked In:")) {
	        	 String replaceAll = employeeName.replaceAll("[\\r\\n]+", "");
	 			String[] split = replaceAll.split("Clocked In:");
	 			employeeName = split[0];
			}
	        Assert.assertTrue(firstOrderCO.contains(employeeName));
	        Assert.assertTrue(firstOrderCO.contains(orderId));
	        Assert.assertTrue(firstOrderCO.contains("Waiter"));
	       //Need Table and Area name validations

	        
	        //Order Status
	        String orStatus = pma.getPOS_FlowOne_POM().getCompleteOrderStatusTakeOut().getAttribute("content-desc");
	        Assert.assertTrue(orStatus.equals("Delivered"));
			
			//Order Summary Validation
			pma.getPOS_FlowOne_POM().getTotAmountCOSummaryTakeOut().click();
			Thread.sleep(600);
			String subTotalSMRY = pma.getPOS_FlowOne_POM().getSubTotalValueCOSummary().getAttribute("content-desc");
			String discountSMRY = pma.getPOS_FlowOne_POM().getDiscountValueCOSummary().getAttribute("content-desc");
			String salesTxSMRY = pma.getPOS_FlowOne_POM().getSalesTaxCOSummary().getAttribute("content-desc");
			String serviceFeeSMRY = pma.getPOS_FlowOne_POM().getServiceFeeCOSummaryTakeOut().getAttribute("content-desc");
			String serviceFeeTXSMRY = pma.getPOS_FlowOne_POM().getServiceFeeTaxCOSummary().getAttribute("content-desc");
			String gratuitySMRY = pma.getPOS_FlowOne_POM().getGratuityCOSummary().getAttribute("content-desc");
			String gratuityTxSMRY = pma.getPOS_FlowOne_POM().getGratuityTaxCOSummary().getAttribute("content-desc");
			
			
			Assert.assertEquals(subTotalSMRY, "$"+roundStringValue(subTotal));
			Assert.assertEquals(discountSMRY, "-$"+roundStringValue(discountAmt));
			Assert.assertEquals(salesTxSMRY, "$"+roundStringValue(salesTax));
			Assert.assertEquals(serviceFeeSMRY, "$"+roundStringValue(serviceFee));
			Assert.assertEquals(serviceFeeTXSMRY, "$"+roundStringValue(serviceFeeTax));
			Assert.assertEquals(gratuitySMRY, "$"+roundStringValue(gratuity));
			Assert.assertEquals(gratuityTxSMRY, "$"+roundStringValue(gratuityTax));
			
			
			String totalAmountTxt = pma.getPOS_FlowOne_POM().getTotAmountCOSummaryTakeOut().getAttribute("content-desc");
			System.out.println(totalAmountTxt);
			
			Assert.assertTrue(totalAmountTxt.contains("Paid - Cash"));
			Assert.assertTrue(totalAmountTxt.contains("Total Amount"));
			Assert.assertTrue(totalAmountTxt.contains(roundStringValue(totalBillAmountADis)));
			//Store Data in Excel
			
		}
		
	}
	@Given("Excel Write Check")
	public void excelWriteCheck() throws IOException {
//		writeValueToCell("Reports", 1, 0, "Custom Text Rewrite");
//		writeValueToCell("Reports", 1, 1, "Text Rewrite");
//		writeValueToCell("Reports", 1, 2, "Rewrite");
		for (int i = 1; i < 100; i++) {
			try {
				if (getDataFromExcel("Reports", 1, 0).equals(null)) {
				break;}
			} catch (NullPointerException e) {
				writeValueToCell("Reports", 1, 0, "orderType");
				break;
			}
		}
		
		
		
	}
	
	
	//Scenario two
	
	@Then("User should Select TakeOut Section and Verify Cutomer Information PopUp")
	public void userShouldSelectTakeOutSectionAndVerifyCutomerInformationPopUp() throws InterruptedException {
		Thread.sleep(1000);
		pma.getPOS_FlowOne_POM().getTakeOutSection().click();
		Thread.sleep(1000);
		String popUpHeader = pma.getPOS_FlowOne_POM().getTakeOutPopupHeader().getAttribute("content-desc");
		Assert.assertEquals(popUpHeader, "Take-out");
		Thread.sleep(1000);
		String popUpCusNameHeader = pma.getPOS_FlowOne_POM().getPopupCustomerNameHeader().getAttribute("content-desc");
		Assert.assertEquals(popUpCusNameHeader, "Customer Name");
		Thread.sleep(1000);
		String popUpMobileHeader = pma.getPOS_FlowOne_POM().getPopupMobileNumHeader().getAttribute("content-desc");
		Assert.assertEquals(popUpMobileHeader, "Mobile Number");Thread.sleep(1000);
	}
	@Then("User should Validate and Store Cutomer Information and Click Proceed Button")
	public void userShouldValidateAndStoreCutomerInformationAndClickProceedButton() throws InterruptedException {
		randomName=randomNameGenerator();
		randomNumber=randomMobileNumberGeneration();
		pma.getPOS_FlowOne_POM().getPopupCustomerNameTextBx().sendKeys(randomName);
		pma.getPOS_FlowOne_POM().getPopupMobileNumTextBx().click();
		pma.getPOS_FlowOne_POM().getPopupMobileNumTextBx().sendKeys(randomNumber);
		System.out.println(randomNumber);
		pma.getPOS_FlowOne_POM().getProceedButton().click();
		Thread.sleep(2000);
		orderType="Take-Out";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//20-04-2023 10:38 Complete