package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:ui.properties"})

public interface UIConfig extends Config {
    @Key("webdriver")
    String getWebDriver();

    @Key("browser")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    String getBaseUrl();

    @Key("remoteUrl")
    String getRemoteUrl();
}
