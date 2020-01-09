package com.wst.dao.impl;


import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



//JDBC封装
public class BaseDao {

	private static final String url = "jdbc:mysql://localhost:3306/wst?characterEncoding=utf8";
	private static final String name = "com.mysql.jdbc.Driver";
	private static final String username = "root";
	private static final String password = "123456";

	static {
		try {
			Class.forName(name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void releaseAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 增删改 封装
	public boolean operUpdate(String sql, List<Object> params) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int res = 0;
		conn = getConn();
		try {
			pstmt = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.size(); i++) {
					pstmt.setObject(i + 1, params.get(i));
				}
			}
			res = pstmt.executeUpdate();
			// 返回的是sql在数据库中影响的行数
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			releaseAll(null, pstmt, conn);
		}
		return res > 0 ? true : false;
	}
	
	// 增删改 封装
		public boolean operUpdate(String sql, List<Object> params,Connection conn) {
			//Connection conn = null;
			PreparedStatement pstmt = null;
			int res = 0;
			//conn = getConn();
			try {
				pstmt = conn.prepareStatement(sql);
				if (params != null) {
					for (int i = 0; i < params.size(); i++) {
						pstmt.setObject(i + 1, params.get(i));
					}
				}
				res = pstmt.executeUpdate();
				// 返回的是sql在数据库中影响的行数
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//releaseAll(null, pstmt, conn);
			}
			return res > 0 ? true : false;
		}

	public <T> List<T> operQuery(String sql, List<Object> params, Class<T> cls) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<T> list = new ArrayList<T>();
		conn = getConn();
		try {
			pstmt = conn.prepareStatement(sql);

			if (params != null) {
				for (int i = 0; i < params.size(); i++) {

					pstmt.setObject(i + 1, params.get(i));
				}
			}
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			while (rs.next()) {
				T m = cls.newInstance();
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					String col_name = rsmd.getColumnName(i + 1);
					//System.out.println("col_name::"+col_name);
					Object value = rs.getObject(col_name);
//					if("java.math.BigDecical".equals(value.getClass().getName())) {
//						value=Long.parseLong(value.toString());
//					}
					Field field;
					field = cls.getDeclaredField(col_name);
					field.setAccessible(true);
					field.set(m, value);
				}
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			releaseAll(rs, pstmt, conn);
		}
		return list;
	}
}
