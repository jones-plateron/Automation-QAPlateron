package com.feature.page.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class POS_FlowOne_POM extends BaseClass {
	PageManager pma = new PageManager();

	public POS_FlowOne_POM() {
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	public WebElement getEnterPin() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Enter Your PIN']"));
		return element;
	}

	public WebElement getClockInElement() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Clock In']"));
	}

	public WebElement getPinOneElement() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='1']"));
	}

	public WebElement getPinTwoElement() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='2']"));
	}

	public WebElement getPinThreeElement() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='3']"));
	}

	public WebElement getPinFourElement() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='4']"));
	}

	public WebElement getPinFiveElement() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='5']"));
	}

	public WebElement getPinsixElement() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='6']"));
	}

	public WebElement getPinSevenElement() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='7']"));
	}

	public WebElement getPinEightElement() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='8']"));
	}

	public WebElement getPinNineElement() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='9']"));
	}

	public WebElement getPinZeroElement() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='0']"));
	}

	public WebElement getSelectTableHeader() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Select Table']"));
		return element;
	}

	public WebElement getAreaList() {
		WebElement element = posDriver1.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.HorizontalScrollView"));
		return element;
	}
	public WebElement getNoOfGuest8() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='8']"));
		return element;
	}
	public WebElement getNoOfGuest5() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='5']"));
		return element;
	}
	public WebElement getNoOfGuest13() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='13']"));
		return element;
	}
	public WebElement getNoOfGuest18() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='18']"));
		return element;
	}
	public WebElement getNoOfGuest22() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='22']"));
		return element;
	}
	public WebElement getNoOfGuest27() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='27']"));
		return element;
	}
	public WebElement getNoOfGuest31() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='31']"));
		return element;
	}

	public WebElement getProceedButton() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Proceed']"));
		return element;
	}

	public WebElement getMenu1() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
		return element;
	}

	public WebElement getMenu2() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[2]"));
		return element;
	}

	public WebElement getMenu3() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='2'])[2]"));
		return element;
	}

	public WebElement getMenu4() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='3'])[2]"));
		return element;
	}

	public WebElement getActiveOrdersTab() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='15']"));
		return element;
	}
	public WebElement getActiveOrdersTab1() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Active Orders']"));
		return element;
	}
	

	public WebElement getActiveOrdersPageHeader() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Active Orders']"));
		return element;
	}
	public WebElement getDineInTab() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Dine-In']"));
		return element;
	}
	public WebElement getCompletedOrderTab() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Completed Orders']"));
		return element;
	}
	
	
	//android.widget.ImageView[@content-desc="Completed Orders"]
	public WebElement getFirstOrderinAO() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
		return element;
	}

	public WebElement getRecievePaymentBtn() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Receive Payment']"));
	}

	public WebElement getEmployeeName() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[1]"));
		return element;
	}

	public WebElement getGuestCountRightCorner() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='9']"));
		return element;
	}

	public WebElement getOrderIdRightCorner() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='12']"));
		return element;
	}
	public WebElement getOrderIdRightCornerTakeOut() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='14']"));		
	}
	public WebElement getFirstMenuRightSide() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[13]"));
		return element;
	}

	public WebElement getSecondMenuRightSide() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
		return element;
	}

	public WebElement getThirdMenuRightSide() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[1]"));
		return element;
	}

	public WebElement getFourthMenuRightSide() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
		return element;
	}

	public WebElement getTableNameRightside() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='7']"));
		return element;
	}

	public WebElement getReceivePaymentBtn() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Receive Payment']"));
		return element;
	}

	public WebElement getPaymentDetailsHeader() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[5]"));
		return element;
	}

	public WebElement getSubtotalPayDetails() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[7]"));
	}

	public WebElement getSalesTaxPayDetails() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='1']"));
		return element;
	}

	public WebElement getServiceFeePayDetails() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='2']"));
		return element;
	}

	public WebElement getServiceFeeTaxPayDetails() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
		return element;
	}

	public WebElement getGratuityPayDetails() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='4']"));
		return element;
	}

	public WebElement getGratuityTaxPayDetails() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='5']"));
		return element;
	}
	public WebElement getTipPayDetails() {
		return  posDriver1.findElement(By.xpath("(//android.view.View[@index='6'])[2]"));
	}
	public WebElement getBillAmountPayDetails() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='8']"));
		return element;
	}

	public WebElement getCollectCashBtnPayDetails() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Collect Cash']"));
		return element;
	}

	public WebElement getTipPopupBillAmt() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
		return element;
	}

	public WebElement getTipPopupNoTip() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='No Tip']"));
		return element;
	}

	public WebElement getSTK1() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Send to Kitchen']"));
		return element;
	}
	public WebElement getSTKwithoutMenu() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='11']"));
		return element;
	}

	public WebElement getCompleteOrderHeadr() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Completed Orders']"));
		return element;
	}

	public WebElement getCompleteOrderSwipe() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Complete Order']"));
		return element;
	}

	public WebElement getFirstOrderinCO() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[2]"));
		return element;
	}

	public WebElement getGuestCountRightCornerCO() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='9']"));
		return element;
	}

	public WebElement getOrderIdRightCorneCO() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='11']"));
		return element;
	}

	public WebElement getFirstMenuRightSideCO() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
		return element;
	}

	public WebElement getSecondMenuRightSideCO() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
		return element;
	}

	public WebElement getThirdMenuRightSideCO() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[1]"));
		return element;
	}

	public WebElement getFourthMenuRightSideCO() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
	}

	public WebElement getDiscountDropDown() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='5']"));
	}

	public WebElement getFirstEligibleDiscountTemplate() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='0']"));
	}

	// After Applying
	// Discount+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public WebElement getSubtotalPayDetailsAfterDis() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[7]"));
		return element;
	}

	public WebElement getDiscountAmtPayDetails() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='1']"));
		return element;
	}

	public WebElement getSalesTaxPayDetailsAfterDis() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='2']"));
		return element;
	}

	public WebElement getServiceFeePayDetailsAfterDis() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
		return element;
	}

	public WebElement getServiceFeeTaxPayDetailsAfterDis() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='4']"));
		return element;
	}

	public WebElement getGratuityPayDetailsAfterDis() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='5'])[2]"));
		return element;
	}

	public WebElement getGratuityTaxPayDetailsAfterDis() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='6'])[1]"));
		return element;
	}
	public WebElement getTipPayDetailsAfter() {
		return  posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[1]"));
	}
	public WebElement getBillAmountPayDetailsAfterDisNoTip() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[1]"));
		return element;
	}
	public WebElement getBillAmountPayDetailsAfterDisTip() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[2]"));
		return element;
	}

	public WebElement getBillAmountPayDetailsAfterDis() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='7']"));
		return element;
	}

	public WebElement getSubTotalTxtCOSummary() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[14]"));
	}

	public WebElement getTableNameRightsideCO() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='7']"));
		return element;
	}

	public WebElement getCompleteOrderSection() {
		WebElement element = posDriver1
				.findElement(By.xpath("//android.widget.ImageView[@content-desc='Completed Orders']"));
		return element;
	}

	public WebElement getSubTotalValueCOSummary() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[3]"));
	}

	public WebElement getDiscountValueCOSummary() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[3]"));
	}
	public WebElement getDiscountValueCOSummaryRefund() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
	}

	public WebElement getSalesTaxCOSummary() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='5'])[1]"));
	}

	public WebElement getServiceFeeCOSummary() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[2]"));
	}
	public WebElement getServiceFeeCOSummaryTakeOut() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[1]"));
	}

	public WebElement getServiceFeeTaxCOSummary() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='9'])[2]"));
	}

	public WebElement getGratuityCOSummary() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='11'])[2]"));
	}

	public WebElement getGratuityTaxCOSummary() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='13'])[2]"));
	}

	public WebElement getTotAmountCOSummary() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='15']"));
	}
	
	public WebElement getTotAmountCOSummaryRefund() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='14'])[1]"));
	}
	public WebElement getRefundedAmountCOSummary() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='16'])[1]"));
	}
	public WebElement getRefundedAmountCOSummary1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='17'])[1]"));
	}
	public WebElement getTotAmountCOSummaryTakeOut() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='17']"));
	}

	public WebElement getSearchBarCO() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='4']"));
	}
