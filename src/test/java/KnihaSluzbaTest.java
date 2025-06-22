//package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import cz.czechitas.ukol07.Kniha;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class KnihaSluzbaTest {

    private final List<Kniha> seznamKnih;

    public KnihaSluzbaTest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try (InputStream inputStream = KnihaSluzbaTest.class.getResourceAsStream("knihy.json")) {
            seznamKnih = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    @Test
//    void vypisVsechnyKnihy() {
//        int pocetKnih = 14;
//        List<String> vysledek = seznamKnih.vypisVsechnyKnihy().size();
//        assertEquals
//    }

}
