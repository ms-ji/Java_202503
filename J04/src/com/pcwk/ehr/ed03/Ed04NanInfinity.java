/**
 * 파일명: Ed04NanInfinity.java<br/>
 * 생성일: 2025-03-21
 */
package com.pcwk.ehr.ed03;

public class Ed04NanInfinity {

	public static void main(String[] args) {
		//정수 나눗셈
		int a = 10;
		int b =0;
		
		System.out.printf("%d / %d =%d%n",a,2,(a/2));
		//ArithmeticException: 0으로 나누면 예외 발생/ by zero
		//System.out.printf("%d / %d =%d%n",a,b,(a/b));
		
		//실수 나눗셈
		double x = 10.0;
		double y = 0.0;
		
		System.out.printf("%.1f / %.1f %n",x,y); //10.0 / 0.0 
		System.out.printf("%.1f / %.1f =%.1f%n",x,y,(x/y)); //10.0 / 0.0 =Infinity
	
		x=-x;
		System.out.printf("%.1f / %.1f %n",x,y); //-10.0 / 0.0 
		System.out.printf("%.1f / %.1f =%.1f%n",x,y,(x/y)); //-10.0 / 0.0 =-Infinity
		
		x=0.0;
		System.out.println("x/y= "+(x/y)); //NaN
		
	}

}
