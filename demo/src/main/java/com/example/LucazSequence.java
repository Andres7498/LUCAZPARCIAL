package com.example;

public class LucazSequence {

    public String calculateSequence(int value){
        String result = "";
        result += value+"->";
        while (value >= 2) {
            if (value  == 0) {
                value = 2;
            }else if (value == 1) {
                value = 1;
            } else  {
              value = (value-1) + (value - 2); 
            } 
        }

        return result;
    }
}
