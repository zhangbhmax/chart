package com.chart.base.dao;

import com.chart.base.bean.User;
import com.chart.common.bean.Page;

public interface UserDao {
	/**
	 * 添加用户
	 * @param user
	 */
	void addUser(User user);
	/**
	 * 删除用户
	 * @param user
	 */
	void deleteUser(User user);
	
	/**
	 * 修改用户
	 * @param user
	 */
	void modifyUser(User user);
	/**
	 * 用户分页查询
	 * @param user
	 * @return
	 */
	Page<User> findUser(User user);
	
	/**
	 * 根据用户名查询用户信息
	 * @param userName
	 * @return
	 */
	User getUser(String userName);
	
	/**
	 * 根据用户Id查询用户信息
	 * @param id
	 * @return
	 */
	User getUser(Integer id);
}
