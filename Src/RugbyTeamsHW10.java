import java.util.Arrays;
import java.util.Random;

public class RugbyTeamsHW10 {

    public static final int NUMBER_OF_PLAYERS = 25;
    public static void main(String[] args) {
        int[] teamA = playersAge();
        int[] teamB = playersAge();
        System.out.println("Вік гравців команди А " + Arrays.toString(teamA));
        System.out.println("Вік гравців команди B " + Arrays.toString(teamB));
        System.out.println("Середній вік гравців команди А " + Math.round(average(teamA)) + " років");
        System.out.println("Середній вік гравців команди В " + Math.round(average(teamB)) + " років");
    }

    public static int[] playersAge (){
        int[] age = new int[NUMBER_OF_PLAYERS];
        Random random = new Random();
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            int r = random.nextInt(22)+18;
            age[i] = r;
        }
        return age;
    }

    public static double average (int[] age){
        int sum = 0;
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            sum += age[i];
        }
        double  avg = sum/((double)NUMBER_OF_PLAYERS);
        return avg;
    }


}
