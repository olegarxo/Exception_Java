package ru.homework.exeprion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

public class CheckNull {
    private Logger logger = Logger.getLogger(CheckNull.class.getName());
    private List<Integer> nullList = new ArrayList<>();
    public void checkArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                nullList.add(i); //Можно +1
            }
        }
        if(nullList.size() == 0){
            logger.info("No Null in ,array");
        }else {
            logger.info("Null in " + nullList.toString().replace("[", "")
                    .replace("]", "")+ " index");
        }
    }
}
