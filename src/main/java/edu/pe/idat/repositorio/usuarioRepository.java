package edu.pe.idat.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pe.idat.entidad.usuario;

public interface usuarioRepository extends JpaRepository<usuario, Long> {

}
