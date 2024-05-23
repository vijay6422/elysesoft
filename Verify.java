package com.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify {
	
	@Test
	public void VerifyFlipkart() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		//driver.findElement(By.name("q"));
		
		driver.close();
		
		
	}
}
		
		