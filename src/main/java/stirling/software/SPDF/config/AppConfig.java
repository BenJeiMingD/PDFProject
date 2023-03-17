package stirling.software.SPDF.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig { 
    @Bean(name = "appVersion")
    public String appVersion() {
        String version = getClass().getPackage().getImplementationVersion();
        return (version != null) ? version : "0.3.3";
    }
}