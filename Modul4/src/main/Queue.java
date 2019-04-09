public class Queue {
    private static final int MAX_SIZE = 10;
    private int[] queue = new int[MAX_SIZE];
    private int tail = -1;
    private int head = 0;


    void queue1(int val) {
        if (tail == MAX_SIZE - 1) {
            return;
        }
        tail++;
        queue[tail] = val;


    }

    int dequeue() {
        if (head > tail) {
            System.out.println();
        }
        int val = queue[head];
        head = head + 1;
        return val;
    }
}