package org.xb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Start {

	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Balaji Raina\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://batikair.com/en/");
		WebElement typeOfService = driver.findElement(By.xpath("(//i[@class='icon icon-round'])[2]"));
		typeOfService.click();
		WebElement Depart = driver.findElement(By.id("departCity"));
		Select Depar=new Select(Depart);
		Depar.selectByValue("MAA");
		Select Arri=new Select(driver.findElement(By.id("arrivalCity")));
		//List<WebElement> li=Arri.getOptions();
		//Arri.selectByIndex(2);
		Arri.selectByValue("BNE");
		
	}

}
