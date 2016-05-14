package com.LI.card;

//这是一个属性类
public class Card {

	private int consume;// 卡片费用
	private int health;// 卡片生命值
	private int attack;// 卡片攻击力
	private String name;// 卡片名称
	private String color;// 卡片颜色

	public Card(String name, int consume, int health, int attack, String color) {

		this.consume = consume;
		this.health = health;
		this.attack = attack;
		this.name = name;
		this.color = color;
	}

	public Card() {
		// TODO 自动生成的构造函数存根
	}

	public int getConsume() {
		return consume;
	}

	public void setConsume(int consume) {
		this.consume = consume;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Card [ consume=" + consume + ", health=" + health + ", attack="
				+ attack + ", name=" + name + ", color=" + color + "]";
	}

}
