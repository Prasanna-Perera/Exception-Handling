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
			ar[3]=100;
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("End main");
	}
}




