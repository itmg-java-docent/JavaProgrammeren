package random;

import java.util.Random;

public class RandomTest {


    public static void main(String[] args) {
        System.out.println("test random");
        var r = new Random();
        var g = 1001;
        var count = 0;
        while (g > 1000 | g < -1000) {
            count++;
            g = r.nextInt();
            if( (g <1000) & (g>-1000)) {
                System.out.println(g);
                System.out.println("tries: " + count);
            }
        }
    }

}
