package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SmokeTestJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Purush/Downloads/selenium-java-3.0.1/chromedriver.exe");
		WebDriver my_Webdriver = new ChromeDriver();
		my_Webdriver.get("http://newtours.demoaut.com/mercuryreservation.php");
		my_Webdriver.findElement(By.linkText("REGISTER")).click();
		
	}

}
