package main.java;

public class Ausgabe {
    private Ausgabe ausgabe;
    private Nutzer nutzer;
    private int betrag;

    public Ausgabe(Nutzer nutzer, int betrag){
        this.nutzer = nutzer;
        this.betrag = betrag;
    }

    public int getBetrag(){
        return betrag;
    }
    public Nutzer getNutzer(){
        return nutzer;
    }
}
