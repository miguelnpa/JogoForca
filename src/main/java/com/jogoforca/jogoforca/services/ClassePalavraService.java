package com.jogoforca.jogoforca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jogoforca.jogoforca.domain.ClassePalavra;
import com.jogoforca.jogoforca.repository.ClassePalavraRepository;

@Service
public class ClassePalavraService {
	
	@Autowired
	private ClassePalavraRepository repo;
	
	public List<ClassePalavra> findAll(){
		return repo.findAll();
	}
}
