package com.example.stacj.stack_implementation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description ="Partner details Bean")
public class Partner {

	@Id()
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@ApiModelProperty(notes="Name Should have atleast 2 characters")
	private String name;
	@ApiModelProperty(notes="Should not contain any special characters")
	private String designation;

	public Partner(Integer id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	public Partner() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
