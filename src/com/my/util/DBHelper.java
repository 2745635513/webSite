package com.my.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBHelper {
	
		public static Connection getConnection(){
			Context context = null;
			DataSource ds = null;
			Connection conn = null;
			try{
				context = new InitialContext();
				ds = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
				conn = ds.getConnection();
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
			return conn;
		}
		
		public static void closeAll(Connection conn,Statement sta){
			try {
				if(conn != null){
					conn.close();	
				}
				if(sta != null){
					sta.close();	
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void closeAll(Connection conn,Statement sta,ResultSet rs){
			try {
				if(rs != null){
					rs.close();	
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			closeAll(conn,sta);
		}
		
}
