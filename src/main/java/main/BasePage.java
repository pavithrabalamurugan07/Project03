package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	public static Properties props;
	public static WebDriver driver;
	
	public BasePage() {
		try {
		props= new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\Balamurugan\\Desktop\\New folder\\Exercise01\\src\\main\\java\\main\\config.properties");
		props.load(ip);
			}catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


public void initialization() {
	String browserName=props.getProperty("browser");
	if(browserName.equals("google"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balamurugan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Balamurugan\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
}
@BeforeMethod
public void setup()
{
	initialization();
	driver.get("https://www.google.com/");
}
//@AfterMethod
//public void terminnate()
//{
//	driver.close();
//}

}
	

