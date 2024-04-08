package seleniumautamation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Testcase35 {
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
		TabClick();
		System.out.println("test case pass");
}static void TabClick() {
		WebElement plus=driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(plus).build().perform();
		action.click().build().perform();
		WebElement customize=driver.findElement(By.xpath("//input[@value='Customize My Tabs']"));
		customize.click();
		WebElement assettab=driver.findElement(By.xpath("//select[@id='duel_select_1']/option[@value='Asset']"));
		assettab.click();
		WebElement remove=driver.findElement(By.xpath("//a[@id='duel_select_0_left']"));
		remove.click();
		WebElement save=driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[@value=' Save ']"));
		save.click();
		WebElement usermenu=driver.findElement(By.xpath("//span[contains(text(),'Ambika')]"));
		usermenu.click();
		WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		driver.get("https://login.salesforce.com/");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("ambika@com.sand");
		WebElement password=driver.findElement(By.name("pw"));
		password.sendKeys("Anoopkp@15");
		WebElement login=driver.findElement(By.id("Login"));
		login.click();}}
		
	
