package com.nbilbao.languages.repositories;

import com.nbilbao.languages.models.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends CrudRepository<Language,Long> {

    //Este método recupera todos los lenguajes de la base de datos
    List<Language> findAll();
    //Este método encuentra un lenguaje por su descripción
    List<Language> findByCreatorContaining(String search);
    //Este método cuenta cuántos libros contiene cierta cadena en el título
    Long countByNameContaining(String search);
    //Este método borra un lenguaje que empieza con un título específico
    Long deleteByNameStartingWith(String search);


}
