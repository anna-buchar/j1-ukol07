package cz.czechitas.ukol07;

import java.io.IOException;

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
        System.out.println(sluzba.vypisKnihyOdAutora("Karel Čapek"));

        System.out.println("Knihy vydané v roce 1845:");
        System.out.println(getAutor(sluzba.vypisKnihyVydaneVRoce("1845")) + ": " + getNazev(sluzba.vypisKnihyVydaneVRoce("1845")));
    }

}
