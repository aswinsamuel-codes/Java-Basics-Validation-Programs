import java.util.Scanner;

public class Q4_EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("----------------- Done By:Aswin Samuel.A URK24CS9014 ---------- ");
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        if (email.endsWith("@karunya.edu.in")) {
            System.out.println("Email Accepted");
        } else {
            System.out.println("Use your college email");
        }
    }
}
