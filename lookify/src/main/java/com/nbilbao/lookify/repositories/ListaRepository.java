package com.nbilbao.lookify.repositories;

import com.nbilbao.lookify.models.Lista;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.OrderBy;
import javax.validation.constraints.Size;
import java.util.List;

@Repository
public interface ListaRepository extends CrudRepository<Lista,Long> {

    //Este método recupera todos los libros de la base de datos
    List<Lista> findAll();
    //Este método encuentra un libro por su descripción
    List<Lista> findByArtistContaining(String search);
    //Este método cuenta cuántos libros contiene cierta cadena en el título
    Long countByTitleContaining(String search);
    //Este método borra un libro que empieza con un título específico
    Long deleteByTitleStartingWith(String search);
    List<Lista> findByTitleOrderByClassificationDesc(String classification);

    List<Lista> findFirst10ByClassification();


}
