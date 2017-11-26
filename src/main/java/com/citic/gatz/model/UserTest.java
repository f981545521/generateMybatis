package com.citic.gatz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * model层测试类
 * @author fengchao
 *
 */
@Table(name="user_test")
public class UserTest implements Serializable {
	private static final long serialVersionUID = 6626527450093471276L;
	@Id  
    @Column(name = "id") 
	private Integer id;
	
	private String username;
	
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}