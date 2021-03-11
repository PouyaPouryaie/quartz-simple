package ir.bigz.quartzsimple.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
})
public class ApplicationProperties {

    @Autowired
    private Environment environment;

    public String getProperty(String name) {
        return environment.getProperty(name);
    }

    public Integer getCode(String name) {
        return Integer.parseInt(environment.getProperty(name));
    }
}
