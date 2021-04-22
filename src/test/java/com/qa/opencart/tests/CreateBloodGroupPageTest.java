package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateBloodGroupPageTest extends BaseTest {

	@BeforeClass
	public void test() {
		SheetName="OMAcademicyear";
		SheetNo="Sheet10";
		}
		
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new Blood Group....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createnewbloodgroup(String sbloodgroupname) throws InterruptedException {
	
	loginPage=loginPage.selectdb();
	loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
	dashboardPage.dashboard();
	othermasterpage.createbloodgroup(sbloodgroupname);
	}

}
