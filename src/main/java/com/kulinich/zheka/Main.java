package com.kulinich.zheka;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver",  "src/test/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
      WebElement element = driver.findElement(By.ById.id("lst-ib"));
      element.sendKeys("asdasdafsdfsdgewtewrwefsadfs");
      element.sendKeys(Keys.ENTER);
//              driver.findElement(By.ById.id("lst-ib")).sendKeys("Hello world");
    }
}
