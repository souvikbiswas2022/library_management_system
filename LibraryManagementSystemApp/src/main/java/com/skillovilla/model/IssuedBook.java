package com.skillovilla.model;

import java.time.LocalDate;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Table(name="issued_books")
public class IssuedBook extends Book {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Column(name="status")
	private Boolean status;
	
	@Column(name="issued_date")
	private LocalDate issuedDate;
	
	@NotNull(message = "Please select user...!")
	@ManyToOne(cascade = CascadeType.ALL )
	private User user;
	
}
