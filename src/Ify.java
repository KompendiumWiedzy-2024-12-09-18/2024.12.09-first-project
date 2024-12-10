public class Ify {
    public static void main(String[] args) {
        int x = 5;

        if(x == 1) {
            System.out.println("To jest 1 !!");
        } else if(x == 2) {
            System.out.println("To jest 2 !!");
        } else if(x == 3) {
            System.out.println("To jest 3 !!");
        } else if(x == 4) {
            System.out.println("To jest 4 !!");
        } else {
            System.out.println("Nie wiadomo co to !!");
        }

        String s = x == 3 ? "To jest 3 !!" : "Nie wiadomo co to !!";

        System.out.println(s);

        System.out.println("koniec programu !!");
    }
}
