package com.LI;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

//查看窗口
@SuppressWarnings("serial")
public class Demo02 extends JFrame {

	private JLabel jl = new JLabel("查询结果如下：");
	private JList<String> list =  new JList<String>();
	private Box box1 = Box.createVerticalBox();
	
	public void init(){
		box1.add(jl);
		box1.add(list);
		
	}
	
	
	public Demo02(){
		super("查询全部卡片");
		this.setSize(600,400);
		this.setLocation(220, 220);
		this.setVisible(true);
		this.init();
		this.add(box1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo02();
	}

}
