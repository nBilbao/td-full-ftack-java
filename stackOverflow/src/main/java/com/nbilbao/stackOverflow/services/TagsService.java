package com.nbilbao.stackOverflow.services;

import com.nbilbao.stackOverflow.models.Tags;
import com.nbilbao.stackOverflow.repositories.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagsService {

    @Autowired
    TagsRepository tagsRepository;

    /**
     * Find by subject.
     *
     * @param subject the subject
     * @return the tags
     */
    public Tags findBySubject(String subject) {
        return tagsRepository.findBySubject(subject);
    }

    /**
     * Save.
     *
     * @param tags the tags
     * @return the tags
     */
    public Tags save(Tags tags) {
        return tagsRepository.save(tags);
    }
}