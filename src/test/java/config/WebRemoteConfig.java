package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:webRemote.properties"})

public interface WebRemoteConfig extends Config {

    @Key("browserName")
    String getBrowserName();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("isRemote")
    boolean getIsRemote();

    @Key("remoteLogin")
    String getRemoteLogin();

    @Key("remotePassword")
    String getRemotePassword();

}
