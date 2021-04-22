package com.qa.opencart.tests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateDistrictPageTest extends BaseTest {
	@BeforeClass
	public void test() {
		SheetName="OMAcademicyear";
		SheetNo="Sheet6";
		
	}
	
	
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new district....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createdistrict(String sdistrictname, String sdisctrictcode, String sdistrictstate, String scountry) throws Exception {
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		dashboardPage.dashboard();
		othermasterpage.createdistrict(sdistrictname, sdisctrictcode, sdistrictstate, scountry);
	}
	

}
