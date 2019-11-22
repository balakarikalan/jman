package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRespository;
import com.example.demo.response.ApiResponse;


@Service
public class UserServiceImpl implements UserService{
    
	@Autowired	
	private UserRespository userRepository;
	
	
	@Override
	public ApiResponse<User> save(User user) {
	    User userReturned= userRepository.save(user);
		ApiResponse<User> response=new ApiResponse<>();
		response.setMessage("New user Created");
		response.setStatus(HttpStatus.OK.value());
		response.setResult(userReturned);
		return response;
	}

	@Override
	public ApiResponse<User> findById(int id) {
		User userReturned= userRepository.findById(id).get();
		ApiResponse<User> response=new ApiResponse<>();
		response.setMessage("New user Created");
		response.setStatus(HttpStatus.OK.value());
		response.setResult(userReturned);
		return response;
	}

	@Override
    public ApiResponse<User> update(User user) {
        User userReturned = userRepository.findById(user.getId()).get();
        if(userReturned != null) {
           userRepository.save(userReturned);
        }
        ApiResponse<User> response=new ApiResponse<>();
		response.setMessage("user updated");
		response.setStatus(HttpStatus.OK.value());
		response.setResult(userReturned);
		return response;
    }

	@Override
	public List<User> findAll() {
		List<User> userReturned= userRepository.findAll();
		return userReturned;
	}

	@Override
	public void delete(int id) {
		userRepository.deleteById(id);	
	}

}
