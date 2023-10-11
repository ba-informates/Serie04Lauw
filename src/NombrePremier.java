import java.util.ArrayList;

public class NombrePremier {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        for (int i = 2; i <= 100; ++i) {
            if (i == 2) {
                tab.add(i);
            } else if ( i % 2 != 0) {
                boolean isDivisible = false;
                for (int j = 3; j <= (int) Math.sqrt(i); j += 2) {
                    if (i % j == 0) {
                        isDivisible = true;
                    }
                }
                if (!isDivisible) {
                    tab.add(i);
                }
            }
        }
        System.out.println("Les nombres premiers compris entre 2 et 100 sont les suivants :");
        for (int val : tab)
            System.out.println(val);
    }
}
