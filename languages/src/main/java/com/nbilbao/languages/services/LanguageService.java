package com.nbilbao.languages.services;

import com.nbilbao.languages.models.Language;
import com.nbilbao.languages.repositories.LanguageRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class LanguageService {
    private final LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }
    //Devolviendo todos los libros.
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    //Creando un libro.
    public Language createLanguage(Language b) {
        return languageRepository.save(b);
    }
    //Obteniendo la información de un libro
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }

    public void deleteLanguage(Long id) {
        languageRepository.deleteById(id);
    }

    public void updateLanguage(Language language) {

    }

    public Language updateLanguage(Long id, String name, String creator, String currentVersion) {

        Language languageToUpdate = languageRepository.findById(id).get();
        languageToUpdate.setName(name);
        languageToUpdate.setCreator(creator);
        languageToUpdate.setCurrentVersion(currentVersion);
        languageRepository.save(languageToUpdate);

        return languageToUpdate;
    }

    public void deleteBook(Long id) {
        languageRepository.deleteById(id);
    }
}
