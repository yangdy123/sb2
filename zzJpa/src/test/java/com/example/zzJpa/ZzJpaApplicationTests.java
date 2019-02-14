package com.example.zzJpa;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.zzJpa.Employee;
import com.example.zzJpa.EmployeeRepository;
//
//import com.somta.springboot.pojo.User;
//import com.somta.springboot.repository.UserRepository;


/**
 * 
 * @author 明天的地平线
 * 
 * SpringBoot 之前的版本配置单元测试类时使用 @SpringApplicationConfiguration(Application.class)
 * SpringBoot 1.5.9  改用@SpringBootTest(classes = Application.class)
 * 
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ZzJpaApplicationTests {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	/**
	 * 新增用户
	 * @throws Exception
	 */
	@Test
	public void testAddUser() throws Exception {
		Employee user = new Employee();
		user.setName("zhangsan");
		user.setAge(15);
		user.setGender("man");
		employeeRepository.save(user);		
	}
//	
//	/**
//	 * 删除用户(根据对象删除时，必须要有ID属性)
//	 * @throws Exception
//	 */
//	@Test
//	public void testDelUser() throws Exception {
//		User user = new User();
//		user.setId(1L);
//		user.setName("zhangsan");
//		user.setAge(12);
//		userRepository.delete(user);
//	}
//	
//	 
//	/**
//	 * 修改用户信息
//	 * @throws Exception
//	 */
//	@Test
//	public void testUpdUser() throws Exception {
//		User user = new User();
//		user.setId(2L);
//		user.setName("zhangsan11");
//		user.setAge(122);
//		userRepository.save(user);
//	}
//	
//	/**
//	 * 查询用户
//	 * @throws Exception
//	 */
//	@Test
//	public void testQueryUser() throws Exception {
//		User user = userRepository.findByAge(22);
//		System.out.println(user.getName());
//		
//		User user2 = userRepository.findByNameAndAge("lishi", 22);
//		System.out.println(user2.getName());
//		
//		User user3 = userRepository.findUser("zhangsan11");
//		System.out.println(user3.getName());
//	}
//	
//	/**
//	 * 查询所有用户
//	 * @throws Exception
//	 */
//	@Test
//	public void testQueryUserList() throws Exception {
//		List<User> list = userRepository.findAll();
//		for (User user : list) {
//			System.out.println(user.getName());
//		}
//	}
	
}
