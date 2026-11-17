/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author ASUS ROG
 */
class A{}
class B extends A{public void mB(){System.out.println("mB");}}
class C extends A{public void mC(){System.out.println("mC");}}
class Demo{	
	public static void main(String args[]){
		System.out.println("Start main");
		A a1=new B();
		C c1=(C)a1;
		c1.mC();
		System.out.println("End main");
	}
}



