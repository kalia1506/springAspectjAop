package kcp.springAOP.advice;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;

public class DiscountCouponAdvice {
	@SuppressWarnings("resource")
	public void generateCoupon(JoinPoint joinPoint, double returnVal)throws Throwable {
		String couponMsg=null;
		FileWriter file=null;
		file=new FileWriter("CouponSlip.log",true);
		
			if(returnVal>=100000) {
				couponMsg="50% discount for your next shooping with total billAmount"+returnVal+"\n";
			}else if (returnVal>=50000) {
				couponMsg="30% discount for your next shooping with total billAmount"+returnVal+"\n";
			}else if (returnVal>=25000) {
				couponMsg="20% discount for your next shooping with total billAmount"+returnVal+"\n";
			}else if (returnVal>=10000) {
				couponMsg="10% discount for your next shooping with total billAmount"+returnVal+"\n";
			}else {
				couponMsg="2% discount for your next shooping with total billAmount"+returnVal+"\n";
			}
			file.write(couponMsg);
			file.flush();
	}
}
