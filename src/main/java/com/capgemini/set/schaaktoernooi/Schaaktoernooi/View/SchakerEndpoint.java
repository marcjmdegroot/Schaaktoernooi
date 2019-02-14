package com.capgemini.set.schaaktoernooi.Schaaktoernooi.View;

import com.capgemini.set.schaaktoernooi.Schaaktoernooi.Controller.SchakerService;
import com.capgemini.set.schaaktoernooi.Schaaktoernooi.Model.Schaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Schaker")
public class SchakerEndpoint {

    @Autowired
    private com.capgemini.set.schaaktoernooi.Schaaktoernooi.Controller.SchakerService SchakerService;

    @GetMapping("/all")
    public Iterable<Schaker> listSchakeres(){
        return SchakerService.findAll();
    }

    @PostMapping("/add")
    public void addSchaker(@RequestBody Schaker Schaker){
        SchakerService.save(Schaker);
    }

    @GetMapping("/Schaker")
    public Schaker findSchakerByID(@RequestParam long consumableID)
    {
        return SchakerService.findByID(consumableID);
    }

}