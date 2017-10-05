package com.guilherme.playground.convencealonso.controller;

import com.guilherme.playground.convencealonso.entity.SerHumano;
import com.guilherme.playground.convencealonso.repository.SerHumanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerHumanoController {

    private final SerHumanoRepository serHumanoRepository;

    @Autowired
    public SerHumanoController(SerHumanoRepository serHumanoRepository) {
        this.serHumanoRepository = serHumanoRepository;
    }

    @GetMapping
    public Page<SerHumano> getSeresHumanos(Pageable pageable) {
        return this.serHumanoRepository.findAll(pageable);
    }

}
