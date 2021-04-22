package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateShiftPageTest extends BaseTest{
	
	@BeforeClass
	public void test() {
		SheetName="OMAcademicyear";
		SheetNo="Sheet2";
	}
	
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new shift....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createshift(String sshiftname, String sshiftid) throws InterruptedException {
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		dashboardPage.dashboard();
		othermasterpage.createshift(sshiftname, sshiftid);

	}
	

}
