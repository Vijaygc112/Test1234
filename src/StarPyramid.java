import java.util.Scanner;

public class StarPyramid {

    public static void main(String[] args) {

        System.out.println("Enter the number iof rows :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
