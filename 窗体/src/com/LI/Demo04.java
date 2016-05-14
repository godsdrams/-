package com.LI;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//删除窗口
@SuppressWarnings("serial")
public class Demo04 extends JFrame {
	private JLabel jl1 = new JLabel("删除卡片名称：");
	private JTextField jt1 = new JTextField(15);
	private JButton but1 = new JButton("确定");
	private JButton but2 = new JButton("返回");	
	
	private Box box1 = Box.createVerticalBox(); 

	
	public void init(){

		box1.add(Box.createVerticalStrut(150));

	}
	
	public Demo04() {
		super("删除卡片");
		this.setSize(350,250);
		this.setLocation(500, 300);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.init();
		this.add(box1);
		this.add(jl1);
		this.add(jt1);
		this.add(but1);
		this.add(but2);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo04();
	}

}
