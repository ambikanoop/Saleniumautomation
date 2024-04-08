package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase6 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("ambika@com.sand");
		WebElement password=driver.findElement(By.name("pw"));
		password.sendKeys("Anoopkp@15");
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		Myprofile();
		postlink();
		filelink();
		photolink();
	}
	static void Myprofile() throws InterruptedException {
		WebElement usermenu=driver.findElement(By.id("userNavLabel"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(usermenu));
		usermenu.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='My Profile']")).click();
		WebElement edit=driver.findElement(By.xpath("//img[@alt='Edit Profile']"));
		edit.click();
		Thread.sleep(3000);
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		driver.switchTo().frame(iframe);
		WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		about.click();
		Thread.sleep(3000);
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		WebDriverWait wait1=new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.visibilityOf(lastname));
		lastname.clear();                              
		lastname.sendKeys("Abcd");
		
		
		WebElement save=driver.findElement(By.xpath("//input[@value='Save All']"));
		save.click();
		Thread.sleep(3000);
	}
	static void postlink() throws InterruptedException {
		driver.switchTo().defaultContent();
		WebElement post=driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(post));
		post.click();

		WebElement frame=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(frame);
		WebElement text=driver.findElement(By.xpath("/html/body"));
		text.click();
		text.sendKeys("hello welcome");
		driver.switchTo().defaultContent();
		WebElement share=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		share.click();
		}
	
	static void filelink() {
		driver.switchTo().defaultContent();
		WebElement file=driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']//span[@class='publisherattachtext ']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(file));
		file.click();
		WebElement uploadbutton=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		uploadbutton.click();
		driver.findElement(By.xpath("//input[@id='chatterFile']")).sendKeys("C:\\Users\\CKAMB\\OneDrive\\Desktop\\.txt");
	}
	static void photolink() throws InterruptedException {
		driver.switchTo().defaultContent();
		WebElement photo=driver.findElement(By.xpath("//a[@id='uploadLink']"));
		WebDriverWait wait1=new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.visibilityOf( photo));
		Actions action=new Actions(driver);
		action.moveToElement(photo).build().perform();
		action.click().build().perform();
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")).sendKeys("C:\\Users\\CKAMB\\OneDrive\\Desktop\\image5.jpg");
		
	WebElement savebutton=	driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
	savebutton.click();
	
Thread.sleep(3000);
	WebElement save1button=driver.findElement(By.xpath("//input[@name='j_id0:j_id7:save']"));
	save1button.click();
	driver.switchTo().defaultContent();
	}

}
