public class For {
    public static void main(String[] args) {
        int[] tab = new int[100];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = (i+1) * 3;
        }

        for(int element : tab) {
            System.out.println(element);
        }

        String[] tab2 = {"A", "B", "C", "D"};

        for(String s : tab2) {
            System.out.println(s);
        }

        System.out.println("koniec programu !!");
    }
}
