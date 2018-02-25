package com.my.bussiness.dao;

import java.sql.SQLException;
import java.util.List;

import com.my.domain.User;

public interface UserDao {
	
	/**
	 * 插入用户
	 * @param user
	 * @return
	 */
	int insertUser(User user) throws SQLException;
	/**
	 * 查询单个用户
	 * @param name
	 * @return
	 */
	User selectUserByName(String name) throws SQLException;
	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> selectAllUser();


}
