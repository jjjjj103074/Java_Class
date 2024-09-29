package Day2;

import java.util.Scanner;
import java.util.Random;

public class c3_Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 隨機生成一個介於 1 到 100 的整數
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("歡迎來到猜數字遊戲！");
        System.out.println("我已經選擇了一個介於 1 到 100 的數字。請嘗試猜出來！");

        // 使用 while 迴圈進行猜數字
        while (userGuess != numberToGuess) {
            System.out.print("請輸入您的猜測：");
            userGuess = scanner.nextInt();
            attempts++;

            // 提供提示
            if (userGuess < numberToGuess) {
                System.out.println("太小了！再試一次。");
            } else if (userGuess > numberToGuess) {
                System.out.println("太大了！再試一次。");
            } else {
                System.out.println("恭喜你！你猜對了！");
                System.out.println("您總共猜了 " + attempts + " 次。");
            }
        }

        // 關閉掃描器
        scanner.close();
    }
}
