package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	private WebDriver driver;
	private static int counter;

	public Test()
	{
		counter = 0;
		driver = new ChromeDriver();
	}

	public void closeDriver()
	{
		driver.close();
	}

	public void loginTest(){
		driver.get("https://ims-st.azurewebsites.net/Account/Login");
		driver.manage().window().setSize(new Dimension(1348, 728));
		driver.findElement(By.id("Email")).click();
		driver.findElement(By.id("Email")).sendKeys("admin@gmail.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".col-md-offset-2 > .btn-primary")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Log off")).click();
	}

	public void signUpTest() {
		driver.get("https://ims-st.azurewebsites.net/Account/Login");
		driver.manage().window().setSize(new Dimension(1348, 728));
		driver.findElement(By.linkText("Register as a new user")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("Email")).click();
		driver.findElement(By.id("Email")).sendKeys("mehboobali" + counter + "@gmail.com");
		counter++;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Test@123");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".col-md-offset-2 > .btn")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".mt-4")).click();
	}

	public void changePasswordTest()
	{
	    driver.get("https://ims-st.azurewebsites.net/Account/Login");
	    driver.manage().window().setSize(new Dimension(1348, 728));
	    driver.findElement(By.id("Email")).click();
	    driver.findElement(By.id("Email")).sendKeys("admin@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Test@123");
	    driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    driver.get("https://ims-st.azurewebsites.net/Manage/ChangePassword");
	    driver.manage().window().setSize(new Dimension(1348, 728));
	    driver.findElement(By.id("OldPassword")).click();
	    driver.findElement(By.id("OldPassword")).sendKeys("Test@123");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.id("NewPassword")).sendKeys("Test@123");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("Test@123");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.id("ConfirmPassword")).sendKeys(Keys.ENTER);
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehboob Ali\\Downloads\\selenium-java-3.141.59\\libs\\chromedriver.exe");
		Test test = new Test();
		test.loginTest();
		Thread.sleep(5000);
		test.signUpTest();
		Thread.sleep(5000);
		test.changePasswordTest();
		test.closeDriver();
	}
}