//+++++++++++++++++++++++++++++++Area and Table++++++++++++++++++++++++++++++++++++++++++
	public WebElement getArea1() {
		WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[6]"));
		return element;
	}
	public WebElement getArea2() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='1']"));
	}

	public WebElement getArea3() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='2']"));
	}

	public WebElement getArea4() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
	}

	public WebElement getArea5() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='4']"));
	}
	
	
	public WebElement gettabledetails() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
	}
	
	
	//Note if the area is added then the index for table will be 6:1
	
	public WebElement getArea1Table1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
	}

	public WebElement getTakeOutSection() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Take-out']"));
	}
	public WebElement getTakeOutPopupHeader() {
//		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[7]"));
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Take-out']"));
	}
	public WebElement getPopupCustomerNameHeader() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='1']"));
	}
	public WebElement getPopupMobileNumHeader() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='3']"));
	}
	public WebElement getPopupCustomerNameTextBx() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='2']"));
	}
	public WebElement getPopupMobileNumTextBx() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='4']"));
	}
	public WebElement getTable1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
	}
	public WebElement getTable2() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
	}
	public WebElement getTable3() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[2]"));
	}
	public WebElement getTable4() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[3]"));
	}
	public WebElement getTable5() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='4'])[3]"));
	}
	public WebElement getTable6() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='5']"));
	}
	public WebElement getTable7() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='6']"));
	}
	public WebElement getTable8() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='7']"));
	}
	public WebElement getTable9() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='8']"));
	}
	public WebElement getTable10() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='9']"));
	}
	
	public WebElement getOccupiedTableWaiterName() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[7]"));
	}
	public WebElement getReleasingthisTable() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Releasing this table will lose the current order']"));
	}
	//RHS===>>>>>>>>>
	public WebElement getCancelBtn() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Cancel']"));
		return element;
	}
	public WebElement getCancelBtn2() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Cancel']"));
		return element;
	}
	public WebElement getYesCancelBtn() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Yes, Cancel']"));
		return element;
	}
	public WebElement getKeepTheOrderBtn() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Keep the Order']"));
		return element;
	}
	public WebElement getCancelPopupInstruction() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Would you like to cancel the order']"));
		return element;
	}
	

	public WebElement getTableNameInMenuPage() {
	WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='6']"));
	return element;
	}
	public WebElement getGuestCountInMenuPage() {
		WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='8']"));
		return element;
	}
	public WebElement getReleaseTableProceedBtn() {
		WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Proceed']"));
		return element;
	}
	public WebElement getGuestPopupHeadr() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[5]"));
	}
	public WebElement getCompleteOrderStatus() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='13']"));
	}
	public WebElement getCompleteOrderStatus1() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Delivered']"));
	}
	public WebElement getCompleteOrderStatusTakeOut() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='15']"));
	}
	public WebElement get18PercentTip() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
	}
	public WebElement get20PercentTip() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='2']"));
	}
	public WebElement get22PercentTip() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='3']"));
	}
	public WebElement getCustomTipAmtTextBx() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index=0]"));
	}
	public WebElement getCustomerNameTxtBxPaymentDetails() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='1']"));
	}
	public WebElement getMobileNumTxtBxPaymentDetails() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='2']"));
	}
	public WebElement getCardRadioBtnPayDetails() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Card']"));
	}
	public WebElement getCashRadioBtnPayDetails() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Cash']"));
	}
	public WebElement getOrderStatusDropdownAO() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Cooking']"));
	}
	public WebElement getgetOrderStatusDropdownDeclineAO() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Declined']"));
	}
	public WebElement getCloverFlexDeviceC143UT22560410() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='C143UT22560410']"));
	}
	public WebElement getCloverFlexDevice22225PP25445065() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='22225PP25445065']"));
	}
	public WebElement getPaymentMethodHdrTxt() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Payment Method']"));
	}
	public WebElement get13() {
		return posDriver1.findElement(By.xpath(""));
	}
	public WebElement get14() {
		return posDriver1.findElement(By.xpath(""));
	}
	public WebElement get15() {
		return posDriver1.findElement(By.xpath(""));
	}
	public WebElement get16() {
		return posDriver1.findElement(By.xpath(""));
	}
	
	
	//+++++++++++Menu Page++++++++++
	public WebElement getMenuPageHeader() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Menu']"));
	}
	public WebElement getSearchBarinMenuPg() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
	}
	public WebElement getSearchedit() {
		return posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
	}
	public WebElement getSearh1stMenu() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[2]"));
	}
	public WebElement getMenuNotFound() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Menu Item(s) does not exist.']"));
	}
	public WebElement get1stCate() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[7]"));
	}
	public WebElement get2ndCate() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[1]"));
	}
	public WebElement get3rdCate() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[1]"));
	}
	public WebElement get4thCate() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='3']"));
	}
	public WebElement get5thCate() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='7']"));
	}
	public WebElement get1stMenu() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
	}
	public WebElement get2ndMenu() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[2]"));
	}
	public WebElement get3rdMenu() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='2'])[2]"));
	}
	public WebElement get4thMenu() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='3'])[2]"));
	}
	public WebElement get5thMenu() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='4']"));
	}
	public WebElement get5thMenuWith4inEachRow() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[2]"));
	}
	public WebElement get6thMenu() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
	}
	public WebElement get7thMenu() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[3]"));
	}
	public WebElement get8thMenu() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='2'])[3]"));
	}
	public WebElement get9thMenu() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='3'])[3]"));
	}
	public WebElement get10thMenu() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='4'])[3]"));
	}
	public WebElement get11thMenu() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='7']"));
	}
	public WebElement getMenuItemName(String text) {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='"+text+"']"));
	}
	
	//Modifier locators for Prepaid Orders(Recieve Button)
	public WebElement getModifierHeaderMenuName() {
	return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
   }
	
	public WebElement getModifierCateName() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[9]"));
	}
	public WebElement getSelectUpt() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
	}
	public WebElement getRequired() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[3]"));
	}
	public WebElement getModiXIcon() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[3]"));
	}
	public WebElement getApplyBtn() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Apply']"));
	}
	public WebElement getAddNotes() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Add Note']"));
	}
	public WebElement getAddNotesTxtBx() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='4']"));
	}
	
	public WebElement getCancel2() {
		return posDriver1.findElement(By.xpath("(//android.widget.Button[@content-desc='Cancel'])[1]"));
	}
	//Modifier locators for Postpaid Orders(Sent to Kitchen Button)
	public WebElement getModifierHeaderMenuNameSTK() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[3]"));
	   }
	public WebElement getModifierCateNameSTK() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[10]"));
	}
	public WebElement getSelectUptSTK() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[3]"));
	}
	public WebElement getRequiredSTK() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[4]"));
	}
	public WebElement getModiXIconSTK() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[4]"));
	}
	public WebElement getApplyBtnSTK() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Apply']"));
	}
	public WebElement getAddNotesSTK() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Add Note']"));
	}
	public WebElement getAddNotesTxtBxSTK() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='4']"));
	}
	
	public WebElement getCancel2STK() {
		return posDriver1.findElement(By.xpath("(//android.widget.Button[@content-desc='Cancel'])[1]"));
	}
	
	//New Modifier Locators
	public WebElement getNewMMItem1() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='2']"));
	}
	public WebElement getNewMMItem2() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='3']"));
	}
	public WebElement getNewMMItem3() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='4']"));
	}
	public WebElement getNewMMItem4() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='5']"));
	}
	public WebElement getNewMMItem5() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='8']"));
	}
	public WebElement getNewMMItem6() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='9']"));
	}
	public WebElement getNewMMItem7() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='10']"));
	}
	public WebElement getPrepaidReceivePmtBtn() {
		return posDriver1.findElement(By.xpath("(//android.widget.Button[@index='12'])[1]"));
	}
	
	//Menu List RHS
	public WebElement getRHSMenu() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
	}
	public WebElement getRHSMenuValidation() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
	}
	public WebElement getRHSMenu1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[19]"));
	}
	//RHS Modifier Menu
	public WebElement getRHSModi1() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[3]"));
	}
	public WebElement getRHSModi1beforeapply() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[5]"));
	}
	public WebElement getMinusSymbol() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[4]"));
	}
	public WebElement getPlusSymbol() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='2'])[4]"));
	}
	public WebElement getRecieveButtonWithoutMenu() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='11']"));
	}
	public WebElement getRecieveButton() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='12']"));
	}
	
	//Settings Page>>>>>>>>>>>>>>>>>>>>>>>>>>
	public WebElement getSettingsPage() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Settings']"));
	}
	public WebElement getMapPrinters() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='1']"));
	}
	public WebElement getSearchingPrinterLoader() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Searching printers']"));
	}
	public WebElement getSearhPrintersBtn() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Search printers']"));
	}
	public WebElement getBillingStationPrinterSection() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@content-desc='Billing station printer'])[1]"));
	}
	public WebElement getBillingStationPrinterOptions() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@content-desc='Billing station printer'])[2]"));
	}
	public WebElement getSelectPrintersDropDown() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@index='3']"));
	}

	public WebElement getSelectPrintersDropDownAttr() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
	}
	public WebElement getAvailablePrinter1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[7]"));
	}
	public WebElement getAvailablePrinter1Attri() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='1']"));////////////
	}
	
	public WebElement getCSPrintersSection() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Cooking station printer']"));
	}
	public WebElement getSaveBtn() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Save']"));
	}
	public WebElement getCS1() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='7']"));
	}
	public WebElement getCS1MapPrinter() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='8']"));
	}
	public WebElement getCS2() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='10']"));
	}
	public WebElement getCS2MapPrinter() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='11']"));
	}
	public WebElement getCS3() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='13']"));
	}
	public WebElement getCS3MapPrinter() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='14']"));
	}
	public WebElement getCS4() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='16']"));
	}
	public WebElement getCS5() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='19']"));
	}
	public WebElement getMappedsuccessfully() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Settings updated Printers mapped sucessfully']"));
	}
	//+++++++++++++++++++++++++++++Screen Time Out+++++++++++++++++++++++++++++++++++++++++
	public WebElement getScreenTimeOutSection() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='4']"));
	}
	public WebElement getScreenTimeOutOption() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Screen Time-Out']"));
	}
	public WebElement getScreenTimeOutToggle() {
		return posDriver1.findElement(By.xpath("//android.widget.Switch[@index='1']"));
	}
	public WebElement getScreenTimeOutIns1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[2]"));
	}
	public WebElement getScreenTimeOutIns2() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Configure lock screen time-out for your POS devices']"));
	}
	public WebElement getEnterTimesIn() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[3]"));
	}
	
	public WebElement getEnterTimesInMin() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Enter time in minutes']"));
	}
	public WebElement getEnterTimesInHr() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Enter time in hours']"));
	}
	public WebElement getScreenTimeTxtBox() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='4']"));
	}
	public WebElement getTimeformatStatus() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
	}
	public WebElement getScreenTimeMinutesDD() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Minutes']"));
	}
	public WebElement getScreenTimeMinutesDDBtn() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Minutes']"));
	}
	public WebElement getScreenTimeHoursDD() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Hours']"));
	}
	public WebElement getScreenTimeHoursDDBtn() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Hours']"));
	}
