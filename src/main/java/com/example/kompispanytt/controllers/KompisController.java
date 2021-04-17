package com.example.kompispanytt.controllers;

import com.example.kompispanytt.models.Kompis;
import com.example.kompispanytt.repositories.KompisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Johan Rune
 * Date: 2021-04-15
 * Time: 10:53
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

@RestController
@RequestMapping(path = "/kompisss")
public class KompisController {

    @Autowired
    private KompisRepository kompisRepository;

    @GetMapping(path="/add")
    public @ResponseBody
    String addNewKompis (@RequestParam String name, @RequestParam String email, @RequestParam
                        String mobile) {
        Kompis n = new Kompis();
        n.setName(name);
        n.setEmail(email);
        n.setMobile(mobile);
        kompisRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public Iterable<Kompis> getAllKompisar(){
        return kompisRepository.findAll();
    }

    @GetMapping(path = "remove" )
    public String removeOneFriend(@RequestParam Long id){
        kompisRepository.deleteById(id);
        return "The person was deleted";
    }

    @GetMapping(path = "findOne")
    public Iterable<Kompis> findByName (@RequestParam String name){
        return kompisRepository.findByName(name);
    }

  /*  public String changeNumber (@RequestParam String name, @RequestParam String number){
        Iterable<Kompis> k = kompisRepository.findByName(name);
        k[0].
    }*/



}
