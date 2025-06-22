package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class KnihaSluzba {

    private final List<Kniha> knihaList;

    public KnihaSluzba() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            knihaList = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Kniha> getKnihaList() {
        return knihaList;
    }

}
