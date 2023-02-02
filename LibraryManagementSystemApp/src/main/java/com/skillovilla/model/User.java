package com.skillovilla.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name="users")
public class User extends Person{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	
	@Column(name = "total_book_checkedout")
	private Integer totalBookCheckedOut;
	
	
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	List<IssuedBook> issuedBooks = new ArrayList<>();
	
	
	

}
