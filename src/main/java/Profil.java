package main.java;
import java.awt.*;

public class Profil{
    private Nutzer nutzer;
    private Listenansicht listenansicht;
    private String name;
    private Image profilbild;

    public Profil(Nutzer nutzer){
        this.nutzer = nutzer;
        this.name = nutzer.getName();
        listenansicht = new Listenansicht(nutzer);
    }
    public Liste createListe(String name){ //Der Benutzer soll die Liste nur vom Profil aus erstellen können.
        //Liste l = new Liste(nutzer, name);
        Liste l = new Liste(nutzer, name);
        //nutzer.addListe(l);
        nutzer.addListe(l);
        listenansicht.updateListen();
        listenansicht.addSumme(l);
        return l;
    }
    public void editListe(Liste liste, boolean offen){
        if(offen == true){
            liste.oeffnen();
        }
        if(offen != false){
            liste.schliessen();
        }
        listenansicht.updateListen();
    }

    /*public void editListe(Liste liste, boolean offen){
        if(liste.isOffen()){
            if(offen == true){
                return;
            }
            else{
                liste.schliessen();
            }
            listenansicht.updateListen();
        }
        else{
            if(offen==false){
                return;
            }
            else{
                liste.oeffnen();
            }
            listenansicht.updateListen();
        }
    }*/

}
