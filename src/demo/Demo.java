/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
class Demo{	
	public static void main(String args[]){
		System.out.println("Start main");
		int x=42,y=0;
		int a;
		try{
			a=x/y; //y=0
			System.out.println("try block");
		}catch(ArithmeticException ex){
			a=-1;
			System.out.println("catch block");
		}
		System.out.println("x/y : "+a);
		System.out.println("End main");
	}
}



