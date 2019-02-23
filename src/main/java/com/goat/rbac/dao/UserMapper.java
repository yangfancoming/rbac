package com.goat.rbac.dao;



import com.goat.rbac.system.domain.User;

import java.util.List;

public interface UserMapper extends MyMapper<User> {

	List<User> findUserWithDept(User user);
	
//	List<UserWithRole> findUserWithRole(Long userId);
	
	User findUserProfile(User user);
}