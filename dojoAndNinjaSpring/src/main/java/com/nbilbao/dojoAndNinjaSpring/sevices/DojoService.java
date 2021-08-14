package com.nbilbao.dojoAndNinjaSpring.sevices;

import com.nbilbao.dojoAndNinjaSpring.models.Dojo;
import com.nbilbao.dojoAndNinjaSpring.models.Ninja;
import com.nbilbao.dojoAndNinjaSpring.repositories.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {

    private final DojoRepository dojoRepository;
    @Autowired
    NinjaService ninjaService;

    public DojoService(DojoRepository dojoRepository){
        this.dojoRepository = dojoRepository;
    }

    //Devolviendo todos los libros.
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    //Creando un libro.
    public Dojo createDojo(Dojo b) {
        return dojoRepository.save(b);
    }
    //Obteniendo la información de un libro
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }





}
