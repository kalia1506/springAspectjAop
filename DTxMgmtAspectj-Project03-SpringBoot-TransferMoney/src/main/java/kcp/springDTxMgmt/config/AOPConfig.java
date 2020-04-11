package kcp.springDTxMgmt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.jta.JtaTransactionManager;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;

@Configuration
public class AOPConfig {
	@Bean("UseTxService")
	public UserTransactionImp getCreateTxService() {
		return new UserTransactionImp();
	}

	@Bean("HendleTxMgr")
	public UserTransactionManager getHendleTxMgr() {
		return new UserTransactionManager();
	}

	@Bean("HendleDistTxMgr")
	public JtaTransactionManager getHendleDTxMgr() {
		JtaTransactionManager jtaTxmgr = new JtaTransactionManager();
		jtaTxmgr.setUserTransaction(getCreateTxService());
		jtaTxmgr.setTransactionManager(getHendleTxMgr());
		return jtaTxmgr;
	}
}
