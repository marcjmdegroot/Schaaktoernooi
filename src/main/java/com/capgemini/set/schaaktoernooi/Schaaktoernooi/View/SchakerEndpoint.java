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
    private SchakerService schakerService;

    @GetMapping("/all")
    public Iterable<Schaker> listSchakeres(){
        return schakerService.findAll();
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public void addSchaker(@RequestBody Schaker schaker){
        schakerService.save(schaker);
    }

    @GetMapping("/test")
    public void test()
    {
        Schaker testschaker = new Schaker("Henk","Gecken","van", LocalDate.of(2019,2,13));

        schakerService.save(testschaker);
    }

    @GetMapping("/{schaakId}")
    public Schaker findSchakerByID(@PathVariable String schaakId)
    {
        return schakerService.findByID(Long.valueOf(schaakId));
    }

    @GetMapping("/delete/{schaakId}")
    public void deleteSchaker(@PathVariable String schaakId)
    {
        schakerService.deleteSchaker(Long.valueOf(schaakId));
    }
}