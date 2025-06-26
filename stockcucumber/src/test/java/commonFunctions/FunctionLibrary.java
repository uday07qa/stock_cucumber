package commonFunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FunctionLibrary {
public	static Properties compro;
public static WebDriver driver;

	public static WebDriver lanchBrowser() throws  Throwable {
		compro= new Properties();
		compro.load(new FileInputStream("./properties/Stock.properties"));
		if(compro.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(compro.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		else {
			try {
				throw new IllegalArgumentException("In valud browser value in properties file ");
			} catch (Throwable e) {
				System.out.println(e.getMessage());
			}
		}
		
			return null;	
	}

	public static void openURL() {
		
		driver.get(compro.getProperty("url"));
	}
	
	public static void waitforelement(String locatertype,String locatervalue,String Testdata) {
		
		if(locatertype.equalsIgnoreCase("xpath")) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(Testdata)));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locatervalue))));
		}
		if(locatertype.equalsIgnoreCase("id")) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(Testdata)));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(locatervalue))));
		}
		if(locatertype.equalsIgnoreCase("name")) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(Testdata)));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(locatervalue))));
		}
	}
	
	
	public static void TypeActions(String locatertype,String locatervalue,String Testdata) {
		if(locatertype.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatervalue)).clear();
			driver.findElement(By.xpath(locatervalue)).sendKeys(Testdata);
		}
		if(locatertype.equalsIgnoreCase("name")) {
			driver.findElement(By.xpath(locatervalue)).clear();
			driver.findElement(By.name(locatervalue)).sendKeys(Testdata);
		}
		if(locatertype.equalsIgnoreCase("id")) {
			driver.findElement(By.xpath(locatervalue)).clear();
			driver.findElement(By.id(locatervalue)).sendKeys(Testdata);
		}
	}
	
	public static void clickaction(String locatertype,String locatervalue) {
		if(locatertype.equalsIgnoreCase("xpath")) {
			
			driver.findElement(By.xpath(locatervalue)).click();
		}
		if(locatertype.equalsIgnoreCase("name")) {
			
			
			driver.findElement(By.name(locatervalue)).click();
		}
		if(locatertype.equalsIgnoreCase("id")) {
			
			
			driver.findElement(By.id(locatervalue)).click();
		}
	}
	public static void validatetitle(String Testdata) {
		
	String 	expected_title= Testdata;
	String actual_title= driver.getTitle();
			try {
				Assert.assertEquals(actual_title, expected_title, "Its an invalid page Title");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
	}
	public static void threadsleep(String Testdata) throws Throwable, Throwable {
		Thread.sleep(Integer.parseInt(Testdata));
	}
	
	
	public static void Implicitywait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public static void closebrowser() {
		driver.quit();
	}
	public static void dropdow_Actions_index(String locatertype,String locatervalue,String Testdata) {
		if(locatertype.equalsIgnoreCase("xpath")) {
		Select sc = new Select(driver.findElement(By.xpath(locatervalue)));
		sc.selectByIndex(Integer.parseInt(Testdata));		
	}
		if(locatertype.equalsIgnoreCase("id")) {
			Select sc = new Select(driver.findElement(By.id(locatervalue)));
			sc.selectByIndex(Integer.parseInt(Testdata));		
		}
		if(locatertype.equalsIgnoreCase("name")) {
			Select sc = new Select(driver.findElement(By.name(locatervalue)));
			sc.selectByIndex(Integer.parseInt(Testdata));		
		}
	}
	
	
	
	public static void capture_stocknumber(String locatertype,String locatervalue,String Testdata) throws Throwable {
		
		String expected_stocknum="";
		if(locatertype.equalsIgnoreCase("xpath")) {
			expected_stocknum=	driver.findElement(By.xpath(locatervalue)).getAttribute("value");
		}
		if(locatertype.equalsIgnoreCase("name")) {
			expected_stocknum=	driver.findElement(By.name(locatervalue)).getAttribute("value");
		}
		if(locatertype.equalsIgnoreCase("id")) {
			expected_stocknum=	driver.findElement(By.id(locatervalue)).getAttribute("value");
		}
		FileWriter fw= new FileWriter("./captureData/stocknumber.txt");
		BufferedWriter br= new BufferedWriter(fw);
		br.write(expected_stocknum);
		br.flush();
		br.close();
		
		
	}
	public static void verify_stocknumber() throws Throwable {
		FileReader fr= new FileReader("./captureData/stocknumber.txt");
		BufferedReader br = new BufferedReader(fr);
	String expected_data=	br.readLine();
	if(!driver.findElement(By.xpath(compro.getProperty("searchbar"))).isDisplayed()) {
		driver.findElement(By.xpath(compro.getProperty("search_icon"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(compro.getProperty("searchbar"))).sendKeys(expected_data);
		driver.findElement(By.xpath(compro.getProperty("search_button"))).click();
		Thread.sleep(2000);
	String Actual_data=	driver.findElement(By.xpath(compro.getProperty("stocknumber_table"))).getText();
		try {
			Assert.assertEquals(Actual_data, expected_data, "Invalid Stocknumber in table");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
		
	}
	
		
	}
	
	
}
