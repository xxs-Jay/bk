package com.lanou.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lanou.dao.BokeDao;
import com.lanou.entity.Boke;

@Controller
public class BokeController {
	
	@Autowired
	BokeDao bokeDao;
	
	@RequestMapping("boke_java.do")
	@ResponseBody
	public List<Boke> findJava() {
		List<Boke> bokes = bokeDao.findJava();
		return bokes;
	}
	

}
