package com.example.Watchstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Watchstore.Entity.Watchstoreproduct;

@Repository
public interface WatchstoreproductRepo extends JpaRepository<Watchstoreproduct, Integer> {


	@Query(value =  "select * from Watchstoreproduct where productname =?" , nativeQuery = true)
	Watchstoreproduct findByName(String productname);
}
