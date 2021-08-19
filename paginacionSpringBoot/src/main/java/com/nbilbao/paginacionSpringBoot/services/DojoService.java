package com.nbilbao.paginacionSpringBoot.services;

import com.nbilbao.paginacionSpringBoot.repositories.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DojoService {

    @Autowired
    DojoRepository dojoRepository;

}
