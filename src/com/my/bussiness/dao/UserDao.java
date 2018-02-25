package com.my.bussiness.dao;

import java.sql.SQLException;
import java.util.List;

import com.my.domain.User;

public interface UserDao {
	
	/**
	 * �����û�
	 * @param user
	 * @return
	 */
	int insertUser(User user) throws SQLException;
	/**
	 * ��ѯ�����û�
	 * @param name
	 * @return
	 */
	User selectUserByName(String name) throws SQLException;
	/**
	 * ��ѯ�����û�
	 * @return
	 */
	List<User> selectAllUser();


}
