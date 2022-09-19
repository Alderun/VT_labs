package Task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите х");
        int x = Integer.parseInt(scan.nextLine());
        System.out.println("Введите у");
        int y = Integer.parseInt(scan.nextLine());
        double result = ((1 + Math.sin(x + y) * Math.sin(x + y)) / (2 + Math.abs(x - (2 * x) / (1 + x * x * y * y)))) + x;
        System.out.println("Результат: " + result);
    }

}
