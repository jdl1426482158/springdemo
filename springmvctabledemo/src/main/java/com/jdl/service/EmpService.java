/*
 * copyright 2018
 * 
 */
package com.jdl.service;

import java.util.List;

import com.jdl.entity.EmpEntity;

/**
 * @author jdl time: 2018年10月9日 下午4:21:57
 */
public interface EmpService {
	
	public List<EmpEntity> selectAll();

	public EmpEntity selectById(String id);
}
