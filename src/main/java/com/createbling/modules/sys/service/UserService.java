package com.createbling.modules.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.createbling.modules.sys.dao.UserDao;
import com.createbling.modules.sys.entity.User;

@Service
@Transactional(readOnly = true)
public class UserService {
	@Autowired
	private UserDao userDao;
	public List<User> findList(User user){
		return userDao.findList(user);
	}

}
