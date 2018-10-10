/*
 * copyright 2018
 * 
 */
package com.jdl.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jdl.dao.EmpDao;
import com.jdl.entity.EmpEntity;

/**
 * @author jdl time: 2018年10月9日 下午4:13:21
 */
@Repository
public class EmpDaoImpl implements EmpDao {

	List<EmpEntity> list;

	/**
	 * 
	 */
	public EmpDaoImpl() {
		list = new ArrayList<EmpEntity>();
		EmpEntity emp;
		emp = new EmpEntity();
		emp.setName("王金泽");
		emp.setAge(15);
		emp.setId("12353453466");
		list.add(emp);

		emp = new EmpEntity();
		emp.setName("凌海");
		emp.setAge(17);
		emp.setId("7743453466");
		list.add(emp);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jdl.dao.EmpDao#selectAll()
	 */
	@Override
	public List<EmpEntity> selectAll() {
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jdl.dao.EmpDao#selectById(java.lang.String)
	 */
	@Override
	public EmpEntity selectById(String id) {
		for (EmpEntity empEntity : list) {
			if (empEntity.getId().equals(id))
				return empEntity;
		}
		return null;
	}

}
