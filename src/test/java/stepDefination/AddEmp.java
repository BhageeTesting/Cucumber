package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmp {


String beforeid="";
String afterid="";
WebDriver driver;
@Given("^user navigates url \"([^\"]*)\"$")
public void user_navigates_url(String url) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.get(url);
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^user logs as username \"([^\"]*)\" and logs as password\"([^\"]*)\"$")
public void user_logs_as_username_and_logs_as_password(String user, String pass) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(user);
   driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pass);
}

@When("^user click login button$")
public void user_click_login_button() throws Throwable {
    driver.findElement(By.xpath("//input[@name='Submit']")).click();
}

@When("^user click pim button$")
public void user_click_pim_button() throws Throwable {
    driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
}

@When("^user click add button$")
public void user_click_add_button() throws Throwable {
    driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
}

@When("^user Enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_Enter_and_and(String FName, String MName, String LName) throws Throwable {
   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(FName);
   driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(MName);
   driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(LName);
   
}

@When("^user capture emid$")
public void user_capture_emid() throws Throwable {
     beforeid=driver.findElement(By.xpath("//input[@name='employeeId']")).getAttribute("value");
}

@When("^user click save button$")
public void user_click_save_button() throws Throwable {
    driver.findElement(By.xpath("//input[@value='Save']")).click();
}

@When("^user capture emid aftersave$")
public void user_capture_emid_aftersave() throws Throwable {
   afterid=driver.findElement(By.xpath("(//input[@name='personal[txtEmployeeId]'])[1]")).getAttribute("value");
}

@Then("^user valid emid$")
public void user_valid_emid() throws Throwable {
    if (beforeid.equals(afterid)) {
    	System.out.println("emp added successfully"+beforeid+"     "+afterid);
		
	}
    else {
		System.out.println("emp addd failed"+beforeid+"      "+afterid);
	}
}

@Then("^user close browser$")
public void user_close_browser() throws Throwable {
    driver.close();
}


	
}
