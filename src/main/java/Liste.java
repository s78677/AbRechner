package main.java;

import java.util.ArrayList;
import java.util.HashMap;
public class Liste {
        private Liste liste;
        private Nutzer nutzer;
        private int id;
        private HashMap<Integer, Integer> summe; //Die Summe wird als Integer unter dem Index der Nutzer-ID gespeichert
        private ArrayList<Ausgabe> ausgaben; // Ausgaben-Objekte werden chronologisch gespeichert
        private String name;
        public ArrayList<Nutzer> zugriffe;
        private static int anzahlZugriffe = 0;
        private int gesamtSumme = 0;
        private boolean offen;
        private static int alleListen = 0;

        public Liste(Nutzer nutzer, String name) {
            this.nutzer = nutzer;
            this.name = name;
            ausgaben = new ArrayList<Ausgabe>();
            zugriffe = new ArrayList<Nutzer>();
            summe = new HashMap<Integer, Integer>();
            addNutzer(nutzer);
            offen = true;
            alleListen++;
            id = alleListen;
        }
        public void neueAusgabe(Nutzer nutzer, int betrag){
            //Ausgabe in liste ausgaben speichern
            Ausgabe neueAusgabe = new Ausgabe(nutzer, betrag);
            ausgaben.add(neueAusgabe);
            gesamtSumme = gesamtSumme+betrag;
            //summe aktualisieren
            updateSumme();
        }
        public void updateSumme(){
            //alle Nutzer durchlaufen
            for (int i = 0; i<anzahlZugriffe; i++){
                int bezahlt = 0;
                //alle Ausgaben von gleichem Nutzer in bezahlt zusammenzählen
                for(int y = 0; y<ausgaben.size(); y++){
                    if(ausgaben.get(y).getNutzer().getID() == zugriffe.get(i).getID()){
                        bezahlt = bezahlt + ausgaben.get(y).getBetrag();
                    }
                }
                //neue Summe speichern
                summe.put(zugriffe.get(i).getID(), gesamtSumme/anzahlZugriffe-bezahlt);
            }
        }
        public void addNutzer(Nutzer nutzer){
            //Nutzer-ID wird in der Array List gespeichert.
            zugriffe.add(nutzer);
            //Summe wird für jeden Nutzer unter dem Index der Nutzer-ID gespeichert und auf 0 gesetzt.
            summe.put(nutzer.getID(), 0);
            anzahlZugriffe++;
        }
        public int getAnzahlZugriffe(){
            return anzahlZugriffe;
        }
        public int getSumme(Nutzer nutzer){
           int i = summe.get(nutzer.getID()).intValue();
           return i;
        }
        public boolean isOffen(){
            return offen;
        }
        public int getId(){
            return id;
        }
        public void oeffnen(){
            offen = true;
        }
        public void schliessen(){
            offen = false;
        }
}
