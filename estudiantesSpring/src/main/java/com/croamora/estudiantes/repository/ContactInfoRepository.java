/**
 * 
 */
package com.croamora.estudiantes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.croamora.estudiantes.model.ContactInfo;

/**
 * @author croamora
 *
 */
@Repository
public interface ContactInfoRepository extends CrudRepository<ContactInfo, Long> {

}
