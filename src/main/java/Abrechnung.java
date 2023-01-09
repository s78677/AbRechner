package main.java;

public class Abrechnung {
    private String text;
    private Nutzer sender;
    private Nutzer empfaenger;
    private Liste liste;
    private String email;
    private String betreff;

    public Abrechnung(Liste liste, Nutzer sender){
        this.sender = sender;
        this.liste = liste;
        //alle Nutzer der Liste prüfen
        for(int i = 0; i<liste.getAnzahlZugriffe(); i++){
            empfaenger = liste.zugriffe.get(i);
            //wenn summe >0, schuldet der Nutzer Geld.
            if(liste.getSumme(empfaenger)>0){
                senden(empfaenger);
            }
        }
    }
    public void senden(Nutzer empfaenger){
        betreff = "Abrechnung von " + sender.getName();
        text = "Sie haben eine Abrechnung von " + sender.getName() + " erhalten.\nAusstehender Betrag: " + liste.getSumme(empfaenger);
    }

}
