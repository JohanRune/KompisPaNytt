package com.example.kompispanytt.repositories;

import com.example.kompispanytt.models.Kompis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Johan Rune
 * Date: 2021-04-15
 * Time: 10:38
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
@Repository
public interface KompisRepository extends CrudRepository <Kompis, Long>{

    List<Kompis> findByName(String name);
    List<Kompis> findByEmail(String email);
    List<Kompis> findByMobile(String mobile);
    // List<Kompis> findbyNameand(String name, String);


}
