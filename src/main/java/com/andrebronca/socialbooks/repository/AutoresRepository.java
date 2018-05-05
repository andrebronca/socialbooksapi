package com.andrebronca.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrebronca.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {
	
}
