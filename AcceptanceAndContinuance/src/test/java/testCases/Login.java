package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public static WebDriver driver;
	private String verifytext;
	private String price;


	@Given("Launch the Browser")
	public void LaunchtheBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver =new ChromeDriver();

	}
	@And("Navigate to the URL")
	public void NavigatetotheURL(){
		driver.get("https://qmat.axis.deloitte.com/");
	}

	@And("Maximise the Browser")
	public void MaximisetheBrowser(){
		driver.manage().window().maximize();	
	}
	@And("Set the timeout")
	public void Setthetimeout(){
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@And("Click on the qauth link") 
	public void Clickontheqauthlink(){
		driver.findElement(By.xpath("(//span[@class='largeTextNoWrap indentNonCollapsible'])[1]")).click();
	}

	@And("Enter username as (.*)")
	public void Enterusername(String uName){
		driver.findElement(By.id("userNameInput")).sendKeys(uName);
	}
	@And("Enter password as (.*)")
	public void Enterpassword(String pName){
		driver.findElement(By.id("passwordInput")).sendKeys(pName);
	}

	@When("Click submit button") 
	public void Clicksubmitbutton(){
		driver.findElement(By.id("submitButton")).click();
	}
	@Then("User landed to home page")
	public void Userlandedtohomepage(){
		verifytext = driver.findElement(By.xpath("//h4[@class='client-initiate-title']")).getText();
		if(verifytext.equals(verifytext)){
			System.out.println(verifytext);
		}else{
			System.out.println("Fail");
		}

	}

	//@And("Click on Search client")
	//public void ClickonSearchclient(){
	//	driver.findElement(By.xpath("(//div[@class='typeahead_block']/input)[1]")).click();
	//}
	@When("Enter Client Name as (.*)")
	public void EnterClientName(String cName){
		driver.findElement(By.xpath("(//div[@class='typeahead_block']/input)[1]")).sendKeys(cName);
	}

	@Then("Click on client")
	public void Clickonclient() throws InterruptedException{
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='result_item ng-scope']")).click();
	}

	@And("Click on Manage Engagement Data")
	public void ClickonManageEngagementData() throws InterruptedException{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver ;
		jse.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("(//span[@class='sp-process'])[7]")).click();
	}
	@And("Select Client Fiscal Year")
	public void SelectClientFiscalYear() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='2019'])[1]")).click();
	}
	@And("Click on Create New")
	public void ClickonCreateNew() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span > a > strong:nth-child(2)")).click();
	}
	@And("Click on Create new MAT pricing profile")
	public void ClickonCreatenewMATpricingprofile() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sp_flyout_menu_item'])[2]")).click();
	}
	@And("click on Begin button")
	public void clickonBeginbutton() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[1]")).click();
	}
	@When("Click on continue button of Warning popup")
	public void ClickoncontinuebuttonofWarningpopup(){
		driver.findElement(By.xpath("(//button[@class='btn btn-success pull-right ng-binding'])[1]")).click();
	}
	@Then("Landed on Mat Pricing")
	public void LandedonMatPricing(){
		price = driver.findElement(By.xpath("(//div[@class='b-profile-filter-table-cell ng-scope'])[1]")).getText();
		if(price.equals(price)){
			System.out.println(price);
		}else{
			System.out.println("Fail");
		}
	}


	//@And("close the browser")
	//public void closethebrowser(){
	//	driver.close();
	//}



	@And("Enter MAT Pricing Profile Name as(.*)")
	public void EnterMATPricingProfileName(String ppname){
		driver.findElement(By.xpath("(//div[@class='control_input_wrapper']/input)[1]")).sendKeys(ppname);
	}

	@And("Click Audit n Other Attest Services")
	public void ClickAuditnOtherAttestServices() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(" div.field-items > div > label:nth-child(2)")).click();

	}

	@And("Select MAT calender")
	public void SelectMATcalender() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.ng-scope.required.ispopulated > div > input")).click();
	}
	@And("Click on Next icon")
	public void ClickonNexticon() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.datepicker-days > table > thead > tr:nth-child(1) > th.next")).click();
	}
	@And("Click on date")
	public void Clickondate() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(4)")).click();
	}

@And("Click on MAT Profile")
public void ClickonMATProfile() throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div.tooltip-placeholder > div > button")).click();
	
}
@And("Select MAT Main Profile Location")
public void SelectMATMainProfileLocation() throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div.tooltip-placeholder > div > div > ul > li:nth-child(8) > a > span")).click();
}

@And("Click on Save")
public void ClickonSave() throws InterruptedException{
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, -500);");
	driver.findElement(By.cssSelector("div.title_info > div > div > button")).click();
}


