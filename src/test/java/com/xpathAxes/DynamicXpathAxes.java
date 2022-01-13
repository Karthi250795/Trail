package com.xpathAxes;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpathAxes {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		
		List<WebElement> findElements = driver.findElements(By.xpath("//td[2]"));
		List<Integer> li = new ArrayList<Integer>();
		
		for (int i = 0; i < findElements.size(); i++) {
			
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			String replace = text.replace("%", "");
			int parseInt = Integer.parseInt(replace);
			li.add(parseInt)
			
		}
		
		
		
	}
	
	

}
