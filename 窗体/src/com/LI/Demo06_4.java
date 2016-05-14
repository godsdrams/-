package com.LI;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

@SuppressWarnings("serial")
public class Demo06_4 extends JFrame {


	private JLabel jl = new JLabel("查询结果如下：");
	private JList<String> list =  new JList<String>();
	
	private Box box1 = Box.createVerticalBox();
	
	public void init(){
		box1.add(jl);
		box1.add(list);
		
	}
	
	
	public Demo06_4(){
		super("通过生命查询");
		this.setSize(600,400);
		this.setLocation(220, 220);
		this.setVisible(true);
		this.init();
		this.add(box1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo06_4();
	}

}
