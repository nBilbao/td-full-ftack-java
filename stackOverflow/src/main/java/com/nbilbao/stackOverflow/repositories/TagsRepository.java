package com.nbilbao.stackOverflow.repositories;

import com.nbilbao.stackOverflow.models.Tags;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsRepository extends CrudRepository<Tags,Long> {

    Tags findBySubject(String subject);

}
