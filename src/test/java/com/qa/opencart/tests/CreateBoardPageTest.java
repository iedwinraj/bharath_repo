package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateBoardPageTest extends BaseTest{
	
	@BeforeClass
	public void test() {
		SheetName="OMAcademicyear";
		SheetNo="Sheet4";
	}
	
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new board....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createshift(String sschoolname, String sname, String scode) throws InterruptedException {
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		dashboardPage.dashboard();
		othermasterpage.createboard(sschoolname, sname, scode);

	}
	

}
