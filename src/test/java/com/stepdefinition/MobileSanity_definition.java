package com.stepdefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MobileSanity_definition extends BaseClass {

	PageManager pma = new PageManager();
	public static String beforeCartElementVal;
	public static float globalSubTotal, globalSalesTax, globalGratuity, globalGratuityTax, globalServiceFee,
			globalServiceFeeTax, globalTip, globalTotal;

	public static Map<String, Integer> menuList = new LinkedHashMap<String, Integer>();
	
	public static String MA_OrderId;

	public MobileSanity_definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	@Given("User is on the Restaurants Page")
	public void userIsOnTheRestaurantsPage() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo V21 5G");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		capabilities.setCapability(AndroidMobileCapabilityType.SKIP_UNLOCK, "false");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.plateron.consumer.qa");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.plateron.consumer.MainActivity");
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 2000);
//			capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, "true");
		capabilities.setCapability(MobileCapabilityType.UDID, "085733127D031763");// RZCT818MYWR //RZ8T31AB43E
		// capabilities.setCapability(MobileCapabilityType.UDID,"192.168.5.101:5555");

		capabilities.setCapability(MobileCapabilityType.NO_RESET, false);

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		posDriver1 = new AppiumDriver(url, capabilities);
		posDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@Then("User should click the profile icon and verify the page redirection to Login page")
	public void userShouldClickTheProfileIconAndVerifyThePageRedirectionToLoginPage() throws InterruptedException {

		pma.getMobileSanity_POM().getProfileIconElement().click();
		String actThere = pma.getMobileSanity_POM().getAlmostThere().getAttribute("content-desc");
		Assert.assertTrue(actThere.contains("Almost There"));

	}

	@Then("User should click skip option and verify the page redirection to Restaurant page")
	public void userShouldClickSkipOptionAndVerifyThePageRedirectionToRestaurantPage() {
		pma.getMobileSanity_POM().getSkip().click();
		Assert.assertTrue(pma.getMobileSanity_POM().getSearchBarElement().isDisplayed());

		// After this the same 1st line is repeating(Mentioned Below)
		// Then User should click the profile icon and verify the page redirection to
		// Login page
	}

	@Then("User should click the Mobile text box and enter the {string} and click Continue")
	public void userShouldClickTheMobileTextBoxAndEnterTheAndClickContinue(String MobileNumber) {

		pma.getMobileSanity_POM().getMobileNoBox().click();

		Random rand = new Random(); // Creating Random Number
		long randomNum = rand.nextInt(900000000) + 1000000000;// Created
		String PhNo = Long.toString(randomNum); // Converting Long to String
		pma.getMobileSanity_POM().getMobileNoBox().sendKeys(PhNo);
		pma.getMobileSanity_POM().getLoginContinueBtnElement().click();

	}

	@Then("User should verify the page redirection to OTP page and enter the {string}")
	public void userShouldVerifyThePageRedirectionToOTPPageAndEnterThe(String OTP) {
		String actOtpdetails = pma.getMobileSanity_POM().getOtpVerifyDetails().getAttribute("content-desc");
		Assert.assertTrue(actOtpdetails.contains("Verify Details"));
		pma.getMobileSanity_POM().getOTPDiigit1Element().click();
		pma.getMobileSanity_POM().getOTPDiigit1Element().sendKeys(OTP);
	}

	@Then("User should verify the page redirection to account creation page {string} and enter {string} {string} {string} {string}")
	public void userShouldVerifyThePageRedirectionToAccountCreationPageAndEnter(String expWelcomeMsg, String FirstName,
			String LastName, String EmailAddress, String DOB) {
		try {
			Thread.sleep(2000);
			String actWelcomeMsg = pma.getMobileSanity_POM().getWelcometoplateronText().getAttribute("content-desc");
			Assert.assertTrue(actWelcomeMsg.contains(expWelcomeMsg));

			pma.getMobileSanity_POM().getFirstnameInputBox().click();
			pma.getMobileSanity_POM().getFirstnameInputBox().sendKeys(FirstName);
			pma.getMobileSanity_POM().getLastnameInputBox().click();
			pma.getMobileSanity_POM().getLastnameInputBox().sendKeys(LastName);
			pma.getMobileSanity_POM().getEmailaddressInputBox().click();

			// Automatically generated email id
			String generateRandomEmail = generateRandomEmail(18);
			pma.getMobileSanity_POM().getEmailaddressInputBox().sendKeys(generateRandomEmail);

			pma.getMobileSanity_POM().getDobInputBox().click();
			pma.getMobileSanity_POM().getDobDatepickerEditButton().click();

			Thread.sleep(300);
			pma.getMobileSanity_POM().getDobDatepickerEditInpuBox().click();
			Thread.sleep(300);
			pma.getMobileSanity_POM().getDobDatepickerEditInpuBox().clear();
			Thread.sleep(300);
			pma.getMobileSanity_POM().getDobDatepickerEditInpuBox().sendKeys(DOB);
			Thread.sleep(300);
			pma.getMobileSanity_POM().getDobDatepickerokButton().click();

			pma.getMobileSanity_POM().getIaggertermsofserviceandprovacypolicyCheckbox().click();
			pma.getMobileSanity_POM().getSignupButton().click();

		} catch (Exception e) {
			try {
				Assert.assertTrue(pma.getMobileSanity_POM().getSearchBarElement().isDisplayed());
			} catch (Exception e2) {
				Assert.assertTrue(pma.getMobileSanity_POM().getSearchBarAfterOrderElement().isDisplayed());
			}
		}

	}

	@Then("User Should verify Search for Restaurants bar")
	public void userShouldVerifySearchForRestaurantsBar() {
		// Assertion
		try {
			Assert.assertTrue(pma.getMobileSanity_POM().getSearchBarElement().isDisplayed());
		} catch (Exception e2) {
			Assert.assertTrue(pma.getMobileSanity_POM().getSearchBarAfterOrderElement().isDisplayed());
		}
	}

	@When("User should Click and search the Restaurant Name")
	public void userShouldClickAndSearchTheRestaurantName() throws InterruptedException, IOException {
		try {
			pma.getMobileSanity_POM().getSearchBarElement().click();
			String resName = getDataFromExcel("MA", 1, 0);
			pma.getMobileSanity_POM().getSearchBarElement().sendKeys(resName);
		} catch (Exception e) {
			pma.getMobileSanity_POM().getSearchBarAfterOrderElement().click();
			String resName = getDataFromExcel("MA", 1, 0);
			pma.getMobileSanity_POM().getSearchBarAfterOrderElement().sendKeys(resName);
		}
		Thread.sleep(2000);
	}

	@Then("User should validate Result Restaurant Text")
	public void userShouldValidateResultRestaurantText() throws IOException {
		String actual = pma.getMobileSanity_POM().getResultRestaurantElement().getAttribute("content-desc");
		String resName = getDataFromExcel("MA", 1, 0);
		Assert.assertTrue(actual.contains(resName));

	}

	@When("User should select the Restaurant")
	public void userShouldSelectTheRestaurant() {
		pma.getMobileSanity_POM().getResultRestaurantElement().click();

	}

	@Then("User should validate page Redirected to Menu list {string}")
	public void userShouldValidatePageRedirectedToMenuList(String expected) {
		String attribute = pma.getMobileSanity_POM().getSearchItemsBarElement().getAttribute("content-desc");
		System.out.println(attribute);
		Assert.assertTrue(attribute.contains(expected));

	}

	@When("User Should Search menuName in Search for Items Bar and select the Menu")
	public void userShouldSearchMenuNameInSearchForItemsBarAndSelectTheMenu() throws InterruptedException, IOException {
		pma.getMobileSanity_POM().getSearchItemsBarElement().click();

		for (int i = 1; i <= 4; i++) {
			String Menu = getDataFromExcel("Menu List", (i), 1);
			pma.getMobileSanity_POM().getSearchItemsBarAfterClickElement().sendKeys(Menu);
			Thread.sleep(500);
			posDriver1.navigate().back();
			Thread.sleep(500);
			pma.getMobileSanity_POM().getResultMenuAddIconElement().click();
			Thread.sleep(2000);
			pma.getMobileSanity_POM().getSearchClearBtnElement().click();
			Thread.sleep(1500);

		}
	}

