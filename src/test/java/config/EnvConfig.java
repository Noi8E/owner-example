package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties"})

public interface EnvConfig extends Config {

    @Key("isRemote")
    @DefaultValue("false")
    Boolean getIsRemote();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("92.0")
    String getBrowserVersion();

    @Key("host")
    @DefaultValue("localhost")
    String getHost();

    @Key("login")
    String getLogin();

    @Key("password")
    String getPassword();

}
