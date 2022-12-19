package ru.homework.exeprion;

import java.util.Random;

public class GenerateArray {
    private Random random = new Random();
    private Integer[] simvol = {0,1,2,3,4,5,6,7,8,9,null};

    public  Integer[] randomArray(int size) {
        Integer[] result = new Integer[size];
        for (int i = 0; i < size; i++){
            result[i] = this.simvol[random.nextInt(simvol.length)];
        }
        return result;
    }
}
