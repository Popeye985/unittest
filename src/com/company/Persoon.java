package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Persoon {
    private String naam;
    private LocalDate geboortedatum;

    public Persoon(String naam, LocalDate geboortedatum) {
        this.naam = naam;
        this.geboortedatum = geboortedatum;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }
    public int getLeeftijd(){
        Period periode = Period.between(geboortedatum, LocalDate.now());
        return periode.getYears();
    }
}

