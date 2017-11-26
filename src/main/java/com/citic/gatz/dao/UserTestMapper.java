package com.citic.gatz.dao;

import java.util.List;

import com.citic.gatz.base.IBaseMapper;
import com.citic.gatz.model.UserTest;



public interface UserTestMapper extends IBaseMapper<UserTest> {
	/**
	 * 根据username查找对应的信息
	 * @param username
	 * @return
	 */
	List<UserTest> selectByUsername(String username);
}