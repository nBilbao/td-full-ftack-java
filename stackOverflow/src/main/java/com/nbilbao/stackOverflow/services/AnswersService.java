package com.nbilbao.stackOverflow.services;

import com.nbilbao.stackOverflow.models.Answers;
import com.nbilbao.stackOverflow.models.Questions;
import com.nbilbao.stackOverflow.repositories.AnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswersService {

    @Autowired
    AnswersRepository answersRepository;

    public List<Answers> findAllByQuestions(Questions question) {
        return answersRepository.findAllByQuestions(question);
    }

    /**
     * Save.
     *
     * @param answers the answers
     */
    public void save(Answers answers) {
        answersRepository.save(answers);
    }

}
