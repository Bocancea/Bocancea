import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int l1 = scanner.nextInt();
        int l2 = scanner.nextInt();
        System.out.println(text.substring(l1, l2 + 1));
    }

}