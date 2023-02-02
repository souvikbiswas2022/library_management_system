package com.skillovilla.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="persons")
public class Person implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	
	
	@NotNull(message = "Please enter  firstname...!")
	@NotBlank(message = "Please enter  firstname...!")
	@Column(name = "firstname")
	private String firstName;
	
	@NotNull(message = "Please enter  lastname...!")
	@NotBlank(message = "Please enter  lastname...!")
	@Column(name = "lastname")
	private String lastName;	
	
	

	
}
