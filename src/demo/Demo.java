/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
class Demo{	
	public static void myMethod1(){
		System.out.println("Start myMethod1");
		myMethod2();
		System.out.println("End myMethod1");
	}
	public static void myMethod2(){
		System.out.println("Start myMethod2");
		try{
			myMethod3();
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("End myMethod2");
	}
	public static void myMethod3(){
		System.out.println("Start myMethod3");
		int ar[]=new int[3];
		ar[3]=100;
		System.out.println("End myMethod3");
	}
	public static void main(String args[]){
		System.out.println("Start main");
		myMethod1();
		System.out.println("End main");
	}
}





