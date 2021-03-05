package com.flipkart.application.scripts;

import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class TC002 extends CommonPage{
		
	/**
	 * @Desc Verify the display of Flipkart Logo Image
	 * @Input NA
	 * @Output NA
	 * @author NARESH
	 * @Date Created
	 * @throws Throwable
	 */
	@Test
	public void testverifyAccessSite() throws Throwable
	{
		boolean bFlag =false;
		
		try {
			
			boolean blnLogo = isElementDisplayed(driver.findElement(Logo));
			if (blnLogo) {
				SuccessReport("Verify Logo Display", "Flipkart logo is displayed");
			} else {
				SuccessReport("Verify Logo Display", "Flipkart logo is not displayed");
			}
			// Verify logo clickable
			isclickable(Logo, "Flipkart Logo");
			
			String strLogoText = getText(LogoText, "Logo Text");
			
			if (strLogoText.contains("Explore")) {
				SuccessReport("Verify Logo Text", "Logo text is displayed as - " + strLogoText);
			} else {
				failureReport("Verify Logo Text", "Logo text is displayed as - " + strLogoText);
			}
			
			String strTooltip = getAttribute(Logo, "title", "Flipkart Logo Tooltip");
			if (strTooltip.contains("Flipkart")) {
				SuccessReport("Verify Tooltip", "Successfully verified the tooltip - " + strTooltip);
			} else {
				failureReport("Verify Tooltip", "Failed to verify the tooltip - " + strTooltip);
			}
			
			bFlag =true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally
		{
			if (bFlag) {
				SuccessReport("Verify Flipkart Logo", "Successsfully verified the Flipkart Logo");
			} else {
				failureReport("Verify Flipkart Logo", "Failed to verify the Flipkart Logo");
			}
		}
		
	}

}
