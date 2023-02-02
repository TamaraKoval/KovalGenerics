import boxes.MagicBox;

public class Main {
    public static void main(String[] args) throws Exception {
        MagicBox<Integer> testBox1 = new MagicBox<>(3); // тест на Integer
        testBox1.add(4); // заполняем первую ячейку коробки
        testBox1.add(5); // заполняем вторую ячейку коробки
        System.out.println(testBox1); // смотрим содержимое коробки
        // testBox.pick(); // программа выкинула Ошибку, все работает корректно
        testBox1.add(6); // заполнили полностью коробку
        System.out.println(testBox1); // смотрим содержимое коробки
        testBox1.pick(); // магическая коробка вернула рандомный элемент массива

        System.out.println();

        MagicBox<String> testBox2 = new MagicBox<>(4); // тест на String
        testBox2.add("Ехал");
        testBox2.add("Грека");
        testBox2.add("через");
        testBox2.add("реку"); // заполнили полностью коробку
        System.out.println(testBox2); // смотрим содержимое коробки
        testBox2.pick(); // магическая коробка вернула рандомный элемент массива

    }
}
