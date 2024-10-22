package Day2;

import java.util.ArrayList;
import java.util.Scanner;

import Day1.function_comparison.While.While;

public class c4_Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Score> scores = new ArrayList<Score>();
        
        while (true){
            Score score = new Score();
            System.out.print("請輸入國文成績(輸入-1結束)");
            score.a = scanner.nextInt();
            if (score.a == -1) {
                break;
            }
            System.out.print("請輸入英文成績");
            score.b = scanner.nextInt();
            System.out.print("請輸入數學成績");
            score.c = scanner.nextInt();
            System.out.print("請輸入社會成績");
            score.d = scanner.nextInt();
            System.out.print("請輸入自然成績");
            score.e = scanner.nextInt();
            scores.add(score);
        }
        for (int i = 0; i < scores.size(); i++){
            System.out.println("第"+(i+1)+"位學生平均分數為: "+scores.get(i).avg());
        }
        scanner.close();
    }
    
}
/**
 * Score
 */
class Score {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public double avg(){
        return (a+b+c+d+e)/5;
    }
}
