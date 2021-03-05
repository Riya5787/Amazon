package com.application.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectRepository.CommonPage;
import com.utilities.Xls_Reader;

public class TC16 extends CommonPage{

	//Create object for excel sheet
	Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
	
	
	@Test
	public void testSearchProduct() throws Throwable
	{
		String searchterm = reader.getCellData("Sheet1", "SearchTerm", 2);
		isElementPresent(txtSearch, "Search textbox");
		driver.findElement(txtSearch).sendKeys(searchterm);
		type(txtSearch, searchterm, "Search textbox");
		isElementPresent(btnSearch, "Search button");
		click(btnSearch, "Search button");
		
	}
}
