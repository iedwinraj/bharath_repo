package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.AdministrationPage;
import com.qa.opencart.pages.AdmissionEmail;
import com.qa.opencart.pages.AdmissionPage;
import com.qa.opencart.pages.ConsultantFeedback;
import com.qa.opencart.pages.CreateEnquiryEntry;
import com.qa.opencart.pages.DashboardPage;
import com.qa.opencart.pages.EnquiryEntryFollowup;
import com.qa.opencart.pages.ImportExportEnquiryEntryPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.OrganizationPage;
import com.qa.opencart.pages.OtherMastersPage;
import com.qa.opencart.pages.ParentEmailFormPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.RecruitmentAnnexure;
import com.qa.opencart.pages.RecruitmentPage;
import com.qa.opencart.pages.RecruitmentRequestPage;
import com.qa.opencart.pages.RecruitmentRequestReplacepage;
import com.qa.opencart.pages.RegisterPage;
import com.qa.opencart.pages.StudentLifeCyclePage;
import com.qa.opencart.utils.ExcelUtil;

public class BaseTest {
	
	DriverFactory df;
	public Properties prop;
	WebDriver driver;
	public LoginPage loginPage;
	public AccountsPage accountsPage;
	public ProductInfoPage productInfoPage;
	public RegisterPage registerPage;
	public DashboardPage dashboardPage;
	public AdministrationPage administrationPage;
	public OrganizationPage organizationPage;
	public StudentLifeCyclePage studentlifecyclepage;
	public CreateEnquiryEntry createenquiryentry;
	public EnquiryEntryFollowup enquiryentryfollowup;
	public RecruitmentPage recruitmentpage;
	public RecruitmentRequestPage recruitmentrequestpage;
	public RecruitmentRequestReplacepage recruitmentrequestreplacepage;
	public AdmissionPage admissionpage;
	public ImportExportEnquiryEntryPage importexportenquiryentrypage; 
	public AdmissionEmail admissionemail;
	public ParentEmailFormPage parentemailformpage;
	public OtherMastersPage othermasterpage;
	public RecruitmentAnnexure recruitmentannexure;
	public ConsultantFeedback consultantfeedback;
		
	public String SheetName;
	public String SheetNo;


	@Parameters({"browser", "version"})
	@BeforeTest
	public void setUp(String browserName, String browserVersion) {
		df = new DriverFactory();
		prop = df.init_prop("config.properties");
	
		String browser = prop.getProperty("browser");
		
		if(browserName !=null) {
			browser = browserName;
		}
		
		
		driver = df.init_driver(browser, browserVersion);
		driver.get(prop.getProperty("url"));
		loginPage = new LoginPage(driver);
		accountsPage = new AccountsPage(driver);
		dashboardPage = new DashboardPage(driver);
		administrationPage = new AdministrationPage(driver);
		organizationPage = new OrganizationPage(driver);
		studentlifecyclepage = new StudentLifeCyclePage(driver);
		createenquiryentry = new CreateEnquiryEntry(driver);
		enquiryentryfollowup = new EnquiryEntryFollowup(driver);
		recruitmentpage = new RecruitmentPage(driver);
		recruitmentrequestpage = new RecruitmentRequestPage(driver);
		recruitmentrequestreplacepage = new RecruitmentRequestReplacepage(driver);
		admissionpage = new AdmissionPage(driver);
		importexportenquiryentrypage = new ImportExportEnquiryEntryPage(driver);
		admissionemail=new AdmissionEmail(driver);
		parentemailformpage = new ParentEmailFormPage(driver);
		othermasterpage=new OtherMastersPage(driver);
		recruitmentannexure = new RecruitmentAnnexure(driver);
		consultantfeedback = new ConsultantFeedback(driver);
		
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
	
	@DataProvider(name="getdata")
	
	public Object [][] getData(){
		return ExcelUtil.getTestData(SheetName,SheetNo);
		
	}
	
	
	

}
