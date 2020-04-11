package kcp.springAOP.service;

public class BankServiceMgmt implements IBankService {
	public double calcSimpleInterest(double pAmt, double rate, int time) {
		System.out.println("BankServiceMgmt.calcSimpleInterest()");
		return (pAmt * rate * time) / 100;
	}

	public double calcCompoundInterest(double pAmt, double rate, int time) {
		System.out.println("BankServiceMgmt.calcCompoundInterest()");
		return pAmt* Math.pow((1 + rate / time), time);
	}
}
