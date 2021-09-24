package pl.altkomsoftware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.altkomsoftware.serviceTask.CustomerSendMessageDelegate;
import pl.altkomsoftware.status.StatusOfTask;

@Configuration
public class AppConfig {

    @Bean(name = "statusOfTask")
    public StatusOfTask statusOfTask(){
        return new StatusOfTask();
    }

    @Bean(name = "sendMessage")
    public CustomerSendMessageDelegate customerSendMessageDelegate(){
        return new CustomerSendMessageDelegate();
    }
}
