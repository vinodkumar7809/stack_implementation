package com.example.stacj.stack_implementation.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.stacj.stack_implementation.entity.Partner;
import com.example.stacj.stack_implementation.service.PartnerService;

@RestController
public class PartnerController {

	@Autowired
	PartnerService partnerService;
	
	Partner savedPartner;

	@PostMapping("/push")
	public ResponseEntity<Object> push(@RequestBody Partner partner) {
		Partner savedPartner = partnerService.push(partner);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedPartner.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping("/pop")
	public Partner getPartner() {
		return partnerService.popOut();
	}
	
}
