package com.nbilbao.stackOverflow.services;

import com.nbilbao.stackOverflow.models.Questions;
import com.nbilbao.stackOverflow.repositories.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {

    @Autowired
    QuestionsRepository questionsRepository;

    public List<Questions> findAll() {
        return questionsRepository.findAll();
    }

    /**
     * Save.
     *
     * @param questions the questions
     * @return the questions
     */
    public Questions save(Questions questions) {
        return questionsRepository.save(questions);
    }

    /**
     * Find by id.
     *
     * @param idQuestion the id question
     * @return the questions
     */
    public Questions findById(Long idQuestion) {
        return questionsRepository.findById(idQuestion).orElse(null);
    }
}
