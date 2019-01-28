
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class gM {

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "/Users/admin/Documents/SeleniumDrivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		
		WebDriver driver=  new ChromeDriver();
		
		
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("lst-ib")).sendKeys("jdjdjdkscnkervjcsnkekd");
		
		driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("name1")).sendKeys("Gunjan Kapoor");
		driver.findElement(By.name("phone")).sendKeys("9910924542");
		driver.findElement(By.name("phone")).sendKeys("9910924542");
		driver.findElement(By.id("email")).sendKeys("GunjanKapoor1985@gmail.com");
		driver.findElement(By.xpath("//input[@type='radio' and @value='Excel']")).click();
		driver.findElement(By.xpath("//input[@type='radio' and @value='Beginner']")).click();
		driver.findElement(By.id("comments3")).sendKeys("HEllo Champ");
		driver.findElement(By.xpath("//input[@class='button'][2]")).click();
		Thread.sleep(5000);
		
	System.out.println("hello");
		
		
//		driver.findElement(By.xpath("//input[@name='radio1' and @type='radio'][1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@name='radio1' and @type='radio'][2]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@name='radio1' and @type='radio'][3]")).click();
//		
		
		
		
		
//		driver.findElement(By.id("gh-ac")).sendKeys("Gunjan");
//		Thread.sleep(4000);
		
//		List <WebElement> linkList =driver.findElements(By.tagName("a"));
//		System.out.println(linkList.size());
//		
//		for (int i = 0; i < linkList.size(); i++) {
//			String linkText = linkList.get(i).getText();
//			System.out.println(linkText);
//			System.out.println(i);
//		}
		
		
//		
//List<WebElement>lists  =driver.findElements(By.xpath("//li[@role='presentation']"));
//		int count=lists.size();
//		System.out.println(count);
//		
//			String date ="11-September-2018";
//			date.split("-");
//		if (count>0) {//					
//		
//		for (int i=0;i<count;i++){
//			String name=lists.get(i).getText();
//			System.out.println(name);
//		}
//		}
		
		
		driver.close();
		driver.quit();
	}

}
