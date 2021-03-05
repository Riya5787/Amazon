package com.application.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.objectRepository.CommonPage;
import com.utilities.Xls_Reader;

public class TC13 extends CommonPage{

	Xls_Reader data = new Xls_Reader("TestData/Data.xlsx");
	String strProduct = data.getCellData("Product", "Product_Name", 2);


	/**
	 * @Method testAddToCart
	 * @Description Adds the product to the cart
	 * @Input Product Name
	 * @Output
	 * @author NareshBabu
	 * @throws Throwable
	 */
	@Test
	public void testAddToCart() throws Throwable 
	{
		boolean bFlag = false;
		String temp = null;
	
		
		try {
			type(txtSearch, strProduct, "Search textbox");
			click(btnSearch, "Search button");
			String strPageTitle = driver.getTitle();
					
			if (strPageTitle.toUpperCase().contains(strPageTitle.toUpperCase())) {
				SuccessReport("Verify Page Title", "Product name is displayed in the page title : " + strPageTitle);
				bFlag =true;
			} else {
				failureReport("Verify Page Title", "Product name is not displayed in the page title");
			}
			
			List<WebElement> ProductPrices = driver.findElements(By.className("_1vC4OE"));
			
			for (int i = 0; i < ProductPrices.size(); i++) {
				String Price =  ProductPrices.get(i).getText().substring(1, ProductPrices.get(i).getText().length());
				temp = temp + Price + ";";
				//SuccessReport("Verify Product Price", "Product Price is displayed as - " + Price);
			}
			
			String Prices = temp;
			//Sort the Prices
			
		}
		finally {
			if (bFlag) {
				SuccessReport("Add Product to the Cart", "Successfully added the product to the Cart");
			} else {
				failureReport("Add Product to the Cart", "Failed to add the product to the Cart");
			}
		}
	}

}
