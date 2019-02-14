package com.capgemini.set.schaaktoernooi.Schaaktoernooi.View;

import com.capgemini.set.schaaktoernooi.Schaaktoernooi.Controller.SchakerService;
import com.capgemini.set.schaaktoernooi.Schaaktoernooi.Model.Schaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/schaker")
public class SchakerEndpoint {

    @Autowired
    private SchakerService SchakerService;

    @GetMapping("/all")
    public Iterable<Schaker> listSchakeres(){
        return SchakerService.findAll();
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public void addSchaker(@RequestBody Schaker schaker){
        SchakerService.save(schaker);
    }

    @GetMapping("/test")
    public void test()
    {
        Schaker testschaker = new Schaker("Henk","Gecken","van", LocalDate.of(2019,2,13));

        SchakerService.save(testschaker);
    }

    @GetMapping("/schaker")
    public Schaker findSchakerByID(@RequestParam long consumableID)
    {
        return SchakerService.findByID(consumableID);
    }

}