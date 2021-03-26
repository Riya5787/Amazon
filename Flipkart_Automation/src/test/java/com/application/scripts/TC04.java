package com.application.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectRepository.CommonPage;
import com.objectRepository.SearchResPage;
import com.utilities.Xls_Reader;

public class TC04 extends CommonPage{
	
	//Create object for excel sheet
	Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
	SearchResPage sp = new SearchResPage();

	@Test
	public void testTC04() throws Throwable {
		
		isElementPresent(txtSearch, "Search textbox");
		String strWatermark  = reader.getCellData("Search", "WATERMARK", 2);
		String strProduct  = reader.getCellData("Search", "PRODUCT_NAME", 2);
		String strActualWatermark = driver.findElement(txtSearch).getAttribute("title");
		if (strActualWatermark.equals(strWatermark)) {
			SuccessReport("Verify Search text field Watermark", "Watermark in search text field is displayed as  : " + strActualWatermark);
		} else {
			failureReport("Verify Search text field Watermark", "Expected Watermark - " +strWatermark+ " in search text field is not macthing with the actual watermark : " + strActualWatermark);
		}
		// Enter the product in Search text field
		type(txtSearch, strProduct, "Search textbox");
		Thread.sleep(3000);
		click(btnSearch, "Search button");
		waitForVisibilityOfElement(sp.lnkHome, "Home");
		String strTitle = driver.getTitle();
		if (strTitle.toLowerCase().contains(strProduct.toLowerCase())) {
			SuccessReport("Verify Search results page title", "Appropriate title is displayed in the search results page for the search criteria : " + strProduct);
		}else {
			failureReport("Verify Search results page title", "Appropriate title is not displayed in the search results page for the search criteria : " + strProduct);
		}

		
	}
	
}
