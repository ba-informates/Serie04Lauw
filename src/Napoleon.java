import java.sql.PreparedStatement;
import java.util.Scanner;
public class Napoleon {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String noms = "Napoleon Bonaparte Bill Gates Claudia Schiffer Martina Hingis ";
        System.out.print("De qui voulez-vous connaitre le nom ? ");
        String prenom = scanner.nextLine();
        int index = noms.indexOf(prenom);
        if (index == -1) {
            System.out.println("Inconnu au bataillon !");
        } else {

            int indexSpace = noms.indexOf(' ', index);
            String reste = noms.substring(indexSpace+1, noms.length());
            int occurence = 1;
            while (reste.length() > 1) {
                int indexSpaceOccur = reste.indexOf(' ');
                reste = reste.substring(indexSpaceOccur + 1, reste.length());
                ++occurence;
            }
            if (occurence % 2 != 0) {
                System.out.println("Vous avez introduit un nom!");
            } else {
                int indexEnd = noms.indexOf(' ', indexSpace+1);
                String nom = noms.substring(indexSpace + 1, indexEnd);
                System.out.println("Le nom de " + prenom + " est " + nom);
            }
        }
    }
}
