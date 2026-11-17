/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
class Demo{	
	public static void main(String args[]){
		System.out.println("Start main");
		int a;
		try{
			a=100;
		}catch(ArithmeticException ex){

		}
		System.out.println(a); //Illegal
		System.out.println("End main");
	}
}
//—-----------------------------------------------------------------
class Demo{	
	public static void main(String args[]){
		System.out.println("Start main");
		int a;
		try{
			a=100;
		}catch(ArithmeticException ex){
			a=-1;
		}
		System.out.println(a); //legal
		System.out.println("End main");
	}
}
//—----------------------------------------------------
class Demo{	
	public static void main(String args[]){
		System.out.println("Start main");
		final int a;
		try{
			a=100;
		}catch(ArithmeticException ex){
			a=-1; //Illegal
		}
		System.out.println(a); 
		System.out.println("End main");
	}
}




