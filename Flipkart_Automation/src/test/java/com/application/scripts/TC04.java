package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.CommonPage;
import com.utilities.Xls_Reader;

public class TC04 extends CommonPage{
	
	//Create object for excel sheet
	Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
		

	@Test
	public void testTC04() throws Throwable {
		
		isElementPresent(txtSearch, "Search textbox");
		String strWatermark  = reader.getCellData("Search", "WATERMARK", 2);
		String strActualWatermark = driver.findElement(txtSearch).getAttribute("title");
		if (strActualWatermark.equals(strWatermark)) {
			SuccessReport("Verify Search text field Watermark", "Watermark in search text field is displayed as  : " + strActualWatermark);
		} else {
			failureReport("Verify Search text field Watermark", "Expected Watermark - " +strWatermark+ " in search text field is not macthing with the actual watermark : " + strActualWatermark);
		}
		
	}
	
}
