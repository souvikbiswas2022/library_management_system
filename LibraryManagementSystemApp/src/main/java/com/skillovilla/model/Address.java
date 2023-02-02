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
@Table(name="address")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	
	
	@NotNull(message = "Please enter  street...!")
	@NotBlank(message = "Please enter  street...!")
	@Column(name = "street")
	private String street;
	
	@NotNull(message = "Please enter  city...!")
	@NotBlank(message = "Please enter  city...!")
	@Column(name = "city")
	private String city;
	
	@NotNull(message = "Please enter  state...!")
	@NotBlank(message = "Please enter  state...!")
	@Column(name = "state")
	private String state;
	
	@NotNull(message = "Please enter  country...!")
	@NotBlank(message = "Please enter  country...!")
	@Column(name = "country")
	private String country;
	
	@NotNull(message = "Please enter  pinCode...!")
	@NotBlank(message = "Please enter  pinCode...!")
	@Column(name = "pincode")
	private String pinCode ;
	
	
	
}
