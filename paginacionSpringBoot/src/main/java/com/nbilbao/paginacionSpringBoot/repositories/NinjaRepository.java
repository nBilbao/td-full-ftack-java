package com.nbilbao.paginacionSpringBoot.repositories;

import com.nbilbao.paginacionSpringBoot.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NinjaRepository extends PagingAndSortingRepository<Ninja,Long> {


}
