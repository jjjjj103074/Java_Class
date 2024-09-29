package Day2;

import java.util.Scanner;

public class c1_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 輸入身高
        System.out.print("請輸入您的身高（公尺）：");
        double height = scanner.nextDouble();
        
        // 輸入體重
        System.out.print("請輸入您的體重（公斤）：");
        double weight = scanner.nextDouble();
        
        // 計算 BMI
        double bmi = weight / (height * height);
        
        // 顯示結果
        System.out.println("您的 BMI 是：" + bmi);

        // 評估 BMI
        if (bmi < 18.5) {
            System.out.println("體重過輕");
        } else if (bmi < 25) {
            System.out.println("正常範圍");
        } else if (bmi < 30) {
            System.out.println("過重");
        } else {
            System.out.println("肥胖");
        }
        
        // 關閉掃描器
        scanner.close();
    }
}
