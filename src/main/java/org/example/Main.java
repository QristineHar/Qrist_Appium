package org.example;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "Xiaomi");
        caps.setCapability("platformName", "Android");
        caps.setCapability("udid", "106a72e60506"); //Give Device ID  caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "org.harshmittal.multicopypaste");
        caps.setCapability("appActivity", "org.qtproject.qt5.android.bindings.QtActivity");


//Instantiate Appium Driver

        try {
            AppiumDriver driver = new AndroidDriver( new URL("http://0.0.0.0:4723"),  caps);
            System.out.println("lunched Application******************");
            driver.findElement(By.cssSelector("[content-desc='Add New']")).click();
            System.out.println("clicked Add New button ****************");
        } catch (MalformedURLException e) {

            System.out.println(e.getMessage());

        }
    }

}