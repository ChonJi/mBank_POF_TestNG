package core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.Properties;

public class AppConfiguration {

    private static Logger logger = LoggerFactory.getLogger(AppConfiguration.class);
    private static Properties properties = null;

    private static Properties config() {
        if(properties == null) {
            properties = new Properties();
            final URL preferenceUrl = AppConfiguration.class.getClassLoader().getResource("application.properties");
        }

        return properties;
    }

}
