package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int ARRAY_SIZE = 12;
    private static final int EMPTY  = -1;
    private static final int IF_EMPTY = -1;
    private static final int CAPACITY  = ARRAY_SIZE - 1;
    

    private int total = EMPTY ;
    private  final int[] numbers = new int[ARRAY_SIZE];


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY ;
    }

    public boolean isFull() {
        return total == CAPACITY ;
    }

    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }

}
