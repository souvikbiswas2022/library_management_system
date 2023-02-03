package com.skillovilla.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name="books")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@NotNull(message = "Please enter book title...!")
	@NotBlank(message = "Please enter book title...!")
	@Column(name = "title")
	private String title;
	
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id")
	@NotNull(message = "Please select author...!")
	private List<Author> authors;
	
	@Column(name = "publisher")
	private String publisher;
	
	
	@Column(name = "isbn")
	private String isbn;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	@NotNull(message = "Please select category...!")
	private Category category;
	

	
	@Column(name="status")
	private Boolean status;
	
	
	@Column(name="issued_date")
	private LocalDate issuedDate;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL )
	private User user;
	
	
	
}
