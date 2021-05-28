package service;

import java.util.Random;

public class SpinService {

    public static int spin (){
        return new Random().nextInt(6) + 1;
    }
}
