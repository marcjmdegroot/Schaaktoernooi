package com.capgemini.set.schaaktoernooi.Schaaktoernooi.Controller;

import com.capgemini.set.schaaktoernooi.Schaaktoernooi.Model.Schaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SchakerService {

    @Autowired
    private SchakerRepository schakerrepository;

    public Schaker findByID(long id) {
        return schakerrepository.findById(id).get();
    }

    public Schaker save(Schaker Schaker)
    {
        return schakerrepository.save(Schaker);
    }

    public Iterable<Schaker> findAll() {
        return schakerrepository.findAll();
    }
}