package com.qa.opencart.tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class AdministrationPageTest extends BaseTest {
	@Test(invocationCount=3)
	@Description("Select administration menu --> Organization  ...")
	@Severity(SeverityLevel.BLOCKER)
	
	public void organizationmenu()
	{
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		dashboardPage.dashboard();
			
		administrationPage.organization();
		
	}
}
