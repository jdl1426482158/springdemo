/*
 * copyright 2018
 * 
 */
package com.jdl.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.jdl.dao.EmpDao;
import com.jdl.entity.Emp;
import com.jdl.util.SqlSessionFactoryUtil;

/**
 * @author jdl time: 2018年10月10日 下午6:43:07
 */
public class MybatisTest {
	@Test
	public void testFindAll() {
		SqlSession session = SqlSessionFactoryUtil.openSession();
		EmpDao empDao = session.getMapper(EmpDao.class);
		List<Emp> empList = empDao.findAllEmp();

		for (Emp emp : empList) {
			System.out.println(emp.getEname() + "    " + emp.getSal());
		}

		System.out.println(empList.size());
	}
}
