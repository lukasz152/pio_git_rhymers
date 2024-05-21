package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static int ARRAY_SIZE = 12;
    public static int STARTING_INDEX = -1;
    public static int LAST_INDEX = 11;
    public int total = STARTING_INDEX;
    private int[] numbers = new int[ARRAY_SIZE];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STARTING_INDEX;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
