# 定義一個類
class Dog:
    def __init__(self, name, age):
        self.name = name  # 實例變數
        self.age = age

    def bark(self):  # 方法
        print(f"{self.name} says: Woof!")

# 創建物件
my_dog = Dog("Buddy", 3)

# 使用物件的方法
my_dog.bark()  # 輸出: Buddy says: Woof!
print(f"My dog's name is {my_dog.name} and he is {my_dog.age} years old.")
