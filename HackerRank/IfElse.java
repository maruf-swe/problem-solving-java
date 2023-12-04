import java.util.Scanner;

public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            if (N >= 2 && N <= 5 || N > 20) {
                System.out.println("Not Weired");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weired");
            }
        } else {
            System.out.println("Weird");
        }

    }
}