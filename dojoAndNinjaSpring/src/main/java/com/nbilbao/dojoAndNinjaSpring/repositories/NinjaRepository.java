package com.nbilbao.dojoAndNinjaSpring.repositories;

import com.nbilbao.dojoAndNinjaSpring.models.Dojo;
import com.nbilbao.dojoAndNinjaSpring.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {

    List<Ninja> findAll();
    List<Ninja> findAllByDojo(Dojo dojo);

}
