package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class KnihaSluzba {

    private final List<Kniha> seznamKnih;

    public KnihaSluzba() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            seznamKnih = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Kniha> getSeznamKnih() {
        return seznamKnih;
    }

    public List<Kniha> vypisVsechnyKnihy() {
        List<Kniha> vysledek = new ArrayList<>();
        for (Kniha seznam : seznamKnih) {
            vysledek.add(seznam);
        }
        return vysledek;
    }

    public List<Kniha> vypisKnihyOdAutora(String autor) {
        List<Kniha> vysledek = new ArrayList<>();
        for (Kniha seznam : seznamKnih) {
            if (autor.equals(seznam.getAutor())) {
                vysledek.add(seznam);
            }
        } if (vysledek.isEmpty()) {
            return vysledek;
        } else {
            return vysledek;
        }
    }

    public List<Kniha> vypisKnihyVydaneVRoce(String rokVydani) {
        List<Kniha> vysledek = new ArrayList<>();
        for (Kniha seznam : seznamKnih) {
            if (rokVydani.equals(seznam.getRokVydani())) {
                vysledek.add(seznam);
            }
        } if (vysledek.isEmpty()) {
            return vysledek;
        } else {
            return vysledek;
        }
    }

}
