package kcp.springAOP.service;

public interface IBankService {
	public double calcSimpleInterest(double pAmt, double rate, int time);

	public double calcCompoundInterest(double pAmt, double rate, int time);
}
