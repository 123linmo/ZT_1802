package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Puthong_query {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获得连接
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.01:3306/jdbc","root","123456");
		//通过连接对象获得语句对象
		Statement yuju=lianjie.createStatement();
		//定义更新sql语句
		String sql="select * from tb_user";
		//執行普通查詢,得到結果集
		ResultSet rs=yuju.executeQuery(sql);
		System.out.println("id   |    name     |      sex");
		//遍歷結果集
		while (rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			System.out.println(id+"   |    "+name+"   |    "+sex);
			
		}

	}

}
