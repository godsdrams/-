package com.LI.card;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//这是一个系统类
public class Sys extends Conl {

	public static void main(String[] args) {
		Sys sy = new Sys();
		sy.watch();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);// 实例化输入对象
		while (true) {
			// 功能选择
			System.out.println("请输入一级功能编号");
			String num = scan.nextLine();
			switch (num) {
			case "1": {
				// 查询所有卡片信息
				System.out.println("查询信息如下：");
				try {
					List<Card> relist = new ArrayList<Card>();
					relist = sy.findall();
					for (Card card : relist) {
						System.out.println("[ 名称：" + card.getName() + "   生命："
								+ card.getHealth() + "血" + "   攻击："
								+ card.getAttack() + "攻" + "   费用："
								+ card.getConsume() + "费" + "   品质："
								+ card.getColor() + "]");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
				break;

			case "2": {
				// 添加卡片信息
				while (true) {

					System.out
							.println("请按【卡片名称+卡片生命+卡片攻击+卡片费用+卡片品质】的格式输入添加信息，或输入【break】返回上层");
					String mic = scan.nextLine();
					if (mic.equals("break")) {
						break;
					}

					String[] micArr = mic.split("\\+");
					String names = micArr[0];
					int consumes = Integer.parseInt(micArr[1]);
					if (consumes > 25 || consumes < 0) {
						System.out.println("费用输入不合法,请重新输入");
						break;
					}
					int healths = Integer.parseInt(micArr[2]);
					int attacks = Integer.parseInt(micArr[3]);
					String colors = micArr[4];
					if ((!(colors.equals("白色")) && (!(colors.equals("蓝色")))
							&& (!(colors.equals("紫色"))) && (!(colors
								.equals("橙色"))))) {
						System.out.println("颜色输入不合法,请重新输入");
						break;
					}
					// 封装对象
					Card cards = new Card(names, consumes, healths, attacks,
							colors);
					// 调用保存方法
					try {
						sy.add(cards);
					} catch (SQLException e) {

						e.printStackTrace();
					}
					System.out.println("添加成功");
				}

			}
				break;

			case "3": {
				// 删除卡片信息
				while (true) {
					System.out.println("请输入删除的【卡片名称】或输入【break】返回");
					String namein = scan.nextLine();
					if (namein.equals("break")) {
						break;
					}
					List<Card> relist = new ArrayList<Card>();
					try {
						relist = sy.findname(namein);
					} catch (SQLException e) {

						e.printStackTrace();
					}
					if (relist == null) {
						System.out.println("该卡片不存在！");
						continue;
					}
					try {
						sy.delete(namein);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					System.out.println("删除成功！");
				}
			}
				break;

			case "4": {
				// 更新卡片信息
				while (true) {
					System.out.println("请输入要修改的【卡片名称】或者输入【break】返回主目录");
					String micin = scan.nextLine();
					if (micin.equals("break")) {
						break;
					}
					List<Card> mics = new ArrayList<Card>();
					try {
						mics = sy.findname(micin);
						if (mics == null) {
							System.out.println("该卡片不存在！");
							continue;
						}
						System.out.println("原来信息：");
						for (Card card : mics) {
							System.out.println("[ 名称：" + card.getName()
									+ "   生命：" + card.getHealth() + "血"
									+ "   攻击：" + card.getAttack() + "攻"
									+ "   费用：" + card.getConsume() + "费"
									+ "   品质：" + card.getColor() + "]");
						}
						System.out.println("请输入修改后的信息【卡片费用+卡片生命值+卡片攻击力+卡片颜色】:");
						String micss = scan.nextLine();

						String[] micarr = micss.split("\\+");
						String names = micin;
						int consumes = Integer.parseInt(micarr[0]);
						int healths = Integer.parseInt(micarr[1]);
						int attacks = Integer.parseInt(micarr[2]);
						String colors = micarr[3];
						// 封装对象
						Card newcards = new Card(names, consumes, healths,
								attacks, colors);
						// 调用跟新
						sy.update(newcards);
						System.out.println("修改成功！");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
				break;
			case "5": {
				// 精确查找
				sy.watchs();
				int i = 0;
				while (true) {
					// 功能选择

					if (i == 1) {
						break;
					}
					System.out.println("请输入二级功能编号");
					String num2 = scan.nextLine();
					switch (num2) {
					case "1": {
						// 通过颜色查找
						while (true) {
							System.out.println("请输入查找的【卡片品质】或输入【break】返回");
							String colorin = scan.nextLine();
							if (colorin.equals("break")) {
								break;
							}
							List<Card> Cardadd;
							try {
								Cardadd = sy.findcolor(colorin);
								System.out
										.println(Cardadd == null ? "sorry not found!"
												: Cardadd);
							} catch (SQLException e) {

								e.printStackTrace();
							}
						}

					}
						break;

					case "2": {
						// 通过费用查找
						while (true) {
							System.out.println("请输入要查询的【卡片费用】或输入【break】返回上一级");

							String conin = scan.nextLine();
							if (conin.equals("break")) {
								break;
							}
							int consume = Integer.parseInt(conin);
							List<Card> Cardadd;
							try {
								Cardadd = sy.findconsume(consume);
								System.out
										.println(Cardadd == null ? "sorry not found!"
												: Cardadd);
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
						break;

					case "3": {
						// 通过攻击力查找
						while (true) {
							System.out.println("请输入要查询的【卡片攻击】或输入break返回上一级");

							String attin = scan.nextLine();
							if (attin.equals("break")) {
								break;
							}
							int attack = Integer.parseInt(attin);
							List<Card> Cardadd;
							try {
								Cardadd = sy.findattack(attack);
								System.out
										.println(Cardadd == null ? "sorry not found!"
												: Cardadd);
							} catch (SQLException e) {
								e.printStackTrace();
							}

						}

					}
						break;

					case "4": {
						// 通过生命值查找
						while (true) {
							System.out.println("请输入要查询的【卡片生命】或输入break返回上一级");

							String healin = scan.nextLine();
							if (healin.equals("break")) {
								break;
							}
							int health = Integer.parseInt(healin);
							List<Card> Cardadd;
							try {
								Cardadd = sy.findhealth(health);
								System.out
										.println(Cardadd == null ? "sorry not found!"
												: Cardadd);
							} catch (SQLException e) {

								e.printStackTrace();
							}

						}
					}
						break;

					case "5": {
						// 通过名称查找
						while (true) {
							System.out.println("请输入查找的【卡片名称】或输入【break】返回");
							String namein = scan.nextLine();
							if (namein.equals("break")) {
								break;
							}
							List<Card> Cardadd;
							try {
								Cardadd = sy.findname(namein);
								System.out
										.println(Cardadd == null ? "sorry not found!"
												: Cardadd);
							} catch (SQLException e) {

								e.printStackTrace();
							}
						}

					}
						break;

					case "help": {
						// 重新打印视图
						sy.watchs();
					}
						break;

					case "break": {
						i = 1;
						break;
					}
					}
				}
			}

				break;

			case "help": {
				// 重新打印视图
				sy.watch();
			}
				break;
			case "exit": {
				// 关闭程序
				System.out.println("欢迎再次使用");
				System.exit(0);
			}
				break;

			default: {
				System.out.println("输入错误！请重新输入");
			}
			}
		}
	}

	// 一级目录
	public void watch() {
		System.out.println("**********卡片信息管理系统**********");
		System.out.println("**1. 查询所有卡片信息");
		System.out.println("**2. 添加卡片信息");
		System.out.println("**3. 删除卡片信息");
		System.out.println("**4. 更新卡片信息");
		System.out.println("**5. 查询卡片信息");
		System.out.println("**exit. 退出系统");
		System.out.println("**help. 帮助");
		System.out.println("************************************");
	}

	// 二级目录
	public void watchs() {
		System.out.println("**********分类查找**********");
		System.out.println("**1. 通过品质查找卡片信息");
		System.out.println("**2. 通过费用查找卡片信息");
		System.out.println("**3. 通过攻击力查找卡片信息");
		System.out.println("**4. 通过生命值查找卡片信息");
		System.out.println("**5. 通过名称查找卡片信息");
		System.out.println("**break. 返回上级目录");
		System.out.println("**help. 帮助");
		System.out.println("************************************");
	}

}
