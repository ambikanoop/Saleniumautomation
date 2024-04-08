package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase32 {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("ambika@com.sand");
		WebElement password=driver.findElement(By.name("pw"));
		password.sendKeys("Anoopkp@15");
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		contactTab() ;
		System.out.println("test case pass");
}
	static void contactTab() {
		WebElement contact=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		Actions action=new Actions(driver);
		action.moveToElement(contact).build().perform();
		action.click().build().perform();
WebElement newbutton=driver.findElement(By.xpath("//td[@class='pbButton']/input[@value=' New ']"));
newbutton.click();
WebElement lastname=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
lastname.sendKeys("Indian");
WebElement company=driver.findElement(By.xpath("//input[@id='con4']"));
company.sendKeys("Global Media");
WebElement savenew=driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[2]"));
savenew.click();

}
}