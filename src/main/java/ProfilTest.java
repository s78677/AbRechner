package main.java;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProfilTest {
    Profil profil;
    String name = "WG-Kasse";

    @Test
    public void profilTest(){
        profil = mock(Profil.class);
        Liste liste = mock(Liste.class);
        when(profil.createListe(name)).thenReturn(liste);
        Listenansicht la = mock(Listenansicht.class);


    }
    //vom profil aus die Summe der Liste abrufen
}
