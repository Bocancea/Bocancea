import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++)
            System.out.println(words[i].charAt(0));
    }

}




