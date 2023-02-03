package com.skillovilla.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name="users")
public class User implements Serializable{/**
	 * 
	 */
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
	
	
	@NotNull(message = "Please enter book Email...!")
	@NotBlank(message = "Please enter book Email...!")
	@Column(name = "Email")
	private String Email;
	
	@NotNull(message = "Please enter book phoneNumber...!")
	@NotBlank(message = "Please enter book phoneNumber...!")
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	@NotNull(message = "Please select address...!")
	private Address address;
	
	
	
	@JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	List<Book> issuedBooks = new ArrayList<>();
	
	
	

}
