import java.util.Arrays;

public class ShuttleNumerationHW9 {
    public static void main(String[] args) {
        int[] numeration = new int[3];
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (a==4) a++;
                if(a>8) {
                    a=0;
                    break;
                }
                numeration[0] = a;
                a++;
                for (int k = 0; k < 10; k++) {
                    if (b==4) b++;
                    if (b>8) {
                        b=0;
                        break;
                    }
                    numeration[1] = b;
                    b++;
                    for (int l = 0; l < 10; l++) {
                        if (c==4) c++;
                        if (c>8) {
                            c=0;
                            break;
                        }
                        numeration[2] = c;
                        c++;
                        System.out.println("Шатл № " + numeration[0]+numeration[1]+numeration[2]);
                        count++;
                        if (count == 100) break;
                    }
                    if (count == 100) break;
                }
                if (count == 100) break;
            }
            if (count == 100) break;
        }
    }
}
