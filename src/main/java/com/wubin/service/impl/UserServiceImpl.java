package com.wubin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wubin.entity.User;
import com.wubin.mapper.UserMapper;
import com.wubin.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.getUserById(id);
	}

	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userMapper.getUserList();
	}

	public int add(User user) {
		// TODO Auto-generated method stub
		return userMapper.add(user);
	}

	public int update(Integer id, User user) {
		// TODO Auto-generated method stub
		return userMapper.update(id, user);
	}

	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.delete(id);
	}

}
