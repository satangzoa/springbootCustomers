package com.oraclejava;

import java.util.*;

import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{ 

	// 오름차순 정렬
	List<Customer> findAll(Sort sort);
	
	//페이징
	Page<Customer> findAll(Pageable pageable);

}
