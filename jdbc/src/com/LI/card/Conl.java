package com.LI.card;

import java.sql.SQLException;
import java.util.List;

//这是一个控制类
public class Conl extends Way {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	// 添加方法
	public void add(Card cardas) throws SQLException {
		Conl conss = new Conl();
		conss.addCard(cardas);
	}

	// 更新方法
	public void update(Card cardas) throws SQLException {
		Conl conss = new Conl();
		conss.upCard(cardas);
	}

	// 删除方法
	public void delete(String name) throws SQLException {
		Conl conss = new Conl();
		conss.deleCard(name);
	}

	// 寻找全部方法
	public List<Card> findall() throws SQLException {
		Conl conss = new Conl();
		return conss.findallCard();

	}

	// 颜色查找
	public List<Card> findcolor(String color) throws SQLException {
		Conl conss = new Conl();
		return conss.findbyColor(color);

	}

	// 姓名查找
	public List<Card> findname(String name) throws SQLException {
		Conl conss = new Conl();
		return conss.findbyName(name);

	}

	// 攻击查找
	public List<Card> findattack(int att) throws SQLException {
		Conl conss = new Conl();
		return conss.findbyAttcak(att);
	}

	// 生命查找
	public List<Card> findhealth(int heal) throws SQLException {
		Conl conss = new Conl();
		return conss.findbyHealth(heal);
	}

	// 费用查找
	public List<Card> findconsume(int consume) throws SQLException {
		Conl conss = new Conl();
		return conss.findbyConsume(consume);
	}

}
