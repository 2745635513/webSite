package com.my.bussiness.service;

import java.sql.SQLException;
import java.util.List;

import com.my.bussiness.dao.UserDao;
import com.my.bussiness.dao.UserDaoImpl;
import com.my.domain.User;

public class UserServiceImpl implements UserService {

	@Override
	public boolean addUser(User user) {
		UserDao ud = new UserDaoImpl();//创建DAo对象
		int result = 0;// 接收数据访问层的结果
		try {
			result = ud.insertUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (result == 0) {
			// 说明,插入时出现了错误
			return false;
		}
		return true;
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		UserDao ud = new UserDaoImpl();//创建DAo对象
		User user = null;
		try {
			user = ud.selectUserByName(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
