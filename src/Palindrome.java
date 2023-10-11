import java.util.Scanner;

public class Palindrome {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Quelle est votre supposé palindrome ? ");
        String palindrome = scanner.nextLine();
        String palEpure = "";
        String reverse = "";
        for (int i = 0; i < palindrome.length(); ++i) { //epuration
            char test = palindrome.charAt(i);
            if(Character.isLetter(test)) {
                palEpure += test;
                reverse = test + reverse;
            }
        }
        palEpure = palEpure.toLowerCase();
        reverse = reverse.toLowerCase();
        if (palEpure.equals(reverse)) {
            System.out.println(palindrome + " est un palindrome ! ");
        } else {
            System.out.println(palindrome + " n'est pas un palindrome !");
        }
    }
}
