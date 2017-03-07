package Citizen;

import static Citizen.CitizenFactory.*;

/**
 * Created by Guillaume Gingembre on 07/03/2017.
 */
public class CitizenMain {

    public static void main(String[] args) {

        Citizen charles = Englishman();
        Citizen guillaume = French();
        Citizen taro = Japanese();
        Citizen lena = Russian();

        charles.sayHello();
        guillaume.sayHello();
        taro.sayHello();
        lena.sayHello();
    }
}
