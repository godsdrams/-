package com.LI;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Demo05_2 extends JFrame {

	
	private JLabel jl1 = new JLabel("更新费用：");
	private JLabel jl2 = new JLabel("更新血量：");
	private JLabel jl3 = new JLabel("更新攻击：");
	private JLabel jl4 = new JLabel("更新品质：");
	
	
	private JTextField jt1 = new JTextField(25);
	private JTextField jt2 = new JTextField(25);
	private JTextField jt3 = new JTextField(25);
	private JTextField jt4 = new JTextField(25);
	
	private Box box1 = Box.createVerticalBox(); 
	private Box box3 = Box.createHorizontalBox();
	private Box box4 = Box.createHorizontalBox();
	private Box box5 = Box.createHorizontalBox();
	private Box box6 = Box.createHorizontalBox();
	private Box box7 = Box.createHorizontalBox();
	
	private JButton but1 = new JButton("确定");
	private JButton but2 = new JButton("返回");
	
	public void init(){
		
		box3.add(jl2);
		box3.add(jt2);
		box4.add(jl3);
		box4.add(jt3);
		box5.add(jl4);
		box5.add(jt4);
		box7.add(but1);
		box7.add(but2);
		box1.add(box3);
		box1.add(box4);
		box1.add(box5);
		box1.add(box6);
		box1.add(box7);
		
		
	}
	
	public Demo05_2(){
		
		super("更新卡片");
		this.setSize(350,250);
		this.setLocation(500, 300);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
//		this.init();
//		this.add(box1);
		this.add(jl1);
		this.add(jt1);
		this.add(jl2);
		this.add(jt2);
		this.add(jl3);
		this.add(jt3);
		this.add(jl4);
		this.add(jt4);
		this.add(but1);
		this.add(but2);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo05_2();
	}

}
