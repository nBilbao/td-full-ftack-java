package com.nbilbao.stackOverflow.repositories;

import com.nbilbao.stackOverflow.models.Questions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepository extends CrudRepository<Questions,Long> {

    List<Questions> findAll();

}
