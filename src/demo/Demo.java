/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
class Demo{	
	public static void main(String args[]){
		System.out.println("Start main");
		String name="Niroth";
		char lastCharacter;
		try{
			lastCharacter=name.charAt(6);
		}catch(StringIndexOutOfBoundsException ex){
			lastCharacter=name.charAt(name.length()-1);
		}
		System.out.println("Last Character : "+lastCharacter);
		System.out.println("End main");
	}
}
