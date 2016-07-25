package socnet.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@Import({WebConfig.class, DataConfig.class, WebSecurityConfig.class, JpaConfig.class})
@ComponentScan("socnet")
public class AppConfig {
    
}
