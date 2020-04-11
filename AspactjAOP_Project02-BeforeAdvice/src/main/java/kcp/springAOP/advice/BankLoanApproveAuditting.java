package kcp.springAOP.advice;

import java.io.FileWriter;
import java.util.Date;

public class BankLoanApproveAuditting {
	private String managerName;

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	@SuppressWarnings("resource")
	public void auditting(Integer loanId, String loanType, double amount) throws Throwable{
		 FileWriter fw = null;
		 String auditLogMsg= null;
		 fw = new FileWriter("audting1.log", true);
		 auditLogMsg ="your loan is approve with loanId " +loanId + " and loan type is " +
						  loanType + " loan passed by  " + managerName+" at "+new Date()+"\n";
		 fw.write(auditLogMsg); 
		 fw.flush();
		
	}
	/*
	  public void auditting(JoinPoint jPoint) throws IOException {
	  System.out.println("BankLoanApproveAudtting.audtting()");
	  System.out.println("METHOD NAME:: " + jPoint.getSignature());
	  System.out.println("Method Arguments:: " +
	 Arrays.toString(jPoint.getArgs())); FileWriter fw = null; String auditLogMsg
	  = null; fw = new FileWriter("audting.log", true); Object[] args =
	 jPoint.getArgs(); if (args[1].equals("goldloan")) { auditLogMsg =
	  "your loan is approve with loanId " + args[0] + " and loan type is " +
	  args[1] + " loan passed by  " + managerName+" at "+new Date()+"\n"; } else {
	  auditLogMsg = "rejected your loantype " + args[1]+"\n"; }
	 fw.write(auditLogMsg); fw.flush(); }
	 */
}
