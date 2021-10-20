package com.local.catsanddogs.controllers;

import com.local.catsanddogs.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {
    // This annotation automatically connects the resource Cat to this controller and thus these endpoints
    @Autowired
    private CatRepository catRepos;

    @GetMapping(value = "/cats", produces = {"application/json"})
    public ResponseEntity<?> findAllCats() {
        return new ResponseEntity<>(catRepos.findAll(), HttpStatus.OK);
    }
}
