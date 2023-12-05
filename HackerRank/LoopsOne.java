import java.util.Scanner;

public class LoopsOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", N, i, N*i).println();
        }
    }
}
