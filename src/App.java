public class App {
    public static void main(String[] args) {
        System.out.println("Witam !!");
        System.out.println();
        System.out.println("Kompendium wiedzy Java !!!");

        byte zmienna;
        zmienna = 6;

        zmienna = 127;

        short malaLiczba = -31000;

        int zwyklaLiczba = 1827;

        long duzaLiczba = 3000000000L;

        double liczbaZmiennoprzecinkowa = 3.44;
        float malaLiczbaZmiennoprzecinkowa = 5.55f;

        boolean zmiennaLogiczna = true;

        char znak = 'r';
        String tekst = "Kawalek tekstu";

        /*
        znak = "ABC";
        tekst = 'Y';
        */

        double d = 4.4;
        int x = (int) d;

        //String s = (String) 123;

        char c = 123;

        byte b = 'f';

        System.out.println(b);
        System.out.println(c);

        int i1 = 15;
        int i2 = 7;

        int wynik = i1 % i2;
        System.out.println(wynik);

        String s1 = "Mateusz";
        String s2 = "Bereda";

        System.out.println(s1 + " " + s2);
        double d2 = 4.4;
        System.out.println("liczba: " + d2);

        System.out.println(i1 < i2);

        boolean wynikPorownania = i1 == i2;

        int a1,a2,a3,a4;
        double d1 = 3.3, d3 = 4.4, d4 = 5.5;

        boolean zmienna1 = true;
        boolean zmienna2 = true;

        System.out.println(zmienna1 ^ zmienna2);

        int i = 0;
        i = i + 1;

        System.out.println(i);

        i++;

        System.out.println(i);

        i--;

        System.out.println(i);
    }
}
