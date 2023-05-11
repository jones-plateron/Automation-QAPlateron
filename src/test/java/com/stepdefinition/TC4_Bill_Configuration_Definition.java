package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_Bill_Configuration_Definition extends BaseClass {

	PageManager pma = new PageManager();

	public TC4_Bill_Configuration_Definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	@When("User should Click Settings Sections")
	public void userShouldClickSettingsSections() throws InterruptedException {
		Thread.sleep(2000);
		pma.getRMS_SettingsPage_Configuration_POM().getSettingsSections().click();
	}

	@Then("User should verify the Page redirection to Settings Page {string}")
	public void userShouldVerifyThePageRedirectionToSettingsPage(String datePageHdr) {
		Assert.assertTrue(
				pma.getRMS_SettingsPage_Configuration_POM().getDateandTimeSecHeader().getText().contains(datePageHdr));
	}

	@Then("User should click Bill configuration and update the sales tax percentage #Excel Input")
	public void userShouldClickBillConfigurationAndUpdateTheSalesTaxPercentageExcelInput()
			throws InterruptedException, IOException {
		pma.getRMS_SettingsPage_Configuration_POM().getBillConfigurationOptionSections().click();

		String dataFromExcel = getDataFromExcel("Bill Configuration", 1, 1);
		pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox()
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(500);
		pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys(dataFromExcel);
		Thread.sleep(3000);
	}

	@Then("User should Enable or Disable Apply sales tax on Subtotal after Deductions Option #Excel Input")
	public void userShouldEnableOrDisableApplySalesTaxOnSubtotalAfterDeductionsOptionExcelInput()
			throws InterruptedException, IOException {
//		String salTxafterDeduct = getDataFromExcel("Bill Configuration", 2, 1);
//		// System.out.println(salTxafterDeduct);
//		if (salTxafterDeduct.equals("ON")) {Thread.sleep(500);
//			if (pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle()
//					.getAttribute("value").equals("true")) {
//			} else if (pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle()
//					.getAttribute("value").equals("false")) {
//				pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle1()
//						.click();
//			}
//		} else if (salTxafterDeduct.equals("OFF")) {
//			if (pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle()
//					.getAttribute("value").equals("true")) {
//				pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle1()
//						.click();
//			} else if (pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle()
//					.getAttribute("value").equals("false")) {
//			}
//		} else {
//			Assert.assertTrue(false, "Invalid State");
//		}
	}

	@Then("User should Enable or Disable Apply sales tax on Tip after Deductions Option #Excel Input")
	public void userShouldEnableOrDisableApplySalesTaxOnTipAfterDeductionsOptionExcelInput()
			throws InterruptedException, IOException {
//		String salTxOnTipafterDeduct = getDataFromExcel("Bill Configuration", 3, 1);
//		if (salTxOnTipafterDeduct.equals("ON")) {
//			if (pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle()
//					.getAttribute("value").equals("true")) {
//			} else if (pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle()
//					.getAttribute("value").equals("false")) {
//				pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle1().click();
//			}
//		} else if (salTxOnTipafterDeduct.equals("OFF")) {
//			if (pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle()
//					.getAttribute("value").equals("true")) {
//				pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle1().click();
//			} else if (pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle()
//					.getAttribute("value").equals("false")) {
//			}
//		} else {
//			Assert.assertTrue(false, "Invalid State");
//		}
	}

	@Then("User should enter the Service Fee Percentage #Excel Input")
	public void userShouldEnterTheServiceFeePercentageExcelInput() throws IOException, InterruptedException {
		String serviceFeePerc = getDataFromExcel("Bill Configuration", 4, 1);
		Thread.sleep(1000);
		pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox()
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(500);
		pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().sendKeys(serviceFeePerc);

	}

	@Then("User should enable or Disable the Service fee tax option #Excel Input")
	public void userShouldEnableOrDisableTheServiceFeeTaxOptionExcelInput() throws IOException, InterruptedException {
		String SerFeeTXCheckBx = getDataFromExcel("Bill Configuration", 5, 1);

		if (SerFeeTXCheckBx.equals("ON")) {Thread.sleep(500);
			if (pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle()
					.getAttribute("value").equals("true")) {Thread.sleep(500);
			} else if (pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle()
					.getAttribute("value").equals("false")) {Thread.sleep(500);
				pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle1().click();
			}
		} else if (SerFeeTXCheckBx.equals("OFF")) {Thread.sleep(500);
			if (pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle()
					.getAttribute("value").equals("true")) {Thread.sleep(500);
				pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle1().click();
			} else if (pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle()
					.getAttribute("value").equals("false")) {Thread.sleep(500);
			}
		} else {
			Assert.assertTrue(false, "Invalid State");
		}
	}

	@Then("User should enable or Disable the Apply service fee on the subtotal after deductions #Excel Input")
	public void userShouldEnableOrDisableTheApplyServiceFeeOnTheSubtotalAfterDeductionsExcelInput()
throws IOException, InterruptedException {
		String serFeeonSubToAfterDedu = getDataFromExcel("Bill Configuration", 7, 1);

		if (serFeeonSubToAfterDedu.equals("ON")) {Thread.sleep(500);
			if (pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle1()
					.getAttribute("value").equals("true")) {Thread.sleep(500);
			} else if (pma.getRMS_SettingsPage_Configuration_POM()
					.getApplyServiceFeeOntheSubtotalafterDeductionsToggle1().getAttribute("value").equals("false")) {Thread.sleep(500);
				pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle()
						.click();
			}
		} else if (serFeeonSubToAfterDedu.equals("OFF")) {Thread.sleep(500);
			if (pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle1()
					.getAttribute("value").equals("true")) {Thread.sleep(500);
				pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle()
						.click();
			} else if (pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle1().getAttribute("value").equals("false")) {Thread.sleep(500);
			}
		} else {
			Assert.assertTrue(false, "Invalid State");
		}
	}

	@Then("User should click Save button in Bill Configuration page")
	public void userShouldClickSaveButtonInBillConfigurationPage() throws InterruptedException {
		Thread.sleep(1000);
		pma.getRMS_SettingsPage_Configuration_POM().getBillSettingSaveButton().click();
	}

	@When("User should click gratuity configuration section")
	public void userShouldClickGratuityConfigurationSection() throws InterruptedException {
		Thread.sleep(1000);
		pma.getRMS_SettingsPage_Configuration_POM().getGratuityConfigurationSections().click();
	}

	@Then("User enable or disable the Gratuity option #Excel Input")
	public void userEnableOrDisableTheGratuityOptionExcelInput() throws IOException, InterruptedException {
		String GradEnable = getDataFromExcel("Bill Configuration", 8, 1);

		if (GradEnable.equals("ON")) {
			if (pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("value")
					.equals("true")) {Thread.sleep(500);
			} else if (pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("value")
					.equals("false")) {Thread.sleep(500);
				pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle1().click();
			}
		} else if (GradEnable.equals("OFF")) {Thread.sleep(500);
			if (pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("value")
					.equals("true")) {Thread.sleep(500);
				pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle1().click();
			} else if (pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("value")
					.equals("false")) {Thread.sleep(500);
			}
		} else {
			Assert.assertTrue(false, "Invalid State");
		}
	}

	@Then("User should select Checkbox Guest Count or Order Amount #Excel Input")
	public void userShouldSelectCheckboxGuestCountOrOrderAmountExcelInput() throws IOException, InterruptedException {

		String CheckboxOption = getDataFromExcel("Bill Configuration", 9, 1);

		if (CheckboxOption.equals("Guest Count")) {Thread.sleep(500);
			pma.getRMS_SettingsPage_Configuration_POM().getGuestCountRadioButtonOption().click();Thread.sleep(500);

		} else if (CheckboxOption.equals("Order Amount")) {Thread.sleep(500);
			pma.getRMS_SettingsPage_Configuration_POM().getOrderAmountRadioButtonOption().click();
			// Need to Add takeAway & Dine-In
			String takeAwayCheckbxStatus = getDataFromExcel("Bill Configuration", 14, 1);
			if (takeAwayCheckbxStatus.equals("ON")) {Thread.sleep(500);
				if (pma.getRMS_SettingsPage_Configuration_POM().getTakeAwayCheckBox1().getAttribute("value")
						.equals("true")) {
				} else {
					pma.getRMS_SettingsPage_Configuration_POM().getTakeAwayCheckBox().click();
				}
			} else if (takeAwayCheckbxStatus.equals("OFF")) {Thread.sleep(500);
				if (pma.getRMS_SettingsPage_Configuration_POM().getTakeAwayCheckBox1().getAttribute("value")
						.equals("true")) {
					pma.getRMS_SettingsPage_Configuration_POM().getTakeAwayCheckBox().click();
				} else {
				}
			}
			String dineINCheckbxStatus = getDataFromExcel("Bill Configuration", 15, 1);
			if (dineINCheckbxStatus.equals("ON")) {
				if (pma.getRMS_SettingsPage_Configuration_POM().getDineInCheckBox1().getAttribute("value")
						.equals("true")) {Thread.sleep(500);
				} else {
					pma.getRMS_SettingsPage_Configuration_POM().getDineInCheckBox().click();
				}
			} else if (dineINCheckbxStatus.equals("OFF")) {Thread.sleep(500);
				if (pma.getRMS_SettingsPage_Configuration_POM().getDineInCheckBox1().getAttribute("value")
						.equals("true")) {
					pma.getRMS_SettingsPage_Configuration_POM().getDineInCheckBox().click();
				} else {
				}
			}
		} else {
			Assert.assertTrue(false, "Invalid Comments");
		}

	}

	@Then("User should enter the Gratuity Percentage #Excel Input")
	public void userShouldEnterTheGratuityPercentageExcelInput() throws IOException, InterruptedException {
		Thread.sleep(500);
		String gratuityPercentage = getDataFromExcel("Bill Configuration", 10, 1);
		pma.getRMS_SettingsPage_Configuration_POM().getGratuityPercentageTextBox()
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		pma.getRMS_SettingsPage_Configuration_POM().getGratuityPercentageTextBox().sendKeys(gratuityPercentage);
	}

	@Then("User should verify and Enter Gratuity eligibility #Excel Input Two")
	public void userShouldVerifyAndEnterGratuityEligibilityExcelInputExcelInputTwo()
			throws IOException, InterruptedException {
		Thread.sleep(500);
		String CheckboxOption = getDataFromExcel("Bill Configuration", 9, 1);
		if (CheckboxOption.equals("Guest Count")) {
			String countOfGuest = getDataFromExcel("Bill Configuration", 11, 1);
			pma.getRMS_SettingsPage_Configuration_POM().getGratuitywillbeAddedonBillwhenGuestCountReachesthisNoTextbox()
					.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			pma.getRMS_SettingsPage_Configuration_POM().getGratuitywillbeAddedonBillwhenGuestCountReachesthisNoTextbox()
					.sendKeys(countOfGuest);

		} else if (CheckboxOption.equals("Order Amount")) {Thread.sleep(500);
			String orderAmount = getDataFromExcel("Bill Configuration", 12, 1);
			pma.getRMS_SettingsPage_Configuration_POM()
					.getGratuitywillbeAddedonBillwhenSubtotalReachesthisAmountTextBox()
					.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			pma.getRMS_SettingsPage_Configuration_POM()
					.getGratuitywillbeAddedonBillwhenSubtotalReachesthisAmountTextBox().sendKeys(orderAmount);
		} else {
			Assert.assertTrue(false, "Invalid Comments");
		}
	}

	@Then("User should Enter the Gratuity tax percentage #Excel Input")
	public void userShouldEnterTheGratuityTaxPercentageExcelInput() throws InterruptedException, IOException {Thread.sleep(500);

		String gratFeeTxIntStr = getDataFromExcel("Bill Configuration", 13, 1);

		pma.getRMS_SettingsPage_Configuration_POM().getTaxtobeAppliedonGratuityAmountTextBox()
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		pma.getRMS_SettingsPage_Configuration_POM().getTaxtobeAppliedonGratuityAmountTextBox()
				.sendKeys(gratFeeTxIntStr);
	}

	@Then("User should enable or Disable the Apply gratuity on subtotal after deductions #Excel Input")
	public void userShouldEnableOrDisableTheApplyGratuityOnSubtotalAfterDeductionsExcelInput()
			throws InterruptedException, IOException {
//		String grdSubafterDeduct = getDataFromExcel("Bill Configuration", 16, 1);
//		System.out.println(grdSubafterDeduct);
//		if(grdSubafterDeduct.equals("ON")) {
//			if(pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle().getAttribute("value").equals("true")) {	
//			}else if (pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle().getAttribute("value").equals("false")) {
//				pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle1().click();
//			}
//		}else if (grdSubafterDeduct.equals("OFF")) {
//			if(pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle().getAttribute("value").equals("true")) {
//				pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle1().click();	
//			}else if (pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle().getAttribute("value").equals("false")) {
//			}
//		}else {
//			Assert.assertTrue(false, "Invalid State");
//		}
		Thread.sleep(500);
		String CheckboxOption = getDataFromExcel("Bill Configuration", 9, 1);
		if (CheckboxOption.equals("Guest Count")) {Thread.sleep(500);

			String grdSubafterDeduct = getDataFromExcel("Bill Configuration", 16, 1);
			if (grdSubafterDeduct.equals("ON")) {Thread.sleep(500);
				if (pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle1()
						.getAttribute("value").equals("true")) {Thread.sleep(500);
				} else if (pma.getRMS_SettingsPage_Configuration_POM()
						.getApplyGratuityontheSubtotalafterDeductionsToggle1().getAttribute("value").equals("false")) {
					pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle()
							.click();
				}
			} else if (grdSubafterDeduct.equals("OFF")) {Thread.sleep(500);
				if (pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle1()
						.getAttribute("value").equals("true")) {Thread.sleep(500);
					pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle()
							.click();
				} else if (pma.getRMS_SettingsPage_Configuration_POM()
						.getApplyGratuityontheSubtotalafterDeductionsToggle1().getAttribute("value").equals("false")) {
				}
			} else {
				Assert.assertTrue(false, "Invalid State");
			}

		} else if (CheckboxOption.equals("Order Amount")) {Thread.sleep(500);
			String grdSubafterDeduct = getDataFromExcel("Bill Configuration", 16, 1);
			if (grdSubafterDeduct.equals("ON")) {
				if (pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle2()
						.getAttribute("value").equals("true")) {Thread.sleep(500);
				} else if (pma.getRMS_SettingsPage_Configuration_POM()
						.getApplyGratuityontheSubtotalafterDeductionsToggle2().getAttribute("value").equals("false")) {
					pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle()
							.click();
				}
			} else if (grdSubafterDeduct.equals("OFF")) {Thread.sleep(500);
				if (pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle2()
						.getAttribute("value").equals("true")) {Thread.sleep(500);
					pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle()
							.click();
				} else if (pma.getRMS_SettingsPage_Configuration_POM()
						.getApplyGratuityontheSubtotalafterDeductionsToggle2().getAttribute("value").equals("false")) {Thread.sleep(500);
				}
			} else {
				Assert.assertTrue(false, "Invalid State");
			}

		} else {
			Assert.assertTrue(false, "Invalid Comments");
		}

	}

	@Then("User should click save button in Gratuity configuration page")
	public void userShouldClickSaveButtonInGratuityConfigurationPage() throws InterruptedException {
		Thread.sleep(1000);
		pma.getRMS_SettingsPage_Configuration_POM().getGratuityConfigurationSaveButton().click();Thread.sleep(500);
	}
	
	@Then("User should add the Payment settings of an Order")
	public void userShouldAddThePaymentSettingsOfAnOrder() throws InterruptedException, IOException {
		Thread.sleep(500);
		pma.getRMS_SettingsPage_Configuration_POM().getPaymentSettingsSection().click();
		Thread.sleep(500);
		String dataFromExcel = getDataFromExcel("Bill Configuration", 17, 1);
		if (dataFromExcel.equals("Prepaid")) {
			if (pma.getRMS_SettingsPage_Configuration_POM().getPaymentModeCheckBox1Satus().getAttribute("value").equals("true")) {
				
			} else if (pma.getRMS_SettingsPage_Configuration_POM().getPaymentModeCheckBox1Satus().getAttribute("value").equals("false")) {
				pma.getRMS_SettingsPage_Configuration_POM().getPaymentModeCheckBox().click();
			}else {
				System.out.println("Invalid State");
			}			
		} else if (dataFromExcel.equals("Postpaid")) {
			if (pma.getRMS_SettingsPage_Configuration_POM().getPaymentModeCheckBox1Satus().getAttribute("value").equals("true")) {
				pma.getRMS_SettingsPage_Configuration_POM().getPaymentModeCheckBox().click();
			} else if (pma.getRMS_SettingsPage_Configuration_POM().getPaymentModeCheckBox1Satus().getAttribute("value").equals("false")) {
			}else {
				System.out.println("Invalid State");
			}
		}else {
			System.out.println("Invalid State");
		}
		try {
			pma.getRMS_SettingsPage_Configuration_POM().getPaymentsettingsPageSaveBtn().click();	
		} catch (Exception e) {
			Assert.assertTrue(pma.getRMS_SettingsPage_Configuration_POM().getPaymentsettingsPageDisabledSaveBtn().isDisplayed());
		}
		
		
	}
	

}

//23-03-23	17:46
