package com.jogoforca.jogoforca.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jogoforca.jogoforca.domain.ClassePalavra;

@Repository
public interface ClassePalavraRepository extends MongoRepository<ClassePalavra, String>{

}
