/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

class Demo{	
	public static void main(String args[]){
		System.out.println("Start main");
		int[] ar=new int[3];
		ar[-100]=300; //throws ArrayIndexOutOfBoundsException {Compile time unchecked}
		Thread.sleep(2000); //throws InterruptedException {Compile time checked}
		System.out.println("End main");
	}
}



