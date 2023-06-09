package com.pagemanager;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.feature.page.pom.MobileSanity_POM;
import com.feature.page.pom.POS_FlowOne_POM;
import com.feature.page.pom.RMS_Cooking_Station_POM;
import com.feature.page.pom.RMS_Discount_Configuration_POM;
import com.feature.page.pom.RMS_Employee_Management_POM;
import com.feature.page.pom.RMS_ManageTable_POM;
import com.feature.page.pom.RMS_Menus_Configuration_POM;
import com.feature.page.pom.RMS_Roles_and_Permissions_POM;
import com.feature.page.pom.RMS_SettingsPage_Configuration_POM;

public class PageManager extends BaseClass{
	
	private RMS_Employee_Management_POM rMS_Employee_Management_POM; 
	private RMS_Roles_and_Permissions_POM rMS_Roles_and_Permissions_POM;
	private RMS_SettingsPage_Configuration_POM rMS_SettingsPage_Configuration_POM;
	private RMS_Menus_Configuration_POM rMS_Menus_Configuration_POM;
	private POS_FlowOne_POM pOS_FlowOne_POM;
	private RMS_ManageTable_POM rMS_ManageTable_POM;
	private RMS_Cooking_Station_POM rMS_Cooking_Station_POM;
	private RMS_Discount_Configuration_POM rMS_Discount_Configuration_POM;
	private MobileSanity_POM mobileSanity_POM;
//	private CalculationsFile calculationsFile;

	
	public PageManager() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	public RMS_Employee_Management_POM getRMS_Employee_Management_POM() {
		return (rMS_Employee_Management_POM==null)? rMS_Employee_Management_POM = new RMS_Employee_Management_POM (): rMS_Employee_Management_POM;
	}
	
	public RMS_Roles_and_Permissions_POM getRMS_Roles_and_Permissions_POM() {
		return rMS_Roles_and_Permissions_POM==null? rMS_Roles_and_Permissions_POM = new RMS_Roles_and_Permissions_POM():rMS_Roles_and_Permissions_POM;
	}

	public RMS_SettingsPage_Configuration_POM getRMS_SettingsPage_Configuration_POM() {
		return rMS_SettingsPage_Configuration_POM==null ? rMS_SettingsPage_Configuration_POM = new RMS_SettingsPage_Configuration_POM():rMS_SettingsPage_Configuration_POM;
		}
	public RMS_Menus_Configuration_POM getRMS_Menus_Configuration_POM() {
		return rMS_Menus_Configuration_POM==null ? rMS_Menus_Configuration_POM = new RMS_Menus_Configuration_POM():rMS_Menus_Configuration_POM;
		}

	public RMS_ManageTable_POM getRMS_ManageTable_POM() {
		return rMS_ManageTable_POM==null ? rMS_ManageTable_POM = new RMS_ManageTable_POM():rMS_ManageTable_POM;
	}

	public RMS_Cooking_Station_POM getrMS_Cooking_Station_POM() {
		return rMS_Cooking_Station_POM==null ? rMS_Cooking_Station_POM = new RMS_Cooking_Station_POM() : rMS_Cooking_Station_POM;
	}

	public RMS_Discount_Configuration_POM getRMS_Discount_Configuration_POM() {
		return rMS_Discount_Configuration_POM==null?rMS_Discount_Configuration_POM= new RMS_Discount_Configuration_POM():rMS_Discount_Configuration_POM;
	}


	public POS_FlowOne_POM getPOS_FlowOne_POM() {
		return pOS_FlowOne_POM==null? pOS_FlowOne_POM=new POS_FlowOne_POM():pOS_FlowOne_POM;
	}

	public MobileSanity_POM getMobileSanity_POM() {
		return mobileSanity_POM==null? mobileSanity_POM = new MobileSanity_POM(): mobileSanity_POM;
	}

//	public CalculationsFile getCalculationsFile() {
//		return calculationsFile==null?calculationsFile=new CalculationsFile():calculationsFile;
//	} 
	
	
	

}

