package kcp.springAspectj.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@ComponentScan(basePackages = {"kcp.springAspectj.advice,kcp.springAspectj.service"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {

}
