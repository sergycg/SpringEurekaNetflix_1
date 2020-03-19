package com.recetas.service;

import java.util.List;

import com.recetas.entity.RecetaCocina;

public interface IRecetaCocinaService {
	
	public List<RecetaCocina> findAll();
	
	public void save (RecetaCocina receta);
	
	public RecetaCocina findById(Long id);

}
