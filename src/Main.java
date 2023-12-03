import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Введите колличество чисел: ");
        count = scanner.nextInt();

        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(  10 - 1 + 1 ) + 1;
            System.out.print(String.format("Значение %d числа : ", i + 1, count));
            System.out.println(numbers[i]);
            }
        System.out.println(" ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print("Четные числа: ");
                System.out.println(numbers[i]);
            }
        }
        System.out.println(" ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                System.out.print("Нечетные числа: ");
                System.out.println(numbers[i]);
            }
        }
        }

    }
