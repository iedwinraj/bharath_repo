package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateCommunityPageTest extends BaseTest {

	@BeforeClass
	public void test() {
		SheetName="OMAcademicyear";
		SheetNo="Sheet8";
		}
		
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new Community....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createnewcommunity(String scommunityname, String scommunitycode) throws InterruptedException {
	
	loginPage=loginPage.selectdb();
	loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
	dashboardPage.dashboard();
	othermasterpage.createcommunity(scommunityname, scommunitycode);
	}
}
