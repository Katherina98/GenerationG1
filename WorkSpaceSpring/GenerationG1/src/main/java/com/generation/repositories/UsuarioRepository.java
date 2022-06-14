package com.generation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	/**Las interfaces solo definen los métodos, pero no las implementamos*/
	/**Querys y usar métodos que se conectan a la base de datos */
}
