package com.example.zzJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {

	/**
	 * 根据年纪查询用户
	 * @param age
	 * @return
	 */
	List<Employee> findByAge(int age);

	/**
	 * 根据年纪和姓名查询
	 * @param name
	 * @param age
	 * @return
	 */
	Employee findByNameAndAge(String name, int age);

    /**
     * 对于复杂查询可以使用@Query 编写sql
     * @param name
     * @return
     */
//    @Query(value="select id,name, gender, age from employee")// u where u.name=:name")
//    List<Employee> findEmployee1();
//    List<Employee> findEmployee(@Param("name") String name);
}
