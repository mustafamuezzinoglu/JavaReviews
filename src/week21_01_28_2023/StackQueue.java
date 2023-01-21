package week21_01_28_2023;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

    public static void main(String[] args) {

        List<String> stack = new Stack<>();
        ((Stack) stack).push("First");
        ((Stack) stack).push("Second");
        ((Stack) stack).push("Last");

        System.out.println("((Stack) stack) .peek() = " + ((Stack) stack).peek()); //it gives last because stack is LIFO

        Queue<String> queue = new PriorityQueue<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Last");

        System.out.println("queue.poll() = " + queue.poll()); //it gives first because queue is FIFO

        List<String> stack1 = new Stack<>();
        stack1.add("Samsung");
        stack1.add("Apple");
        stack1.add("Samsung");
        stack1.add("Apple");
















    }
}
