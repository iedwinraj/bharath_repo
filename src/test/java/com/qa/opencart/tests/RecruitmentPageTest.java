package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;



public class RecruitmentPageTest extends BaseTest{
	
	@BeforeClass
	public void test() {
		SheetName="TC001_01";
		
	}
	
	
	@Test(invocationCount = 1 ,dataProvider="getdata" )
	@Description("Select administration Organization menu  ...")
	@Severity(SeverityLevel.BLOCKER)
	
	public void create(String Vacancy)
	{
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		recruitmentpage.click();
		
		recruitmentpage.create(Vacancy);
	}
	
	

}
