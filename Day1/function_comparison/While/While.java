package Day1.function_comparison.While;

public class While {
    public static void main(String[] args) {
        while (true) {
            System.out.print("輸入q離開:");
            String input = System.console().readLine();
            if (input.equals("q")) {
                break;
            }
        }
    }
}
