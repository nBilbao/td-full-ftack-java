package com.nbilbao.lookify.services;


import com.nbilbao.lookify.models.Lista;
import com.nbilbao.lookify.repositories.ListaRepository;
import javassist.runtime.Desc;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.OrderBy;
import java.util.List;
import java.util.Optional;
@Service
public class ListaService {

    private final ListaRepository listaRepository;

    public ListaService(ListaRepository listaRepository) {
        this.listaRepository = listaRepository;
    }

    //Devolviendo todos los libros.
    public List<Lista> allListas() {
        return listaRepository.findAll();
    }
    //Creando un libro.
    public Lista createLista(Lista b) {
        return listaRepository.save(b);
    }
    //Obteniendo la información de un libro
    public Lista findLista(Long id) {
        Optional<Lista> optionalLista = listaRepository.findById(id);
        if(optionalLista.isPresent()) {
            return optionalLista.get();
        } else {
            return null;
        }
    }

    public void deleteBook(Long id) {
        listaRepository.deleteById(id);
    }

    public List<Lista> ordenarTopTen(){

        return listaRepository.findTop10ByOrderByClassificationAsc();



    }

    public List<Lista> findArtist(String artist){
        return listaRepository.findByTitleContaining(artist);
    }
}
