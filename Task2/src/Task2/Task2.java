package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите х");
        int x = Integer.parseInt(scan.nextLine());
        System.out.println("Введите у");
        int y = Integer.parseInt(scan.nextLine());
        boolean result = false;
        if(y > 0 && y <= 5){
            if(x >= -4 && x <= 4){
                result = true;
            }
        } else if(x >= -3){
            if(x >= -6 && x <= 6){
                result = true;
            }
        }
        System.out.println(result);
    }
}
