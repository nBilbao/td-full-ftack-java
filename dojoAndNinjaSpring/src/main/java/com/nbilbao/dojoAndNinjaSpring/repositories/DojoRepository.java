package com.nbilbao.dojoAndNinjaSpring.repositories;

import com.nbilbao.dojoAndNinjaSpring.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DojoRepository extends CrudRepository<Dojo,Long> {

    List<Dojo> findAll();

}
