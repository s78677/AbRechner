package main.java;

public class Admin extends Nutzer {

    //private String email;
    //private String name;
    //private String passwort;
    //fallen weg, da sie in Superklasse Nutzer gespeichert sind.

    public Admin(String email, String name, String passwort) throws Exception {
        super(email, name, passwort);
    }

    public void addListe(Liste liste){
        super.listen.add(liste);
    }
}
