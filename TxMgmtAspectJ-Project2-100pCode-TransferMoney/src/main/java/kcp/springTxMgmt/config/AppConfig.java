package kcp.springTxMgmt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PersistanceConfig.class,ServiceConfig.class,AOPConfig.class})
public class AppConfig {
	
}
