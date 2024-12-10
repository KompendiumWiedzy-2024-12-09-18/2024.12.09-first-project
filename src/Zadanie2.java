import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random losowacz = new Random();
        int sum = 0;
        for(int i = 0; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(1001);
            sum += tab[i];
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        System.out.println(((double) sum) / ((double) tab.length));
        String liczba = "123.4";
        double liczbaWTypieDouble = Double.parseDouble(liczba);
        System.out.println(liczbaWTypieDouble);

        String liczbaZPrzecinkiem = (liczbaWTypieDouble + "").replace(".", ",");
        System.out.println(liczbaZPrzecinkiem);
    }
}
