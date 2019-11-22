package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRespository;
import com.example.demo.response.ApiResponse;
import com.example.demo.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRespository userRepository;

	@PostMapping
	public ApiResponse<User> saveUser(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping
	public ApiResponse<List<User>> listUser() {
		List<User> userReturned = userService.findAll();
		ApiResponse<List<User>> response = new ApiResponse<>();
		response.setMessage("New user Created");
		response.setStatus(HttpStatus.OK.value());
		response.setResult(userReturned);
		return response;
		// return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched
		// successfully.",userService.findAll());
	}

	@GetMapping("/{id}")
	public ApiResponse<User> getOne(@PathVariable int id) {
		return userService.findById(id);
		// return new ApiResponse<>(HttpStatus.OK.value(), "User fetched
		// successfully.",userService.findById(id));
	}

	@PutMapping("/{id}")
	public ApiResponse<User> update(@RequestBody User user) {
		return userService.update(user);
		// return new ApiResponse<>(HttpStatus.OK.value(), "User updated
		// successfully.",userService.update(userDto));
	}

	@DeleteMapping("/{id}")
	public ApiResponse<Void> delete(@PathVariable int id) {
		 userService.delete(id);
		ApiResponse<Void> response = new ApiResponse<>();
		response.setMessage("User Deleted");
		response.setStatus(HttpStatus.OK.value());
		response.setResult(null);
		return response;
	}

}