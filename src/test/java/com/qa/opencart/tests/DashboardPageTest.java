package com.qa.opencart.tests;

import org.testng.annotations.Test;


import com.qa.opencart.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class DashboardPageTest extends BaseTest {

	@Test
	@Description("Select administration menu ...")
	@Severity(SeverityLevel.BLOCKER)
	public void Selectadministrationmenu() {
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		dashboardPage.dashboard();
		 
		/*
		 * loginPage=loginPage.selectdb();
		 * loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		 * 
		 * loginPage.selectdb(); accountsPage =
		 * loginPage.doLogin(prop.getProperty("username"),
		 * prop.getProperty("password"));
		 * //Assert.assertEquals(accountsPage.getAccountsPageTitle(),
		 * Constants.ACCOUNTS_PAGE_TITLE); loginPage.login("erpadmin@harishree.org");
		 */
	}
}
