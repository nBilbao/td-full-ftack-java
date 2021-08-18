package com.nbilbao.stackOverflow.repositories;

import com.nbilbao.stackOverflow.models.Answers;
import com.nbilbao.stackOverflow.models.Questions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswersRepository extends CrudRepository<Answers,Long> {


    List<Answers> findAllByQuestions(Questions question);
}
