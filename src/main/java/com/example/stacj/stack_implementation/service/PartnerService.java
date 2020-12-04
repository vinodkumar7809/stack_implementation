package com.example.stacj.stack_implementation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stacj.stack_implementation.controller.repository.PartnerRepository;
import com.example.stacj.stack_implementation.entity.Partner;

@Service
public class PartnerService {
	
	@Autowired
	PartnerRepository partnerRepository;
	
	public Partner push(Partner partner) {
		return partnerRepository.save(partner);
	}
	
	public Partner popOut() {
		return partnerRepository.findTopByOrderByIdDesc();
	}
}
