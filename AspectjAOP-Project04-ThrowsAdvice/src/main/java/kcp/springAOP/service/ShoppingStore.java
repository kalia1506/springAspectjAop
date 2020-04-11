package kcp.springAOP.service;

public class ShoppingStore {
	public double generateBillAmount(String[] items, double[] prices) {
		double totalAmount = 0;
		for (double price : prices) {
			if (price == 0) {
				throw new IllegalArgumentException("Zero couldn't be allow");
			} else {
				totalAmount = totalAmount + price;
			}
		}
		return totalAmount;

	}
}
