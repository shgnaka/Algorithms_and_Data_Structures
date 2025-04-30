class MyStack {
    static final int STACKSIZE = 30;
    static final int POPERROR = -2147483648;

    private int sp = 0;
    private int[] stack;

    MyStack() {
        this(STACKSIZE);
    }

    MyStack(int size) {
        stack = new int[size];
    }

    public int pop() {
        return POPERROR;
    }

    public boolean push(int data) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }
}