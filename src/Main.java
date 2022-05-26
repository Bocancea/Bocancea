import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String max = "";
     String[] words = text.split(" ");
for (int i=0; i< words.length; i++)
 if (words[i].length()>max.length()) max=words[i];
        System.out.println(max);

    }

}




