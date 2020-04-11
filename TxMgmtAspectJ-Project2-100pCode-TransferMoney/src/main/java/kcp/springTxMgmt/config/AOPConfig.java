package kcp.springTxMgmt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
public class AOPConfig {
	@Bean("Txmg")
	public DataSourceTransactionManager getTxMgr() {
		return new DataSourceTransactionManager(PersistanceConfig.getDataSource());

	}
}
