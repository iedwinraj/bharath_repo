package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ImportEnquiryEntryPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		SheetName = "EnquiryEntry";
		SheetNo="Sheet4";
	}
	@Test(invocationCount = 1  ,dataProvider="getdata" )
	@Description("Import/Export enquiry entry.....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void importdata(String ayear, String sfilepath) {
		loginPage.selectdb();
		loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		studentlifecyclepage.studentlifecyclepageclick();
		studentlifecyclepage.enquiryentryclick();
		importexportenquiryentrypage.importdetails(ayear, sfilepath);
	}
}
