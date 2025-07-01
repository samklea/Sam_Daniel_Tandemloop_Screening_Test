import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = (x % 2 == 0) ? x - 1 : x;

        int num = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(num + " ");
            num += 2;
        }
        sc.close();
    }
}
