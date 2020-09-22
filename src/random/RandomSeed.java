package random;

import java.util.Random;

public class RandomSeed {

    public static void main(String[] args) {
        var r = new Random(10);


        for (var i=0;i <100;i++) {
            System.out.println(r.nextInt());
        }
    }

}

//-1193959466
//        -1139614796
//        837415749
//        -1220615319
//        -1429538713
//        118249332
//        -951589224
//        1301674577
//        -1638067850
//        -1279751870
