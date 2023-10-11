import java.util.Scanner;
public class Conversion {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Entre une seule lettre A..Z ou a..z : ");
        int lettre = (int)scanner.next().charAt(0);
        if (lettre < 65 || lettre > 122 || (lettre > 90 && lettre < 97)) {
            System.out.println("Caractère non valide");
        } else if (lettre <= 90) {
            lettre += 32;
            System.out.println("Version minuscule : " + (char)(lettre));
        } else {
            lettre -= 32;
            System.out.println("Version majuscule : " + (char)(lettre));
        }
    }
}
