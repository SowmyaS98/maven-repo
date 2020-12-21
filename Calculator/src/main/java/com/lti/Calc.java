package com.lti;

public class Calc {
	public static  int add(int n1,int n2)
	{
		return n1+n2;
	}
	
	public static  int sub(int n1,int n2)
	{
		return n1-n2;
	}
	
	public static  int mul(int n1,int n2)
	{
		return n1*n2;
	}
	public static  int div(int n1,int n2)
	{
		return n1/n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum is: "+add(10,20));
		System.out.println("diff is: "+sub(30,20));
		System.out.println("mul is: "+mul(30,20));
		System.out.println("div is: "+div(30,10));

	}

}
