package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@RestController
public class ItemController {
	
	@Autowired 
    private ItemRepository itemRepo;
    
	
	@PostMapping(value = "/saveAll")
	public ResponseEntity<Item> saveAll(@RequestBody Item item) {
		Item  item1=itemRepo.save(item);
		return new ResponseEntity<Item>(item1,HttpStatus.OK);
	}
	@GetMapping(value = "/getAll")
	public @ResponseBody List<Item> getAll() {
		List<Item> listItem = itemRepo.findAll();
		return listItem;
	}
	
	@GetMapping(value="/getById")
	public 
    
}
