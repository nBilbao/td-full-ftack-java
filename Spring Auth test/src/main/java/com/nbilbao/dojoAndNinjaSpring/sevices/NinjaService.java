package com.nbilbao.dojoAndNinjaSpring.sevices;

import com.nbilbao.dojoAndNinjaSpring.models.Dojo;
import com.nbilbao.dojoAndNinjaSpring.models.Ninja;
import com.nbilbao.dojoAndNinjaSpring.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository){
        this.ninjaRepository = ninjaRepository;
    }

    //Devolviendo todos los libros.
    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }
    //Creando un libro.
    public Ninja createNinja(Ninja b) {
        return ninjaRepository.save(b);
    }
    //Obteniendo la información de un libro
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }

    public List<Ninja> findAllByDojo(Dojo dojos) {
        return ninjaRepository.findAllByDojo(dojos);
    }
}
