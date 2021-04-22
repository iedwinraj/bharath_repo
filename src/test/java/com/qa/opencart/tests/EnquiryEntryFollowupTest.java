package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class EnquiryEntryFollowupTest extends BaseTest{
	@BeforeClass
	public void test() {
		SheetName="EnquiryEntry";
		SheetNo="Sheet2";
		
	}
	
	@Test(invocationCount = 1  ,dataProvider="getdata" )
	@Description("Select administration Organization menu  ...")
	@Severity(SeverityLevel.BLOCKER)
	
	public void enquiryfollowup(String sstatus, String sremarks, String sfollowedon) throws InterruptedException
	{
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		  
		  //dashboardPage.dashboard();
		  studentlifecyclepage.studentlifecyclepageclick();
			
			  studentlifecyclepage.enquiryentryclick();
			  studentlifecyclepage.enquiryentryfollowup();
			  enquiryentryfollowup.createenquiryfollowup();
			  enquiryentryfollowup.enterdetails(sstatus, sremarks, sfollowedon);		  
	}

}
