package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ConsultantFeedbackPageTest extends BaseTest{

	
	@BeforeClass
	public void test() {
		SheetName="Consultant";
		SheetNo="Sheet1";
		}
		
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new recruitment annexure....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createconsultantfeedback(String sschoolname,String scandidatename,String scandidateemail,String sinterviewdate,String sinterviewtime,String sgender,String sfeedback,String sattachment) throws InterruptedException {
		
	loginPage=loginPage.selectdb();
	loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
	dashboardPage.dashboard();
	recruitmentpage.click();
	consultantfeedback.createfeedback(sschoolname, scandidatename, scandidateemail, sinterviewdate, sinterviewtime, sgender, sfeedback, sattachment);
}
}
