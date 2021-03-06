package org.agtsys.service;

import org.agtsys.damain.User;
import org.agtsys.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper  userMapper;
	@Override
	public User getUserByUser(User user) {
		
		return userMapper.getUserByUser(user);
	}

}
