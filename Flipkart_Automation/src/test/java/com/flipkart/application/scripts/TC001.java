package com.flipkart.application.scripts;

import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class TC001 extends CommonPage{
	
	
	@Test
	public void testverifyAccessSite() throws Throwable
	{
		boolean bFlag =false;
		
		try {
			
			isElementPresent(Logo, "Flipkart logo image"); // Check logo is dislayed or not
			String src = driver.findElement(Logo).getAttribute("src");
			// Verify image is clickable or not
			if (src!="") {
				SuccessReport("Verify Logo Clickable", "Flipkart logo image is clickable");
			} else {
				failureReport("Verify Logo Clickable", "Flipkart logo image is not clickable");
			}
			bFlag =true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			failureReport("Verify Logo", "Flipkart logo image is not displayed since - " + e.getMessage());
		}
		finally
		{
			if (bFlag) {
				SuccessReport("Access 'Flipkart' site", "Successfully accessed Flipkart site");
			} else {
				failureReport("Access 'Flipkart' site", "Failed to access Flipkart site");
			}
		}
	}
	

}
