package org.example;

public class MixFor5 {
    public static void main (String [] args){
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++){ //1
            for (int inner = 4; inner > 1 ; inner--){ //3
                x= x+3;//3
                y= y-2;//28
                if (x == 6){
                    break;
                }
                x = x +3;//6
            }
            y = y-2;
        }
        System.out.println(x+" "+y);
    }
}
