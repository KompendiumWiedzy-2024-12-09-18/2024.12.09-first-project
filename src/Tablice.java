public class Tablice {
    public static void main(String[] args) {
        int[] tab = new int[10];
        tab[0] = 15;
        tab[1] = 20;
        tab[2] = 40;

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);

        double[] tab2 = {3.3, 5.5, 7.7, 9.9};

        System.out.println(tab2[0]);
        System.out.println(tab2[1]);
        System.out.println(tab2[2]);
        System.out.println(tab2[3]);

        System.out.println(tab2.length);
        System.out.println(tab.length);

        String[] names = new String[5];

        names[0] = "Janusz";
        names[1] = "Wiesiek";

        System.out.println(names[0]);

        int i;
        int[] t;
        int[][] tab2D = new int[5][5];

        tab2D[0][0] = 4;
        tab2D[0][1] = 7;

        System.out.println(tab2D[0][0]);

        boolean[][][] tab3D = new boolean[3][3][3];

        tab3D[0][1][2] = true;

        System.out.println(tab3D[0][1][2]);

        int[][] tab2D2 = {
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };

        int[] innerTab = tab2D2[0];
        System.out.println(innerTab[0]);

        boolean[] emptyTab = new boolean[10];

        System.out.println(emptyTab[0]);
        System.out.println(emptyTab[1]);
        System.out.println(emptyTab[2]);
        System.out.println(emptyTab[3]);
    }
}
