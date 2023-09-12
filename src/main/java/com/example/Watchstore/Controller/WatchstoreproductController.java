package com.example.Watchstore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.Watchstore.Entity.Watchstoreproduct;
import com.example.Watchstore.Service.WatchstoreproductService;

@RestController
public class WatchstoreproductController {

	@Autowired
	WatchstoreproductService watchstoreproductservice;
	
	@PostMapping("/post")
	public Watchstoreproduct addproducts(@RequestBody  Watchstoreproduct  watchstoreproduct) {
		return watchstoreproductservice.addproduct(watchstoreproduct);
	}
	
	@PutMapping("/update")
	public  Watchstoreproduct updateproducts(@RequestHeader String productname, @RequestBody  Watchstoreproduct  watchstoreproduct ) {
		return watchstoreproductservice.updateproduct(productname, watchstoreproduct);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String productname) {
		watchstoreproductservice.deleteproduct(productname);
		return "Data was deleted...";
	}
	
}
