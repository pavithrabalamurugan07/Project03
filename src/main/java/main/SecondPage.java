package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SecondPage extends BasePage {
	public WebElement text() {
		return driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul[1]/li/div/div/div[1]/div/div[2]/p"));
	}
	public void textmethod() {
		String t=text().getText();
		System.out.println(t);
	}


}
