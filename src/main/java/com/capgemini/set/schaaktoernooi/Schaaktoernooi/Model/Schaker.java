package com.capgemini.set.schaaktoernooi.Schaaktoernooi.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Schaker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long schaakID;

    private String voornaam;
    private String tussenvoegsel;
    private String achternaam;

    private LocalDate geboortedatum;

    private int gewonnenPartijen;
    private int remises;
    private int verlorenPartijen;


    private Schaker()
    { }

    public Schaker(String voornaam, String achternaam, String tussenvoegsel, LocalDate geboortedatum) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.tussenvoegsel = tussenvoegsel;
        this.geboortedatum = geboortedatum;
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

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

//    public void setGeboortedatum(LocalDate geboortedatum) throws NoTransAgeismAllowedException {
//        if(voornaam.equalsIgnoreCase("Emile") && achternaam.equalsIgnoreCase("Ratelband")) {
//            geboortedatum = geboortedatum.plusYears(20);
//        }
//        else throw new NoTransAgeismAllowedException();
//    }

    public void setGeboortedatum(LocalDate geboortedatum)
    {
        this.geboortedatum = geboortedatum;
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

    public long getSchaakID() {
        return schaakID;
    }

    @Override
    public String toString() {
        return "Schaker{" +
                "schaakID=" + schaakID +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", tussenvoegsel='" + tussenvoegsel + '\'' +
                ", geboortedatum=" + geboortedatum +
                ", gewonnenPartijen=" + gewonnenPartijen +
                ", remises=" + remises +
                ", verlorenPartijen=" + verlorenPartijen +
                '}';
    }
}
