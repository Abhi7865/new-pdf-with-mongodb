package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LoanDatabase;

@Repository
public interface LoanRepository extends MongoRepository<LoanDatabase, Long>{
	
}
