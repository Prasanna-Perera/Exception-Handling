/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
class Demo{	
	public static void main(String args[]){
		System.out.println("Start main");
		int ar[]=new int[3];
		try{
			ar[3]=100;  //throws "ArrayIndexOutOfBoundsException"
		}catch(/*Insert code here*/){
			System.out.println("catch block");
		}
		System.out.println("End main");
	}
}
//A. ArrayIndexOutOfBoundsException ex
//B. IndexOutOfBoundsException ex
//C. RuntimeException ex
//D. Exception ex
//E. Throwable ex
//F. Object ex //Illegal




