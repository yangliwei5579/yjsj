package com.fenbi.yjsj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenbi.yjsj.mapper.GdpMapper;
import com.fenbi.yjsj.pojo.Gdp;
import com.fenbi.yjsj.service.GdpService;

@Service
public class GdpServiceImpl implements GdpService {

	@Autowired
	private GdpMapper gdpMapper;
	
	@Override
	public List<Gdp> findAll() {
		
		return gdpMapper.selectAll();
	}

	

}
