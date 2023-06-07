//"Вгадай число" зі сканером

import java.util.Random;
import java.util.Scanner;

public class GuessNumberScannerHW8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println("Ваша задача - відгадати число, що загадав комп'ютер.");
        for (int i = 0; i < 3; i++){
            System.out.println("Спроба № "+ (i+1));
            System.out.println("Введіть число");
            int myNumber = scn.nextInt();
            if(myNumber==number){
                System.out.println("Ви вгадали число");
                break;
            } else {
                System.out.println("Число не вірне");
                if (i==2){
                    System.out.println("Ви програли. Правильне число = " + number);
                }
            }
        }
    }
}