package baitap4;

import baitap4.Fan.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(2,false,5,"blue");
        Fan fan3 = new Fan(1,true,4,"red");
        fan1.displayFan();
        fan2.displayFan();
        fan3.displayFan();
    }
}