//	@Then("User Should Verify the Item Added to cart")
//	public void userShouldVerifyTheItemAddedToCart() throws InterruptedException {
//		try {
//			String afterCartElementVal = pma.getMobileSanity_POM().getCartIconElement().getAttribute("content-desc");
//			char c = beforeCartElementVal.charAt(0);
//			String s = "" + c;
//			int beforeCount = Integer.parseInt(s);
//			Thread.sleep(2000);
//			char d = afterCartElementVal.charAt(0);
//			String t = "" + d;
//			int afterCount = Integer.parseInt(t);
//			Thread.sleep(2000);
//			System.out.println(beforeCount);
//			System.out.println(afterCount);
////			 Assert.assertTrue(beforeCount<afterCount);
//		} catch (Exception e) {
//			pma.getMobileSanity_POM().getSearchBarCloseIconElement().click();Thread.sleep(300);
//			String afterCartElementVal = pma.getMobileSanity_POM().getCartIconElement().getAttribute("content-desc");
//			char c = beforeCartElementVal.charAt(0);
//			String s = "" + c;
//			int beforeCount = Integer.parseInt(s);
//			char d = afterCartElementVal.charAt(0);
//			String t = "" + d;
//			int afterCount = Integer.parseInt(t);
//			System.out.println(beforeCount);
//			System.out.println(afterCount);
////			 Assert.assertTrue(beforeCount<afterCount);
//		}
//				}
	@When("User Should Click place Order button")
	public void userShouldClickPlaceOrderButton() {
		pma.getMobileSanity_POM().getPlaceOrderIconElement().click();
	}

	@Then("User Should Verify the Page Redirection to Checkout")
	public void userShouldVerifyThePageRedirectionToCheckout() {
		boolean displayed = pma.getMobileSanity_POM().getPayNowElement().isDisplayed();
		Assert.assertTrue(displayed);
	}

	@Then("User Should Verify Subtotal")
	public void userShouldVerifySubtotal() throws InterruptedException {
		Thread.sleep(500);

		// Menu1 Price
		String menu1 = pma.getMobileSanity_POM().getMenuPrice1PM().getAttribute("content-desc");
		String smenu1 = menu1.substring(1);
		float fmenu1 = Float.parseFloat(smenu1);
		// Menu2 Price
		String menu2 = pma.getMobileSanity_POM().getMenuPrice2PM().getAttribute("content-desc");
		String smenu2 = menu2.substring(1);
		float fmenu2 = Float.parseFloat(smenu2);
		// Menu3 Price
		String menu3 = pma.getMobileSanity_POM().getMenuPrice3PM().getAttribute("content-desc");
		String smenu3 = menu3.substring(1);
		float fmenu3 = Float.parseFloat(smenu3);
		// Menu4 Price
		String menu4 = pma.getMobileSanity_POM().getMenuPrice4PM().getAttribute("content-desc");
		String smenu4 = menu4.substring(1);
		float fmenu4 = Float.parseFloat(smenu4);
		// Total Price
		float total = fmenu1 + fmenu2 + fmenu3 + fmenu4;

		// Subtotal
		Thread.sleep(2000);
		// total element
		pma.getMobileSanity_POM().getTotalUpArrowElement().click();
		String allCalculation1 = pma.getMobileSanity_POM().getTotalCalculationElement().getAttribute("content-desc");
		char charAt1 = allCalculation1.charAt(8);
		String s1 = "" + charAt1;
		String replaceAll1 = allCalculation1.replaceAll(s1, "");
		String finalString1 = replaceAll1.replaceAll(" ", "");

		int indexOfSub1 = finalString1.indexOf("Subtotal$");
		String subTotal1 = finalString1.substring((indexOfSub1 + 9), finalString1.indexOf("Sales"));
		float actsubTot = Float.parseFloat(subTotal1);

		// Comparing both total
		Assert.assertEquals(total, actsubTot, 0.0002);

		// 18% Tip
		Thread.sleep(2000);
		String tAmount = pma.getMobileSanity_POM().getTipAmountElement().getAttribute("text");
		float actTip = Float.parseFloat(tAmount);

		// total element
		String allCalculation = pma.getMobileSanity_POM().getTotalCalculationElement().getAttribute("content-desc");
		char charAt = allCalculation.charAt(8);
		String s = "" + charAt;
		String replaceAll = allCalculation.replaceAll(s, "");
		String finalString = replaceAll.replaceAll(" ", "");

		int indexOfSub = finalString.indexOf("Subtotal$");
		String subTotal = finalString.substring((indexOfSub + 9), finalString.indexOf("Sales"));
		float subTot = Float.parseFloat(subTotal);

		float ExpTipCalcu = (subTot / 100) * 18;

		DecimalFormat df = new DecimalFormat("0.00");
		String format = df.format(ExpTipCalcu);
		float ExpTip = Float.parseFloat(format);

		Assert.assertTrue(actTip == ExpTip);

	}

	@Then("User Should Verify Sales Tax")
	public void userShouldVerifySalesTax() throws InterruptedException {
		Thread.sleep(2000);
		// total element
		String allCalculation = pma.getMobileSanity_POM().getTotalCalculationElement().getAttribute("content-desc");
		char charAt = allCalculation.charAt(8);
		String s = "" + charAt;
		String replaceAll = allCalculation.replaceAll(s, "");
		String finalString = replaceAll.replaceAll(" ", "");

		int indexOfSub = finalString.indexOf("Subtotal$");
		String subTotal = finalString.substring((indexOfSub + 9), finalString.indexOf("Sales"));
		float subTot = Float.parseFloat(subTotal);

		int indexOfSal = finalString.indexOf("SalesTax$");
		String salTax = finalString.substring((indexOfSal + 9), finalString.indexOf("ServiceFee$"));
		float actST = Float.parseFloat(salTax);

		float ExpSalesTax = (subTot / 100) * 66.66f;

		DecimalFormat df = new DecimalFormat("0.00");
		String format = df.format(ExpSalesTax);
		float expST = Float.parseFloat(format);

		System.out.println("Actual Sales Tax " + actST);
		System.out.println("expected Sales Tax " + expST);

		Assert.assertTrue(actST == expST);

	}

	@Then("User Should Verify Service Fee")
	public void userShouldVerifyServiceFee() throws InterruptedException {
		Thread.sleep(2000);
		// total element
		String allCalculation = pma.getMobileSanity_POM().getTotalCalculationElement().getAttribute("content-desc");
		char charAt = allCalculation.charAt(8);
		String s = "" + charAt;
		String replaceAll = allCalculation.replaceAll(s, "");
		String finalString = replaceAll.replaceAll(" ", "");

		int indexOfSub = finalString.indexOf("Subtotal$");
		String subTotal = finalString.substring((indexOfSub + 9), finalString.indexOf("Sales"));
		float subTot = Float.parseFloat(subTotal);

		int indexOfSerF = finalString.indexOf("ServiceFee$");
		String serFee = finalString.substring((indexOfSerF + 11), finalString.indexOf("ServiceFeeTax$"));
		float actSF = Float.parseFloat(serFee);

		System.out.println("Actual service fee " + actSF);

		float ExpSerFee = (subTot / 100) * 33.33f;

		DecimalFormat df = new DecimalFormat("0.00");
		String format = df.format(ExpSerFee);
		float expSF = Float.parseFloat(format);

		System.out.println("Expected service fee " + expSF);
		Assert.assertTrue(actSF == expSF);
	}

	@Then("User Should Verify Service Fee Tax")
	public void userShouldVerifyServiceFeeTax() throws InterruptedException {
		Thread.sleep(2000);
		// total element
		String allCalculation = pma.getMobileSanity_POM().getTotalCalculationElement().getAttribute("content-desc");
		char charAt = allCalculation.charAt(8);
		String s = "" + charAt;
		String replaceAll = allCalculation.replaceAll(s, "");
		String finalString = replaceAll.replaceAll(" ", "");
		System.out.println(finalString);

		/*
		 * int indexOfSub = finalString.indexOf("Subtotal$"); String subTotal =
		 * finalString.substring((indexOfSub+9), finalString.indexOf("Sales")); float
		 * subTot = Float.parseFloat(subTotal);
		 */

		int indexOfSerF = finalString.indexOf("ServiceFee$");
		String serFee = finalString.substring((indexOfSerF + 11), finalString.indexOf("ServiceFeeTax$"));
		float actSF = Float.parseFloat(serFee);

		int indexOfSerFT = finalString.indexOf("ServiceFeeTax$");
		String serFeeT = finalString.substring((indexOfSerFT + 14), finalString.indexOf("Gratuity$"));
		float actSFT = Float.parseFloat(serFeeT);

		float ExpSerFeeT = (actSF / 100) * 66.66f;

		DecimalFormat df = new DecimalFormat("0.00");
		String format = df.format(ExpSerFeeT);
		float expSFT = Float.parseFloat(format);

		System.out.println("Actual service fee tax " + actSFT);
		System.out.println("Expected service fee tax " + expSFT);

		Assert.assertTrue(actSFT == expSFT);

	}

	@Then("User Should Verify Gratuity")
	public void userShouldVerifyGratuity() throws InterruptedException {
		Thread.sleep(2000);
		// total element
		String allCalculation = pma.getMobileSanity_POM().getTotalCalculationElement().getAttribute("content-desc");
		char charAt = allCalculation.charAt(8);
		String s = "" + charAt;
		String replaceAll = allCalculation.replaceAll(s, "");
		String finalString = replaceAll.replaceAll(" ", "");

		int indexOfSub = finalString.indexOf("Subtotal$");
		String subTotal = finalString.substring((indexOfSub + 9), finalString.indexOf("Sales"));
		float subTot = Float.parseFloat(subTotal);

		int indexOfGrad = finalString.indexOf("Gratuity$");
		String grad = finalString.substring((indexOfGrad + 9), finalString.indexOf("GratuityTax$"));
		float actGrt = Float.parseFloat(grad);

		float ExpGrad = (subTot / 100) * 75.99f;

		DecimalFormat df = new DecimalFormat("0.00");
		String format = df.format(ExpGrad);
		float expGrt = Float.parseFloat(format);

		System.out.println("Actual grt " + actGrt);
		System.out.println("Expected grt " + expGrt);

		Assert.assertTrue(actGrt == expGrt);

	}

	@Then("User Should Verify Gratuity Tax")
	public void userShouldVerifyGratuityTax() throws InterruptedException {
		Thread.sleep(2000);
		// total element
		String allCalculation = pma.getMobileSanity_POM().getTotalCalculationElement().getAttribute("content-desc");
		char charAt = allCalculation.charAt(8);
		String s = "" + charAt;
		String replaceAll = allCalculation.replaceAll(s, "");
		String finalString = replaceAll.replaceAll(" ", "");

		/*
		 * int indexOfSub = finalString.indexOf("Subtotal$"); String subTotal =
		 * finalString.substring((indexOfSub+9), finalString.indexOf("Sales")); float
		 * subTot = Float.parseFloat(subTotal);
		 */

		int indexOfGrad = finalString.indexOf("Gratuity$");
		String grad = finalString.substring((indexOfGrad + 9), finalString.indexOf("GratuityTax$"));
		float actGrt = Float.parseFloat(grad);

		int indexOfGradT = finalString.indexOf("GratuityTax$");
		String gradTx = finalString.substring((indexOfGradT + 12), finalString.indexOf("Tip$Total$"));
		float actGrTx = Float.parseFloat(gradTx);

		float ExpGradTx = (actGrt / 100) * 51;

		DecimalFormat df = new DecimalFormat("0.00");
		String format = df.format(ExpGradTx);
		float expGrTx = Float.parseFloat(format);

		System.out.println("Actual grtTax " + actGrTx);
		System.out.println("Expected grtTax " + expGrTx);

		Assert.assertTrue(actGrTx == expGrTx);

	}

	@Then("User Should Verify Total")
	public void userShouldVerifyTotal() {
		String allCalculation = pma.getMobileSanity_POM().getTotalCalculationElement().getAttribute("content-desc");
		char charAt = allCalculation.charAt(8);
		String s = "" + charAt;
		String replaceAll = allCalculation.replaceAll(s, "");
		String finalString = replaceAll.replaceAll(" ", "");

		int indexOfSub = finalString.indexOf("Subtotal$");
		String subTotal = finalString.substring((indexOfSub + 9), finalString.indexOf("Sales"));
		globalSubTotal = Float.parseFloat(subTotal);// globalSubTotal

		int indexOfSal = finalString.indexOf("SalesTax$");
		String salTax = finalString.substring((indexOfSal + 9), finalString.indexOf("ServiceFee$"));
		globalSalesTax = Float.parseFloat(salTax);// globalSalesTax

		int indexOfGrad = finalString.indexOf("Gratuity$");
		String grad = finalString.substring((indexOfGrad + 9), finalString.indexOf("GratuityTax$"));
		globalGratuity = Float.parseFloat(grad);// globalGratuity

		int indexOfGradT = finalString.indexOf("GratuityTax$");
		String gradTx = finalString.substring((indexOfGradT + 12), finalString.indexOf("Tip$Total$"));
		globalGratuityTax = Float.parseFloat(gradTx);// globalGratuityTax

		int indexOfSerF = finalString.indexOf("ServiceFee$");
		String serFee = finalString.substring((indexOfSerF + 11), finalString.indexOf("ServiceFeeTax$"));
		globalServiceFee = Float.parseFloat(serFee);// globalServiceFee

		int indexOfSerFT = finalString.indexOf("ServiceFeeTax$");
		String serFeeT = finalString.substring((indexOfSerFT + 14), finalString.indexOf("Gratuity$"));
		globalServiceFeeTax = Float.parseFloat(serFeeT);// globalServiceFeeTax

		String tAmount = pma.getMobileSanity_POM().getTipAmountElement().getAttribute("text");
		globalTip = Float.parseFloat(tAmount);// globalTip

		float actualTotal = globalSubTotal + globalSalesTax + globalServiceFee + globalServiceFeeTax + globalGratuity
				+ globalGratuityTax + globalTip;

		DecimalFormat df = new DecimalFormat("0.00");
		String format = df.format(actualTotal);
		globalTotal = Float.parseFloat(format);

		int totalAmt = finalString.indexOf("Tip$Total$");
		String tot = finalString.substring((totalAmt + 10), finalString.length());
		float expTotal = Float.parseFloat(tot);
		System.out.println(globalTotal);
		System.out.println(expTotal);
		// Assert.assertTrue(actTotal==expTotal);
	}

	@Then("User Should Click Pay Now")
	public void userShouldClickPayNow() {
		pma.getMobileSanity_POM().getPayNowElement().click();

	}

	@Then("User Should verify Page Redirected to Payment Page")
	public void userShouldVerifyPageRedirectedToPaymentPage() throws InterruptedException {

		Thread.sleep(2000);
		pma.getMobileSanity_POM().getAddNewCardElement().click();
		pma.getMobileSanity_POM().getNameOnCardElement().click();
		pma.getMobileSanity_POM().getNameOnCardElement().sendKeys("Boo");
		pma.getMobileSanity_POM().getCardNumberElement().click();
		pma.getMobileSanity_POM().getCardNumberElement().sendKeys("5454545454545454");
		pma.getMobileSanity_POM().getValidTillElement().click();
		pma.getMobileSanity_POM().getValidTillElement().sendKeys("0227");
		pma.getMobileSanity_POM().getNewCardCvvElement().click();
		Thread.sleep(500);
		pma.getMobileSanity_POM().getNewCardCvvElement().click();
		Thread.sleep(500);

		Actions actions = new Actions(posDriver1);
		actions.moveToElement(pma.getMobileSanity_POM().getNewCardCvvElement()).click().sendKeys("457").build()
				.perform();
		Thread.sleep(400);

		pma.getMobileSanity_POM().getZipCodeElement().click();
		pma.getMobileSanity_POM().getZipCodeElement().sendKeys("90009");

		// Clicking back button to close the Keyboard
		posDriver1.navigate().back();
		pma.getMobileSanity_POM().getPayElement().click();

	}

	@Then("User Should Verify Payment Successful")
	public void userShouldVerifyPaymentSuccessful() throws InterruptedException {
		Thread.sleep(2000);
		//String paymentsucessful = pma.getMobileSanity_POM().getPaymentSuccessTextElement().getAttribute("content-desc");
		//Assert.assertEquals(paymentsucessful, "Payment Successful !!");

		//if (paymentsucessful.equals("Payment Successful !!")) {
			pma.getMobileSanity_POM().getPaySuccessViewmyOrderElement().click();
		//}

	}

	@Then("User should verify the order details")
	public void userShouldVerifyTheOrderDetails() throws InterruptedException {
		MA_OrderId = pma.getMobileSanity_POM().getOrderIDElement().getAttribute("content-desc");// Declaring Globally

		// Restaurant Name Validation
		String resName = pma.getMobileSanity_POM().getOrderSummaryResName().getAttribute("content-desc");
		System.out.println("Restaurant Name in Order Summary  " + "*******" + resName + "*******");

		// Date and Time Validation
		String OrderDT = pma.getMobileSanity_POM().getOrderSummaryDateTime().getAttribute("content-desc");
		System.out.println("Order Date and Time  " + OrderDT);

		// Splitting Time Alone
		String[] splited = OrderDT.split(", ");
		String timeStr = splited[1];
		System.out.println("Order Time    " + timeStr);

		String menu1 = pma.getMobileSanity_POM().getOrderSummaryMenu1().getAttribute("content-desc");
		// Spliting and taking the quantity and Menu name
		int indexOfX = menu1.indexOf("x");
		String menu1Q = menu1.substring(0, indexOfX).trim();
		int menu1Quantity = Integer.parseInt(menu1Q);
		String menu1Name = menu1.substring(indexOfX + 1).trim();

		String menu2 = pma.getMobileSanity_POM().getOrderSummaryMenu2().getAttribute("content-desc");
		// Spliting and taking the quantity and Menu name
		int indexOfX2 = menu2.indexOf("x");
		String menu2Q = menu2.substring(0, indexOfX2).trim();
		int menu2Quantity = Integer.parseInt(menu2Q);
		String menu2Name = menu2.substring(indexOfX2 + 1).trim();

		String menu3 = pma.getMobileSanity_POM().getOrderSummaryMenu3().getAttribute("content-desc");
		// Spliting and taking the quantity and Menu name
		int indexOfX3 = menu3.indexOf("x");
		String menu3Q = menu3.substring(0, indexOfX3).trim();
		int menu3Quantity = Integer.parseInt(menu3Q);
		String menu3Name = menu3.substring(indexOfX3 + 1).trim();

		String menu4 = pma.getMobileSanity_POM().getOrderSummaryMenu4().getAttribute("content-desc");
		// Spliting and taking the quantity and Menu name
		int indexOfX4 = menu4.indexOf("x");
		String menu4Q = menu4.substring(0, indexOfX4).trim();
		int menu4Quantity = Integer.parseInt(menu4Q);
		String menu4Name = menu4.substring(indexOfX4 + 1).trim();

		menuList.put(menu1Name, menu1Quantity);
		menuList.put(menu2Name, menu2Quantity);
		menuList.put(menu3Name, menu3Quantity);
		menuList.put(menu4Name, menu4Quantity);
		System.out.println(menuList);

		// Calculations

		String menuPrice1 = pma.getMobileSanity_POM().getOrderSummaryMenuPrice1().getAttribute("content-desc");
		String smenuPrice1 = menuPrice1.substring(1);
		float fmenuPrice1 = Float.parseFloat(smenuPrice1);

		String menuPrice2 = pma.getMobileSanity_POM().getOrderSummaryMenuPrice2().getAttribute("content-desc");
		String smenuPrice2 = menuPrice2.substring(1);
		float fmenuPrice2 = Float.parseFloat(smenuPrice2);

		String menuPrice3 = pma.getMobileSanity_POM().getOrderSummaryMenuPrice3().getAttribute("content-desc");
		String smenuPrice3 = menuPrice3.substring(1);
		float fmenuPrice3 = Float.parseFloat(smenuPrice3);

		String menuPrice4 = pma.getMobileSanity_POM().getOrderSummaryMenuPrice4().getAttribute("content-desc");
		String smenuPrice4 = menuPrice4.substring(1);
		float fmenuPrice4 = Float.parseFloat(smenuPrice4);

		float totalPrice = fmenuPrice1 + fmenuPrice2 + fmenuPrice3 + fmenuPrice4;
		float roundTotalPrice = roundFloatValue(totalPrice);

		Thread.sleep(2000);

		// Sub-total element
		pma.getMobileSanity_POM().getOrderSummaryTotal().click();
		String allCalculation1 = pma.getMobileSanity_POM().getOrderSummaryTotalExpand().getAttribute("content-desc");
		char charAt1 = allCalculation1.charAt(8);
		String s1 = "" + charAt1;
		String replaceAll1 = allCalculation1.replaceAll(s1, "");
		String finalString1 = replaceAll1.replaceAll(" ", "");

		int indexOfSub1 = finalString1.indexOf("Subtotal$");
		String subTotal1 = finalString1.substring((indexOfSub1 + 9), finalString1.indexOf("Sales"));
		float actsubTot = Float.parseFloat(subTotal1);

		Assert.assertEquals(roundTotalPrice, actsubTot, 0.000002);
		// Validating Sales Tax

		int indexOfSub = finalString1.indexOf("Subtotal$");
		String subTotal = finalString1.substring((indexOfSub + 9), finalString1.indexOf("Sales"));
		float subTot = Float.parseFloat(subTotal);

		int indexOfSal = finalString1.indexOf("SalesTax$");
		String salTax = finalString1.substring((indexOfSal + 9), finalString1.indexOf("ServiceFee$"));
		float actST = Float.parseFloat(salTax);

		float ExpSalesTax = (subTot / 100) * 66.66f;

		DecimalFormat df = new DecimalFormat("0.00");
		String format = df.format(ExpSalesTax);
		float expST = Float.parseFloat(format);

		System.out.println("Actual Sales Tax " + actST);
		System.out.println("expected Sales Tax " + expST);

		Assert.assertTrue(actST == expST);

		// Validating Servicefee

		int indexOfSerF = finalString1.indexOf("ServiceFee$");
		String serFee = finalString1.substring((indexOfSerF + 11), finalString1.indexOf("ServiceFeeTax$"));
		float actSF = Float.parseFloat(serFee);

		System.out.println("Actual service fee " + actSF);

		float ExpSerFee = (subTot / 100) * 33.33f;

		DecimalFormat dfsf = new DecimalFormat("0.00");
		String format1 = dfsf.format(ExpSerFee);
		float expSF = Float.parseFloat(format1);

		System.out.println("Expected service fee " + expSF);
		Assert.assertTrue(actSF == expSF);

		// Service Fee Tax

		int indexOfSerFT = finalString1.indexOf("ServiceFeeTax$");
		String serFeeT = finalString1.substring((indexOfSerFT + 14), finalString1.indexOf("Gratuity$"));
		float actSFT = Float.parseFloat(serFeeT);

		float ExpSerFeeT = (actSF / 100) * 66.66f;

		DecimalFormat dfSet = new DecimalFormat("0.00");
		String formatSet = dfSet.format(ExpSerFeeT);
		float expSFT = Float.parseFloat(formatSet);

		System.out.println("Actual service fee tax " + actSFT);
		System.out.println("Expected service fee tax " + expSFT);

		Assert.assertTrue(actSFT == expSFT);

		// Validating Gratuity

		int indexOfGrad = finalString1.indexOf("Gratuity$");
		String grad = finalString1.substring((indexOfGrad + 9), finalString1.indexOf("GratuityTax$"));
		float actGrt = Float.parseFloat(grad);

		float ExpGrad = (subTot / 100) * 75.99f;

		DecimalFormat dfG = new DecimalFormat("0.00");
		String formatG = dfG.format(ExpGrad);
		float expGrt = Float.parseFloat(formatG);

		System.out.println("Actual grt " + actGrt);
		System.out.println("Expected grt " + expGrt);

		Assert.assertTrue(actGrt == expGrt);

		// Validating GratuityTax
		String[] lines = allCalculation1.split("\n");
		String gratuityTax = "";
		for (int i = 0; i < lines.length; i++) {
			if (lines[i].equals("Gratuity Tax")) {
				gratuityTax = lines[i + 1].substring(1);
				break;
			}
		}

		System.out.println(gratuityTax); // output: 5.41
		// From MA took as String and converted into float
		float actGrTx = Float.parseFloat(gratuityTax);

		// Expected
		float ExpGradTx = (actGrt / 100) * 51;
		DecimalFormat dfGt = new DecimalFormat("0.00");
		String formatGt = dfGt.format(ExpGradTx);
		float expGrTx = Float.parseFloat(formatGt);

		// Comparing
		Assert.assertTrue(actGrTx == expGrTx);

		// Total
		String[] t = allCalculation1.split("\n");
		String STotal = "";
		for (int i = 0; i < t.length; i++) {
			if (t[i].equals("Total")) {
				STotal = t[i + 2].substring(1);
				break;
			}
		}

		System.out.println("Checking the Total " + STotal);
		float OrderSummaryTotal = Float.parseFloat(STotal);
		Assert.assertEquals(OrderSummaryTotal, globalTotal, 0.00002);

		// Payment Status Validation
		String[] payStatus = allCalculation1.split("\n");
		String paid = "";
		for (String line : payStatus) {
			if (line.startsWith("Paid")) {
				paid = line;
				break;
			}
		}
		System.out.println("Payment Status " + paid); // output: Paid

	}

	@Then("User should get the URL of the Table")
	public void userShouldGetTheURLOfTheTable() throws InterruptedException {
		Thread.sleep(1000);

		pma.getMobileSanity_POM().getProfileIconElement().click();
		pma.getMobileSanity_POM().getSkip().click();

		String test = "https://plateron.page.link/?link=https%3a%2f%2fconsumer-mobile-app-ordering.web.app?refId%3Dfa73fdd3-7682-414f-9759-6c69fcebcf90%26utm_campaign%3DDineInTableQR&apn=com.plateron.consumer.qa&isi=1585134889&ibi=com.plateron.consumer.qa";
		posDriver1.get(test);
	}

	@Then("User Should Verify the Page Redirection to Confirm Order page")
	public void userShouldVerifyThePageRedirectionToConfirmOrderPage() {
		boolean displayed = pma.getMobileSanity_POM().getResNameConfirmOrderBtn().isDisplayed();
		Assert.assertTrue(displayed);
		String pageConfirmation = "";
		try {
			pageConfirmation = pma.getMobileSanity_POM().getEnterDetailsHdr().getAttribute("content-desc");
		} catch (Exception e) {

		}

		if (pageConfirmation.equals("Enter details to place order")) {

			// First Name
			pma.getMobileSanity_POM().getFirstNameEDpage().click();
			pma.getMobileSanity_POM().getFirstNameEDpage().sendKeys("DineIn");

			// Last Name
			pma.getMobileSanity_POM().getLastNameEDpage().click();
			pma.getMobileSanity_POM().getLastNameEDpage().sendKeys("Flow");

			// Mobile Number
			Random rand = new Random(); // Creating Random Number
			long randomNum = rand.nextInt(900000000) + 1000000000;// Created
			String PhNo = Long.toString(randomNum); // Converting Long to String
			pma.getMobileSanity_POM().getMobileNumEDpage().click();
			pma.getMobileSanity_POM().getMobileNumEDpage().sendKeys(PhNo);
			posDriver1.navigate().back();
			// ContinueButton
			pma.getMobileSanity_POM().getContinueBtn().click();

			// Otp

			pma.getMobileSanity_POM().getOtpDineInFlow().click();
			pma.getMobileSanity_POM().getOtpDineInFlow().sendKeys("666666");
			// Clicking Verify Btn
			// pma.getMobileSanity_POM().get().click();

		} else {

		}
		// Menu1 Price
		String menu1 = pma.getMobileSanity_POM().getMenuPrice1ConfirmOrderPg().getAttribute("content-desc");
		String smenu1 = menu1.substring(1);
		float fmenu1 = Float.parseFloat(smenu1);
		// Menu2 Price
		String menu2 = pma.getMobileSanity_POM().getMenuPrice2ConfirmOrderPg().getAttribute("content-desc");
		String smenu2 = menu2.substring(1);
		float fmenu2 = Float.parseFloat(smenu2);
		// Menu3 Price
		String menu3 = pma.getMobileSanity_POM().getMenuPrice3ConfirmOrderPg().getAttribute("content-desc");
		String smenu3 = menu3.substring(1);
		float fmenu3 = Float.parseFloat(smenu3);
		// Menu4 Price
		String menu4 = pma.getMobileSanity_POM().getMenuPrice4ConfirmOrderPg().getAttribute("content-desc");
		String smenu4 = menu4.substring(1);
		float fmenu4 = Float.parseFloat(smenu4);
		// Total Price
		float total = fmenu1 + fmenu2 + fmenu3 + fmenu4;

		System.out.println("Total Menu Price In Confirm Order Page   " + total);

	}

	@When("User Should Click Confirm Order button")
	public void userShouldClickConfirmOrderButton() {
		pma.getMobileSanity_POM().getConfirmOrderBtn().click();
	}

	@Then("User should Validate the PayBill page")
	public void userShouldValidateThePayBillPage() throws InterruptedException {
		String payBillhdr = pma.getMobileSanity_POM().getPayBillDFHdr().getAttribute("content-desc");
		//System.out.println(payBillhdr);

		// Menu Prices
		String menuPrice1DF = pma.getMobileSanity_POM().getMenuPrice1PayBillDF().getAttribute("content-desc");
		String sMenuPrice1DF = menuPrice1DF.substring(1);
		float fMenuPrice1DF = Float.parseFloat(sMenuPrice1DF);

		String menuPrice2DF = pma.getMobileSanity_POM().getMenuPrice2PayBillDF().getAttribute("content-desc");
		String sMenuPrice2DF = menuPrice2DF.substring(1);
		float fMenuPrice2DF = Float.parseFloat(sMenuPrice2DF);

		String menuPrice3DF = pma.getMobileSanity_POM().getMenuPrice3PayBillDF().getAttribute("content-desc");
		String sMenuPrice3DF = menuPrice3DF.substring(1);
		float fMenuPrice3DF = Float.parseFloat(sMenuPrice3DF);

		String menuPrice4DF = pma.getMobileSanity_POM().getMenuPrice4PayBillDF().getAttribute("content-desc");
		String sMenuPrice4DF = menuPrice4DF.substring(1);
		float fMenuPrice4DF = Float.parseFloat(sMenuPrice4DF);

		float total = fMenuPrice1DF + fMenuPrice2DF + fMenuPrice3DF + fMenuPrice4DF;
		System.out.println("Total Menu Price in Paybill Page   " + total);

		// Clicking UpArrow
		pma.getMobileSanity_POM().getTotalUpArrowPayBillDF().click();
		String allCalculation = pma.getMobileSanity_POM().getAllCalculationPayBillDF().getAttribute("content-desc");
		String[] allCalculationSplit = allCalculation.split("\n");
		
		// Subtotal
		String Subtotal = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Subtotal")) {
				Subtotal = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println(Subtotal); // output:

		// SalesTax
		String SalesTax = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Sales Tax")) {
				SalesTax = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println(SalesTax); // output:

		// ServiceFee
		String ServiceFee = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Service Fee")) {
				ServiceFee = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println(ServiceFee); // output:

		// ServiceFeeTax
		String ServiceFeeTax = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Service Fee Tax")) {
				ServiceFeeTax = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println(ServiceFeeTax); // output:

		// Gratuity
		String Gratuity = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Gratuity")) {
				Gratuity = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println(Gratuity); // output:

		// Gratuity Tax
		String GratuityTax = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Gratuity Tax")) {
				GratuityTax = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println(GratuityTax); // output:

		// Tip
		Thread.sleep(2000);
		String tipAmount = pma.getMobileSanity_POM().getTipValueDF().getAttribute("text");
		float actTip = Float.parseFloat(tipAmount);
		System.out.println("Actual tip in the Tip box " + actTip);

		// Total
		String Total = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Total")) {
				Total = allCalculationSplit[i + 1 ].substring(1);
				break;
			}
		}
		System.out.println(Total); // output:
		pma.getMobileSanity_POM().getPayBtnPayBillpgDF().click();
	}

	@Then("User should verify the order details for DineIn Flow")
	public void userShouldVerifyTheOrderDetailsForDineInFlow() throws InterruptedException {
		
		// Restaurant Name Validation
		String resName = pma.getMobileSanity_POM().getOrderSummaryResName().getAttribute("content-desc");
		System.out.println("Restaurant Name in Order Summary  " + "*******" + resName + "*******");

		
		//Storing the Details
		String menu1 = pma.getMobileSanity_POM().getMenu1OrderSummaryDF().getAttribute("content-desc");
		// Spliting and taking the quantity and Menu name
		int indexOfX = menu1.indexOf("x");
		String menu1Q = menu1.substring(0, indexOfX).trim();
		int menu1Quantity = Integer.parseInt(menu1Q);
		String menu1Name = menu1.substring(indexOfX + 1).trim();

		String menu2 = pma.getMobileSanity_POM().getMenu2OrderSummaryDF().getAttribute("content-desc");
		// Spliting and taking the quantity and Menu name
		int indexOfX2 = menu2.indexOf("x");
		String menu2Q = menu2.substring(0, indexOfX2).trim();
		int menu2Quantity = Integer.parseInt(menu2Q);
		String menu2Name = menu2.substring(indexOfX2 + 1).trim();

		String menu3 = pma.getMobileSanity_POM().getMenu3OrderSummaryDF().getAttribute("content-desc");
		// Spliting and taking the quantity and Menu name
		int indexOfX3 = menu3.indexOf("x");
		String menu3Q = menu3.substring(0, indexOfX3).trim();
		int menu3Quantity = Integer.parseInt(menu3Q);
		String menu3Name = menu3.substring(indexOfX3 + 1).trim();

		String menu4 = pma.getMobileSanity_POM().getMenu4OrderSummaryDF().getAttribute("content-desc");
		// Spliting and taking the quantity and Menu name
		int indexOfX4 = menu4.indexOf("x");
		String menu4Q = menu4.substring(0, indexOfX4).trim();
		int menu4Quantity = Integer.parseInt(menu4Q);
		String menu4Name = menu4.substring(indexOfX4 + 1).trim();

		menuList = new LinkedHashMap<>();
		
		menuList.put(menu1Name, menu1Quantity);
		menuList.put(menu2Name, menu2Quantity);
		menuList.put(menu3Name, menu3Quantity);
		menuList.put(menu4Name, menu4Quantity);
		System.out.println(menuList);

		
		String menuPrice1 = pma.getMobileSanity_POM().getMenu1PriceOrderSummaryDF().getAttribute("content-desc");
		String smenuPrice1 = menuPrice1.substring(1);
		float fmenuPrice1 = Float.parseFloat(smenuPrice1);

		String menuPrice2 = pma.getMobileSanity_POM().getMenu2PriceOrderSummaryDF().getAttribute("content-desc");
		String smenuPrice2 = menuPrice2.substring(1);
		float fmenuPrice2 = Float.parseFloat(smenuPrice2);

		String menuPrice3 = pma.getMobileSanity_POM().getMenu3PriceOrderSummaryDF().getAttribute("content-desc");
		String smenuPrice3 = menuPrice3.substring(1);
		float fmenuPrice3 = Float.parseFloat(smenuPrice3);

		String menuPrice4 = pma.getMobileSanity_POM().getMenu4PriceOrderSummaryDF().getAttribute("content-desc");
		String smenuPrice4 = menuPrice4.substring(1);
		float fmenuPrice4 = Float.parseFloat(smenuPrice4);

		float totalPrice = fmenuPrice1 + fmenuPrice2 + fmenuPrice3 + fmenuPrice4;
		float roundTotalPrice = roundFloatValue(totalPrice);
		System.out.println("Total Amount  "+roundTotalPrice);
		Thread.sleep(2000);
	  
		//Clicking Up Arrow
		pma.getMobileSanity_POM().getTotalOrderSummaryDF().click();
		//Subtotal
		
		String allCalculation = pma.getMobileSanity_POM().getTotalOrderSummaryExpandDF().getAttribute("content-desc");
		String[] allCalculationSplit = allCalculation.split("\n");
		// Subtotal

		String Subtotal = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Subtotal")) {
				Subtotal = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println("Order summary subtotal "+Subtotal); // output:

		// SalesTax

		String SalesTax = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Sales Tax")) {
				SalesTax = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println("Order summary salesTax "+SalesTax); // output:

		// ServiceFee
		String ServiceFee = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Service Fee")) {
				ServiceFee = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println("Order summary ServiceFee "+ServiceFee); // output:

		// ServiceFeeTax
		String ServiceFeeTax = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Service Fee Tax")) {
				ServiceFeeTax = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println("Order summary ServiceFeeTax "+ServiceFeeTax); // output:

		// Gratuity
		String Gratuity = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Gratuity")) {
				Gratuity = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println("Order summary Gratuity "+Gratuity); // output:

		// Gratuity Tax
		String GratuityTax = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Gratuity Tax")) {
				GratuityTax = allCalculationSplit[i + 1].substring(1);
				break;
			}
		}
		System.out.println("Order summary GratuityTax "+GratuityTax); // output:
		
		// Total
		String Total = "";
		for (int i = 0; i < allCalculationSplit.length; i++) {
			if (allCalculationSplit[i].equals("Total")) {
				Total = allCalculationSplit[i + 2].substring(1);
				break;
			}
		}
		System.out.println("Total Amount in Order summary "+Total); // output:
		
	}
	
				
				
				
	}


