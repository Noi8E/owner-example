package ru.bazt;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.APIConfig;
import config.EnvConfig;
import helpers.ConfigSettings;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase extends ConfigSettings {

    public final String BAZT_URL = "https://bazt.ru/";
    public final String SEARCH_VALUE = "test";


    @BeforeAll
    public static void setUp() {
        Configuration.browserSize = "1920x1080";
        ConfigSettings.setMainConfig();
    }
    @AfterEach
    public void shutDown() {
        Selenide.closeWebDriver();
    }
}