package pages;

import java.util.ArrayList;
import java.util.Arrays;

public class kejws {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(20);
        list.add(3);
        list.add(3);

        for (int i = 0; i < list.size()-2; i+=2) {

            if(list.get(i) > (list.get(i+1))){
                list.remove(i);
                list.remove(i);
                i--;
                i--;
            }
        }
        System.out.println(list);
    }
}
