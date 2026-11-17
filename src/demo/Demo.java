/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
		int[] ar=new int[3];
		String name="Niroth";
		int a=0,b=6,c=3;
		try{
			ar[c]=name.charAt(b)/a; 
		}catch(ArithmeticException ex){
			System.out.println("Arithmetic error");
		}catch(IndexOutOfBoundsException ex){
			System.out.println("any index error");
		}catch(StringIndexOutOfBoundsException ex){
			System.out.println("String index error");
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Array index error");
		}
		System.out.println("End main");
	}
}


