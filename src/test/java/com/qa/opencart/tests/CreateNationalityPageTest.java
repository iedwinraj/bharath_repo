package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateNationalityPageTest extends BaseTest {

	@BeforeClass
	public void test() {
		SheetName="OMAcademicyear";
		SheetNo="Sheet9";
		}
		
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new nationality....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createnewcommunity(String snationalityname, String snationalitycode) throws InterruptedException {
	
	loginPage=loginPage.selectdb();
	loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
	dashboardPage.dashboard();
	othermasterpage.createnationality(snationalityname, snationalitycode);
	}

}
