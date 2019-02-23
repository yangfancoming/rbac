package com.goat.rbac.system.service;


import com.goat.rbac.dao.UserMapper;
import com.goat.rbac.system.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserServiceImpl  {

	@Autowired
	private UserMapper userMapper;

	public List<User> findUserWithDept(User user) {
        return userMapper.findUserWithDept(user);
	}


}
