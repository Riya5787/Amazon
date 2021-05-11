package com.application.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectRepository.CommonPage;
import com.objectRepository.SearchResPage;
import com.utilities.Xls_Reader;

public class TC06 extends CommonPage{

	//Create object for excel sheet
			Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
			SearchResPage sp = new SearchResPage();
			
			@Test
			public void testTC06() throws Throwable {
				click(Account, "open account");
				Thread.sleep(2000);
				click(AmazonAc, "open new account");
				Thread.sleep(2000);
				isElementPresent(Name, "Write your name");
				String strName  = reader.getCellData("Account", "Personal_Information", 2);
				type(Name, strName, "Write your name");
				Thread.sleep(2000);
				isElementPresent(Email, "Write your email");
				String strEmail  = reader.getCellData("Account", "Personal_Information", 3);
				type(Email, strEmail, "Write your email");
				Thread.sleep(2000);
				isElementPresent(Password, "Write your password");
				String strPassword  = reader.getCellData("Account", "Personal_Information", 4);
				type(Password, strPassword, "Write your password");
				Thread.sleep(2000);
				isElementPresent(Repassword, "Write your password again");
				String strRepassword  = reader.getCellData("Account", "Personal_Information", 5);
				type(Repassword, strRepassword, "Write your password again");
				Thread.sleep(2000);
				click(Create, "Account is open");
				Thread.sleep(2000);
				
			}
			
			}

