package com.qa.opencart.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class AdmissionEmailPageTest extends BaseTest{
	@BeforeClass
	public void test() {
		SheetName="AdmissionEmail";
		SheetNo="Sheet1";
	}
	@Test(invocationCount = 1  ,dataProvider="getdata"  )
	@Description("Select administration Organization menu  ...")
	@Severity(SeverityLevel.BLOCKER)
	public void admissionemail(String ssubject, String sby,String sfrom,String sto,String  stopartners,String  scc,String  sbody) throws InterruptedException {
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		studentlifecyclepage.studentlifecyclepageclick();
		admissionemail.createemail(ssubject, sby, sfrom, sto, stopartners, scc, sbody);
		}

}
