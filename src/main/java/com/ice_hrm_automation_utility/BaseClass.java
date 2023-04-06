package com.ice_hrm_automation_utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
    public ExtentTest log;
    
	public void launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			// System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver(options);
			break;

		case "edge":
            EdgeOptions options1 = new EdgeOptions();
            options1.addArguments("--remote-allow-origins=*");
			WebDriverManager.edgedriver().setup();
			// System.setProperty("webdriver.edge.driver","msedgedriver.exe");
			driver = new EdgeDriver(options1);
			break;

		case "firefox":
			FirefoxOptions options2 = new FirefoxOptions();
            options2.addArguments("--remote-allow-origins=*");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options2);

		default:
			WebDriverManager.chromedriver().setup();
            // System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver(setChromeOptions());
		}
	}

	// perform a sendKeys operation on provided location (element)

	public void enterText(By by, String text) {
		try {
			System.out.println("driver value 3 "+driver);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			// perform a click
			driver.findElement(by).sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// perform a click operation on the given locator with by class reference
	public void click(By by) {
		try {
			System.out.println("driver value 4 "+driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(by));

			driver.findElement(by).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// take multiple data in DropDown list

	public void list(By by, String Text) {
		try {
			List<WebElement> AllElements = driver.findElements(by);

			for (int i = 0; i < AllElements.size(); i++) {
				WebElement elements = AllElements.get(i);

				String Value = elements.getText();

				if (Value.equals(Text)) {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
					wait.until(ExpectedConditions.elementToBeClickable(by));

					// System.out.println(Value);
					elements.click();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ChromeOptions setChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("incognito");
		/*
		 * options.setHeadless(false); options.setExperimentalOption("excludeswitches",
		 * Arrays.asList("disable-popup-clocking")); Map<String, String> pref = new
		 * HashMap<>(); pref.put("download.default.directory", "E:/newfolder/download");
		 * options.setExperimentalOption("Pref", pref);
		 * options.setAcceptInsecureCerts(true);
		 */
		return options;
	}

	public EdgeOptions setEdgeOptions() {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("incognito");
//		options.setHeadless(false);
//		options.setExperimentalOption("excludeswitches", Arrays.asList("disable-popup-clocking"));
//		Map<String, String> prefs = new HashMap<>();
//		prefs.put("download.default.directory", "E:/newfolder/download");
//		options.setExperimentalOption("Prefs", prefs);
//		options.setAcceptInsecureCerts(true);
		return options;
	}

	public FirefoxOptions setFirefoxOptions() {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		/*
		 * options.addArguments("incognito"); options.setHeadless(false);
		 * options.addPreference("excludeSwitches",
		 * Arrays.asList("disable-popup-clocking")); Map<String, String> prefs = new
		 * HashMap<>(); prefs.put("download.default.directory",
		 * "E:/newfolder/download"); options.addPreference("Prefs", prefs);
		 * options.setAcceptInsecureCerts(true);
		 */
		return options;
	}

	
	public void elementToBeClickable(By by)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void waitVisibilityOf(By by)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
	}
	
	public void fileUpload(String filepath)
	{
		try
		{
			System.out.println("try block");
			PropertyHandling property = new PropertyHandling();
			String autoItScript = property.getProperty("autoItScript");
			Thread.sleep(1000);
			Runtime.getRuntime().exec(autoItScript + "" + filepath);
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("waiting img is uploaded");
	}
}
