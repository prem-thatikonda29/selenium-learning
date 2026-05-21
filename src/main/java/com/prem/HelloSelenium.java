package com.prem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();

        driver.get("https://anusrikarmokar.in");

        Thread.sleep(5000);

        WebElement about = driver.findElement(By.className("framer-iyjazn"));
        System.out.println("Found about section");

	WebElement div = about.findElement(By.className("framer-3fiqig"));
	System.out.println("Found name container");

	WebElement name = div.findElement(By.tagName("p"));
	System.out.println("Found name :" + name.getText());

        driver.quit();
    }
}
