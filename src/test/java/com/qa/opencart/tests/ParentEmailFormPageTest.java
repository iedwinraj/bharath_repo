package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ParentEmailFormPageTest extends BaseTest{
	@BeforeClass
	public void test() {
		SheetName="AdmissionEmail";
		SheetNo="Sheet2";
		
	}
	
	@Test(invocationCount = 1  ,dataProvider="getdata"  )
	@Description("Select administration Organization menu  ...")
	@Severity(SeverityLevel.BLOCKER)
	
	public void parentemail(String ayear,String semailtype,String  sdate,String stime,String senquiryid) throws InterruptedException {
		
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		studentlifecyclepage.studentlifecyclepageclick();
		parentemailformpage.createemail(ayear, semailtype, sdate, stime, senquiryid);
		
		
	}
	

}
