package kcp.springTxMgmt.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "kcp.springTxMgmt.dao")
public class PersistanceConfig {
	@Bean("hkds")
	public static HikariDataSource getDataSource() {
		HikariDataSource hkds = new HikariDataSource();
		hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		hkds.setUsername("system");
		hkds.setPassword("kalia");
		return hkds;
	}

	@Bean("templete")
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(getDataSource());
	}
}
