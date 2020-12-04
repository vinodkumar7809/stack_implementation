package com.example.stacj.stack_implementation.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.stacj.stack_implementation.entity.Partner;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Integer> {

	@Query(value="SELECT * FROM Partner p order by id desc limit 1", nativeQuery=true)
	public Partner findTopByOrderByIdDesc();
}
