package com.feature.page.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_Menus_Configuration_POM extends BaseClass{
PageManager pma = new PageManager();
	
	public RMS_Menus_Configuration_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	public WebElement getHomeMenusSectionelement() {
		return rmsDriver.findElement(By.xpath("//li[3]//a[1]"));
	}
	public WebElement getTopMenuItemsSectionElement() {
		return rmsDriver.findElement(By.xpath("//a[normalize-space()='Menu Items']"));
	}
	public WebElement getModifiersButtonUnderMenuItemsSec() {
		return rmsDriver.findElement(By.xpath("//li[contains(text(),'Modifiers')]"));
	}
	public WebElement getModifiersButtonUnderMenuItemsSec1() {
		return rmsDriver.findElement(By.xpath("//div[contains(text(),'Modifiers')]"));
	}
	public WebElement getAddModifierbutton() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-small btn-width large d-flex align-items-center']"));
	}
	public WebElement getAddModifierPopupHdrElement() { //for Add Category popup also
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getAddModifierPopupTextElement() { //for Add Category popup also
		return rmsDriver.findElement(By.xpath("//label[@class='page-subheader__help-title d-block mb-1']"));
	}
	public WebElement getAddModifierPopupTextBoxElement() {//for Add Category popup also
		return rmsDriver.findElement(By.xpath("//input[@type='text']"));
	}
	public WebElement getAddModifierPopupCancelBtnElement() { //for Add Category popup also
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getAddModifierPopupCloseBtnElement() { //for Add Category popup also
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public WebElement getAddModifierPopupSaveBtnElement() { //for Add Category popup also
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
	}
	public WebElement getAddModifierPopupErrorMsgElement() { //for Add Category popup also
		return rmsDriver.findElement(By.xpath("//span[@class='invalid-feedback']"));
	}
	public List<WebElement> getModifierCateElements() {
		return rmsDriver.findElements(By.xpath("//div[contains(@class,'inner__sidebar w-large sidenav-subheader')]//li"));
	}
	public WebElement getEditModifierNameIconElement() { // Same for Category Section
		return rmsDriver.findElement(By.xpath("(//i[@class='icon-edit'])[1]"));
	}
	
			public WebElement getCategoryNameHdrNEDElement() { // Same for Category Section
				return rmsDriver.findElement(By.xpath("(//div[@class='d-flex'])[2]"));
			}
	
	
	public WebElement getEditModifierPopupHdrElement() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getEditModifierPopupCancelElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getEditModifierPopupSaveElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
	}
	public WebElement getEditModifierPopupCloseElement() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public WebElement getEditModifierPopupTextBxElement() {
		return rmsDriver.findElement(By.xpath("//input[@class='form-control  full-width modal-textarea'][@type='text']"));
	}
	public WebElement getDeleteModifierIconElementNName() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-delete']"));
	}
	public WebElement getDeleteModifierPopupHdrElement() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getDeleteModifierPopupCancelElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getDeleteModifierPopupDeleteElement() {
		return rmsDriver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
	}
	public WebElement getDeleteModifierPopupCloseElement() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public WebElement getDeleteModifierPopupTextElement() {
		return rmsDriver.findElement(By.xpath("//p[@class='empty-state__help-text--large ']"));
	}
	public WebElement getAddModifierItemButtonElement() {
		return rmsDriver.findElement(By.xpath("//div[@class='card card-empty']"));
	}
	public WebElement getAddModifierItemButtonElementNO() {
		return rmsDriver.findElement(By.xpath("//div[@class='card card-empty']"));
	}
	public WebElement getAddModifierItemButtonElement1() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-small btn-width large d-flex align-items-center']"));
	}
	public WebElement getAddModifierItemSlideHdrElement() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getAddModifierItemSlideNameTextBxElement() {
		return rmsDriver.findElement(By.xpath("//input[@placeholder='Enter modifier name']"));
	}
	public WebElement getAddModifierItemSlideNameHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Modifier Name']"));
	}
	public WebElement getAddModifierItemSlideNameErrorMsg() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='Please enter modifier name']"));
	}
	public WebElement getAddModifierItemSlidePriceTextBxElement() {
		return rmsDriver.findElement(By.xpath("//input[@name='price']"));
	}
	public WebElement getAddModifierItemSlidePriceHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Price']"));
	}
	public WebElement getAddModifierItemSlidePriceErrMsgElement() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='Please enter valid price']"));
	}
	public WebElement getAddModifierItemSlideModifierTypeHdr() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Modifier Type']"));
	}
	public WebElement getAddModifierItemSlideModTypeVegetarian() {
		return rmsDriver.findElement(By.xpath("//label[@for='radio-group-1']"));
	}
	public WebElement getAddModifierItemSlideModTypeNonVeg() {
		return rmsDriver.findElement(By.xpath("//label[@for='radio-group-2']"));
	}
	public WebElement getAddModifierItemSlideModTypeVegan() {
		return rmsDriver.findElement(By.xpath("//label[@for='radio-group-3']"));
	}
	public WebElement getAddModifierItemSlideDescriptionHdr() {
		return rmsDriver.findElement(By.xpath("//div[@class='form-col']//label[@class='form-label']"));
	}
	public WebElement getAddModifierItemSlideDescriptionTextBx() {
		return rmsDriver.findElement(By.xpath("//textarea[@name='description']"));
	}
	public WebElement getAddModifierItemSlideSaveBtn() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
	}
	public WebElement getAddModifierItemSlideCancelBtn() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getAddModifierItemSlideCloseBtn() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public List<WebElement> getModifierItemsList() {
		return rmsDriver.findElements(By.xpath("//div[@class=' menu-card__menu-card-item  cursor-grab ']"));
	}
	public List<WebElement> getEditModifierItemsIconInsideList() {
		return rmsDriver.findElements(By.xpath("//button[@class='mr-2 tooltip']"));
	}
	
	public WebElement getEditFirstMenuItemIconInsideList() {
		return rmsDriver.findElement(By.xpath("(//button[@class='mr-2 tooltip'])[2]"));
	}
	
	public WebElement getUpdateModifierItemSlidePopupHdr() {
		return rmsDriver.findElement(By.xpath("//h4[contains(@class,'modal-title text-ellipsis')]"));
	}
	public WebElement getAddModifierItemSlideYesProceedBtn() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Yes, Proceed']"));
	}
	public WebElement getAddModifierItemSlideLetMeModifyBtn() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Let me modifiy']"));
	}
	public WebElement getAddModifierItemSlideAreYouSureText() {
		return rmsDriver.findElement(By.xpath("//div[@role='alert']"));
	}
	
	
	
	
