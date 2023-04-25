package com.stepdefinition;

import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC11_POS_DineIn_Prepaid_Decline_Flow_Definition extends BaseClass {

	PageManager pma = new PageManager();
	public float subTotal, totalBillAmount;
	List<Float> menuPrice = new ArrayList<Float>();
	String noOfGuest = "",orderId="",randomName="",randomNumber="",orderType = "",orderTime="";
	public int guestCountAOP;
	float salesTax = 0, gratuity = 0, serviceFee = 0, serviceFeeTax = 0, gratuityTax = 0, discountAmt = 0,totalBillAmountADis=0;

	public String specialChar = "!@#$%%^&*()_+";
	public String upperCase = "AUTOMATIONTEXT";
	public String lowerCase = "automationtext";
	public String numbers = "1234567890";
	public String text = "!@#$%^&*()abcdefghijABCDEFGHIJ1234567890AutomationTestRegression";

	public TC11_POS_DineIn_Prepaid_Decline_Flow_Definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	@Then("User should able to select guest count Number and Click Proceed button")
	public void userShouldAbleToSelectGuestCountNumberAndClickProceedButton() throws InterruptedException {
		pma.getPOS_FlowOne_POM().getNoOfGuest5().click();
		noOfGuest=pma.getPOS_FlowOne_POM().getNoOfGuest5().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().getProceedButton().click();
		Thread.sleep(2000);
	}
	@Then("User should Add the Pre-Defined Set of Menus")
	public void userShouldAddThePreDefinedSetOfMenus() {
		
	}
	@Then("User Should Add the Menu with Optional Modifier")
	public void userShouldAddTheMenuWithOptionalModifier() {
		
		
	}
	@When("User Should click Receive Payment button")
	public void userShouldClickReceivePaymentButton() {
		pma.getPOS_FlowOne_POM().getReceivePaymentBtn().click();
	}
	@Then("User Should Verify the page redirected to Payment Detail Page")
	public void userShouldVerifyThePageRedirectedToPaymentDetailPage() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(pma.getPOS_FlowOne_POM().getPaymentDetailsHeader().isDisplayed());
		String header = pma.getPOS_FlowOne_POM().getPaymentDetailsHeader().getAttribute("content-desc");
		Assert.assertEquals("Payment details", header);
	}
	@Then("User Should verify the Receive Payment page Calculation")
	public void userShouldVerifyTheReceivePaymentPageCalculation() throws IOException, InterruptedException {

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
	@Then("User Should Add the Tip")
	public void userShouldAddTheTip() {
		pma.getPOS_FlowOne_POM().getCollectCashBtnPayDetails().click();
		pma.getPOS_FlowOne_POM().get22PercentTip().click();
	}
	@Then("User Should verify the Receive Payment page Calculation after Tip")
	public void userShouldVerifyTheReceivePaymentPageCalculationAfterTip() {
		
		
		
		
		
	}
	@Then("User should apply Discount")
	public void userShouldApplyDiscount() {
	}
	@Then("User Should verify the Receive Payment page Calculation after Applying Discount")
	public void userShouldVerifyTheReceivePaymentPageCalculationAfterApplyingDiscount() {
		
	}
	@Then("User should verify the Customer Information Field")
	public void userShouldVerifyTheCustomerInformationField() throws InterruptedException {Thread.sleep(1000);
		//Special Char
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(specialChar);
		String nameTxt = pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().getAttribute("content-desc");
		Assert.assertEquals("", nameTxt);Thread.sleep(1000);
		//Upper Case
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(upperCase);
		String nameTxt1 = pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().getAttribute("content-desc");
		Assert.assertEquals(upperCase, nameTxt1);Thread.sleep(1000);
		//Lower Case
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(lowerCase);
		String nameTxt2 = pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().getAttribute("content-desc");
		Assert.assertEquals(lowerCase, nameTxt2);Thread.sleep(1000);
		//Numbers
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(numbers);
		String nameTxt3 = pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().getAttribute("content-desc");
		Assert.assertEquals(numbers, nameTxt3);Thread.sleep(1000);
		//Text
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(text);
		String nameTxt4 = pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().getAttribute("content-desc");
		Assert.assertEquals("abcdefghijABCDEFGHIJ1234567890AutomationTestRegression", nameTxt4);Thread.sleep(1000);
		
		
		
		//MobileNum Tab
		//Text
		pma.getPOS_FlowOne_POM().getMobileNumTxtBxPaymentDetails().sendKeys(text);
		String numTxt = pma.getPOS_FlowOne_POM().getMobileNumTxtBxPaymentDetails().getAttribute("content-desc");
		Assert.assertEquals("1234567890", numTxt);Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	@Then("User Should Select the Payment Method as Cash")
	public void userShouldSelectThePaymentMethodAsCash() {
		pma.getPOS_FlowOne_POM().getCashRadioBtnPayDetails().click();
	}
	@Then("User Should swipe the Send to Kitchen")
	public void userShouldSwipeTheSendToKitchen() throws InterruptedException {
		
		Thread.sleep(300);
		String text = pma.getPOS_FlowOne_POM().getSTK1().getAttribute("content-desc");
		System.out.println(text);
		Thread.sleep(3000);
		Actions act = new Actions(posDriver1);
		WebElement aElement = pma.getPOS_FlowOne_POM().getSTK1();
		int a = ((aElement.getSize().width) / 2) * -1;

		dragAndDropBy(act, pma.getPOS_FlowOne_POM().getSTK1(), a, 600, 0).perform();
		Thread.sleep(1500);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		LocalTime currentTime = LocalTime.now();
		String formattedTime = currentTime.format(formatter);
		orderTime = formattedTime.toUpperCase();
		System.out.println(orderTime);
	}
	public Actions dragAndDropBy(Actions act, WebElement source, int startOffset, int xOffset, int yOffset) {
		return act
				.tick(act.getActivePointer().createPointerMove(Duration.ofMillis(100),
						Origin.fromElement(pma.getPOS_FlowOne_POM().getSTK1()),(startOffset + 25), 0))
				.tick(act.getActivePointer().createPointerDown(LEFT.asArg())).tick(act.getActivePointer()
						.createPointerMove(Duration.ofMillis(250), Origin.pointer(), xOffset, yOffset))
				.tick(act.getActivePointer().createPointerUp(LEFT.asArg()));
	}
	
	
	@Then("User Should Validate the Active Orders Page")
	public void userShouldValidateTheActiveOrdersPage() {

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
			Assert.assertTrue(firstOrderAO.contains(orderTime));

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
			Assert.assertTrue(firstOrderAO.contains(orderTime));

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
		

	}
	@Then("User Should Decline the Order")
	public void userShouldDeclineTheOrder() throws InterruptedException {
		Thread.sleep(1000);
		pma.getPOS_FlowOne_POM().getOrderStatusDropdownAO().click();
		pma.getPOS_FlowOne_POM().getgetOrderStatusDropdownDeclineAO().click();
		Thread.sleep(1000);
	}
	@Then("User should Verify Order gets Moved to Completed Orders Page")
	public void userShouldVerifyOrderGetsMovedToCompletedOrdersPage() throws InterruptedException {
		Thread.sleep(1500);
		pma.getPOS_FlowOne_POM().getCompleteOrderSection().click();
		Thread.sleep(1000);
        String actHeadr = pma.getPOS_FlowOne_POM().getCompleteOrderHeadr().getAttribute("content-desc");    
        Assert.assertTrue(actHeadr.equals("Completed Orders"));
	}
	@Then("User Should Validate the Completed Orders Page")
	public void userShouldValidateTheCompletedOrdersPage() throws InterruptedException, IOException {
		
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
//			for (int i = 1; i < 100; i++) {
//				try {
//					if (getDataFromExcel("Reports", i, 0).equals(null)) {
//						writeValueToCell("Reports", i, 0, orderType);
//					break;}
//				} catch (NullPointerException e) {
//				}
//			}
			
			
		
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
	@Then("User Should Add the Menu with Required Modifier")
	public void userShouldAddTheMenuWithRequiredModifier() {
	}
	@Then("User Should Add the Tip #Need to Check")
	public void userShouldAddTheTipNeedToCheck() {
	}
	@Then("User Should Add the Menu with both Optonal and Required Modifier")
	public void userShouldAddTheMenuWithBothOptonalAndRequiredModifier() {
	}
	@Then("User Should Add the Menu with Modifier Price Zero")
	public void userShouldAddTheMenuWithModifierPriceZero() {
	}
	@Then("User Should Add the Menu Price Zero with Modifier")
	public void userShouldAddTheMenuPriceZeroWithModifier() {
	}
	
	
	
}
