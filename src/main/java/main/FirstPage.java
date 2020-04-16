package main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FirstPage extends BasePage {
	public WebElement gmail() {
		return driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
	}
	public WebElement images() {
		return driver.findElement(By.xpath("//a[contains(text(),'Images')]"));
	}
	public WebElement googleapps() {
		return driver.findElement(By.xpath("//a[@class='gb_D gb_tc']"));
	}
	public WebElement searchbox() {
		return driver.findElement(By.xpath("//input[@name='q']"));
	}
	public WebElement luckybox() {
		return driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[3]/center/input[2]"));
	}
	public WebElement enterbox() {
		return driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
	}
	//Actions
	public void gmailmethod() {
		gmail().click();
	}
	public void imagesmethod() {
		images().click();
	}
	public void googleappsmethod() {
		googleapps().click();
	}
	public void searchboxmethod(String name) {
		searchbox().sendKeys(name);
		searchbox().sendKeys(Keys.ENTER);
	}
	public void luckyboxmethod() {
		luckybox().click();
	}
	public void enterboxmethod() {
		enterbox().click();
	}
	

}
