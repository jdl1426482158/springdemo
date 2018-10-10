/*
 * copyright 2018
 * 
 */
package com.jdl.entity;

import java.util.List;

/**
 * @author jdl time: 2018年10月9日 下午3:42:12
 */
public class EmpEntity {
	private String id;
	private String name;
	private int age;
	private UserEntity user;
	private List<UserEntity> userList;

	/**
	 * @return the userList
	 */
	public List<UserEntity> getUserList() {
		return userList;
	}

	/**
	 * @param userList the userList to set
	 */
	public void setUserList(List<UserEntity> userList) {
		this.userList = userList;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the user
	 */
	public UserEntity getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserEntity user) {
		this.user = user;
	}

}
