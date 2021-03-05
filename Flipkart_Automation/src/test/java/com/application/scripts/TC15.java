package com.application.scripts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.objectRepository.CommonPage;
import com.objectRepository.SearchResPage;
import com.utilities.Xls_Reader;

public class TC15 extends CommonPage{

	
	//Create object for excel sheet
	Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
	SearchResPage sp = new SearchResPage();
	
	
	@Test
	public void testTC15() throws Throwable
	{
		type(txtSearch, reader.getCellData("Product", "Product_Name", 2), "Product Name");
		click(btnSearch, "Search button");
		List<WebElement> strFilters = driver.findElements(sp.filters);
		System.out.println(strFilters.size());
		
		for (int i = 0; i < strFilters.size(); i++) {
			String strFilter = strFilters.get(i).getText();
			if (strFilter!="") 
			{
				SuccessReport("Verify Filter", "Successfully verified the filter - " + strFilter);
			}
			else
			{
				failureReport("Verify Filter", "Failed to verify the filter - " + strFilter);
			}
		}
		
		
		
		
	}

}
