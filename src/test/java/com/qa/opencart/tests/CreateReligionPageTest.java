package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateReligionPageTest extends BaseTest {

	@BeforeClass
	public void test() {
		SheetName="OMAcademicyear";
		SheetNo="Sheet7";
		}
		
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new religion....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createnewreligion(String sreligionname, String sreligioncode) throws InterruptedException {
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		dashboardPage.dashboard();
		othermasterpage.createreligion(sreligionname, sreligioncode);
	}
}
