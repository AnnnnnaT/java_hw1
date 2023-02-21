// 3. Реализовать простой калькулятор
import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        double n1 = iScanner.nextDouble();
                   
        System.out.println("Input what to do /,*,+,-: ");
        String oper = iScanner.next();

        System.out.println("Input 2nd number: ");
        double n2 = iScanner.nextDouble();

        iScanner.close();
   
        switch (oper){
            case "+": 
                System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1+n2);
                break;
            case "/":
                if (n2==0) System.out.println("Can't divide by 0");
                else System.out.printf("%.2f / %.2f = %.2f",n1, n2, n1/n2);
                break;
            case "*": 
                System.out.printf("%.2f * %.2f = %.2f",n1, n2, n1*n2);
                break;
            case "-": 
                System.out.printf("%.2f - %.2f = %.2f",n1, n2, n1-n2);
                break;
        }
        System.out.println();
    }
}

