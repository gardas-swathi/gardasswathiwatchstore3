package com.example.Watchstore.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Watchstore.Entity.Watchstoreproduct;
import com.example.Watchstore.Exception.ResourceNotFoundException;
import com.example.Watchstore.Repository.WatchstoreproductRepo;
import com.example.Watchstore.Service.WatchstoreproductService;

@Service
public class WatchstoreproductServiceimpl implements WatchstoreproductService {

	@Autowired
	WatchstoreproductRepo watchstoreproductrepo;
	@Override
	public Watchstoreproduct addproduct(Watchstoreproduct watchstoreproduct) {
		// TODO Auto-generated method stub
		return watchstoreproductrepo.save(watchstoreproduct);
	}

	@Override
	public Watchstoreproduct updateproduct(String productname, Watchstoreproduct watchstoreproduct) {
		// TODO Auto-generated method stub
		Watchstoreproduct s1=watchstoreproductrepo.findByName(productname);
		
		if(s1!=null) {
			s1.setProductdesc(watchstoreproduct.getProductdesc());
			s1.setProductlink(watchstoreproduct.getProductlink());
			return watchstoreproductrepo.save(s1);
		}
		else {
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void deleteproduct(String productname) {
		// TODO Auto-generated method stub
		Watchstoreproduct s2=watchstoreproductrepo.findByName(productname);
		
		if(s2!=null) {
			watchstoreproductrepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}
	}

}
