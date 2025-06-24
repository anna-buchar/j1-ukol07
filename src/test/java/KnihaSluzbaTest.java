//package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import cz.czechitas.ukol07.Kniha;
import cz.czechitas.ukol07.KnihaSluzba;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class KnihaSluzbaTest {

    @Test
    void vypisVsechnyKnihy() throws IOException {
        KnihaSluzba sluzba = new KnihaSluzba();
        List<Kniha> knihy = sluzba.vypisVsechnyKnihy();
        assertEquals(14, knihy.size());
    }

    @Test
    void vypisKnihyOdAutora() throws IOException {
        KnihaSluzba sluzba = new KnihaSluzba();
        List<Kniha> knihy = sluzba.vypisKnihyOdAutora("Magdalena Dobromila Rettigová");
        assertFalse(knihy.isEmpty());
        assertEquals("Magdalena Dobromila Rettigová", knihy.getFirst().getAutor());
    }

    @Test
    void vypisKnihyOdAutoraNeniVSeznamu() throws IOException {
        KnihaSluzba sluzba = new KnihaSluzba();
        List<Kniha> knihy = sluzba.vypisKnihyOdAutora("Dominik Landsman");
        assertTrue(knihy.isEmpty());
    }

    @Test
    void vypisKnihyVydaneVRoce() throws IOException {
        KnihaSluzba sluzba = new KnihaSluzba();
        List<Kniha> knihy = sluzba.vypisKnihyVydaneVRoce("1856");
        assertFalse(knihy.isEmpty());
        assertEquals(2,  knihy.size());
    }

    @Test
    void vypisKnihyVydaneVRoceNeniVSeznamu() throws IOException {
        KnihaSluzba sluzba = new KnihaSluzba();
        List<Kniha> knihy = sluzba.vypisKnihyVydaneVRoce("2038");
        assertTrue(knihy.isEmpty());
    }

}
