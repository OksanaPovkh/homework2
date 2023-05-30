package lesson7.task3;

public class CycleTest {
    public static void main(String[] args) {


        // Вывести в консоль слово Hello 10 раз
        int a = 5;

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            System.out.println(a);
        }
        System.out.println("конец цикла");

        System.out.println("Вторая задача");

        // Вывнсти число от 10 до 1 в парядке убывания

        for(int i = 10; i >= 1; i-- ){
            System.out.println(i);
        }



    }
}
