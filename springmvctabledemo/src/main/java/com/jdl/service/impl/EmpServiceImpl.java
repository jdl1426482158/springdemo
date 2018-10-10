/*
 * copyright 2018
 * 
 */
package com.jdl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdl.dao.EmpDao;
import com.jdl.entity.EmpEntity;
import com.jdl.service.EmpService;

/**
 * @author jdl time: 2018年10月9日 下午4:23:27
 */
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao empDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jdl.service.EmpService#selectAll()
	 */
	@Override
	public List<EmpEntity> selectAll() {
		return empDao.selectAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jdl.service.EmpService#selectById(java.lang.String)
	 */
	@Override
	public EmpEntity selectById(String id) {
		return empDao.selectById(id);
	}

}
