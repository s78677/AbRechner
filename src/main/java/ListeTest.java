package main.java;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListeTest {
    private final Nutzer nutzer1 = new Nutzer("max-muster@gmail.com", "maxmuster96", "12345678");
    private final Nutzer nutzer2 = new Nutzer("tommy-test@gmail.com", "tommyt", "testtest");
    private final Nutzer nutzer3 = new Nutzer("lisa-liste@gmail.com", "lisa2508", "hallo");
    private final Liste liste1 = new Liste(nutzer2, "WG-Kasse Dezember");

    public ListeTest() throws Exception {
    }

    @Test
    public void nutzerTest(){
        liste1.addNutzer(nutzer1);
        liste1.addNutzer(nutzer3);
        System.out.println("Es haben "+ liste1.getAnzahlZugriffe() + " Nutzer Zugriff auf diese Liste.");
        try{
            Nutzer nutzer4 = new Nutzer("nutzer-test@mail.de", "", "");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    @Test
    public void ausgabeTest(){
        liste1.addNutzer(nutzer1);
        liste1.addNutzer(nutzer3);
        System.out.println("Es haben "+ liste1.getAnzahlZugriffe() + " Nutzer Zugriff auf diese Liste.");
        liste1.neueAusgabe(nutzer1, 10);
        liste1.neueAusgabe(nutzer2, 20);
        System.out.println("Summe Nutzer 1: " +liste1.getSumme(nutzer1));
        System.out.println("Summe Nutzer 2: " +liste1.getSumme(nutzer2));
        System.out.println("Summe Nutzer 3: " +liste1.getSumme(nutzer3));
    }

    @Test
    public void summeTest(){
        Liste liste = mock(Liste.class);
        when(liste.getSumme(nutzer1)).thenReturn(500);
        Listenansicht la = new Listenansicht(nutzer1);
        la.addSumme(liste);
    }
}