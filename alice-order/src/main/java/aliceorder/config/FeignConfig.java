package aliceorder.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Retryer feignRetryer() {
        Retryer retryer = new Retryer.Default(100, 1000, 4);
        return retryer;
    }
}
