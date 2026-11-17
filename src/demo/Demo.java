/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
class Demo{	
	public static void main(String args[]){
		System.out.println("Start main");
		String sNum="120a";
		int num;
		try{
			num=Integer.parseInt(sNum);
		}catch(NumberFormatException ex){
			num=0;
		}
		System.out.println("Num : "+num);
		System.out.println("End main");
	}
}


