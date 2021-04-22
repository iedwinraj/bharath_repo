package com.qa.opencart.tests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateEnquiryEntryPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		SheetName="EnquiryEntry";
		SheetNo="Sheet1";
		
	}
	
	@Test(invocationCount = 1  ,dataProvider="getdata" )
	@Description("Select administration Organization menu  ...")
	@Severity(SeverityLevel.BLOCKER)	
	
	public void createenquiryentry(String ayear,String sname,String sdob, String sgrade,String smobile, String semail,String spostcode,String slastschool,String sfathername,String smothername,String slocalno,String sotherdetail, String senquirysource,String sstatus,String sremarks,String sremainder) throws InterruptedException {
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		studentlifecyclepage.studentlifecyclepageclick();
		studentlifecyclepage.enquiryentryclick();
		studentlifecyclepage.enquirysubmenuclick();
		studentlifecyclepage.createenquiry();
		createenquiryentry.details(ayear, sname, sdob, sgrade, smobile, semail, spostcode, slastschool, sfathername, smothername, slocalno, sotherdetail, senquirysource, sstatus, sremarks, sremainder);
	}
	
}
