package Day2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 2) {

            System.out.println("123");
            i = add(i, 1);
        }

        System.out.println("done");
    }
    private static int add(int a, int b){
        return a + b;
    }
}
