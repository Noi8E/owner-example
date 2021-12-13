package ru.bazt;

import config.APIConfig;
import config.UIConfig;
import org.assertj.core.configuration.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    public final String mainUrl = "https://bazt.ru/";


    public String expectedResult = "Главная";

    public UIConfig uiConfig;
    public APIConfig apiConfig;

//    public void setWebDriver() {
//        if (uiConfig.getWebDriver().equals("local")) {
//            Configuration.browser = uiConfig.getBrowser();
//            return;
//        }
//        Configuration.remote = uiConfig.getRemoteUrl();
//    }
//
//    public void setBrowserVersion() {
//        Configuration.browserVersion = uiConfig.getBrowserVersion();
//    }

    @BeforeAll
    static void setUp() {

    }

    @AfterEach
    public void addAttachments() {

    }



}
