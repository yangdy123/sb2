package com.ydy.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	public static class User {
		public int user_id;
		public String user_name;
		public UserEx userEx;
	}
	
	public static class UserEx {
		int intExt;
		String strExt;
	}

    @Autowired
    private MongoTemplate mongoTemplate;
    
    @RequestMapping("/")
	public String Home() {
		return "ok1";
	}
    
    @RequestMapping("/mongodb_insert")
	public String Inset() {    	
    	User user = new User();
    	user.user_id = 101;
    	user.user_name = "test";
    	UserEx userEx = new UserEx();
    	userEx.intExt = 100;
    	userEx.strExt = "sss";
    	user.userEx = userEx;
    	
        mongoTemplate.save(user);
        
		return "ok";
	}

    @RequestMapping("/mongodb_query")
	public String query() {
        Query query = new Query(Criteria.where("user_id").is(101));        
        User user = mongoTemplate.findOne(query, User.class);    	
		return "ok";
	}
    
    
}

