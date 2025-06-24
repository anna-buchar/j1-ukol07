package cz.czechitas.ukol07;

import java.io.IOException;
import java.util.List;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {

    public static void main(String[] args) throws IOException {
        new Aplikace().run();
    }

    private void run() throws IOException {
        KnihaSluzba sluzba = new KnihaSluzba();

        System.out.println("Pocet vsech knih:");
        System.out.println(sluzba.vypisVsechnyKnihy().stream().count());

        System.out.println("Knihy od Karla Čapka:");
        List<Kniha> capekKnihy = sluzba.vypisKnihyOdAutora("Karel Čapek");
        for (Kniha kniha : capekKnihy) {
            System.out.println(kniha.getNazev());
        }

        System.out.println("Knihy vydané v roce 1845:");
        List<Kniha> knihy1845 = sluzba.vypisKnihyVydaneVRoce("1845");
        for (Kniha kniha : knihy1845) {
            System.out.println(kniha.getAutor() + ": " + kniha.getNazev());
        }
    }
}


