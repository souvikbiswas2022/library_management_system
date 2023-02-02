package com.skillovilla.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name="authors")
public class Author extends Person{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "Please select books...!")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Book> booksPublished;
	
}
