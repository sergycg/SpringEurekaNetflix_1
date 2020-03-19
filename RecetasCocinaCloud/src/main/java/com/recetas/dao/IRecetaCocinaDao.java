package com.recetas.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.recetas.entity.RecetaCocina;


public interface IRecetaCocinaDao extends CrudRepository<RecetaCocina, Long> {


	
}
