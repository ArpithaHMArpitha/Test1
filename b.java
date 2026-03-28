package com;

// 2. Method with argument, without return statement

class MethodExample2 {
	
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("the sum of "+ a + " and " + b + " is " + sum);
	}
	
	public static void main(String[] args) {
		MethodExample2 me2 = new MethodExample2();
		me2.add(5, 6);
	}

}