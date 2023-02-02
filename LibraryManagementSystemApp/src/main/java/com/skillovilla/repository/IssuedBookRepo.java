package com.skillovilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillovilla.model.IssuedBook;


@Repository
public interface IssuedBookRepo extends JpaRepository<IssuedBook, Long> {

}
