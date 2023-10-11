import java.util.Scanner;

public class Scalaire {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int nMax = 10;
        double[] v1 = new double[nMax];
        double[] v2 = new double[nMax];
        System.out.print("Entrez la taille des vecteurs (entre 1 et " + nMax + ") : ");
        int n;
        do {
            n = scanner.nextInt();
            if (n < 1 || n > nMax) {
                System.out.print("Erreur, valeur non valide, veuillez retaper : ");
            }
        } while ( n < 1 || n > nMax);
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print("Veuillez mettre la composante v_" + i +"{"+ j + "} : ");
                if (i == 0) {
                    v1[j] = scanner.nextDouble();
                } else {
                    v2[j] = scanner.nextDouble();
                }
            }
        }
        int resultat = 0;
        for (int i = 0; i < n; ++i) {
            resultat += v1[i]*v2[i];
        }
        System.out.println("Le résultat du produit scalaire est : " + resultat);
    }
}
