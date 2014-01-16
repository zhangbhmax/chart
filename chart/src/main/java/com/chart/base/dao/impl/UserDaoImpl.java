package com.chart.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.chart.base.bean.User;
import com.chart.base.dao.UserDao;
import com.chart.common.dao.BaseDao;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

	public void addUser(User user) {
		getSqlMapClientTemplate().insert("user.addUser", user);
	}

}
