package com.stepdefinition;

import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	Map<String,Float> menuPrice = new LinkedHashMap<String,Float>();
	Map<String,Float> entityPercentage = new LinkedHashMap<String,Float>();
	Map<String, Float> roundedCalculationSummary = new LinkedHashMap<String,Float>();
	List<String> excludedItems=new ArrayList<String>();
	String noOfGuest = "",orderId="",randomName="",randomNumber="",orderType = "",orderTime="",tipPercentage="",discountName="";
	public int guestCountAOP;
	float salesTax = 0, gratuity = 0, serviceFee = 0, serviceFeeTax = 0, gratuityTax = 0, discountAmt = 0,totalBillAmountADis=0,tipAmount = 0;
	DecimalFormat dF = new DecimalFormat("#.##");

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
		orderType="Dine-In";
		Thread.sleep(1000);
	}
	@Then("User should Add the Pre-Defined Set of Menus")
	public void userShouldAddThePreDefinedSetOfMenus() throws InterruptedException {
		Thread.sleep(500);
		pma.getPOS_FlowOne_POM().getMenu1().click();
		String menu1Txt = pma.getPOS_FlowOne_POM().getMenu1().getAttribute("content-desc");
		String m1textRep = menu1Txt.replaceAll("[\\r\\n]+", "");
		String[] m1Split = m1textRep.split("\\$");
		Float menu1 = Float.valueOf(dF.format(Float.parseFloat(m1Split[m1Split.length - 1])));
		System.out.println(m1Split[0]);
		menuPrice.put(m1Split[0],menu1);Thread.sleep(500);
		
		
		
		pma.getPOS_FlowOne_POM().getMenu2().click();
		String menu2Txt = pma.getPOS_FlowOne_POM().getMenu2().getAttribute("content-desc");
		String m2textRep = menu2Txt.replaceAll("[\\r\\n]+", "");
		String[] m2Split = m2textRep.split("\\$");
		Float menu2 = Float.valueOf(dF.format(Float.parseFloat(m2Split[m2Split.length - 1])));
		System.out.println(m2Split[0]);
		menuPrice.put(m2Split[0],menu2);Thread.sleep(500);
		
		pma.getPOS_FlowOne_POM().getMenu3().click();
		String menu3Txt = pma.getPOS_FlowOne_POM().getMenu3().getAttribute("content-desc");
		String m3textRep = menu3Txt.replaceAll("[\\r\\n]+", "");
		String[] m3Split = m3textRep.split("\\$");
		Float menu3 = Float.valueOf(dF.format(Float.parseFloat(m3Split[m3Split.length - 1])));
		System.out.println(m3Split[0]);
		menuPrice.put(m3Split[0],menu3);Thread.sleep(500);
		
		
		pma.getPOS_FlowOne_POM().getMenu4().click();
		String menu4Txt = pma.getPOS_FlowOne_POM().getMenu4().getAttribute("content-desc");
		String m4textRep = menu4Txt.replaceAll("[\\r\\n]+", "");
		String[] m4Split = m4textRep.split("\\$");
		Float menu4 = Float.valueOf(dF.format(Float.parseFloat(m4Split[m4Split.length - 1])));
		System.out.println(m4Split[0]);
		menuPrice.put(m4Split[0],menu4);Thread.sleep(500);
		
		System.out.println(menuPrice);
	}
	@Then("User Should Add the Menu with Optional Modifier")
	public void userShouldAddTheMenuWithOptionalModifier() throws InterruptedException {
		pma.getPOS_FlowOne_POM().get3rdCate().click();
		Thread.sleep(500);
		String menu5Txt = pma.getPOS_FlowOne_POM().get3rdMenu().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().get3rdMenu().click();
		String m5textRep = menu5Txt.replaceAll("[\\r\\n]+", "");
		String[] m5Split = m5textRep.split("\\$");
		Float menu5 = Float.valueOf(dF.format(Float.parseFloat(m5Split[m5Split.length - 1])));
		//menuPrice.add(menu4);
		
		Thread.sleep(500);
		String mod1Txt = pma.getPOS_FlowOne_POM().getNewMMItem1().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().getNewMMItem1().click();
		String[] mod1Split = mod1Txt.split("\\$");
		Float mod1 = Float.valueOf(dF.format(Float.parseFloat(mod1Split[mod1Split.length - 1])));
//		
		String mod2Txt = pma.getPOS_FlowOne_POM().getNewMMItem2().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().getNewMMItem2().click();
		String[] mod2Split = mod2Txt.split("\\$");
		Float mod2 = Float.valueOf(dF.format(Float.parseFloat(mod2Split[mod2Split.length - 1])));
//		
		String mod3Txt = pma.getPOS_FlowOne_POM().getNewMMItem3().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().getNewMMItem3().click();
		String[] mod3Split = mod3Txt.split("\\$");
		Float mod3 = Float.valueOf(dF.format(Float.parseFloat(mod3Split[mod3Split.length - 1])));
//		
		String mod4Txt = pma.getPOS_FlowOne_POM().getNewMMItem4().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().getNewMMItem4().click();
		String[] mod4Split = mod4Txt.split("\\$");
		Float mod4 = Float.valueOf(dF.format(Float.parseFloat(mod4Split[mod4Split.length - 1])));
//		
		String mod5Txt = pma.getPOS_FlowOne_POM().getNewMMItem5().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().getNewMMItem5().click();
		String[] mod5Split = mod5Txt.split("\\$");
		Float mod5 = Float.valueOf(dF.format(Float.parseFloat(mod5Split[mod5Split.length - 1])));
		
		String mod6Txt = pma.getPOS_FlowOne_POM().getNewMMItem6().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().getNewMMItem6().click();
		String[] mod6Split = mod6Txt.split("\\$");
		Float mod6 = Float.valueOf(dF.format(Float.parseFloat(mod6Split[mod6Split.length - 1])));
		
		float menu5Wm = menu5+mod1+mod2+mod3+mod4+mod5+mod6;
		System.out.println(m5Split[0]);
		menuPrice.put(m5Split[0],menu5Wm);Thread.sleep(500);
		System.out.println(menuPrice);
		//Need to Add Value
		pma.getPOS_FlowOne_POM().getApplyBtn().click();
		
		
		
	}
	@When("User Should click Receive Payment button")
	public void userShouldClickReceivePaymentButton() {
		pma.getPOS_FlowOne_POM().getPrepaidReceivePmtBtn().click();
	}
	@Then("User Should Verify the page redirected to Payment Detail Page")
	public void userShouldVerifyThePageRedirectedToPaymentDetailPage() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pma.getPOS_FlowOne_POM().getPaymentDetailsHeader().isDisplayed());
		String header = pma.getPOS_FlowOne_POM().getPaymentDetailsHeader().getAttribute("content-desc");
		Assert.assertEquals("Payment details", header);
		Thread.sleep(500);
	}
	@Then("User Should verify the Receive Payment page Calculation")
	public void userShouldVerifyTheReceivePaymentPageCalculation() throws IOException, InterruptedException {

//		for (int i = 0; i < menuPrice.size(); i++) {
//			subTotal=subTotal+menuPrice.get(i);
//		}
		Set<Entry<java.lang.String, Float>> menuSet = menuPrice.entrySet();
		for (Entry<String, Float> eachMenu : menuSet) {
			subTotal = subTotal+eachMenu.getValue();
		}
		//Get Percentages from Excel and parse value
		float percentageSaltx = Float.parseFloat(getDataFromExcel("Bill Configuration", 1, 1));
		float percentageSerFee = Float.parseFloat(getDataFromExcel("Bill Configuration", 4, 1));
		String SerFeeTXCheckBx = getDataFromExcel("Bill Configuration", 5, 1);
		float percentageSerFeeTx = Float.parseFloat(getDataFromExcel("Bill Configuration", 6, 1));
		String gratuityState = getDataFromExcel("Bill Configuration", 8, 1); // ON/OFF
		String gratuityBasedOn = getDataFromExcel("Bill Configuration", 9, 1); // Order Amount/GuestCount/Nil
		String takeAwayCBx = getDataFromExcel("Bill Configuration", 14, 1); // ON/OFF
		String dineInCBx = getDataFromExcel("Bill Configuration", 15, 1); // ON/OFF
		String gratuityPercent = getDataFromExcel("Bill Configuration", 10, 1);
		String gratuityTaxPercent = getDataFromExcel("Bill Configuration", 13, 1);
		String subTotalReaches = getDataFromExcel("Bill Configuration", 12, 1);
		String GuestCntReaches = getDataFromExcel("Bill Configuration", 11, 1);
		
		Thread.sleep(500);
		entityPercentage.put("salesTaxPercentage", percentageSaltx);
		entityPercentage.put("serviceFeePercentage", percentageSerFee);
		entityPercentage.put("serviceFeeTaxPercentage", percentageSerFeeTx);
		entityPercentage.put("gratuityPercentage", Float.parseFloat(gratuityPercent));
		entityPercentage.put("gratuityTaxPercentage", Float.parseFloat(gratuityTaxPercent));
		Thread.sleep(500);
		Map<java.lang.String, Float> grandCalculationSummary = grandCalculationSummary(menuPrice, entityPercentage);Thread.sleep(500);
		System.out.println(grandCalculationSummary);Thread.sleep(500);
		roundedCalculationSummary = roundCalculationSummary(grandCalculationSummary);Thread.sleep(500);
		System.out.println(roundedCalculationSummary);Thread.sleep(500);
		
		
		Thread.sleep(500);
		String subTotPD = pma.getPOS_FlowOne_POM().getSubtotalPayDetails().getAttribute("content-desc");
		String SubTreplace = subTotPD.replaceAll("[\\r\\n]+", "");
		System.out.println(subTotal);
		Assert.assertEquals(SubTreplace, "Subtotal$" + subTotal);
		
		
		// Sales tax validations
		if (!(percentageSaltx == 0)) {
			String salesTxPD = pma.getPOS_FlowOne_POM().getSalesTaxPayDetails().getAttribute("content-desc");
			String salTxreplace = salesTxPD.replaceAll("[\\r\\n]+", "");
			Assert.assertEquals(salTxreplace, "Sales Tax$" + roundStringValue(roundedCalculationSummary.get("salesTax")));
			System.out.println("ExecutedST");
		}

		// Service Fee Validations
		if (!(percentageSerFee == 0)) {
			String serFeePD = pma.getPOS_FlowOne_POM().getServiceFeePayDetails().getAttribute("content-desc");
			String serFeereplace = serFeePD.replaceAll("[\\r\\n]+", "");
			Assert.assertEquals(serFeereplace, "Service Fee$" + roundStringValue(roundedCalculationSummary.get("serviceFee")));
			System.out.println("ExecutedSF");
		}
		// Service Fee tax Validations
		if (SerFeeTXCheckBx.equals("ON")) {
			String serFeeTxPD = pma.getPOS_FlowOne_POM().getServiceFeeTaxPayDetails().getAttribute("content-desc");
			String serFeeTaxreplace = serFeeTxPD.replaceAll("[\\r\\n]+", "");
			Assert.assertEquals(serFeeTaxreplace, "Service Fee Tax$" + roundStringValue(roundedCalculationSummary.get("serviceFeeTax")));
			System.out.println("ExecutedSFT");
		}
		// Gratuity

		if (gratuityState.equals("ON") || gratuityState.equals("OFF")) {
			if (gratuityBasedOn.equals("Order Amount")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (subTotal >= Float.parseFloat(subTotalReaches)) {
						if (takeAwayCBx.equals("ON") || dineInCBx.equals("ON")) {// need to get current order type +
																					// button takeAway & dineIn status
							String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetails()
									.getAttribute("content-desc");
							String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
							Assert.assertEquals(gratuityreplace, "Gratuity$" + roundStringValue(roundedCalculationSummary.get("gratuity")));
							System.out.println("ExecutedGty");
						}
					}
				}
			} else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (guestCountAOP >= Float.parseFloat(GuestCntReaches)) {
						String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetails()
								.getAttribute("content-desc");
						String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
						Assert.assertEquals(gratuityreplace, "Gratuity$" + roundStringValue(roundedCalculationSummary.get("gratuity")));
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
							String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetails()
									.getAttribute("content-desc");
							String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
							Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$" + roundStringValue(roundedCalculationSummary.get("gratuityTax")));
							System.out.println("ExecutedGtyTx");
						}
					}
				}
			} else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (guestCountAOP >= Float.parseFloat(GuestCntReaches)) {
						String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetails()
								.getAttribute("content-desc");
						String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
						Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$" + roundStringValue(roundedCalculationSummary.get("gratuityTax")));
						System.out.println("ExecutedGtyTx");
					}
				}
			}
		}
		
		Set<Entry<java.lang.String, Float>> roundedSummarySet = roundedCalculationSummary.entrySet();
		for (Entry<String, Float> eachEntity : roundedSummarySet) {
			totalBillAmount = totalBillAmount+eachEntity.getValue();
		}
		
		totalBillAmount=totalBillAmount+subTotal;
		
		String billAmount = pma.getPOS_FlowOne_POM().getBillAmountPayDetails().getAttribute("content-desc");
		Assert.assertEquals(billAmount, "$" + roundStringValue(totalBillAmount));
	}
	@Then("User Should Select the Payment Method as Cash")
	public void userShouldSelectThePaymentMethodAsCash() throws InterruptedException {
		Thread.sleep(500);
		pma.getPOS_FlowOne_POM().getCashRadioBtnPayDetails().click();
	}
	
	@Then("User Should Add the Tip Percentage as {string}")
	public void userShouldAddTheTipPercentageAs(String tipPer) throws InterruptedException {
		Thread.sleep(500);
		pma.getPOS_FlowOne_POM().getCollectCashBtnPayDetails().click();
		//Tip Value 
		tipPercentage=tipPer;
		if (tipPer.equals("22%")) {
			String tipBoxText = pma.getPOS_FlowOne_POM().get22PercentTip().getAttribute("content-desc");
			String[] split = tipBoxText.split("\\(");
			String replaceAll = split[1].replaceAll("\\)", "").replaceAll("\\$", "");
			tipAmount = Float.parseFloat(replaceAll);
			
			pma.getPOS_FlowOne_POM().get22PercentTip().click();
		}else if (tipPer.equals("20%")) {
			String tipBoxText = pma.getPOS_FlowOne_POM().get20PercentTip().getAttribute("content-desc");
			String[] split = tipBoxText.split("\\(");
			String replaceAll = split[1].replaceAll("\\)", "").replaceAll("\\$", "");
			tipAmount = Float.parseFloat(replaceAll);
			
			pma.getPOS_FlowOne_POM().get20PercentTip().click();
		}else if (tipPer.equals("18%")) {
			String tipBoxText = pma.getPOS_FlowOne_POM().get18PercentTip().getAttribute("content-desc");
			String[] split = tipBoxText.split("\\(");
			String replaceAll = split[1].replaceAll("\\)", "").replaceAll("\\$", "");
			tipAmount = Float.parseFloat(replaceAll);
			
			pma.getPOS_FlowOne_POM().get18PercentTip().click();
		}else if (tipPer.equals("No Tip")) {
			tipAmount=0;
			pma.getPOS_FlowOne_POM().getTipPopupNoTip().click();
		}else {
			tipAmount=Float.parseFloat(tipPer);
			pma.getPOS_FlowOne_POM().getCustomTipAmtTextBx().click();
			pma.getPOS_FlowOne_POM().getCustomTipAmtTextBx().sendKeys(tipPer);
		}
		Thread.sleep(3500);
	}
	@Then("User Should verify the Receive Payment page Calculation after Tip")//++++++++++++++++++++++++++++  Tip  +++++++++++++++
	public void userShouldVerifyTheReceivePaymentPageCalculationAfterTip() throws IOException, InterruptedException {
		//After Tip Calculation
		Thread.sleep(1500);

		String subTotPD = pma.getPOS_FlowOne_POM().getSubtotalPayDetails().getAttribute("content-desc");
		String SubTreplace = subTotPD.replaceAll("[\\r\\n]+", "");
		Assert.assertEquals(SubTreplace, "Subtotal$" + subTotal);
		
		// Sales tax validations
		float percentageSaltx = Float.parseFloat(getDataFromExcel("Bill Configuration", 1, 1));
		if (!(percentageSaltx == 0)) {
			String salesTxPD = pma.getPOS_FlowOne_POM().getSalesTaxPayDetails().getAttribute("content-desc");
			String salTxreplace = salesTxPD.replaceAll("[\\r\\n]+", "");
			Assert.assertEquals(salTxreplace, "Sales Tax$" + roundStringValue(roundedCalculationSummary.get("salesTax")));
			System.out.println("ExecutedST");
		}
		// Service Fee Validations
		float percentageSerFee = Float.parseFloat(getDataFromExcel("Bill Configuration", 4, 1));
		if (!(percentageSerFee == 0)) {
			String serFeePD = pma.getPOS_FlowOne_POM().getServiceFeePayDetails().getAttribute("content-desc");
			String serFeereplace = serFeePD.replaceAll("[\\r\\n]+", "");
			Assert.assertEquals(serFeereplace, "Service Fee$" + roundStringValue(roundedCalculationSummary.get("serviceFee")));
			System.out.println("ExecutedSF");
		}
		// Service Fee tax Validations
		String SerFeeTXCheckBx = getDataFromExcel("Bill Configuration", 5, 1);
		if (SerFeeTXCheckBx.equals("ON")) {
			String serFeeTxPD = pma.getPOS_FlowOne_POM().getServiceFeeTaxPayDetails().getAttribute("content-desc");
			String serFeeTaxreplace = serFeeTxPD.replaceAll("[\\r\\n]+", "");
			Assert.assertEquals(serFeeTaxreplace, "Service Fee Tax$" + roundStringValue(roundedCalculationSummary.get("serviceFeeTax")));
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
							String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetails()
									.getAttribute("content-desc");
							String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
							Assert.assertEquals(gratuityreplace, "Gratuity$" + roundStringValue(roundedCalculationSummary.get("gratuity")));
							System.out.println("ExecutedGty");
						}
					}
				}
			} else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (guestCountAOP >= Float.parseFloat(GuestCntReaches)) {
						//Menu Wise Service Fee tax
						String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetails()
								.getAttribute("content-desc");
						String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
						Assert.assertEquals(gratuityreplace, "Gratuity$" + roundStringValue(roundedCalculationSummary.get("gratuity")));
						System.out.println("ExecutedGty");
					}
				}
			}
		}

		// gratuity Tax
		if (gratuityState.equals("ON") || gratuityState.equals("OFF")) {
			if (gratuityBasedOn.equals("Order Amount")) {
				if (Float.parseFloat(gratuityTaxPercent) > 0) {
					if (subTotal >= Float.parseFloat(subTotalReaches)) {
						if (takeAwayCBx.equals("ON") || dineInCBx.equals("ON")) {
//need to get CURRENT ORDER TYPE + button takeAway & dineIn status - ####-Pass Global OrderType String-####
							String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetails()
									.getAttribute("content-desc");
							String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
							Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$" + roundStringValue(roundedCalculationSummary.get("gratuityTax")));
							System.out.println("ExecutedGtyTx");
						}
					}
				}
			} else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityTaxPercent) > 0) {
					if (guestCountAOP >= Float.parseFloat(GuestCntReaches)) {
						String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetails()
								.getAttribute("content-desc");
						String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
						Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$" + roundStringValue(roundedCalculationSummary.get("gratuityTax")));
						System.out.println("ExecutedGtyTx");
					}
				}
			}
		}
		
		//Tip
		if (!(tipAmount==0)) {
			String tipAmttext = pma.getPOS_FlowOne_POM().getTipPayDetails().getAttribute("content-desc");
			String[] split = tipAmttext.split("\\$");
			System.out.println(split[1]);
			Assert.assertEquals(split[1],roundStringValue(tipAmount));
		}
		totalBillAmount=totalBillAmount+tipAmount;
		
		String billAmount = pma.getPOS_FlowOne_POM().getBillAmountPayDetails().getAttribute("content-desc");
		Assert.assertEquals(billAmount, "$" + roundStringValue(totalBillAmount));
		
	}
	@Then("User should apply Discount")
	public void userShouldApplyDiscount() throws InterruptedException {
		Thread.sleep(900);
		pma.getPOS_FlowOne_POM().getDiscountDropDown().click();
		discountName = pma.getPOS_FlowOne_POM().getFirstEligibleDiscountTemplate().getAttribute("content-desc");
		System.out.println("Applied Discount Template Name : "+discountName);
		pma.getPOS_FlowOne_POM().getFirstEligibleDiscountTemplate().click();
		Thread.sleep(900);
	}
	@Then("User Should verify the Receive Payment page Calculation after Applying Discount")
	public void userShouldVerifyTheReceivePaymentPageCalculationAfterApplyingDiscount() throws IOException {
		Map<String,Float> roundCalculationSummary1 = new LinkedHashMap<>();
		
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
		
		//Need to Add Logic for Exclude Items and store in Excel
		
		
		

		if (subTotal >= discountMinimumOrderAmt) {
			Map<String,Float> CalculationSummary = grandCalculationSummaryAfterDiscount(menuPrice,entityPercentage,excludedItems,discountPercentage);
			
			roundCalculationSummary1 = roundCalculationSummary(CalculationSummary);
			
		} else {
			System.out.println("Discount not Calculated");
		}
		float updatedSubTotal=subTotal-roundCalculationSummary1.get("discount");
		
		// SubTotal - Here we show original SubTotal only
		String subTotTxt = pma.getPOS_FlowOne_POM().getSubtotalPayDetailsAfterDis().getAttribute("content-desc");
		String subRepTxt = subTotTxt.replaceAll("[\\r\\n]+", "");
		Assert.assertEquals(subRepTxt, "Subtotal$" + subTotal);
		
		// Discount
		String discTxt = pma.getPOS_FlowOne_POM().getDiscountAmtPayDetails().getAttribute("content-desc");
		String discRepTxt = discTxt.replaceAll("[\\r\\n]+", "");
		Assert.assertEquals(discRepTxt, "Discount-$" + roundCalculationSummary1.get("discount"));
		
		// SalesTax - Wont Change so that Calculated from subTotal
		String salTxText = pma.getPOS_FlowOne_POM().getSalesTaxPayDetailsAfterDis().getAttribute("content-desc");
		String salTxRepTxt = salTxText.replaceAll("[\\r\\n]+", "");
		Assert.assertEquals(salTxRepTxt, "Sales Tax$" + roundCalculationSummary1.get("salesTax"));
		
		// Service Fee
		String SerFeeFromExcel = getDataFromExcel("Bill Configuration", 4, 1);
		float percentageSerFee = Float.parseFloat(SerFeeFromExcel);
		if (!(percentageSerFee == 0)) {
			// format for Assert
			String serFeeTxt = pma.getPOS_FlowOne_POM().getServiceFeePayDetailsAfterDis().getAttribute("content-desc");
			String serFeeRepTxt = serFeeTxt.replaceAll("[\\r\\n]+", "");
			Assert.assertEquals(serFeeRepTxt, "Service Fee$" + roundCalculationSummary1.get("serviceFee"));
			System.out.println("ExecutedSF");
		}
		// Service Fee Tax
		String SerFeeTXCheckBx = getDataFromExcel("Bill Configuration", 5, 1);
		if (SerFeeTXCheckBx.equals("ON")) {
			String serFeeTxPD = pma.getPOS_FlowOne_POM().getServiceFeeTaxPayDetailsAfterDis()
					.getAttribute("content-desc");
			String serFeeTaxreplace = serFeeTxPD.replaceAll("[\\r\\n]+", "");
			Assert.assertEquals(serFeeTaxreplace, "Service Fee Tax$" + roundCalculationSummary1.get("serviceFeeTax"));
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
							String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetailsAfterDis()
									.getAttribute("content-desc");
							String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
							Assert.assertEquals(gratuityreplace, "Gratuity$" + roundCalculationSummary1.get("gratuity"));
							System.out.println("ExecutedGty");
						}
					}
				}
			} else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityPercent) > 0) {
					if (guestCountAOP >= Float.parseFloat(GuestCntReaches)) {
						String gratuityPD = pma.getPOS_FlowOne_POM().getGratuityPayDetailsAfterDis()
								.getAttribute("content-desc");
						String gratuityreplace = gratuityPD.replaceAll("[\\r\\n]+", "");
						Assert.assertEquals(gratuityreplace, "Gratuity$" + roundCalculationSummary1.get("gratuity"));
						System.out.println("ExecutedGty");
					}
				}
			}
		}
		// Gratuity Tax
		if (gratuityState.equals("ON") || gratuityState.equals("OFF")) {
			if (gratuityBasedOn.equals("Order Amount")) {
				if (Float.parseFloat(gratuityTaxPercent) > 0) {
					if (updatedSubTotal >= Float.parseFloat(subTotalReaches)) {
						if (takeAwayCBx.equals("ON") || dineInCBx.equals("ON")) {
//need to get CURRENT ORDER TYPE + button takeAway & dineIn status - ####-Pass Global OrderType String-####
							String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetailsAfterDis()
									.getAttribute("content-desc");
							String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
							Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$" + roundCalculationSummary1.get("gratuityTax"));
							System.out.println("ExecutedGtyTx");
						}
					}
				}
			} else if (gratuityBasedOn.equals("Guest Count")) {
				if (Float.parseFloat(gratuityTaxPercent) > 0) {
					if (guestCountAOP >= Float.parseFloat(GuestCntReaches)) {
						String gratuityTaxPD = pma.getPOS_FlowOne_POM().getGratuityTaxPayDetailsAfterDis()
								.getAttribute("content-desc");
						String gratuityTaxreplace = gratuityTaxPD.replaceAll("[\\r\\n]+", "");
						Assert.assertEquals(gratuityTaxreplace, "Gratuity Tax$" + roundCalculationSummary1.get("gratuityTax"));
						System.out.println("ExecutedGtyTx");
					}
				}
			}
		}
		//Tip
		if (tipPercentage.contains("%")) {
			if (tipPercentage.contains("22")) {
				if (!(tipAmount==0)) {
					String tipAmttext = pma.getPOS_FlowOne_POM().getTipPayDetailsAfter().getAttribute("content-desc");
					String[] split = tipAmttext.split("\\$");
//					System.out.println(split[1]);
					tipAmount=updatedSubTotal*22/100;
					
					//validation
					Assert.assertEquals(split[1],roundStringValue(tipAmount));
				}
			} else if (tipPercentage.contains("20")) {
				if (!(tipAmount==0)) {
					String tipAmttext = pma.getPOS_FlowOne_POM().getTipPayDetailsAfter().getAttribute("content-desc");
					String[] split = tipAmttext.split("\\$");
//					System.out.println(split[1]);
					tipAmount=updatedSubTotal*20/100;
					Assert.assertEquals(split[1],roundStringValue(tipAmount));
				}
			}else if (tipPercentage.contains("18")) {
				if (!(tipAmount==0)) {
					String tipAmttext = pma.getPOS_FlowOne_POM().getTipPayDetailsAfter().getAttribute("content-desc");
					String[] split = tipAmttext.split("\\$");
//					System.out.println(split[1]);
					tipAmount=updatedSubTotal*18/100;
					Assert.assertEquals(split[1],roundStringValue(tipAmount));
				}
			}			
		}else if (tipPercentage.contains("No Tip")) {
			System.out.println("Tip Field Not Available");
		}else if (Float.parseFloat(tipPercentage)>0) {
			String tipAmttext = pma.getPOS_FlowOne_POM().getTipPayDetailsAfter().getAttribute("content-desc");
			String[] split = tipAmttext.split("\\$");
//			System.out.println(split[1]);
			tipAmount=Float.parseFloat(tipPercentage);
			Assert.assertEquals(split[1],roundStringValue(tipAmount));
		}
		totalBillAmount=0;
		Set<Entry<java.lang.String, Float>> roundedSummarySet = new HashSet<>();
		roundedSummarySet=roundCalculationSummary1.entrySet();
		for (Entry<String, Float> eachEntity : roundedSummarySet) {
			totalBillAmount = totalBillAmount+eachEntity.getValue();
		}
		System.out.println(roundCalculationSummary1);
		
		totalBillAmount=totalBillAmount+subTotal-(2*roundCalculationSummary1.get("discount"))+tipAmount;	
		
		// Bill Amount Validation
		String billAmount = pma.getPOS_FlowOne_POM().getBillAmountPayDetailsAfterDisTip().getAttribute("content-desc");
		Assert.assertEquals(billAmount, "$" + roundFloatValue(totalBillAmount));
	}
	@Then("User should verify the Customer Information Field")
	public void userShouldVerifyTheCustomerInformationField() throws InterruptedException {
		Thread.sleep(500);
		//Special Char
	pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().click();
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(specialChar);
		String nameTxt = pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().getAttribute("content-desc");
		Assert.assertEquals(null, nameTxt);Thread.sleep(500);
		//Upper Case
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().click();
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(upperCase);
		String nameTxt1 = pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().getAttribute("text");
		Assert.assertEquals(upperCase+", Name", nameTxt1);Thread.sleep(500);
		//Lower Case
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().click();
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(lowerCase);
		String nameTxt2 = pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().getAttribute("text");
		Assert.assertEquals(lowerCase+", Name", nameTxt2);Thread.sleep(500);
		//Numbers
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().click();
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(numbers);
		String nameTxt3 = pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().getAttribute("text");
		Assert.assertEquals(numbers+", Name", nameTxt3);Thread.sleep(500);
		//Text
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().click();
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(text);
		String nameTxt4 = pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().getAttribute("text");
		Assert.assertEquals("abcdefghijABCDEFGHIJ1234567890Autom"+", Name", nameTxt4);Thread.sleep(1000);
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getPOS_FlowOne_POM().getCustomerNameTxtBxPaymentDetails().sendKeys(randomNameGenerator());
		//MobileNum Tab
		//Text
		pma.getPOS_FlowOne_POM().getMobileNumTxtBxPaymentDetails().click();
		pma.getPOS_FlowOne_POM().getMobileNumTxtBxPaymentDetails().sendKeys(text);
		String numTxt = pma.getPOS_FlowOne_POM().getMobileNumTxtBxPaymentDetails().getAttribute("text");
		
		Assert.assertTrue(numTxt.contains("(123) 456 - 7890"));Thread.sleep(500);
		
		pma.getPOS_FlowOne_POM().getMobileNumTxtBxPaymentDetails().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getPOS_FlowOne_POM().getMobileNumTxtBxPaymentDetails().sendKeys(randomMobileNumberGeneration());
		
		pma.getPOS_FlowOne_POM().getCashRadioBtnPayDetails().click();
		Thread.sleep(500);
	}
	
	@Then("User Should swipe the Send to Kitchen")
	public void userShouldSwipeTheSendToKitchen() throws InterruptedException {
		Thread.sleep(300);
		String text = pma.getPOS_FlowOne_POM().getSTK1().getAttribute("content-desc");
		System.out.println(text);
		Thread.sleep(1000);
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
			pma.getPOS_FlowOne_POM().getFirstOrderinAO().click();
			 System.out.println(pma.getPOS_FlowOne_POM().getFirstOrderinAO().getAttribute("content-desc"));
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
		   System.out.println(orderId);
			String tableName = pma.getPOS_FlowOne_POM().getTableNameRightside().getAttribute("content-desc");
//		   System.out.println(tableName);
			Assert.assertTrue(firstOrderAO.contains("Paid - Cash"));
			Assert.assertTrue(firstOrderAO.contains(employeeName));
			Assert.assertTrue(firstOrderAO.contains("Guest: " + substring));
			Assert.assertTrue(firstOrderAO.contains(orderId));
			Assert.assertTrue(firstOrderAO.contains("Waiter"));
			Assert.assertTrue(firstOrderAO.contains(tableName));
			//Assert.assertTrue(firstOrderAO.contains(orderTime)); - Hiding Because of 1 minute mismatch issue
		}
		else if (orderType.equals("Take-Out")) {
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

			Assert.assertTrue(firstOrderAO.contains("Paid - Cash"));
			Assert.assertTrue(firstOrderAO.contains(employeeName));
			Assert.assertTrue(firstOrderAO.contains(orderId));
			Assert.assertTrue(firstOrderAO.contains("Waiter"));
			Assert.assertTrue(firstOrderAO.contains(randomName));
	//Need Time 
//			Assert.assertTrue(firstOrderAO.contains(orderTime));
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
//	        DecimalFormat dF = new DecimalFormat("#.##");
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
	        Assert.assertTrue(orStatus.equals("Declined"));
			
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


	        
//	        DecimalFormat dF = new DecimalFormat("#.##");
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
	@When("Calculation validation")
	public void calculationValidation() {
	Map<String, Float> menuItems = new LinkedHashMap<>();
	Map<String, Float> percentages = new LinkedHashMap<>();
	List<String> exclude = new LinkedList<>();
	percentages.put("salesTaxPercentage", 66.66f);
	percentages.put("serviceFeePercentage", 33.33f);
	percentages.put("serviceFeeTaxPercentage", 66.66f);
	percentages.put("gratuityPercentage", 75.99f);
	percentages.put("gratuityTaxPercentage", 51f);
	percentages.put("discount", 32.25f);
	
	menuItems.put("Menu Item1", 1.99f);
	menuItems.put("Menu Item2", 2.99f);
	menuItems.put("Menu Item3", 3.99f);
	menuItems.put("Menu Item4", 4.99f);
	System.out.println(menuPrice);
	
	exclude.add("Menu Item1");
	
	Map<java.lang.String, Float> calculationSummaryAfterAddMenus = grandCalculationSummary(menuItems, percentages);
	
	 Map<java.lang.String, Float> calculationSummaryAfterAddMenusAfterDiscount = grandCalculationSummaryAfterDiscount(menuItems, percentages,exclude,21);

	 System.out.println(calculationSummaryAfterAddMenus);
	 System.out.println();System.out.println();System.out.println();System.out.println();
	 System.out.println(calculationSummaryAfterAddMenusAfterDiscount);
	
	
	
//	Set<Entry<java.lang.String, Float>> entrySet = menuItems.entrySet();
//	for (Entry<String, Float> menuAll : entrySet) {
//			Float menuEach = menuAll.getValue();
//			java.lang.String key = menuAll.getKey();
//		Float salesTaxpercentage= percentages.get("sales tax");
//			System.out.println(salesTaxpercentage);		//			System.out.println(menuEach);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
	
}
