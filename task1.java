// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)



import java.util.Scanner;
// public class task1{
//     public static void main (String[] args){
//     Scanner iScanner = new Scanner(System.in);
//     System.out.println("Введите число: ");
//     int n = iScanner.nextInt();
//     iScanner.close();  
//     int res = 0;
//     do{
//         res+=n;
//         n = n-1;
//     }while(n!=0);
//     System.out.printf("n-ое треугольного числa: %d",res);
//     }
// }

public class task1 {
    public static void main (String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int fact = 1;
        if (n==0){
            fact= 1;
        }else{
            do{
                fact*=n;
                n--;
            }while(n!=0);
        }
        System.out.printf("Факториал введенного числа - %d",fact);
    } 
}