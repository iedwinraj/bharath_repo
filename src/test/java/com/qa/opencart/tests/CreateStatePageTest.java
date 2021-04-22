package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateStatePageTest extends BaseTest{
	
	@BeforeClass
	public void test() {
		SheetName="OMAcademicyear";
		SheetNo="Sheet5";
		
	}
	
	
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new state....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createshift(String sstatename, String scountry, String sstatecode, String sstatecallingcode) throws InterruptedException {
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		dashboardPage.dashboard();
		othermasterpage.createstate(sstatename, scountry, sstatecode, sstatecallingcode);

	}
	

}
