package Day1.function_comparison.If;

import java.io.IOException;

public class If {
    public static void main(String[] args) throws IOException {
        System.out.print("請輸入一個整數：");
        int number = System.in.read();
        if (number == 0) {
            System.out.println("零");
        } else if (number % 2 == 0) {
            System.out.println("偶數");
        } else {
            System.out.println("奇數");
        }
    }
}