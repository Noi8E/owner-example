package helpers;

import com.codeborne.selenide.Configuration;
import config.APIConfig;
import config.EnvConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ConfigSettings {

    public static APIConfig apiConfig = ConfigFactory.create(APIConfig.class, System.getProperties());
    public static EnvConfig config;

    public  static void setMainConfig() {
        if (System.getProperty("env").equals("local")) {
            config = ConfigFactory.create(EnvConfig.class, System.getProperties());

        }
        if (System.getProperty("env").equals("remote")) {
            config = ConfigFactory.create(EnvConfig.class, System.getProperties());

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);

            Configuration.browserCapabilities = capabilities;
            Configuration.browser = config.getBrowser();
            Configuration.browserVersion = config.getBrowserVersion();

            String login = config.getLogin();
            String password = config.getPassword();
            String host = config.getHost();
            Configuration.remote = String.format("https://%s:%s@%s", login, password, host);
        }
    }
}
