package com.LI;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Demo06_1 extends JFrame {

	private JButton but1 = new JButton("通过颜色查找");
	private JButton but2 = new JButton("通过费用查找");
	private JButton but3 = new JButton("通过生命查找");
	private JButton but4 = new JButton("通过攻击查找");
	private JButton but5 = new JButton("通过品质查找");
	private JButton but6 = new JButton("返回上级菜单");
	
	private Box box1 = Box.createVerticalBox();
	public void init(){

		box1.add(Box.createVerticalStrut(100));

	}
	public Demo06_1() {
		super("登陆页面");
		this.setSize(300,250);
		this.setLocation(500, 300);
		this.setLayout(new FlowLayout());
		this.init();
		this.add(box1);
		this.add(but1);
		this.add(but2);
		this.add(but3);
		this.add(box1);
		this.add(but4);
		this.add(but5);
		this.add(but6);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo06_1();
	}

}
