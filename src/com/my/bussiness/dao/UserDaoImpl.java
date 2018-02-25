package com.my.bussiness.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.my.domain.User;
import com.my.util.DBHelper;

public class UserDaoImpl implements UserDao {

	@Override
	public int insertUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		// ȡ������
		Connection conn = DBHelper.getConnection();
		// ƴ��sql
		StringBuilder sb = new StringBuilder();
		sb.append(" INSERT INTO ");
		sb.append(" 	TBL_USER ");
		sb.append(" ( ");
		sb.append(" 	ID ");
		sb.append(" 	,NAME ");
		sb.append(" 	,PASS ");
		sb.append(" 	,QUE ");
		sb.append(" 	,ANS ");
		sb.append(" 	,EMAIL ");
		sb.append(" 	,REALNAME ");
		sb.append(" 	,SEX ");
		sb.append(" 	,IDEN ");
		sb.append(" 	,TEL ");
		sb.append(" 	,AREA ");
		sb.append(" 	,ADDRESS ");
		sb.append(" 	,POST ");
		sb.append(" ) ");
		sb.append(" VALUES ");
		sb.append(" ( ");
		sb.append(" 	SEQ_TBL_USER_ID.NEXTVAL ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" 	,? ");
		sb.append(" ) ");
		// ����PreparedStatement��������
		System.out.println(sb.toString());
		PreparedStatement ps = conn.prepareStatement(sb.toString());
		int index = 0;
		ps.setString(++index, user.getNAME());
		ps.setString(++index, user.getPASS());
		ps.setString(++index, user.getQUE());
		ps.setString(++index, user.getANS());
		ps.setString(++index, user.getEMAIL());
		ps.setString(++index, user.getREALNAME());
		ps.setString(++index, user.getSEX());
		ps.setString(++index, user.getIDEN());
		ps.setString(++index, user.getTEL());
		ps.setString(++index, user.getAREA());
		ps.setString(++index, user.getADDRESS());
		ps.setString(++index, user.getPOST());
		// ִ��SQL,��ȡ�÷���ֵ
		int result = ps.executeUpdate();
		// �ͷ���Դ
		DBHelper.closeAll(conn, ps);
		return result;
	}

	@Override
	public User selectUserByName(String name) throws SQLException {
		// ȡ������
				Connection conn = DBHelper.getConnection();
				// ƴ��sql
				StringBuilder sb = new StringBuilder();
				sb.append(" select * from TBL_USER where name = ? ");
				
				// ����PreparedStatement��������
				PreparedStatement ps = conn.prepareStatement(sb.toString());
				ps.setString(1, name);
				ResultSet rs = ps.executeQuery();
				User user = null;
				if (rs.next()) {
					user = new User(rs.getString("name")
							,rs.getString("pass"));
				}
				
				// �ͷ���Դ
				DBHelper.closeAll(conn, ps, rs);
				return user;
	}

	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
