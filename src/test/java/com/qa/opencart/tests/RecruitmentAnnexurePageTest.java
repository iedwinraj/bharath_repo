package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class RecruitmentAnnexurePageTest extends BaseTest{
	
	@BeforeClass
	public void test() {
		SheetName="Annexuredetails";
		SheetNo="Sheet1";
		}
		
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new recruitment annexure....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createnewannexure(String sschoolname,String sename,String sdesignation,String sadd1,String sadd2,String scity,String sstate,String szip,String scountry,String sdob,String semail,String sdoj,String scperson,String stype,String scemail,String sbasic,String shra,String scca,String sca,String sma,String spf,String sesi,String sgrosssalary,String sretirebenefit,String scti) throws InterruptedException {
		
	loginPage=loginPage.selectdb();
	loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
	dashboardPage.dashboard();
	recruitmentpage.click();
	recruitmentannexure.createannexure(sschoolname, sename, sdesignation, sadd1, sadd2, scity, sstate, szip, scountry, sdob, semail, sdoj, scperson, stype, scemail, sbasic, shra, scca, sca, sma, spf, sesi, sgrosssalary, sretirebenefit, scti);
	
	}

}
