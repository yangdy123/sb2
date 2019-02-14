package com.example.zzMybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Player;
import com.example.bean.PlayerExample;
import com.example.dao.PlayerMapper;

@RestController
public class HomeController {

	@Autowired
	PlayerMapper playerMapper;
	
	@RequestMapping("/")
	public long Home () {

		PlayerExample playerExample = new PlayerExample();
		
		return playerMapper.countByExample(playerExample);
	}
}
