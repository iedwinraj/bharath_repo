package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateEnquiryFollowupModePageTest extends BaseTest {

	@BeforeClass
	public void test() {
		SheetName="OtherMaster2";
		SheetNo="Sheet3";
		}
		
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new Enquiry Followup Mode....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createnewenquirysouce(String senquirymodename) throws InterruptedException {
		
	loginPage=loginPage.selectdb();
	loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
	dashboardPage.dashboard();
	othermasterpage.createeenquirymode(senquirymodename);
	}
}
