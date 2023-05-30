package homework2;

import java.util.Scanner;

public class HWScanner {

    public static void main(String[] args) {
        System.out.println("Введите 2 слоава с четным количеством букв:");
        Scanner scanner = new Scanner(System.in);
        String w1 = scanner.nextLine();
        String w2 = scanner.nextLine();
        System.out.println("Вы ввели слово:" + w1 +" " + w2);

        int half1 = w1.length() /2;
        int half = w2.length() /2;
        String result = w1.substring(0,half) + w2.substring(half1);
        System.out.println(result);
    }
}
