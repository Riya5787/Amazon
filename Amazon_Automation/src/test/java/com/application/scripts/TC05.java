package com.application.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.objectRepository.CommonPage;
import com.objectRepository.SearchResPage;
import com.utilities.Xls_Reader;

@Test
public class TC05 extends CommonPage { 
	
	//Create object for excel sheet
		Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
		SearchResPage sp = new SearchResPage();
	
	public void testTC05() throws Throwable {
	
	isElementPresent(txtSearch, "Search textbox");
	String strProduct  = reader.getCellData("Search", "PRODUCT_NAME", 3);
	type(txtSearch, strProduct, "Search textbox");
	Thread.sleep(2000);
	click(btnSearch, "Search button");

	Thread.sleep(2000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	driver.findElement(By.className("s-image")).click();
	//driver.findElement(By.className("_multi-card-creative-desktop_Image_image__1pfbQ")).click();
	Thread.sleep(2000);
	//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		//Thread.sleep(3000);
	//driver.findElement(By.className("style__button__1MgdH style__addToCart__9TqqV style__beacon__2ECwE ProductGridItem__addToCartBtn__2nB4J style__small__1WMMU style__disableInternalPointerEvents__1ECVO")).click();	
	Thread.sleep(3000);
	click(btnCART, "Add to cart");
	Thread.sleep(6000);
	System.out.println("Before click");

    driver.findElement(By.id("a-autoid-9")).click();
    System.out.println("after Click");
	Thread.sleep(6000);
	driver.findElement(By.id("nav-cart")).click();
	Thread.sleep(6000);

    this.takeSnapShot(driver, "c://test.png") ;
    Thread.sleep(5000);
	
	
	
}

	private void takeSnapShot(EventFiringWebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
}


