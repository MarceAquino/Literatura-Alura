package com.curso.lliteralura.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.lliteralura.model.Autor;

import java.util.List;

public interface IAutorRepository extends JpaRepository<Autor, Long> {
    Autor findByNombreIgnoreCase(String nombre);
    List<Autor> findByFechaDeNacimientoLessThanEqualAndFechaDeFallecimientoGreaterThanEqual(int anioInicial, int anioFinal);

}

