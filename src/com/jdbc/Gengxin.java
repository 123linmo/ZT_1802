package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;





public class Gengxin {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获得连接
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.01:3306/jdbc","root","123456");
		//通过连接对象获得语句对象
		Statement yuju=lianjie.createStatement();
		//定义更新sql语句
		String sql="UPDATE tb_user SET email = 'jack@qq.com' WHERE id= 1";
		//通过语句对象执行sql
		yuju.execute(sql);
	}

}
