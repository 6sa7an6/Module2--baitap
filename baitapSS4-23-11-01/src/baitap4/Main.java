package baitap4;

import baitap4.Fan.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(2,false,5,"blue");
        System.out.println("Fan 1 : " + fan1.toString());
        System.out.println("Fan 2 : " + fan2.toString());
    }
}
