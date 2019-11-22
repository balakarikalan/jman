package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.response.ApiResponse;

public interface UserService {
	
	
 ApiResponse<User> save(User user);
 List<User> findAll();
 ApiResponse<User> findById(int id);
 ApiResponse<User> update(User user);
 void delete(int id);
 

}
