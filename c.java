package com;

// 3. Method without argument, with return statement.

class MethodExample3 {
	
	public int print() {
		return 50;
	}
	
	public String display() {
		return "Dhee coding lab";
	}
	
	public static void main(String[] args) {
		MethodExample3 me3 = new MethodExample3();
		
		//Calling the print() method
		int result = me3.print();
		System.out.println(result); // we can use this way to print return statement
		System.out.println(me3.print()); // or else we can use this also

		
		// Calling display() method
		String message = me3.display();
		System.out.println(message); // here also same
		System.out.println(me3.display());
		
	}
	

}
