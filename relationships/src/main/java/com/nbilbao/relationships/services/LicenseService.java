package com.nbilbao.relationships.services;

import com.nbilbao.relationships.models.License;
import com.nbilbao.relationships.models.Person;
import com.nbilbao.relationships.repositories.LicenseRepository;
import com.nbilbao.relationships.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LicenseService {

    //Agregando el book al repositorio como una dependenciacopy
    private final LicenseRepository licenseRepository;

    public LicenseService(LicenseRepository licenseRepositoryRepository) {
        this.licenseRepository = licenseRepositoryRepository;
    }

    //Devolviendo todos los libros.
    public List<License> allLicense() {
        return licenseRepository.findAll();
    }

    //Creando un libro.
    public License createLicense(License b) {
        return licenseRepository.save(b);
    }

    //Obteniendo la información de un libro
    public License findLicense(Long id) {
        Optional<License> optionalLicense = licenseRepository.findById(id);
        if (optionalLicense.isPresent()) {
            return optionalLicense.get();
        } else {
            return null;
        }

    }
}
