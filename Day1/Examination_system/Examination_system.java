package Day1.Examination_system;

import java.util.ArrayList;

// 定義考生類
class Student {
    private String name;
    private int age;
    private int score; // Java 考試的分數

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getData() {
        return "姓名: " + name + ", 年齡: " + age + ", Java考試分數: " + score;
    }
}

public class Examination_system {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        String input;
        int age, score;

        while (true) {

            System.out.print("請輸入考生的姓名（或輸入 'q' 退出）:");
            input = System.console().readLine();

            if (input.equals("q")) {
                break; // 離開迴圈
            }

            String name = input;
            while (true) {
                System.out.print("請輸入考生的年齡:");
                try {
                    age = Integer.parseInt(System.console().readLine()); // ��字元���������字
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("輸入的年齡不是數字。請重新輸入。");
                }
            }
            while (true) {

                System.out.print("請輸入考生的 Java 考試分數:");
                try {
                    score = Integer.parseInt(System.console().readLine());// 將字元轉換為數字
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("輸入的分數不是數字。請重新輸入。");
                }
            }

            // 創建考生物件並添加到列表中
            Student student = new Student(name, age, score);
            students.add(student);

        }
        // 印出所有考生的資料
        System.out.println("\n所有考生的資料:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("第" + String.valueOf(i + 1) + "個學生: " + student.getData());
        }
    }
}