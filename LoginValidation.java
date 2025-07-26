import java.util.Scanner;

public class Q2_LoginValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("----------------- Done By:Aswin Samuel.A URK24CS9014 ---------- ");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.startsWith("user_") && password.length() >= 8) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}
