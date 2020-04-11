package kcp.springAspectj.service;

public class DifferentAreaCalc implements IDifferentAreaCalc {
	public double CircleArea(double radious) {
		System.out.println("DifferentAreaCalc.CircleArea()");
		return radious * radious * 3.14;
	}
	public double CircleParameter(double radius) {
		System.out.println("DifferentAreaCalc.CircleParameter()");
		return 2*3.14*radius;

	}
}
