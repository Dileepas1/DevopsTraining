package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {
    public static void main(String[] args) {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "/path/to/your/app.apk"); // Provide the path to your app

        try {
            AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

            // Example: Click on a button with the ID "com.example:id/button"
            WebElement button = driver.findElement(By.id("com.example:id/button"));
            button.click();

            // Example: Enter text in a text field with the ID "com.example:id/textfield"
            WebElement textField = driver.findElement(By.id("com.example:id/textfield"));
            textField.sendKeys("Hello, Appium!");

            driver.quit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
