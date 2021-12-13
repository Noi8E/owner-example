package ru.bazt;

import com.codeborne.selenide.Configuration;
import config.APIConfig;
import config.WebLocalConfig;
import config.WebRemoteConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
    public APIConfig apiConfig;

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";

        if (System.getProperty("isRemote") == null) {
            WebRemoteConfig webRemoteConfig = ConfigFactory
                    .create(WebRemoteConfig.class, System.getProperties());

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);

            Configuration.browserCapabilities = capabilities;
            Configuration.browser = webRemoteConfig.getBrowserName();
            Configuration.browserVersion = webRemoteConfig.getBrowserVersion();
            if (webRemoteConfig.getIsRemote()) {
                String remoteLogin = webRemoteConfig.getRemoteLogin();
                String remotePassword = webRemoteConfig.getRemotePassword();
                String remoteUrl = webRemoteConfig.getRemoteUrl();
                Configuration.remote = String.format("https://%s:%s@%s", remoteLogin, remotePassword, remoteUrl);
            }


        }
    }





}
