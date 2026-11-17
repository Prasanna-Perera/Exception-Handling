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
			a=x/y;
		}catch(ArithmeticException ex){
			a=-1;
		}
		System.out.println("x/y : "+a);
		System.out.println("End main");
	}
}
//if y = 0 then result (a)-> "-1"
//int a=y==0 ? -1:x/y; (Data validation)
