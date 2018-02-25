package com.my.bussiness.service;

import java.util.List;

import com.my.domain.User;

public interface UserService {
	/**
	 * �����û�
	 * @param user
	 * @return
	 */
	boolean addUser(User user);
	/**
	 * ��ѯ�����û�
	 * @param name
	 * @return
	 */
	User getUserByName(String name);
	/**
	 * ��ѯ�����û�
	 * @return
	 */
	List<User> getAllUser();
}
