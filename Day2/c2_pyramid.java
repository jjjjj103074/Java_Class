package Day2;

import java.util.Scanner;

public class c2_pyramid {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("請輸入金字塔的高度：");
        // int height = scanner.nextInt();

        // for (int i = 1; i <= height; i++) {
        //     for (int j = 1;j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // scanner.close();








        // 創建 Scanner 物件以讀取使用者輸入
        Scanner scanner = new Scanner(System.in);
        
        // 提示使用者輸入精字塔的高度
        System.out.print("請輸入金字塔的高度：");
        int height = scanner.nextInt();
        
        // 繪製精字塔
        for (int i = 1; i <= height; i++) {
            // 輸出空白
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // 輸出星號
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // 換行
            System.out.println();
        }
        
        // 關閉掃描器
        scanner.close();
    }
}
