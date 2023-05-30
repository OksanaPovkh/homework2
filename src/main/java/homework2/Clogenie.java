package homework2;

public class Clogenie {
    public static void main(String[] args) {
        System.out.println("Метод сложения");
        int y = 15;
        int x = 10;
        System.out.println(add(y,x));
        System.out.println(bbn(y,x));
        System.out.println(dda(y,x));
        System.out.println(ffn(y,x));
    }

        public static int add(int y,int x){
            System.out.println("Метод начал работу");
            int result = y + x;
            System.out.println("Метод закончил работу");
            return result;
        }

    public static int bbn (int y,int x){
        System.out.println("Метод начал работу");
        int result = y - x;
        System.out.println("Метод закончил работу");
        return result;
    }
    public static int dda (int y,int x){
        System.out.println("Метод начал работу");
        int result = y * x;
        System.out.println("Метод закончил работу");
        return result;
    }

    public static int ffn (int y,int x){
        System.out.println("Метод начал работу");
        int result = y / x;
        System.out.println("Метод закончил работу");
        return result;
    }




    }

