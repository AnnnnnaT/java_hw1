// 2. Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        boolean flag = true;
        for (int num = 1; num < 1001; num++) {
          for (int div = 2; div < num; div++) {
            if (num % div == 0) {
                flag = false;
                break;
            }
          }
            if (flag == true) System.out.print(num + " ");
            else flag = true;
        }
    }
}