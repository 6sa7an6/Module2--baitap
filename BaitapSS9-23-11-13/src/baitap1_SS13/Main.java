package baitap1_SS13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(7,6,5,8,2,5,3,5,7,8,9);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < array.size();i++){
            if(!map.containsKey(array.get(i))){
                map.put(array.get(i),1);
            }else{
                map.put(array.get(i),map.get(array.get(i))+1);
            }
        }
        for (Map.Entry<Integer,Integer> en:map.entrySet()
             ) {
            System.out.println("Phần tử " + en.getKey() + " xuất hiện " + en.getValue() + " lần");
        }
    }
}
