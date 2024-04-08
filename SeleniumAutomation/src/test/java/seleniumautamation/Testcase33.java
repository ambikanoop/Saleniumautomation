package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase33 {

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
		HomeTab();
		verification();
}
	static void HomeTab() {
		WebElement homebutton=driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(homebutton).build().perform();
		action.click().build().perform();
		WebElement Aname=driver.findElement(By.xpath("//span[@class='pageType']//a[contains(text(),'Ambika Abcd')]"));
		Aname.click();
	}
	static void verification() {
		WebElement v=driver.findElement(By.xpath("//*[@id=\"tailBreadcrumbNode\"]"));
		System.out.println(v.getText());
		String s="Ambika Abcd";
		if(v.getText().contains(s)){
			System.out.println("test pass");
			
		}else {
			System.out.println("test fail");
		}
	}
	
}