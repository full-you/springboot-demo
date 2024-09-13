package com.example.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.mybatis.entity.Person;

/**
 * PersonテーブルMapper
 */
@Mapper
public interface PersonMapper {

	/**
	 * insert
	 * @param person
	 * @return 登録件数
	 */
	public int insert(Person person);
	
	/**
	 * select
	 * @param person
	 * @return List<Person>
	 */
	public List<Person> search(Person person);
}
