package com.my.bussiness.service;

import java.util.List;

import com.my.domain.User;

public interface UserService {
	/**
	 * 插入用户
	 * @param user
	 * @return
	 */
	boolean addUser(User user);
	/**
	 * 查询单个用户
	 * @param name
	 * @return
	 */
	User getUserByName(String name);
	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> getAllUser();
}
