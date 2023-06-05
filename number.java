/*2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
Пример ввода:
1 2 1 2 -1 1 3 1 3 -1 0
Логика расчета:
2 -1 переход -> 2 в сумму
3 -1 переход -> 3 в сумму
Пример вывода: 5*/



import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, num;
        do {
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println(sum);
        scanner.close();
    }
}
