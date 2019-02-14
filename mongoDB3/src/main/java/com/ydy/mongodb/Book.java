package com.ydy.mongodb;

import org.springframework.data.annotation.Id;

public class Book {
    @Id
    private String id;
    //价格
    private Integer price;
    //书名
    private String name;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}