package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:webLocal.properties"})

public interface WebLocalConfig extends Config {

    @Key("browserName")
    String getBrowserName();

    @Key("browserVersion")
    String getBrowserVersion();



}
