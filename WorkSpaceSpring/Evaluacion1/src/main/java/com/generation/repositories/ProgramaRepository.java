package com.generation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.models.Programa;

@Repository
public interface ProgramaRepository extends JpaRepository<Programa, Long> {

}
