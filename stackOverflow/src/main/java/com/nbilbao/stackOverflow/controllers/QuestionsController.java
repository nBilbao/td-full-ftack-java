package com.nbilbao.stackOverflow.controllers;

import com.nbilbao.stackOverflow.models.Answers;
import com.nbilbao.stackOverflow.models.Questions;
import com.nbilbao.stackOverflow.models.Tags;
import com.nbilbao.stackOverflow.services.AnswersService;
import com.nbilbao.stackOverflow.services.QuestionsService;
import com.nbilbao.stackOverflow.services.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/questions")
public class QuestionsController {

    @Autowired
    QuestionsService questionsService;

    @Autowired
    TagsService tagsService;

    @Autowired
    AnswersService answersService;

    /**
     * Crete student.
     *
     * @param model the model
     * @return the string
     */
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(Model model) {
        List<Questions> questions = questionsService.findAll();
        model.addAttribute("questions", questions);
        return "index.jsp";
    }

    /**
     * New questions.
     *
     * @param model the model
     * @return the string
     */
    @RequestMapping(value="/new", method=RequestMethod.GET)
    public String newQuestions(Model model) {
        return "newQuestions.jsp";
    }



    /**
     * New questions.
     *
     * @param model the model
     * @return the string
     */
    @RequestMapping(value="/new", method=RequestMethod.POST)
    public String createNewQuestions(@RequestParam(value = "question") String question, @RequestParam(value = "tags") String tags, Model model) {
        String[] tagsName = tags.split(",");
        List<Tags> tagsObject = new ArrayList<Tags>();
        for (int i = 0; i < tagsName.length; i++) {
            String string = tagsName[i].toLowerCase();
            tagsObject.add(getTagByString(string));
        }
        Questions questions = new Questions();
        questions.setQuestion(question);
        questions.setTags(tagsObject);
        questionsService.save(questions);
        return index(model);
    }




    /**
     * New questions.
     *
     * @param model the model
     * @return the string
     */
    @RequestMapping(value="/{idQuestion}", method=RequestMethod.GET)
    public String viewQuestions(@PathVariable(value = "idQuestion") Long idQuestion, Model model) {
        Questions question = questionsService.findById(idQuestion);
        List<Answers> answers = answersService.findAllByQuestions(question);
        model.addAttribute("answers", answers);
        model.addAttribute("question", question);
        return "questionDetail.jsp";
    }



    /**
     * Gets the tag by string.
     *
     * @param string the string
     * @return the tag by string
     */
    private Tags getTagByString(String string) {
        Tags tags = tagsService.findBySubject(string);
        if(tags == null) {
            tags = new Tags();
            tags.setSubject(string);
            tags = tagsService.save(tags);
        }
        return tags;
    }


    @RequestMapping(value="/{idQuestion}/addAnswer", method=RequestMethod.POST)
    public String addAnswer(@PathVariable(value = "idQuestion") Long idQuestion, @RequestParam(value = "answer") String answer, Model model) {
        Questions question = questionsService.findById(idQuestion);
        Answers answersObj = new Answers();
        answersObj.setAnswers(answer);
        answersObj.setQuestions(question);
        answersService.save(answersObj);

        List<Answers> answers = answersService.findAllByQuestions(question);
        model.addAttribute("answers", answers);
        model.addAttribute("question", question);
        return "questionDetail.jsp";
    }


}
