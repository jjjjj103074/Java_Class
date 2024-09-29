package Day2;

import java.util.Scanner;

public class c0_Scanner {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入您的姓名：");
        String name = scanner.nextLine();

        System.out.print("請輸入您的年齡：");
        int age = scanner.nextInt();

        System.out.print("請輸入您最愛的顏色：");
        scanner.nextLine();
        String favoriteColor = scanner.nextLine();

        System.out.println("\n您好，" + name + "!");
        System.out.println("您的年齡是：" + age);
        System.out.println("您最愛的顏色是：" + favoriteColor);
        
        scanner.close();

        // // 創建 Scanner 物件以讀取使用者輸入
        // Scanner scanner = new Scanner(System.in);
        
        // // 提示使用者輸入姓名
        // System.out.print("請輸入您的姓名：");
        // String name = scanner.nextLine();
        
        // // 提示使用者輸入年齡
        // System.out.print("請輸入您的年齡：");
        // int age = scanner.nextInt();
        
        // // 提示使用者輸入最愛顏色
        // System.out.print("請輸入您最愛的顏色：");
        // scanner.nextLine(); // 清除換行符號
        // String favoriteColor = scanner.nextLine();
        
        // // 顯示結果
        // System.out.println("\n您好，" + name + "!");
        // System.out.println("您的年齡是：" + age);
        // System.out.println("您最愛的顏色是：" + favoriteColor);
        
        // // 關閉掃描器
        // scanner.close();
    }
}
