package kcp.springAOP.service;

import java.util.Calendar;

public class BankLoanApproval {
	public String approval(Integer loanId, String loanType, double amount) {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		if (month >= 1 && month <= 5) {
			if (loanType.equalsIgnoreCase("goldloan"))
				return "Your Laon is Successfully Approved with " + loanType;
		}
		return loanType + " is rejected";

	}

}
