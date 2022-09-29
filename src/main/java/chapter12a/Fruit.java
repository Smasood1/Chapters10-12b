package chapter12a;

import java.util.HashMap;
import java.util.Map;

public class Fruit {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana",105);
        fruitCalories.put("orange",45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("lemon"));
        System.out.println(fruitCalories.entrySet());
        fruitCalories.remove("orange");
        System.out.println(fruitCalories);

    }
}
