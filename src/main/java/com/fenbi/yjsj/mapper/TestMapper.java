package com.fenbi.yjsj.mapper;

import org.apache.ibatis.annotations.Insert;

public interface TestMapper {

	/**
	 * 向测试表中插入一条数据
	 */
	@Insert("insert into test (name, password) values ('李四', '666')")
	void insert();

}