//++++++++++++++++++++++++++++++++++Cash Drawer++++++++++++++++++++++++++++++++++++++++++++
	public WebElement getCashDrawer() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
	}
	public WebElement getCashDrawerSection() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
	}
	public WebElement getConnectthisPOS() {
		return posDriver1.findElement(By.xpath(""));
	}
	public WebElement getConnectthisPOSIns() {
		return posDriver1.findElement(By.xpath(""));
	}
	public WebElement getConnectthisCheckBx() {
		return posDriver1.findElement(By.xpath(""));
	}
	
	//+++++++++++++++++++++++++++++++++++++Preparation Time+++++++++++++++++++++++++++++++++++++++++
	public WebElement getPreparationTimeSection() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[7]"));
	}
	public WebElement getEstimatedOrderPreparationTime() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[9]"));
	}
	public WebElement get1stCS() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
	}
	public WebElement get2ndCS() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
	}
	public WebElement get3rdCS() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[13]"));
	}
	public WebElement getMonday() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Monday']"));
	}
	public WebElement getTuesday() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Tuesday']"));
	}
	public WebElement getWednesday() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Wednesday']"));
	}
	public WebElement getThursday() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Thursday']"));
	}
	public WebElement getFriday() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Friday']"));
	}
	public WebElement getSaturday() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Saturday']"));
	}
	public WebElement getSunday() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc=\"Monday\"]"));
	}
	
	
	public WebElement getFirstMenuRHSAOPage() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
	}
	public WebElement getSecondMenuRHSAOPage() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
	}
	public WebElement getThirdMenuRHSAOPage() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[1]"));
	}
	public WebElement getFourthMenuRHSAOPage() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
	}
	public WebElement getFifthMenuRHSAOPage() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='4'])[1]"));
	}
	//More Active Orders
	public WebElement getFirstMenuRHSAOPage1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[13]"));
	}
	public WebElement getSecondMenuRHSAOPage1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
	}
	public WebElement getThirdMenuRHSAOPage1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[1]"));
	}
	public WebElement getFourthMenuRHSAOPage1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
	}
	public WebElement getFifthMenuRHSAOPage1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='4'])[1]"));
	}
	
	
	
	public WebElement getVoidOptionAOPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Void']"));
	}
	public WebElement getSelectReasonDropDownAOPage() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Select Reason']"));
	}
	public WebElement getSaveBtnVoidWindowAOPage() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[3]"));
	}
	public WebElement getCancelBtnVoidWindowAOPage() {
		return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='2'])[2]"));
	}
	public WebElement getVoidDDCustomerChangedMindAOPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Customer Changed Mind']"));
	}
	public WebElement getVoidDDWaiterErrorAOPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Waiter Error']"));
	}
	public WebElement getVoidDD86edAOPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='86ed']"));
	}
	public WebElement getVoidDDTestingTrainingAOPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Testing/Training']"));
	}
	public WebElement getVoidDDGuestDissatisfiedAOPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Guest Dissatisfied']"));
	}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Refund
	public WebElement getRefundBtnCOPage() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Refund']"));
	}
	public WebElement getRefundPageText() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Tax charged is refunded in addition to the amount selected.']"));
	}
	public WebElement getServiceFeeCheckBxRefundPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Service Fee']"));
	}
	public WebElement getGratuityCheckBxRefundPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Gratuity']"));
	}
	public WebElement getTipCheckBxRefundPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Tip']"));
	}
	public WebElement getCustomValueCheckBxRefundPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Custom value']"));
	}
	public WebElement getOrderNumberHdrRefundPage() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Order#']"));
	}
	public WebElement getCustomerNameHdrRefundPage() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Customer Name']"));
	}
	public WebElement getPaymentMethodHdrRefundPage() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Payment Method']"));
	}
	public WebElement getRefundedHdrRefundPage() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Refunded']"));
	}
	public WebElement getFirstTransactionDetailsRefundPage() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[6]"));
	}
	public WebElement getTotalRefundableAmountRefundPage() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='19']"));
	}
	public WebElement getYouWillRefundAmountRefundPage() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='18']"));
	}
	public WebElement getYouWillRefundTextRefundPage() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='17']"));
	}
	public WebElement getRefundCancelBtn() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Cancel']"));
	}
	public WebElement getOrderIDRefundPageLHS() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='10']"));
	}
	public WebElement getCustomerNameRefundPageLHS() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='9']"));
	}
	public WebElement getTotalAmountNPayMethodRefundPage() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='12']"));
	}
	public WebElement getBillAmountTextRefundPage() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Bill amount']"));
	}
	public WebElement getOrderHasNotBeenSentToKitchenNotification() {
		return posDriver1.findElement(By.xpath(""));
	}
	public WebElement getServiceFeeTextBoxRefundPage() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='1']"));
	}
	public WebElement getGratuityTextBoxRefundPage() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='1']"));
	}
	public WebElement getTipTextBoxRefundPage() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='1']"));
	}
	public WebElement getCustomValueTextBoxRefundPage() {
		return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='1']"));
	}
	public WebElement getEnterValueWarnMsgRefundPage() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='3']"));
	}
	public WebElement getRefundPageHdr() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Refund']"));
	}
	public WebElement getRefundConfirmatonPopProceed() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Proceed']"));
	}
	public WebElement getRefundConfirmatonPopCancel() {
		return posDriver1.findElement(By.xpath("(//android.widget.Button[@content-desc='Cancel'])[1]"));
	}
	public WebElement getRefundConfirmatonPopText() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='16']"));
	}
	public WebElement getRefundBtnRefundPage() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Refund']"));
	}
	public WebElement getRefundedAmountCOSummary2() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='19'])[1]"));
	}
	public WebElement getCOPage39() {
		return posDriver1.findElement(By.xpath(""));
	}
	//++++++++++++++++++++++++++++++Shift Review+++++++++++++++++++++++++++++
	public WebElement getUserAction() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
	}
	public WebElement getShiftReview() {
		return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Shift Review']"));
	}
	public WebElement getShiftReviewHeadr() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Please review your shift before clocking out']"));
	}
	public WebElement getEmpNameOption() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Employee Name']"));
	}
	public WebElement getShiftReviewEmpName() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[1]"));
	}
	public WebElement getOrderIdHeading() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Order #']"));
	}
	public WebElement getBillAmountHeading() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Bill Amount']"));
	}
	public WebElement getTipHeading() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Tip']"));
	}
	public WebElement getGratuityHeading() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Gratuity']"));
	}
	public WebElement getPayOut() {
		return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Pay out']"));
	}
	public WebElement getPrintReview() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Print Review']"));
	}
	public WebElement getReviewed() {
		return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Reviewed']"));
	}
	public WebElement getOwes() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='10'])[2]"));
	}
	
	public WebElement getOrderId1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[6]"));
	}
	public WebElement getOrderId2() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='4'])[2]"));
	}
	
	
	public WebElement getOrderId3() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='8']"));
	}
	public WebElement getOrderId4() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='12']"));
	}
	public WebElement getOrderId5() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='16']"));
	}
	public WebElement getOrderId6() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='20']"));
	}
	public WebElement getOrderId7() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='24']"));
	}
	public WebElement getBillAmount1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
	}
	public WebElement getBillAmount2() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='5'])[2]"));
	}
	public WebElement getBillAmount3() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='9']"));
	}
	public WebElement getBillAmount4() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='13']"));
	}
	public WebElement getBillAmount5() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='17']"));
	}
	public WebElement getBillAmount6() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='21']"));
	}
	public WebElement getBillAmount7() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='25']"));
	}
	public WebElement getTip1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[2]"));
	}
	public WebElement getTip2() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='6'])[2]"));
	}
	public WebElement getTip3() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='10']"));
	}
	public WebElement getTip4() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='14']"));
	}
	public WebElement getTip5() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='18']"));
	}
	public WebElement getTip6() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='22']"));
	}
	public WebElement getTip7() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='26']"));
	}
	public WebElement getGratuity1() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
	}
	public WebElement getGratuity2() {
		return posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[2]"));
	}
	public WebElement getGratuity3() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='11']"));
	}
	public WebElement getGratuity4() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='15']"));
	}
	public WebElement getGratuity5() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='19']"));
	}
	public WebElement getGratuity6() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='23']"));
	}
	
	public WebElement getGratuity7() {
		return posDriver1.findElement(By.xpath("//android.view.View[@index='27']"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


