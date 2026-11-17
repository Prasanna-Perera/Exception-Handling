/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

class Demo{	
	public static void main(String args[]){
		System.out.println("Start main");
		int[] ar=new int[3];
		String name="Niroth";
		int a=0,b=6,c=3;
		try{
			ar[c]=name.charAt(b)/a; 
		}catch(ArithmeticException ex){
			System.out.println("Arithmetic error");
		}catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex){ //Since JDK6
			System.out.println("index error");
		}
		System.out.println("End main");
	}
}


