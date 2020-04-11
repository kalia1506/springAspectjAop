package kcp.AspectjAOP.advice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BankLoanApproveAuditting {
	@Value(value = "kalu charan panda")
	private String managerName;

	/*
	 * @Around("execution(* kcp.springAOP.service.*.*(..))") public void
	 * auditting(Integer loanId, String loanType, double amount) throws Throwable {
	 * FileWriter fw = null; String auditLogMsg = null; fw = new
	 * FileWriter("audting1.log", true); auditLogMsg =
	 * "your loan is approve with loanId " + loanId + " and loan type is " +
	 * loanType + " loan passed by  " + managerName + " at " + new Date() + "\n";
	 * fw.write(auditLogMsg); fw.flush();
	 * 
	 * }
	 */
	@SuppressWarnings("resource")
	@Before("execution(* kcp.springAOP.service.*.*(..))")
	public void auditting(JoinPoint jPoint) throws IOException {
		System.out.println("BankLoanApproveAudtting.audtting()");
		System.out.println("METHOD NAME:: " + jPoint.getSignature());
		System.out.println("Method Arguments:: " + Arrays.toString(jPoint.getArgs()));
		FileWriter fw = null;
		String auditLogMsg = null;
		fw = new FileWriter("audting.log", true);
		Object[] args = jPoint.getArgs();
		if (args[1].equals("goldloan")) {
			auditLogMsg = "your loan is approve with loanId " + args[0] + " and loan type is " + args[1]
					+ " loan passed by  " + managerName + " at " + new Date() + "\n";
		} else {
			auditLogMsg = "rejected your loantype " + args[1] + "\n";
		}
		fw.write(auditLogMsg);
		fw.flush();
	}

}
