package org.asd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sangitha - J\\Desktop\\chandrakanthtester\\Practies\\driver\\chromedriver.exe");
	WebDriver dri = new ChromeDriver();
	dri.get("https://www.toolsqa.com/");
	dri.manage().window().maximize();
	Thread.sleep(1000);
	JavascriptExecutor j= (JavascriptExecutor)dri;
	WebElement txt = dri.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
	j.executeScript("arguments[0].ScollIntoview(true)",txt);

	
	
	}
	
	

}
