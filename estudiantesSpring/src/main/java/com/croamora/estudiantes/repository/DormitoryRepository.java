package com.croamora.estudiantes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.croamora.estudiantes.model.Dormitory;

@Repository
public interface DormitoryRepository extends CrudRepository<Dormitory, Long> {

}
