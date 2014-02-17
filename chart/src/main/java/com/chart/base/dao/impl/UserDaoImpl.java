package com.chart.base.dao.impl;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.chart.base.bean.User;
import com.chart.base.dao.UserDao;
import com.chart.common.bean.Page;
import com.chart.common.dao.BaseDao;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

	public void addUser(User user) {
		try {
			getSqlMapClient().insert("user.addUser", user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Page<User> findUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(User user) {
		try {
			getSqlMapClient().delete("user.deleteUser", user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
