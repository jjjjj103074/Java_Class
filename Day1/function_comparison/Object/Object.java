package Day1.function_comparison.Object;

// 定義一個類
class Dog {
    private String name; // 實例變數
    private int age;

    // 建構子
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 方法
    public void bark() {
        System.out.println(name + " says: Woof!");
    }

    // 取得名稱
    public String getName() {
        return name;
    }

    // 取得年齡
    public int getAge() {
        return age;
    }
}

// 主類
public class Object {
    public static void main(String[] args) {
        // 創建物件
        Dog myDog = new Dog("Buddy", 3);

        // 使用物件的方法
        myDog.bark(); // 輸出: Buddy says: Woof!
        System.out.println("My dog's name is " + myDog.getName() + " and he is " + myDog.getAge() + " years old.");
    }

}
