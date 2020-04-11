package kcp.springAOP.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"kcp.springAOP.service,kcp.springAOP.advice"})
@EnableAspectJAutoProxy
public class AppConfig {

}
