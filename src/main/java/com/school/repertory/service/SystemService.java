package com.school.repertory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.school.repertory.dao.mapper.SystemUserMapper;
import com.school.repertory.dao.model.SystemUser;

@Service
public class SystemService {
	
	@Autowired
	private SystemUserMapper userMapper;
	
	public SystemUser findUser(String username) {
		if (StringUtils.isEmpty(username.trim())) {
			return null;
		}
		
		SystemUser user = userMapper.selectByPrimaryKey(username);
		
		return user;
	}
}
