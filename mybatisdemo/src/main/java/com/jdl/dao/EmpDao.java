/*
 * copyright 2018
 * 
 */
package com.jdl.dao;

import java.util.List;

import com.jdl.entity.Emp;

/**
 * @author jdl
 * time: 2018年10月10日 下午6:37:02
 */
public interface EmpDao {
	public List<Emp> findAllEmp();
}
