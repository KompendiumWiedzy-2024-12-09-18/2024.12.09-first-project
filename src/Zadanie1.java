public class Zadanie1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] tab = new int[100];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
            if(tab[i] % 5 == 0) {
                System.out.println(tab[i]);
            }
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
