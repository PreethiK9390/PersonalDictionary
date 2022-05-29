package com.preethi.personaldictionary.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preethi.personaldictionary.word.Word;

public interface WordRepo extends JpaRepository<Word,String>{
	

}
