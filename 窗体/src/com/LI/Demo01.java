package com.LI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

//系统首页
@SuppressWarnings("serial")
public class Demo01 extends JFrame {
	private JButton but1 = new JButton("查看全部信息");
	private JButton but2 = new JButton("添加卡片信息");
	private JButton but3 = new JButton("查询卡片信息");
	private JButton but4 = new JButton("删除卡片信息");
	private JButton but5 = new JButton("更新卡片信息");
	private JButton but6 = new JButton("退出本次使用");
	private Box box2 = Box.createVerticalBox();
	
	public void init(){
		box2.add(Box.createHorizontalStrut(150));
		box2.add(Box.createVerticalStrut(10));
		box2.add(but1);
		box2.add(Box.createVerticalStrut(10));
		box2.add(but2);
		box2.add(Box.createVerticalStrut(10));
		box2.add(but3);
		box2.add(Box.createVerticalStrut(10));
		box2.add(but4);
		box2.add(Box.createVerticalStrut(10));
		box2.add(but5);
		box2.add(Box.createVerticalStrut(10));
		box2.add(but6);
		box2.add(Box.createVerticalStrut(10));
		box2.add(Box.createHorizontalStrut(130));
	}
	
	
	
	
	public Demo01(){
		super("登陆页面");
		this.setSize(600,400);
		this.setLocation(200, 200);
		this.init();
		this.add(box2);
		this.setVisible(true);
		but1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				new Demo02();
			}
		});
		but2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				new Demo03();
			}
		});
		but3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				new Demo06_1();
			}
		});
		but4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				new Demo04();
			}
		});
		but5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				new Demo05_1();
			}
		});
			
			
			
			
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo01();
	}

}

	
	
	
