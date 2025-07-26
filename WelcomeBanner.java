import java.util.Scanner;

public class Q3_WelcomeBanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("----------------- Done By:Aswin Samuel.A URK24CS9014 ---------- ");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("WELCOME " + name.toUpperCase());
    }
}
