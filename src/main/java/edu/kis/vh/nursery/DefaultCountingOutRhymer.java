package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ARRAY_SIZE = 12;
    public static final int EMPTY_STACK_VALUE = -1;
    public static final int EMPTY_STACK_EXIT = -1;
    public static final int FULL_STACK_VALUE = ARRAY_SIZE - 1;

    private final int[] numbers = new int[ARRAY_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == FULL_STACK_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_EXIT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_EXIT;
        return numbers[total--];
    }

}
