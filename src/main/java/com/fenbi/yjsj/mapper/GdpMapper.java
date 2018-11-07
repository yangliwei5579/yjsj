package com.fenbi.yjsj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import com.fenbi.yjsj.pojo.Gdp;
import com.fenbi.yjsj.pojo.ProgramLanguage;

public interface GdpMapper {

	
	
	@Select("select year, value from gdp")
	@Result(javaType=Gdp.class)
	List<Gdp> selectAll();

}
