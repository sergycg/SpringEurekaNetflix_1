package com.recetas.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.recetas.entity.Ingrediente;
import com.recetas.entity.RecetaCocina;


public interface IIngredienteDao extends CrudRepository<RecetaCocina, Long> {

//	public List<Ingrediente> findByRecetaId(Long id);
	
}
