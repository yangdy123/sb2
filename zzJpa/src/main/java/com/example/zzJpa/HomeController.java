package com.example.zzJpa;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.somta.springboot.pojo.PlayerEx;
//import com.somta.springboot.repository.PlayerRepository;
//import com.somta.springboot.repository.UserRepository;

@RestController
public class HomeController {

	
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/queryall")
//    @ResponseBody
    public List<Employee> queryAll(){
        List<Employee> list = new ArrayList<Employee>();
        list = employeeRepository.findAll();
        return list;
    }

	/**
	 * 新增用户
	 * @throws Exception
	 */
	@RequestMapping("/")
	public String testAddUser() throws Exception {
		Employee user = new Employee();
//		user.setId("1");
		user.setName("zhangsan");
		user.setAge(12);
		employeeRepository.save(user);		
		
		return "ok";
	}

	/**
	 * 新增用户
	 * @throws Exception
	 */
	@RequestMapping("/a")
	public String testAddUser1(String name) throws Exception {
		Employee user = employeeRepository.findByAge(12).get(0);
//		user.setId("1");
		user.setName("zhangsa1n");
//		user.setAge(12);
		employeeRepository.save(user);		
		
		return "ok";
	}
}
