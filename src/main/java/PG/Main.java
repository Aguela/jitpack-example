package PG;

import com.soundicly.jnanoidenhanced.jnanoid.NanoIdUtils;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        String hash = NanoIdUtils.randomNanoId();
        System.out.println("hash = " + hash);

        String hash2 = NanoIdUtils.randomNanoId(5);
        System.out.println("hash2 = " + hash2);

        char[] alfabeto = {'a','b','c','d','e','f','g','h'};

        String hash3 = NanoIdUtils.randomNanoId(alfabeto,10);
        System.out.println("hash3 = " + hash3);

        Random random = new Random();
        String hash4 = NanoIdUtils.randomNanoId(random,alfabeto,6);
        System.out.println("hash4 = " + hash4);

    }
}
