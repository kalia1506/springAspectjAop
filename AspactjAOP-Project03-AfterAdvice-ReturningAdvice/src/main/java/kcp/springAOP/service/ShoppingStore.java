package kcp.springAOP.service;

public class ShoppingStore {
	public double generateBillAmount(String[] items, double[] prices) {
		double totalAmount = 0;
		for (double price : prices) {
			totalAmount = totalAmount + price;
		}
		return totalAmount;

	}
}
