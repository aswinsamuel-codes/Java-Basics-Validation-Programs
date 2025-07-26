import java.util.Scanner;

public class Q5_VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("----------------- Done By:Aswin Samuel.A URK24CS9014 ---------- ");
        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
