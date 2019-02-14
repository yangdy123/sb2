package com.ydy.mongodb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mongodb.DBObject;

@RestController
public class HomeController {

    @RequestMapping("/")
	public String Home() {
		return "ok";
	}
    
    @RequestMapping("/mongodb_insert")
	public String Inset() {
    	
    	ArrayList<String> keys = new ArrayList<>();
    	ArrayList<Object> values = new ArrayList<>();
    	
    	keys.add("user_id");
    	values.add(1);
    	keys.add("user_name");
    	values.add("ydy");
    	keys.add("user_tel");
    	values.add("138*****");
    	keys.add("user_ex");
    	UserEx userEx = new UserEx(123, "ex");
//    	values.add(userEx);
    	values.add(new Gson().toJson(userEx));
    	System.out.println(userEx.toString());
    	MongoDBDaoImpl.getMongoDBDaoImplInstance().inSert("testdb", "testcollection", keys.toArray(new String[keys.size()]), values.toArray());
    	
		return "ok";
	}

    @RequestMapping("/mongodb_query")
	public String query() {
    	
    	ArrayList<String> keys = new ArrayList<>();
    	ArrayList<Object> values = new ArrayList<>();
    	
    	keys.add("user_id");
    	values.add(1);
    	List<DBObject> result = MongoDBDaoImpl.getMongoDBDaoImplInstance().find("testdb", "testcollection", keys.toArray(new String[keys.size()]), values.toArray(), 1);
    	
		return "ok";
	}
    
    
}

