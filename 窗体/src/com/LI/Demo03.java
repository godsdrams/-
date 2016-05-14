package com.LI;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//添加窗口
@SuppressWarnings("serial")
public class Demo03 extends JFrame {

	
	private JLabel jl1 = new JLabel("添加名称：");
	private JLabel jl2 = new JLabel("添加费用：");
	private JLabel jl3 = new JLabel("添加血量：");
	private JLabel jl4 = new JLabel("添加攻击：");
	private JLabel jl5 = new JLabel("添加品质：");
	
	private JTextField jt1 = new JTextField(25);
	private JTextField jt2 = new JTextField(25);
	private JTextField jt3 = new JTextField(25);
	private JTextField jt4 = new JTextField(25);
	private JTextField jt5 = new JTextField(25);
	
	private Box box1 = Box.createVerticalBox(); 
	private Box box2 = Box.createHorizontalBox();
	private Box box3 = Box.createHorizontalBox();
	private Box box4 = Box.createHorizontalBox();
	private Box box5 = Box.createHorizontalBox();
	private Box box6 = Box.createHorizontalBox();
	private Box box7 = Box.createHorizontalBox();
	
	private JButton but1 = new JButton("确定");
	private JButton but2 = new JButton("返回");
	
	public void init(){
		box2.add(jl1);
		box2.add(jt1);
		box3.add(jl2);
		box3.add(jt2);
		box4.add(jl3);
		box4.add(jt3);
		box5.add(jl4);
		box5.add(jt4);
		box6.add(jl5);
		box6.add(jt5);
		box7.add(but1);
		box7.add(but2);
		box1.add(box2);
		box1.add(box3);
		box1.add(box4);
		box1.add(box5);
		box1.add(box6);
		box1.add(box7);
		
		
	}
	
	public Demo03(){
		
		super("添加卡片");
		this.setSize(350,300);
		this.setLocation(500, 250);
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
		this.add(jl5);
		this.add(jt5);
		this.add(but1);
		this.add(but2);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo03();
	}

}
