//Вывести все простые числа от 1 до 1000
public class Main {

    public static void main(String[] args) {
        System.out.println("1");
        for (int i = 2; i <= 1000; i++) {
            boolean n = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    n = false;
                    break;
                }
            }
            if (n) {
                System.out.println(i);
            }
        }
    }
}
