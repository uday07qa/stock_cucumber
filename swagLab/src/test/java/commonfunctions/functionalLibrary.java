package commonfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class functionalLibrary  {
	
public static Properties compro;
public static WebDriver driver;
public static WebDriver lanchbrowser() throws Throwable, Throwable {
	compro= new Properties();
	compro.load(new FileInputStream("./properties/automation.properties"));
	if(compro.getProperty("browser").equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if(compro.getProperty("browser").equalsIgnoreCase("edge")) {
		driver= new EdgeDriver();
		driver.manage().window().maximize();
	}
	else {
		try {
			throw new IllegalArgumentException("in valid browser value ");
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
	return driver;
}
	
public static void  closebrowser() {
	driver.quit();
}

public static void  url() {
	driver.get(compro.getProperty("url"));
}

public static void TypeActions(String locatertype,String locatervalue,String testdata) {
	if(locatertype.equalsIgnoreCase("xpath")) {
		driver.findElement(By.xpath(locatervalue)).sendKeys(testdata);
	}
	if(locatertype.equalsIgnoreCase("id")) {
		driver.findElement(By.id(locatervalue)).sendKeys(testdata);
	}
	if(locatertype.equalsIgnoreCase("name")) {
		driver.findElement(By.name(locatervalue)).sendKeys(testdata);
	}
}

public static void clickAction(String locatertype,String locatervalue) {
	
	if(locatertype.equalsIgnoreCase("xpath")) {
		driver.findElement(By.xpath(locatervalue)).click();
	}
	if(locatertype.equalsIgnoreCase("id")) {
		driver.findElement(By.id(locatervalue)).sendKeys(Keys.ENTER);
	}
	if(locatertype.equalsIgnoreCase("name")) {
		driver.findElement(By.name(locatervalue)).sendKeys(Keys.ENTER);
	}
}


public static void waitforelement(String locatertype,String locatervalue,String testdata) {
	if(locatertype.equalsIgnoreCase("xpath")) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(testdata)));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locatervalue))));
	}
	if(locatertype.equalsIgnoreCase("id")) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(testdata)));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(locatervalue))));
	}
	if(locatertype.equalsIgnoreCase("name")) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(testdata)));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(locatervalue))));
	}
	
}

public static void verifytheuser(String locatertype,String locatervalue,String testdata){
	
	String expected_name=testdata;
	String actual_name=driver.findElement(By.xpath(locatervalue)).getText();
if(actual_name.contains(testdata)) {
	System.out.println("its a valid user");
}
else{
	System.out.println("its a invalid user" );
}
}






public static void scrolling(String Testdata) {
	
	
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0," + Integer.parseInt(Testdata) + ")");	
		
	
}



public static void threedsleeo(String testdata) throws Throwable, Throwable {
	Thread.sleep(Integer.parseInt(testdata));
}


public static void actions_click(String locatertype,String locatervalue) {
	
	Actions ac = new Actions(driver);
	if(locatertype.equalsIgnoreCase("xpath")) {
	ac.moveToElement(driver.findElement(By.xpath(locatervalue))).click().perform();
	}
	if(locatertype.equalsIgnoreCase("id")) {
		ac.moveToElement(driver.findElement(By.id(locatervalue))).click().perform();
		}
	if(locatertype.equalsIgnoreCase("name")) {
		ac.moveToElement(driver.findElement(By.name(locatervalue))).click().perform();
		}
}


public static void mouse_action(String locatertype,String locatervalue) {
	Actions ac = new Actions(driver);
	if(locatertype.equalsIgnoreCase("id")) {
		ac.moveToElement(driver.findElement(By.id(locatervalue))).perform();
		}
	if(locatertype.equalsIgnoreCase("xpath")) {
		ac.moveToElement(driver.findElement(By.xpath(locatervalue))).perform();
		}
	if(locatertype.equalsIgnoreCase("name")) {
		ac.moveToElement(driver.findElement(By.name(locatervalue))).perform();
		}
}


public static void select_dropdown(String locatertype,String locatervalue,String testdata) {
	if(locatertype.equalsIgnoreCase("xpath")){
	Select sc = new Select(driver.findElement(By.xpath(locatervalue)));
	sc.selectByVisibleText(testdata);
}
	
	if(locatertype.equalsIgnoreCase("id")){
		Select sc = new Select(driver.findElement(By.id(locatervalue)));
		sc.selectByVisibleText(testdata);
	}
	if(locatertype.equalsIgnoreCase("name")){
		Select sc = new Select(driver.findElement(By.name(locatervalue)));
		sc.selectByVisibleText(testdata);
	}
	
}

public static void verifyorderid(String locatertype,String locatervalue,String testdata) {
	String expecetd_id=testdata;
	String actual_id=driver.findElement(By.xpath(locatervalue)).getText();
	try {
		Assert.assertEquals(actual_id, expecetd_id, "Order id is not displaying in fromet end");
	} catch (AssertionError e) {
		System.out.println(e.getMessage());
	}
}

}
