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
        if (isEmpty() == false) {
            sp--;
            return stack[sp];
        } else {
            return POPERROR;
        }
    }

    public boolean push(int data) {
        if (isFull() == false) {
            stack[sp] = data;
            sp++;
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (sp == 0) {
        return true;
        } else {
        return false;
        }
    }

    public boolean isFull() {
        if (sp == stack.length) {
            return true;
        } else {
            return false;
        }
    }
}