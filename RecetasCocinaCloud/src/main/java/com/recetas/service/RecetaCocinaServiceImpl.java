package com.recetas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recetas.dao.IRecetaCocinaDao;
import com.recetas.entity.RecetaCocina;

@Service
public class RecetaCocinaServiceImpl implements IRecetaCocinaService {

	@Autowired
	private IRecetaCocinaDao dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<RecetaCocina> findAll() {
		return (List<RecetaCocina>) dao.findAll();
	}

	@Override
	@Transactional
	public void save (RecetaCocina receta) {
		dao.save(receta);	
	}

	@Override
	@Transactional(readOnly = true)
	public RecetaCocina findById(Long id) {
		return dao.findById(id).orElse(null);
	}

}
