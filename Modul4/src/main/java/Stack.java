//package com.sda.java8;

public class Stack {
    private static final int MAX_SIZE = 10;
    private int[] stack = new int[MAX_SIZE];
    private int top = -1;

    void push(int val) {
        if(top == MAX_SIZE-1) {
            return;
        }
        top++;
        stack[top] = val;

    }

    int pop() {
        if (top < 0) {
            System.out.println("No more elements.");
        }
        int val = stack[top];
        top = top-1;
        return val;

        // return stack[top--];
    }
}

