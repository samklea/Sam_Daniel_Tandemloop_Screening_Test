import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num = 1;

        for (int i = 0; i < x; i++) {
            System.out.print(num + " ");
            num += 2;
        }
        sc.close();
    }
}
