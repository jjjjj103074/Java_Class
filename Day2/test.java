package Day2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.print(a);
        System.out.print("|");
        System.out.print(b);

        scanner.close();
    }
}