//	public WebElement getModifierItemNameInsideList(WebElement find) {  // Applies for Category Menu Item
//		return find.findElement(By.xpath("//h4[@class='card-title line-wrap']"));
//	}
//	public WebElement getModifierItemDescriptionInsideList(WebElement find) { // Applies for Category Menu Item Description
//		return find.findElement(By.xpath("//p[@class='card-text w-break mb-1']"));
//	}
//	public WebElement getModifierItemPriceInsideList(WebElement find) { // Applies for Category Menu Item Price
//		return find.findElement(By.xpath("//div[@class='d-flex mw-60']"));
//	}
	
	
	
	public WebElement getModifierItemNameInsideList() {  // Applies for Category Menu Item
		return rmsDriver.findElement(By.xpath("//h4[@class='card-title line-wrap']"));
	}
	public WebElement getModifierItemDescriptionInsideList() { // Applies for Category Menu Item Description
		return rmsDriver.findElement(By.xpath("//p[@class='card-text w-break mb-1']"));
	}
	public WebElement getModifierItemPriceInsideList() { // Applies for Category Menu Item Price
		return rmsDriver.findElement(By.xpath("//div[@class='d-flex mw-60']"));
	}
	
	
	
	
	
	
	
	
	
	
	public WebElement getActiveModifierElement() { // Applies for Category Menu 
		return rmsDriver.findElement(By.xpath("//li[@class='list-item item-width no-border d-flex align-items-center active ']"));
	}
	public List<WebElement> getAllModifierElement() { // Applies for Category Menu 
		return rmsDriver.findElements(By.xpath("//li[@aria-describedby='rbd-hidden-text-11-hidden-text-61']"));
	}
	public List<WebElement> getDeleteModifierItemsIconInsideList() {
		return rmsDriver.findElements(By.xpath("//button[@data-target='#delete-menu-modal']"));
	}
	public WebElement getDeleteModifierItemsIconInsideList1() {
		return rmsDriver.findElement(By.xpath("//button[@data-target='#delete-menu-modal']"));
	}
	
	
	
	public WebElement getDeleteModifierItemPopHdr() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getDeleteModifierItemPopText() {
		return rmsDriver.findElement(By.xpath("//p[contains(@class,'empty-state__help-text--large')]"));
	}
	public WebElement getDeleteModifierItemPopCancelElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getDeleteModifierItemPopCloseElement() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public WebElement getDeleteModifierItemPopDeleteElement() {
		return rmsDriver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
	}
	public WebElement getCategoriesButtonUnderMenuItemsSec() {
		return rmsDriver.findElement(By.xpath("//div[contains(text(),'Categories (')]"));
	}
	public WebElement getCategoriesButtonUnderMenuItemsSec1() {
		return rmsDriver.findElement(By.xpath("//li[@class='switch-tag medium cursor-pointer switch-tag-active']"));
	}
	public WebElement getAddCategoryButton() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-small large d-flex align-items-center']"));
	}
	public List<WebElement> getAllCategoriesList() {
		return rmsDriver.findElements(By.xpath("//ul[contains(@class,'list-group-flush list-group__box-model mb-2')]//li"));
	}
	public WebElement getAddMenuInsideCateElement() {
		return rmsDriver.findElement(By.xpath("//div[@class='card card-empty']"));
	}
	public List<WebElement> getMenusListInsideCate() {
		return rmsDriver.findElements(By.xpath("//div[@class=' menu-card__menu-card-item  cursor-grab ']"));
	}
	public WebElement getAddMenuSlideHdr() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title mb-2']"));
	}
	public WebElement getAddMenuSlideMenuNameHdr() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Menu Name']"));
	}
	public WebElement getAddMenuSlideMenuNameTextBx() {
		return rmsDriver.findElement(By.xpath("//input[@placeholder='Enter menu name']"));
	}
	public WebElement getAddMenuSlideMenuNameErrorMsg() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='Please enter menu name']"));
	}
	public WebElement getAddMenuSlideMenuTypeHdr() {
		return rmsDriver.findElement(By.xpath("//label[@class='form-label form-label__form--medium ']"));
	}
	public WebElement getAddMenuSlideMenuTypeDropDown() {
		return rmsDriver.findElement(By.xpath("//select[@placeholder='Choose menu type']"));
	}
	public WebElement getAddMenuSlideMenuTypeDropDownErrorMsg() {
		return rmsDriver.findElement(By.xpath("//span[contains(@class,'invalid-feedback w-auto')]"));
	}
	public WebElement getAddMenuSlidePriceHdr() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Price']"));
	}
	public WebElement getAddMenuSlidePriceTextBx() {
		return rmsDriver.findElement(By.xpath("//input[@name='price']"));
	}
	public WebElement getAddMenuSlidePriceErrorMsg() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='Please enter valid price']"));
	}
	public WebElement getAddMenuSlideDescriptionHdr() {
		return rmsDriver.findElement(By.xpath("//label[@class='form-label d-flex']"));
	}
	public WebElement getAddMenuSlideDescriptionTextBx() {
		return rmsDriver.findElement(By.xpath("//textarea[@name='description']"));
	}
	public WebElement getAddMenuSlideApplyModifiersHdr() {
		return rmsDriver.findElement(By.xpath("//h4[@class='page-subheader align-self-end']"));
	}
	public WebElement getAddMenuSlideAddModifierBtn() {
		return rmsDriver.findElement(By.xpath("//a[@class='btn btn-outline-primary btn-medium']"));
	}
	public WebElement getAddMenuSlideModifierListHdr() {
		return rmsDriver.findElement(By.xpath("//h4[normalize-space()='Modifier List']"));
	}
	public List<WebElement> getAddMenuSlideModifiersList() {
		return rmsDriver.findElements(By.xpath("//div[@class='task-group__task-listitem mt-3']"));
	}
	public WebElement getAddMenuSlideModifiersListApplyBtn() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
	}
	public WebElement getAddMenuSlideModifiersListCancelBtn() {//
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getAddMenuSlideModifiersListYesItsOkBtn() {//
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small ml-2 mt-2 mb-2']"));
	}
	public WebElement getAddMenuSlideModifiersListLetMeSelectBtn() {//
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Let me select']"));
	}
	public WebElement getAddMenuSlideModifiersListConfirtext() {//
		return rmsDriver.findElement(By.xpath("//div[@role='alert']"));
	}
	//button[@class='btn btn-outline-default btn-md ml-2']
	public WebElement getAddMenuSlideModifiersListApplyBtnAfter() {//After Adding items to menu
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-outline-default btn-md w-md ml-2']"));
	}
	
	public WebElement getAddMenuSlideModifiersListSaveBtnAfter() {//After Adding items to menu
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-medium mt-2 mb-2']"));
	}
	
	//select[@class='minimal full-width']
	public List<WebElement> getAddMenuSlideAddedModifiersListReqOrOpt() {
		return rmsDriver.findElements(By.xpath("//select[@class='minimal full-width']"));
	}
	
	public List<WebElement> getCategoryListsElement() {
		return rmsDriver.findElements(By.xpath("//ul[@class='list-group-flush list-group__box-model mb-2']//li"));
	}
	
	
	
	
	
		
	
	
	
	public WebElement getMenuImageText1() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-upload align-top']"));
	}
	public WebElement getMenuImageText2() {
		return rmsDriver.findElement(By.xpath("//input[@name='menuImg']"));
	}
	public WebElement getAddMenuSlideCacelBtn() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getAddMenuSlideSaveBtn() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
	}
	public WebElement getAddMenuSlideCloseBtn() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-cancel icon-3x']//img"));
	}
	public WebElement getPublishMenuBtnElement() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-success btn-small d-flex align-items-center']"));
	}
	public WebElement getPublishMenuPopupHdr() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getPublishMenuPopupTotalChangesElement() {
		return rmsDriver.findElement(By.xpath("//p[@class='modal-sub-title']"));
	}
	public WebElement getPublishMenuPopupCancelBtn() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-default']"));
	}
	public WebElement getPublishMenuPopupPublishBtn() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	}
	public WebElement getPublishMenuPopupCloseElement() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	
	public WebElement getPublishMenuPopTable() {
		return rmsDriver.findElement(By.xpath("//table[@class='table mt-3']"));
	}
	public WebElement getTotalChangesTextInPublish() {
		return rmsDriver.findElement(By.xpath("//p[@class='modal-sub-title']"));
	}
	public WebElement getUnmappedCookingStnTextInPublish() {
		return rmsDriver.findElement(By.xpath("//span[@class='modal-link']"));
	}
	public WebElement getPublishPopupRearrText() {
		return rmsDriver.findElement(By.xpath("//p[@class='pl-1 font-bold text-medium']"));
	}
	public WebElement getUnmapCSTxtatTopPublishMenu() {
		return rmsDriver.findElement(By.xpath("//span[@class='modal-link']"));
	}
	public WebElement getMenuNotPublishedtext() {
		return rmsDriver.findElement(By.xpath("//h4[@class='publish-menu-warning-header']"));
	}
	public WebElement getMenuNotPublishedSubtext() {
		return rmsDriver.findElement(By.xpath("//p[@class='publish-menu-warning-description']"));
	}
	public WebElement getMenuNotPublishedClose() {
		return rmsDriver.findElement(By.xpath("//div[@class='cursor-pointer']//img"));
	}
	
	
	
	
	
	public WebElement get() {
		return rmsDriver.findElement(By.xpath(""));
	}
	
}

//28-03-2023 18:28
