package pl.altkomsoftware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.altkomsoftware.serviceTask.CustomerDataDelegate;
import pl.altkomsoftware.serviceTask.PermissionDelegate;
import pl.altkomsoftware.status.StatusOfTask;

@Configuration
public class AppConfig {

    @Bean(name = "statusOfTask")
    @Scope("prototype")
    public StatusOfTask statusOfTask(){
        return new StatusOfTask();
    }

    @Bean(name = "permissionDelegate")
    public PermissionDelegate permissionDelegate(){
        return new PermissionDelegate();
    }
    @Bean(name = "customerDataDelegate")
    public CustomerDataDelegate customerDataDelegate(){
        return new CustomerDataDelegate();
    }
}
