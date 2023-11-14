package baitap1_SS12;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(7);
        queue.offer(5);
        queue.offer(1);
        queue.offer(3);
        queue.offer(9);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
