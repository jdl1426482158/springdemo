/*
 * copyright 2018
 * 
 */
package com.jdl.dao;

import java.util.List;

import com.jdl.entity.EmpEntity;

/**
 * @author jdl time: 2018年10月9日 下午4:13:12
 */
public interface EmpDao {

	public List<EmpEntity> selectAll();

	public EmpEntity selectById(String id);

}
