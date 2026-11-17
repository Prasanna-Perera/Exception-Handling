/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
/*
class Thread{
	public static void sleep(long x)throws InterruptedException{
		//
	}
}
*/
class Demo{	
	public static void main(String args[])throws InterruptedException{
		System.out.println("Start main");
		int[] ar=new int[3];
		ar[-100]=300;
		Thread.sleep(2000);
		System.out.println("End main");
	}
}



