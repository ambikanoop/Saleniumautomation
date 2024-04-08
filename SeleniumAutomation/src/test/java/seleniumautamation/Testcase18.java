package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase18 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();   //  //a[@title='My Settings']
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("ambika@com.sand");
		WebElement password=driver.findElement(By.name("pw"));
		password.sendKeys("Anoopkp@15");
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		opportunites();
		System.out.println("test case pass");

}
	static void opportunites() {
		WebElement opp=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		Actions action=new Actions(driver);
		action.moveToElement(opp).build().perform();
		action.click().build().perform();
		WebElement interval=driver.findElement(By.xpath("//select[@id='quarter_q']"));
	Select st=new Select(interval);
	st.selectByVisibleText("Next FQ");
	//st.selectByVisibleText("Current FQ");
	WebElement include=driver.findElement(By.xpath("//select[@id='open']"));
	Select st1=new Select( include);
	st1.selectByVisibleText("Open Opportunities");
	//st1.selectByVisibleText("Closed Opportunities");
	WebElement runreport=driver.findElement(By.xpath("//input[@title='Run Report']"));
	runreport.click();
}}
