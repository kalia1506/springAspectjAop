package kcp.springDTxMgmt.config;

import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@EnableConfigurationProperties
public class PersistanceConfig {
	@Bean("OracleconnPol")
	@ConfigurationProperties(prefix = "jta.atomikos.datasource.first")
	public AtomikosDataSourceBean getOracleEnabledConnectionPooling() {
		AtomikosDataSourceBean ads = new AtomikosDataSourceBean();
		ads.setUniqueResourceName("oracleXA");
		ads.setXaDataSourceClassName("oracle.jdbc.xa.client.OracleXADataSource");
		Properties props = new Properties();
		props.put("databaseName", "xe");
		props.put("user", "system");
		props.put("password", "kalia");
		props.put("URL", "jdbc:oracle:thin:@localhost:1521:xe");
		ads.setXaProperties(props);
		return ads;
	}

	@Bean("MySQLConnPol")
	@ConfigurationProperties(prefix = "jta.atomikos.datasource.second")
	public AtomikosDataSourceBean getMySQLEnabledConnectionPooling() {
		AtomikosDataSourceBean ads = new AtomikosDataSourceBean();
		ads.setUniqueResourceName("MySQLXA");
		ads.setXaDataSourceClassName("com.mysql.cj.jdbc.MysqlXADataSource");
		Properties props = new Properties();
		props.put("databaseName", "spring712");
		props.put("user", "root");
		props.put("password", "root");
		props.put("URL", "jdbc:mysql:///spring712");
		ads.setXaProperties(props);
		return ads;
	}

	@Bean("MySQLJt")
	public JdbcTemplate getMySQLTemplate() {
		return new JdbcTemplate(getMySQLEnabledConnectionPooling());
	}

	@Bean("oracleJt")
	public JdbcTemplate getOracleTemplate() {
		return new JdbcTemplate(getOracleEnabledConnectionPooling());
	}
}
