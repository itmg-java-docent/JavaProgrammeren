package random;

import java.util.Random;

public class RandomGetalTussen {


    public static void main(String[] args) {
        var r = new Random();
        for (var i=0;i <100;i++) {
            System.out.println(1+r.nextInt(10));
        }

    }
}
