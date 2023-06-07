//"Вгадай число" без сканера

import java.util.Random;

public class GuessNumberHW8 {
    public static void main(String[] args) {
        int[] myNumbers = new int[]{3, 6, 8};
        Random random = new Random();
        int compNumber = random.nextInt(10);
        for(int i = 0; i < 3; i++){
            if (myNumbers[i] == compNumber) {
                System.out.println("Число " + myNumbers[i] + " вірне. Ви перемогли!");
                break;
            } else {
                System.out.println("Число " + myNumbers[i] + " невірне.");
                if (i == 2){
                    System.out.println("Ви програли. Комп'ютер загадав число " + compNumber);
                    break;
                }
            }
        }
    }
}