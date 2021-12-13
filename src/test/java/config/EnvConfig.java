package config;

import org.aeonbits.owner.Config;
@Config.Sources({"classpath:env.properties"})

public interface EnvConfig extends Config {
    @Key("login")
    String getLogin();

    @Key("password")
    String getPassword();

    @Key("stageAddress")
    String getStageAddress();


}
