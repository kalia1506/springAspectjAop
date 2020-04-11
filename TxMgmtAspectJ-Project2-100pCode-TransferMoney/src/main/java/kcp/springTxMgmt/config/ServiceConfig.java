package kcp.springTxMgmt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "kcp.springTxMgmt.service" })
public class ServiceConfig {

}
