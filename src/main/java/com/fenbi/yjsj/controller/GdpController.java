package com.fenbi.yjsj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fenbi.yjsj.pojo.FenbiResult;
import com.fenbi.yjsj.pojo.Gdp;
import com.fenbi.yjsj.service.GdpService;

@Controller
@RequestMapping("/gdp")
public class GdpController {

	@Autowired
	private GdpService gdpService;

	@RequestMapping("/findAll.do")
	@ResponseBody
	public FenbiResult findAll() {

		List<Gdp> gdps = gdpService.findAll();

		return new FenbiResult(gdps);

	}

}
