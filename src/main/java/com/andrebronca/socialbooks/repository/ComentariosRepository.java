package com.andrebronca.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrebronca.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
