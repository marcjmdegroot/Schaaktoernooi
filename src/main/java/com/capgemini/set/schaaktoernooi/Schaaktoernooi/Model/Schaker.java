package com.capgemini.set.schaaktoernooi.Schaaktoernooi.Model;

import java.time.LocalDateTime;

public class Schaker {

    private String voornaam;
    private String achternaam;
    private String tussenvoegsel;
    private LocalDateTime Geboortedatum;
    private int gewonnenPartijen;
    private int remises;
    private int verlorenPartijen;


    private Schaker()
    { }

    public Schaker(String voornaam, String achternaam, String tussenvoegsel, LocalDateTime geboortedatum) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.tussenvoegsel = tussenvoegsel;
        Geboortedatum = geboortedatum;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public LocalDateTime getGeboortedatum() {
        return Geboortedatum;
    }

    public void setGeboortedatum(LocalDateTime geboortedatum) throws NoTransAgeismAllowedException {
        if(voornaam.equalsIgnoreCase("Emile") && achternaam.equalsIgnoreCase("Ratelband")) {
            Geboortedatum = geboortedatum.plusYears(20);
        }
        else throw new NoTransAgeismAllowedException();
    }

    public int getGewonnenPartijen() {
        return gewonnenPartijen;
    }

    public void setGewonnenPartijen(int gewonnenPartijen) {
        this.gewonnenPartijen = gewonnenPartijen;
    }

    public int getRemises() {
        return remises;
    }

    public void setRemises(int remises) {
        this.remises = remises;
    }

    public int getVerlorenPartijen() {
        return verlorenPartijen;
    }

    public void setVerlorenPartijen(int verlorenPartijen) {
        this.verlorenPartijen = verlorenPartijen;
    }
}
