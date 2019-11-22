package com.example.demo.response;




import com.example.demo.entity.User;

import lombok.Data;


@Data
public class ApiResponse<T> {
	
	
	private int status;
    private String message;
    private Object result;

}
