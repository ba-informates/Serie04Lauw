import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        for (int i = 0; i < s.length(); i++) {
            Character lettre = s.charAt(i);
            int index = ALPHABET.indexOf(lettre);
            if (index != -1) {
                aCoder += lettre;
                int indexDecal = index + DECALAGE;
                if (indexDecal >= ALPHABET.length()) {
                    indexDecal = indexDecal - ALPHABET.length();
                }
                chaineCodee += ALPHABET.charAt(indexDecal);
            } else if (lettre.equals(' ')) {
                aCoder += ' ';
                chaineCodee += ' ';
            }
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
