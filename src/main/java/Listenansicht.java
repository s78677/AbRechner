package main.java;

import java.util.ArrayList;
import java.util.HashMap;

public class Listenansicht {
    private Nutzer nutzer;
    private ArrayList<Liste> offen; //alle offenen Listen werden hier gespeichert.
    private ArrayList<Liste> geschlossen; //alle geschlossenen Listen werden hier gespeichert.
    private HashMap<Integer, Integer> summe; //Summe für den Benutzer unter der ID der Liste als Index abgespeichert.

    public Listenansicht(Nutzer nutzer){
        this.nutzer = nutzer;
        offen = new ArrayList<Liste>();
        geschlossen = new ArrayList<Liste>();
        summe = new HashMap<Integer, Integer>();
    }
    public void updateListen(){
        //hier sollen alle Listen auf offen/geschlossen geprüft und sortiert werden.
        //soll immer aufgerufen werden, sobald eine Liste geöffnet oder geschlossen wird.
    }
    public void addSumme(Liste liste){
        summe.put(liste.getId(), liste.getSumme(nutzer));
    }

}
