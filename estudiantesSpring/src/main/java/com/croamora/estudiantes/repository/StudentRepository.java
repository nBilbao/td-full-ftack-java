/**
 * 
 */
package com.croamora.estudiantes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.croamora.estudiantes.model.Dormitory;
import com.croamora.estudiantes.model.Student;

/**
 * The Interface StudentRepository.
 *
 * @author croamora
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

	List<Student> findAll();

	List<Student> findAllByDormitory(Dormitory dormitory);
	
	

}