@And("Click on New button")
public void ClickonNewbutton() throws InterruptedException{
	Thread.sleep(6000);
	driver.findElement(By.xpath("(//div[@class='dropdown']/button)[1]")).click();
//("(//div[@class='dropdown']/button)[1]")
	//cssSelector(" div:nth-child(3) > div > div > div.b-profile-filter-table-cell-section-head > div > div.b-set-cell.b-ui.align_right.ng-scope > json-drop-down > div > div > button")
}
@And("Click on the continuance radio button")
public void Clickonthecontinuanceradiobutton() throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div:nth-child(2) > div > label:nth-child(6)")).click();
}
@And("Click on check box")
public void Clickoncheckbox() throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div:nth-child(3) > div > label")).click();
}
@And("Click on OK button")
public void ClickonOKbutton() throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div.modal-footer.ng-scope > button:nth-child(2)")).click();
}
@And("Enter Engagement Name as (.*)")
public void EnterEngagementName(String eeName) throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("p.wrap_profile_info_label.ng-scope.required.ispopulated > input")).sendKeys(eeName);
}

@And("Enter Engagement Description")
public void EnterEngagementDescription() throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div.control_textarea_wrapper > textarea")).sendKeys("test");
}

@And("Click on main Engagement location")
public void ClickonmainEngagementlocation() throws InterruptedException{
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)driver ;
	jse.executeScript("window.scrollBy(0,250)", "");
	driver.findElement(By.cssSelector("div.tooltip-placeholder > div > button")).click();
}

@And("Select the location") 
public void Selectthelocation() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div > ul > li:nth-child(4) > a > span")).click();
}
@And("Click on AEPs Search icon")
public void ClickonAEPsSearchicon() throws InterruptedException{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//ui-view/div/div/div/div[2]/div[1]/div/div/div[2]/div[4]/div/div[1]/div/div/div[1]/input[1]")).click();
}

@And("click on lookup button")
public void clickonlookupbutton() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[4]/div/div[1]/div/div/div[2]/div[1]/button[1]")).click();
}

@And("Search the partner and leader role")
public void Searchthepartnerandleaderrole(){
	driver.findElement(By.cssSelector("#mppPeopleSearchCriterion")).sendKeys("b");
}

@And("click on Search button")
public void clickonSearchbutton(){
	driver.findElement(By.cssSelector("form > div > button")).click();
}

@And("Select the user")
public void Selecttheuser(){
	driver.findElement(By.cssSelector("tr:nth-child(8) > td:nth-child(2)")).click();
}

@Then("Click on the next page")
public void Clickonthenextpage(){
	driver.findElement(By.cssSelector("#mppListFoundTeamMembers > div.col-md-9 > div.peoplepicker-footer > div.table-pages.pagination-custom > div.wrap_pager > ul > li:nth-child(4) > a")).click();
}

@And("Select the next user")

public void Selectthenextuser() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).click();
}
@And("click on add button")
public void clickonaddbutton(){
	driver.findElement(By.cssSelector("div.modal-footer.ng-scope > div > div > button > span:nth-child(1)")).click();
}

@And("Click on the checkbox")
public void Clickonthecheckbox(){
	driver.findElement(By.xpath("//div[2]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/label")).click();
}

@And("Click on Select Persons")
public void ClickonSelectPersons() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[2]/div[4]/div/div[1]/div/div/div[2]/div[1]/button[2]")).click();
}

@And("Click on EQCR option")
public void ClickonEQCRoption() throws InterruptedException{
	Thread.sleep(2000);
driver.findElement(By.cssSelector("(//input[@class='form-control role_searcher ng-pristine ng-valid ng-touched'])[2]")).click();
}
//div.ng-scope.required.ispopulated > div > div > div.input-wrap > input.form-control.role_searcher.ng-pristine.ng-valid.ng-touched
//(//input[@ng-model='searchRole'])[2]
@And("click on user")
public void clickonuser() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div.ng-scope.required.ispopulated > div > div > div.role-dropdown > ul > li:nth-child(2) > label")).click();
}
//
@And("Click on select person")
public void Clickonselectperson() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[2]/div[5]/div/div[1]/div/div/div[2]/div[1]/button[2]")).click();
}
@And("Click on Engagement Senior Manager")
public void ClickonEngagementSeniorManager() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div:nth-child(5) > div > div.ng-scope.required > div > div > div.role-dropdown > div.btn_role_wrapper > button.btn.btn-success")).click();
}

@And("Click on look up person")

public void ClickonLookupperson() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[2]/div[1]/div/div/div[2]/div[5]/div/div[1]/div/div/div[1]/input[1]")).click();
}

























}
