package com.example.Watchstore.Service;

import com.example.Watchstore.Entity.Watchstoreproduct;

public interface WatchstoreproductService {

	Watchstoreproduct addproduct(Watchstoreproduct watchstoreproduct);
	
	Watchstoreproduct updateproduct(String productname, Watchstoreproduct watchstoreproduct);
	
	void deleteproduct(String productname);
}
