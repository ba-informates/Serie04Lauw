import java.util.Scanner;
public class Pascal {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Combien de lignes voulez-vous à votre triangle de Pascal ? ");
        int n = 0;
        do {
            n = scanner.nextInt();
            if (n < 1)  {
                System.out.println("Erreur, veuillez retaper : ");
            }
        }while (n < 1);
        int[][] pascal = new int[n][];
        for (int i = 0; i < n; ++i) {
            int[] tab = new int[i+1];
            for (int j = 0; j < i+1; ++j) {
                if (j == 0) {
                    tab[j] = 1;
                } else if (j == i) {
                    tab[j] = 1;
                } else {
                    tab[j] = pascal[i-1][j] + pascal[i-1][j-1];
                }
            }
            pascal[i] = tab;
        }
        for (int[] ligne : pascal) {
            for(int val : ligne) {
                System.out.print(val + " ");
            }
            System.out.println("");
        }
    }
}
