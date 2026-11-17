/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JLabel lblResult;
	private JButton btnExecute;
	
	MyFrame(){
		setSize(300,300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		
		txtNum1=new JTextField(3);
		txtNum1.setFont(new Font("",1,20));
		add(txtNum1);
		JLabel lblOperator=new JLabel("/");
		lblOperator.setFont(new Font("",1,20));
		add(lblOperator);
		txtNum2=new JTextField(3);
		txtNum2.setFont(new Font("",1,20));
		add(txtNum2);
		btnExecute=new JButton("=");
		btnExecute.setFont(new Font("",1,20));
		
btnExecute.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String sNum1=txtNum1.getText();
				String sNum2=txtNum2.getText();
				int num1=Integer.parseInt(sNum1);
				int num2=Integer.parseInt(sNum2);
				int result=num1/num2;
				lblResult.setText(""+result);
			}
		});
		add(btnExecute);
		lblResult=new JLabel("  0  ");
		lblResult.setFont(new Font("",1,20));
		add(lblResult);
		pack();
	}
}
class Demo{	
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}






