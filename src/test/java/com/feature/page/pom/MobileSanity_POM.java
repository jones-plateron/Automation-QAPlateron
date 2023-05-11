package com.feature.page.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class MobileSanity_POM extends BaseClass {
	PageManager pma = new PageManager();
	
	public MobileSanity_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	/* @description- Each Page Operations and locators
	 * 
	 */
	
		// posDriver1 initializations
	

		/*
		 * **************************************************************
		 * 
		 * @description- Page WebElements (Locators)
		 */
		
		public WebElement getSkip() {
			return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip\"]"));
		}
		
		public WebElement getAlmostThere() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc=\"Almost There\"]"));
			return element;
		}
		
		public WebElement getLoginOrSignup() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc=\"Login or Sign up to place your order\"]"));
			return element;
		}
		
		public WebElement getMobileNoBox() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.EditText[@index='5']"));
			return element;
		}
		
		public WebElement getOtpVerifyDetails() {
			return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Verify Details']"));
		}

		
		public WebElement getWelcometoplateronText() {
			return posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[5]"));
		}

		public WebElement getCreateanaccountText() {
			return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Create an account']"));
		}

		public WebElement getFirstnameText() {
			return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='First Name']"));
		}

		public WebElement getLastnameText() {
			return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Last Name']"));
		}

		public WebElement getEmailaddressoptionalText() {
			return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Email Address (optional)']"));
		}

		public WebElement getDoboptionalText() {
			return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='DOB (optional)']"));
		}

		public WebElement getyoumayreceiveoffersonyourbirthdayText() {
			return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='You may receive offers on your Birthday']"));
		}

		public WebElement getIaggertermsofserviceandprovacypolicyText() {
			return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='I agree to the ']"));
		}

		public WebElement getFirstnameInputBox() {
			return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
		}

		public WebElement getLastnameInputBox() {
			return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='3']"));
		}

		public WebElement getEmailaddressInputBox() {
			return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='5']"));
		}

		public WebElement getDobInputBox() {
			return posDriver1.findElement(By.xpath("//android.view.View[@index='7']"));
		}

		public WebElement getDobDatepickerEditButton() {
			return posDriver1.findElement(By.xpath("//android.widget.Button[@index='2']"));
		}

		public WebElement getDobDatepickerEditInpuBox() {
			return posDriver1.findElement(By.xpath("//android.widget.EditText[@index='3']"));
		}

		public WebElement getDobDatepickerokButton() {
			return posDriver1.findElement(By.xpath("//android.widget.Button[@index='5']"));
		}

		public WebElement getIaggertermsofserviceandprovacypolicyCheckbox() {
			return posDriver1.findElement(By.xpath("//android.widget.CheckBox[@index='0']"));
		}

		public WebElement getSignupButton() {
			return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Signup']"));
		}

		public WebElement getSearchBarElement() {
			return posDriver1.findElement(By.xpath("(//android.widget.EditText)[@index='2']"));
		}

		public WebElement getSearchBarAfterOrderElement() {
			return posDriver1.findElement(By.xpath("(//android.widget.EditText)[@text='Search for Restaurants']"));
		}

		public WebElement getResultRestaurantElement() {
			return posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[3]"));
		}

		public WebElement getRestaurantlocationElement() {
			WebElement element = posDriver1.findElement(By.xpath("(\"//android.widget.ImageView[@index='1']\")"));
			return element;
		}

		public WebElement getProfileIconElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
			return element;
		}

		public WebElement getNumberTextBoxElement() {
			WebElement element = posDriver1.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
			return element;
		}

		public WebElement getLoginContinueBtnElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Continue']"));
			return element;
		}

		public WebElement getOTPDiigit1Element() {
			WebElement element = posDriver1.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.EditText[1]"));
			return element;
		}
		public WebElement getSearchItemsBarElement() {
			return posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Search for items']"));
			////android.view.View[@content-desc='Search for items']
			//android.view.View[@elementId='00000000-0000-006c-0000-004300000004']
		}
		
		public WebElement getSearhResultMenu() {
			return posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
		}
		
		public WebElement getSearchItemsBarAfterClickElement() {
			return posDriver1.findElement(By.xpath("//android.widget.EditText[@text='Search for items']"));
		}
		public WebElement getRestaurantNameElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='1']"));
			return element;
		}
		public WebElement getRestaurantAddressElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='2']"));
			return element;
		}
		public WebElement getBackArrowIconElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index='0']"));
			return element;
		}
		public WebElement getSearchClearBtnElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Clear']"));
			return element;
		}
		public WebElement getMenuNotFoundElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Menu not found']"));
			return element;
		}
		public WebElement getSearchBarCloseIconElement() {  // clickable
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[4]"));
			return element;
		}
	
		public WebElement getResultMenuAddIconElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='ADD']"));
			return element;
		}
		public WebElement getResultMenuAddPlusIconElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index='2']"));
			return element;
		}
		
		public WebElement getResultMenuElement() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='0']"));
			return element;
		
		}
		//Modify Popup 
		
		public WebElement getCountModifyPopupHeaderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Modify']"));
			return element;
			}
		
		public WebElement getCountModifyPopupCloseIconElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]"));
			return element;
			}
		
		public WebElement getCountModifyPopupDeleteIconElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index='0']"));
			return element;
			}
		
		public WebElement getCountModifyPopupPlusElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index='1']"));
			return element;
			}
		public WebElement getCountModifyPopupPlusAfterElement() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.widget.Button[@index='1'])[1]"));
			return element;
			}
		
		
		public WebElement getCountModifyPopupAddNotesElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc=\"+ Add Notes\"]"));
			return element;
			}
		public WebElement getCountModifyPopupAddNewElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Add New']"));
			return element;
			}
		public WebElement getCountModifyPopupUpdateElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Update']"));
			return element;
			}
		
		public WebElement getCartIconElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='4']"));
			return element;
		}
		public WebElement getCartIconBeforeElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='7']"));
			return element;
		}
		public WebElement getPlaceOrderIconElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Place order']"));
			return element;
		}		

		public WebElement getModifierHeaderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
			return element;
		}

		public WebElement getModifierRequiredFrameElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='0']"));
			return element;
		}

		public WebElement getModifierAddReqElement(int i) {
			WebElement element = posDriver1.findElement(By.xpath("(//android.widget.Button[@content-desc='ADD'])[" + i + "]"));
			return element;
		}

		public WebElement getModifierOptionalFrameElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='1']"));
			return element;
		}

		public WebElement getModifierReduceMenuCountElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index='1']"));
			return element;
		}

		public WebElement getModifierMenuCountElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='2']"));
			return element;
		}

		public WebElement getModifierAddMenuCountElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index='3']"));
			return element;
		}

		public WebElement getModifierMenuTotalPriceElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='4']"));
			return element;
		}
		
		public WebElement getModifierCloseElement() {
			WebElement element = posDriver1.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			return element;
		}

		public WebElement getModifierApplyElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Apply']"));
			return element;
		}

		public WebElement getElement() {
			WebElement element = posDriver1.findElement(By.xpath(""));
			return element;
		}
		
		 /* ************************************************************** 
		  * @description- Page WebElements (Locators) 
		  */
		
		public WebElement getAddItemsElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Add Items']"));
			return element;
		}
		public WebElement getRestaurantSpecialNotesElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Any special notes for restaurant']"));
			return element;
		}
		public WebElement getRestaurantAfterAddedSpecialNotesElement() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.widget.Button[@index='0'])[2]"));
			return element;
		}
		public WebElement getSpecialNotesPopupCloseElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]"));
			return element;
		}
		public WebElement getSpecialNotesPopupTextBarElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
			return element;
		}
		public WebElement getSpecialNotesPopupApplyNotesElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Apply Notes']"));
			return element;
		}
		public WebElement getSpecialNotesPopupHeaderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Special notes']"));
			return element;
		}
		public WebElement getEditSpecialNotesElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index='0']/android.widget.ImageView[2]"));
			return element;
		}
		public WebElement getDeleteMenuBeforeNoteElement() { //not clickable
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button[1]"));
			return element;
		}
		public WebElement getDeleteMenuAfterNoteElement() { //not clickable
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button[2]"));
			return element;
		}
		public WebElement getAddMenuCountAfterNotePlusElement() { //not clickable
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button[3]"));
			return element;
		}
		public WebElement getAddMenuCountBeforeNotePlusElement() { 
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button[2]"));
			return element;
		}
		public WebElement getReduceMenuCountElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button[2]"));
			return element;
		}
		public WebElement getMenuCountElement() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
			return element;
		}
		public WebElement getSecondMenuNameElement(String attriValue) {
			String xpath="//android.view.View[@content-desc='"+attriValue+"']";
			WebElement element = posDriver1.findElement(By.xpath(xpath));
			return element;
		}
		public WebElement getCartEmptyPopupCloseElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]"));
			return element;
		}
		public WebElement getCartEmptyPopupClearCartElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Clear Cart']"));
			return element;
		}
		public WebElement getCartEmptyPopupKeepItemsElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Keep Items']"));
			return element;
		}
		public WebElement getCartEmptyPopupHeaderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Your cart cannot be empty']"));
			return element;
		}
		public WebElement getCartEmptyPopupConfirmationMsgElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='This is the last item in your cart. Are you sure you want to remove it?']"));
			return element;
		}
		public WebElement getMenuPriceElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='6']"));
			return element;
		}
		public WebElement getMenuAddNotesElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='+ Add Notes']"));
			return element;
		}
		public WebElement getMenuAddNotesEditElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='5']"));
			return element;
		}
		public WebElement getMenuAddNotesPopupTextboxElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
			return element;
		}
		public WebElement getMenuAddNotesPopupEgElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Eg: No onion, No garlic, less oil']"));
			return element;
		}
		public WebElement getMenuAddNotesPopupCloseElement() {
			WebElement element = posDriver1.findElement(By.xpath("	\r\n"
					+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]"));
			return element;
		}
		public WebElement getMenuAddNotesPopupApplyNotesElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Apply Notes']"));
			return element;
		}
		public WebElement getTotalUpArrowElement() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='11'])[2]"));
			return element;
		}
		public WebElement get18TipElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='18%']"));
			return element;
		}
		public WebElement get20TipElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='20%']"));
			return element;
		}
		public WebElement get22TipElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='22%']"));
			return element;
		}
		public WebElement getTipAmountElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='5']/android.widget.EditText"));
			//WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
			return element;
		}
		public WebElement getTotalCalculationElement() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='5'])[2]"));
			return element;
		}
		public WebElement getPayNowElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Pay now']"));
			return element;
		}
		public WebElement getMenuPrice1PM() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='6']"));
			return element;
		}

		public WebElement getMenuPrice2PM() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='12']"));
			return element;
		}

		public WebElement getMenuPrice3PM() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='18']"));
			return element;
		}

		public WebElement getMenuPrice4PM() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='24']"));
			return element;
		}

		public WebElement getMenuPrice5PM() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='30']"));
			return element;
		}

		public WebElement getMenuPrice6PM() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='6']"));
			return element;
		}
		
		
		//Payment Page
		public WebElement getPaymentPageheaderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Select Payment Method']"));
			return element;
		}
		public WebElement getBackArrowElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			return element;
		}
		public WebElement getExistCardCvvElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.EditText[@index='3']"));
			return element;
		}
		public WebElement getExistingCardPayElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index='4']"));
			return element;
		}
		public WebElement getCancelPaymentCloseElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]"));
			return element;
		}
		public WebElement getCancelPaymentYesCancelElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Yes, Cancel']"));
			return element;
		}
		public WebElement getCancelPaymentNoContinueElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='No, Continue']"));
			return element;
		}
		public WebElement getCancelPaymentHeaderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Want to cancel the payment?']"));
			return element;
		}
		public WebElement getAddNewCardElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='+ Add new card']"));
			return element;
		}
		public WebElement getAddCardHeaderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Add Card']"));
			return element;
		}
		public WebElement getNameOnCardElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[2]/android.widget.EditText"));
			return element;
		}
		public WebElement getCardNumberElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[4]/android.widget.EditText"));
			return element;
		}
		public WebElement getValidTillElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[8]/android.widget.EditText"));
			return element;
		}
		public WebElement getNewCardCvvElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[9]"));
			return element;
		}
		public WebElement getZipCodeElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[11]/android.widget.EditText"));
			return element;
		}
		public WebElement getPayElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index='3']"));
			return element;
		}
		public WebElement getPaymentSuccessTextElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Payment Successful !!']"));
			return element;
		}
		public WebElement getPaySuccessViewmyOrderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='View my order']"));
			return element;
		}
		public WebElement getPaySuccessCloseElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]"));
			return element;
		}
		public WebElement getInvalidPopUpHeaderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Invalid Card Details.']"));
			return element;
		}
		public WebElement getInvalidPopUpCloseElement() {
			WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]"));
			return element;
		}
		public WebElement getInvalidPopUpOkayElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Okay']"));
			return element;
		}
		public WebElement getMyOrdersHeaderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Orders']"));
			return element;
		}
		public WebElement getIndividualOrderPageHeaderElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Order ID']"));
			return element;
		}
		public WebElement getOrderIDElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='2']"));
			return element;
		}
		
		public WebElement getMyOrdersTabElement() {
	        WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='6']"));
	        return element;
	    }
		public WebElement getMyOrdersTabAfterOrderElement() {
	        WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='7']"));
	        return element;
	    }
	    public WebElement getCurrentOrderElement(int i, int j) {
	        WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='"+i+"'])["+j+"]"));
	        return element;
	    }
	    public WebElement getPastOrdersElement() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index='1']"));
			return element;
		}
	    
	    public WebElement getOrderSummaryResName() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[5]"));
			return element;
		}
	    public WebElement getOrderSummaryMenu1() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='5'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenu2() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenu3() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='9'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenu4() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='11'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenu5() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='13'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenu6() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='15'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenu7() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='17'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenu8() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='19'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenuPrice1() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='6'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenuPrice2() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='8'])[2]"));
			return element;
		}
	    public WebElement getOrderSummaryMenuPrice3() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='10'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenuPrice4() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='12'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenuPrice5() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='14'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenuPrice6() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='16'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryMenuPrice7() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='18'])[1]"));
			return element;
		}
	    public WebElement getOrderSummaryTotal() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='9'])[2]"));
			return element;
		}
	    public WebElement getOrderSummaryTotalExpand() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='9'])[2]"));
			return element;
		}
	    
	    public WebElement getOrderSummaryDateTime() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
			return element;
		}
	    
	    
	    
	    /*
		 * ************************************************************** 
		 * Below locators is for DineIn-Flows
		 */
	    
	    
	    public WebElement getFirstNameEDpage() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='2'])[1]"));
			return element;
		}
	    public WebElement getLastNameEDpage() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='4'])[1]"));
			return element;
		}
	    public WebElement getMobileNumEDpage() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.widget.EditText[@index='8'])[1]"));
			return element;
		}
	    public WebElement getContinueBtn() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Continue']"));
			return element;
		}
	    
	    public WebElement getOtpDineInFlow() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.widget.EditText[@index='0'])[1]"));
			return element;
		}
	    
	    
	    public WebElement getResNameConfirmOrderBtn() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[1]"));
			return element;
		}
	    public WebElement getEnterDetailsHdr() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Enter details to place order']"));
			return element;
		}
	    
	  
	    public WebElement getMenuPrice1ConfirmOrderPg() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='5'])[2]"));
			return element;
		}
	    public WebElement getMenuPrice2ConfirmOrderPg() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='11']"));
			return element;
		}
	    public WebElement getMenuPrice3ConfirmOrderPg() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='17']"));
			return element;
		}
	    public WebElement getMenuPrice4ConfirmOrderPg() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='23']"));
			return element;
		}
	    public WebElement getMenuPrice5ConfirmOrderPg() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='29']"));
			return element;
		}
	    public WebElement getConfirmOrderBtn() {
			WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Confirm Order']"));
			return element;
		}
	    public WebElement getPayBillDFHdr() {
			WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Pay Bill']"));
			return element;
		}
	    public WebElement getOrderIdPayBillPageDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[1]"));
			return element;
		}
	    public WebElement getTotalItemPayBillPageDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='5'])[1]"));
			return element;
		}
	    public WebElement getMenuPrice1PayBillDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
			return element;
		}
	    public WebElement getMenuPrice2PayBillDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
			return element;
		}
	    public WebElement getMenuPrice3PayBillDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='5'])[2]"));
			return element;
		}
	    public WebElement getMenuPrice4PayBillDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[1]"));
			return element;
		}
	    public WebElement getTotalUpArrowPayBillDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='13'])[1]"));
			return element;
		}
	    
	    public WebElement getAllCalculationPayBillDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[2]"));
			return element;
		}
	    public WebElement getTipValueDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.widget.EditText[@index='3'])[1]"));
			return element;
		}
	    public WebElement getPayBtnPayBillpgDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.widget.Button[@index='8'])[1]"));
			return element;
		}
	    
	    public WebElement getMenu1OrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
			return element;
		}
	    public WebElement getMenu2OrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
			return element;
		}
	    public WebElement getMenu3OrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='5'])[1]"));
			return element;
		}
	    public WebElement getMenu4OrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[1]"));
			return element;
		}
	    public WebElement getMenu5OrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='8'])[1]"));
			return element;
		}
	    public WebElement getMenu6OrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='8'])[1]"));
			return element;
		}
	    public WebElement getMenu7OrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='8'])[1]"));
			return element;
		}
	    
	    public WebElement getTotalOrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[2]"));
			return element;
		}
	    public WebElement getTotalOrderSummaryExpandDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='7'])[2]"));
			return element;
		}
	    //Menu Price in order summary
	    public WebElement getMenu1PriceOrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[2]"));
			return element;
		}
	    public WebElement getMenu2PriceOrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='4'])[2]"));
			return element;
		}
	    public WebElement getMenu3PriceOrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='6'])[2]"));
			return element;
		}
	    public WebElement getMenu4PriceOrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='8'])[1]"));
			return element;
		}
	    public WebElement getMenu5PriceOrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='8'])[1]"));
			return element;
		}
	    public WebElement getMenu6PriceOrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='8'])[1]"));
			return element;
		}
	    public WebElement getMenu7PriceOrderSummaryDF() {
			WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='8'])[1]"));
			return element;
		}
	    
	   
	    
		

		/*
		 * ************************************************************** Test Case
		 * method process step definition Inputs
		 */

	}


