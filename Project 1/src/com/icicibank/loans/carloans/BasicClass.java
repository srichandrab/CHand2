package com.icicibank.loans.carloans;

public class BasicClass implements BasicInterface
{
	
	int a=10;
	float f=10.00f;
	public void m1()
	
	{
		System.out.println("HI I am m1 method...");
		
	}
	
   public void m2()
{
	System.out.println("Hi I am m2 method..");
}
	public static void main(String[] args) {
		System.out.println("HI");
		BasicClass obj=new BasicClass();
		obj.m1();
		obj.m2();
		obj.m3();
		System.out.println(obj.a);
		System.out.println(obj.f);
 
		
		BasicClass obj1=new BasicClass();
		
		
		
	}

	@Override
	public void m3() {
		Object obj;
		// TODO Auto-generated method stub
		System.out.println("Pulling m3");
		
	}



	}


