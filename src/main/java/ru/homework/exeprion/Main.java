package ru.homework.exeprion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Exception.*;

public class Main {
    public static void main(String[] args) {
        CheckNull checkNull = new CheckNull();
        GenerateArray generateArray = new GenerateArray();
        Integer[] randomNumber = generateArray.randomArray(20);
        Integer[] number = {1,3,5,6,3,4,7,1,3,2,3,5,null,null};
        checkNull.checkArray(randomNumber);
    }

}