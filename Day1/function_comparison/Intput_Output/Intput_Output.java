package Day1.function_comparison.Intput_Output;

public class Intput_Output {
    public static void main(String[] args) {
        System.out.print("請輸入你的名字：");
        String name = System.console().readLine();
        System.out.println("你好，" + name + "！");
    }
}
