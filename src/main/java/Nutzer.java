package main.java;

import java.util.ArrayList;

public class Nutzer {
    protected int id;
    protected String name;
    protected String email;
    protected ArrayList<Liste> listen;
    private static int alleNutzer = 0;

    public Nutzer(String email, String name, String passwort) throws Exception {
        this.name = name;
        this.email = email;
        listen = new ArrayList<Liste>();
        if(email.isEmpty()||name.isEmpty()||passwort.isEmpty()){
            throw new Exception("Alle Felder müssen ausgefüllt sein!");
        }
        alleNutzer++;
        this.id = alleNutzer;
    }

    public int getID(){
      return id;
    }

    public void addListe(Liste liste){
        listen.add(liste);
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

}
