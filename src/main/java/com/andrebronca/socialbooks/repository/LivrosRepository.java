package com.andrebronca.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrebronca.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}
