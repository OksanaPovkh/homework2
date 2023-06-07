package homework3.task3;

public class Flask {
    public static void main(String[] args) {

       // - Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод, который проверяет это устройство. Ваша программа должна иметь переменные temperature1 и temperature2. Метод принимает на вход две эти переменные и выводит в консоль true или false.

        int Temperature1 = 105;
        int Temperature2 = 95;

        if (Temperature1 > 100 && Temperature2 < 100) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
