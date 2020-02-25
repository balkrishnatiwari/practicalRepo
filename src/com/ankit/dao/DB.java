package com.ankit.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ANKIT","ANKIT");

	}catch(Exception e){System.out.println(e);}
	return con;
}
}
