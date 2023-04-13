package com.base;

import java.text.DecimalFormat;
import java.util.List;

public class CalculationsFile extends BaseClass{
	
	private float subtotalAfterApplyingDiscountWOExcludeItems(List<Float> menus,float discPercentage) {
		
		float discountAmtOfMenu,subTotalAfterDiscount=0,discountAmt=0,MenuAfterDiscount;
		for (int i = 0; i < menus.size(); i++) {
			Float menuItem = menus.get(i);
			discountAmtOfMenu=(menuItem*discPercentage/100);
			MenuAfterDiscount=(menuItem-discountAmtOfMenu);
			discountAmt=(discountAmt+discountAmtOfMenu);
			subTotalAfterDiscount=(subTotalAfterDiscount+MenuAfterDiscount);
		}
		DecimalFormat df = new DecimalFormat("#.##");
		float discountAmt1 = Float.valueOf(df.format(discountAmt));
		return discountAmt1;
	}
	private float roundFloatValue(float val) {
		DecimalFormat df = new DecimalFormat("#.##");
		float roundedVal = Float.valueOf(df.format(val));
		return roundedVal;
	}
	private float salesTax(float subTotal,float salTaxPercentage) {
		float salesTax=(subTotal*salTaxPercentage/100);
		float roundedValue = roundFloatValue(salesTax);
		return roundedValue;
	}
	private float serviceFee(float subTotal,float serFeePercentage) {
		float serviceFee=(subTotal*serFeePercentage/100);
		float roundedValue = roundFloatValue(serviceFee);
		return roundedValue;
	}
	private float serviceFeeTax(float SalesTax,float serFeeTxPercentage) {
		float serviceFeeTax=(SalesTax*serFeeTxPercentage/100);
		float roundedValue = roundFloatValue(serviceFeeTax);
		return roundedValue;
	}
	private float gratuity(float SubTotal,float gratuityPercentage) {
		float gratuity=(SubTotal*gratuityPercentage/100);
		float roundedValue = roundFloatValue(gratuity);
		return roundedValue;
	}
	private float gratuityTax(float gratuity,float gratuityTaxPercentage) {
		float gratuityTax=(gratuity*gratuityTaxPercentage/100);
		float roundedValue = roundFloatValue(gratuityTax);
		return roundedValue;
	}
//		System.out.println(cf.salesTax((float)10.918,(float) 100.00));
}
