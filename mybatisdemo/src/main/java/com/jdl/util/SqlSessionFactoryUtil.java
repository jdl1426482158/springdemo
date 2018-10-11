/*
 * copyright 2018
 * 
 */
package com.jdl.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author jdl time: 2018年10月10日 下午5:47:11
 */
public class SqlSessionFactoryUtil {
	private SqlSessionFactoryUtil() {
	}

	private static SqlSessionFactory sqlSessionFactory;
	static {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static SqlSession openSession() {
		return sqlSessionFactory.openSession();
	}
}
