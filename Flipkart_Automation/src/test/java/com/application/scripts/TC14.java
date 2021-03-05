package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.CommonPage;
import com.objectRepository.SearchResPage;
import com.utilities.Xls_Reader;

public class TC14 extends CommonPage{

	//Create object for excel sheet
	Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
	SearchResPage sp = new SearchResPage();

	@Test
	public void testTC14() throws Throwable 
	{
		boolean bFlag = false;
		try {
			String txtSearchTerm = reader.getCellData("Product", "Product_Name", 2);
			type(txtSearch, txtSearchTerm, "Search textbox");
			click(btnSearch, "Search button");

			String strResultsHeader = driver.findElement(sp.strHeading).getText();
			
			// Check for the display of product name in the search results header
			if (strResultsHeader.trim().contains(txtSearchTerm)) {
				SuccessReport("Verify the product name in the results heading", "Product name is displayed in the results heading");
			} else {
				failureReport("Verify the product name in the results heading", "Product name is not displayed in the results heading");
			}
			bFlag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				SuccessReport("Search Product", "Succcessfully searhed the product");
			}
			else 
			{
				failureReport("Search Product", "Failed to search the product");
			}

		}
	}
}


