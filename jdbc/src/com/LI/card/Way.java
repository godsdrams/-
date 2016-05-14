package com.LI.card;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//这是一个方法类
public class Way {

	private static Connection conn = null;

	static {
		// 1.加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2.获得数据库连接
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/t_card",
					"root", "1234");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {

	}

	// 添加卡片信息
	public void addCard(Card a) throws SQLException {
		conn.createStatement();
		String sqladd = "insert into card1(name,attack,health,consume,color)"
				+ "values(?,?,?,?,?);";
		java.sql.PreparedStatement ps = conn.prepareStatement(sqladd);
		ps.setString(1, a.getName());
		ps.setInt(2, a.getAttack());
		ps.setInt(3, a.getHealth());
		ps.setInt(4, a.getConsume());
		ps.setString(5, a.getColor());
		ps.execute();

	}

	// 更新卡片信息
	public void upCard(Card u) throws SQLException {
		conn.createStatement();
		String sqlup = "update card1 set attack=?,health=?,consume=?,color=?"
				+ " where name = ?";

		java.sql.PreparedStatement ps = conn.prepareStatement(sqlup);
		ps.setInt(1, u.getAttack());
		ps.setInt(2, u.getHealth());
		ps.setInt(3, u.getConsume());
		ps.setString(4, u.getColor());
		ps.setString(5, u.getName());
		ps.executeUpdate();
	}

	// 删除卡片信息
	public void deleCard(String d) throws SQLException {
		String sqldel = "delete from card1 where name = ?";
		java.sql.PreparedStatement dele = conn.prepareStatement(sqldel);
		dele.setString(1, d);
		dele.execute();
	}

	// 查询全部卡片信息
	public List<Card> findallCard() throws SQLException {
		Statement stmtall = conn.createStatement();
		ResultSet rs = stmtall
				.executeQuery("select name,attack,health,consume,color from card1");
		List<Card> recard = new ArrayList<Card>();
		while (rs.next()) {
			Card lcard = new Card();
			lcard.setName(rs.getString("name"));
			lcard.setAttack(rs.getInt("attack"));
			lcard.setHealth(rs.getInt("health"));
			lcard.setConsume(rs.getInt("consume"));
			lcard.setColor(rs.getString("color"));
			recard.add(lcard);
		}
		return recard;
	}

	// 以颜色为查询关键字
	public List<Card> findbyColor(String color) throws SQLException {
		List<Card> recard = new ArrayList<Card>();

		String sql = new String();
		sql = "select * from card1 where color like ?";
		java.sql.PreparedStatement findbycolor = conn.prepareStatement(sql);
		findbycolor.setString(1, "%" + color + "%");
		ResultSet rs = findbycolor.executeQuery();
		while (rs.next()) {
			Card lcard = new Card();
			lcard.setName(rs.getString("name"));
			lcard.setAttack(rs.getInt("attack"));
			lcard.setHealth(rs.getInt("health"));
			lcard.setConsume(rs.getInt("consume"));
			lcard.setColor(rs.getString("color"));
			recard.add(lcard);
		}
		return recard;

	}

	// 以攻击为查询关键字
	public List<Card> findbyAttcak(int attack) throws SQLException {
		List<Card> recard = new ArrayList<Card>();

		String sql = new String();
		sql = "select * from card1 where attack = ?";
		java.sql.PreparedStatement findbyattack = conn.prepareStatement(sql);
		findbyattack.setInt(1, attack);
		ResultSet rs = findbyattack.executeQuery();
		while (rs.next()) {
			Card lcard = new Card();
			lcard.setName(rs.getString("name"));
			lcard.setAttack(rs.getInt("attack"));
			lcard.setHealth(rs.getInt("health"));
			lcard.setConsume(rs.getInt("consume"));
			lcard.setColor(rs.getString("color"));
			recard.add(lcard);
		}
		return recard;

	}

	// 以生命为关键字
	public List<Card> findbyHealth(int health) throws SQLException {
		List<Card> recard = new ArrayList<Card>();
		String sql = new String();
		sql = "select * from card1 where health = ?";
		java.sql.PreparedStatement findbyhealth = conn.prepareStatement(sql);
		findbyhealth.setInt(1, health);
		ResultSet rs = findbyhealth.executeQuery();
		while (rs.next()) {
			Card lcard = new Card();
			lcard.setName(rs.getString("name"));
			lcard.setAttack(rs.getInt("attack"));
			lcard.setHealth(rs.getInt("health"));
			lcard.setConsume(rs.getInt("consume"));
			lcard.setColor(rs.getString("color"));
			recard.add(lcard);
		}
		return recard;

	}

	// 以费用为关键字
	public List<Card> findbyConsume(int consume) throws SQLException {
		List<Card> recard = new ArrayList<Card>();
		String sql = new String();
		sql = "select * from card1 where consume = ?";
		java.sql.PreparedStatement findbyconsume = conn.prepareStatement(sql);
		findbyconsume.setInt(1, consume);
		ResultSet rs = findbyconsume.executeQuery();
		while (rs.next()) {
			Card lcard = new Card();
			lcard.setName(rs.getString("name"));
			lcard.setAttack(rs.getInt("attack"));
			lcard.setHealth(rs.getInt("health"));
			lcard.setConsume(rs.getInt("consume"));
			lcard.setColor(rs.getString("color"));
			recard.add(lcard);
		}
		return recard;

	}

	// 以名称为关键字
	public List<Card> findbyName(String name) throws SQLException {
		List<Card> recard = new ArrayList<Card>();
		String sql = new String();
		sql = "select * from card1 where name like ?";
		java.sql.PreparedStatement findbyname = conn.prepareStatement(sql);
		findbyname.setString(1, "%" + name + "%");
		ResultSet rs = findbyname.executeQuery();
		while (rs.next()) {
			Card lcard = new Card();
			lcard.setName(rs.getString("name"));
			lcard.setAttack(rs.getInt("attack"));
			lcard.setHealth(rs.getInt("health"));
			lcard.setConsume(rs.getInt("consume"));
			lcard.setColor(rs.getString("color"));
			recard.add(lcard);
		}
		return recard;

	}

}
