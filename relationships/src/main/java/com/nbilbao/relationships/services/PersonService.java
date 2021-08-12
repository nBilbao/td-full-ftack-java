package com.nbilbao.relationships.services;
import com.nbilbao.relationships.models.Person;
import com.nbilbao.relationships.repositories.PersonRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    //Agregando el book al repositorio como una dependenciacopy
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    //Devolviendo todos los libros.
    public List<Person> allPersons() {
        return personRepository.findAll();
    }

    //Creando un libro.
    public Person createPerson(Person b) {
        return personRepository.save(b);
    }

    //Obteniendo la información de un libro
    public Person findPerson(Long id) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if (optionalPerson.isPresent()) {
            return optionalPerson.get();
        } else {
            return null;
        }

    }
}