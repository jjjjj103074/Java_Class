public class Main {

    // 地圖的寬和高
    private static final int WIDTH = 50;
    private static final int HIGH = 30;

    // 主程式
    public static void main(String[] args) {
        printMap();
    }
    
    //印出地圖的方法
    public static void printMap() {
        int width = WIDTH;
        int high = HIGH;
        // 印出上邊框
        for (int i = 0; i < width; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // 印出中間的空白部分
        for (int i = 0; i < high - 2; i++) {
            System.out.print("* "); // 左上角
            for (int j = 0; j < width - 2; j++) {
                System.out.print("  "); // 內部空白
            }
            System.out.println("*"); // 右上角
        }

        // 印出下邊框
        for (int i = 0; i < width; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
