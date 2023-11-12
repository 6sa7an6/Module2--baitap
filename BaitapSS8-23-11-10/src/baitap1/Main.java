package baitap1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(10);
        for(int i = 0 ; i < 10 ; i ++){
            int numb = (int) (Math.random()*100);
            arrayList.add(numb);
        }
        System.out.println("List ngẫu nhiên 10 phần tử là : " + arrayList);
        System.out.println(Collections.max(arrayList));
    }
}
