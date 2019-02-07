package com.jorge.cursos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jorge.cursos.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

	
}
