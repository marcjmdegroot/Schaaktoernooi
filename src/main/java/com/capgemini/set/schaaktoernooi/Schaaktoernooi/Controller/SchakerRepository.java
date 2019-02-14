package com.capgemini.set.schaaktoernooi.Schaaktoernooi.Controller;

import com.capgemini.set.schaaktoernooi.Schaaktoernooi.Model.Schaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SchakerRepository extends CrudRepository<Schaker, Long> {

}