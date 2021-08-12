package com.nbilbao.relationships.repositories;

import com.nbilbao.relationships.models.License;
import com.nbilbao.relationships.models.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LicenseRepository extends CrudRepository<License,Long> {

    //Este método recupera todos los libros de la base de datos
    List<License> findAll();
    //Este método encuentra un libro por su descripción
    //List<License> findByDescriptionContaining(String search);
    //Este método cuenta cuántos libros contiene cierta cadena en el título
    //Long countByTitleContaining(String search);
    //Este método borra un libro que empieza con un título específico
    //Long deleteByTitleStartingWith(String search);
}
