package com.company;

import java.time.LocalDate;
import java.time.Month;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Test leeftijd");
        LocalDate gebDatum = LocalDate.of(2000, Month.APRIL, 1);
        Persoon testPersoon = new Persoon("Joske", gebDatum);
        int verwachteLeeftijd = 18;
        int leeftijd = testPersoon.getLeeftijd();
        if (verwachteLeeftijd != leeftijd) {
            System.out.printf("Verkeerde leeftijd. Verwacht = %d, echte leeftijd = %d%n", verwachteLeeftijd, leeftijd);
        }else {
            System.out.println("Leeftijd test in orde");
        }
    }
}
