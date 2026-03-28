package com;

class MethodExample1 {
	//1. Method without argument, without return statement
	
	public void test() {
		System.out.println("learning methods in java");
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("---------");
		MethodExample1 me1 = new MethodExample1();
		me1.test();
		System.out.println("---------");
		System.out.println("End");
		
	}

}