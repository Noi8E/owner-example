package ru.bazt;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleUITests extends TestBase {

    @Test
    public void testAPIExample(){

       String browserName =  System.getProperty("browser");
        WebDriver driver = new ChromeDriver();
        driver.get(mainUrl);
        assertEquals("Главная",  driver.getTitle());
        driver.quit();

    }
}
