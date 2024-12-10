import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        Random losowacz = new Random();
        int max = Integer.MIN_VALUE, maxRow = 0;
        for(int row = 0; row < tab.length; row++) {
            for(int col = 0; col < tab[row].length; col++) {
                tab[row][col] = losowacz.nextInt(1001);
                System.out.print(tab[row][col] + "\t");
                if(tab[row][col] >= max) {
                    max = tab[row][col];
                    maxRow = row;
                }
            }
            System.out.println();
        }

        System.out.println(max);
        System.out.println(maxRow);
    }
}
