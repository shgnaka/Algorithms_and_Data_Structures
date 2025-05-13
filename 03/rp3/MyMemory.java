class MyMemory {
    static final int CODESIZE = 30;
    static final int STACKSIZE = 30;

    private int codeSize;
    private int stackSize;

    private int[] stack;
    private int sp;
    private int pc;
 
    MyMemory() {
        this(CODESIZE, STACKSIZE);
    }
 
    MyMemory(int codeSize, int stackSize) {
        stack = new int[codeSize + stackSize];
        this.sp = codeSize;
        this.pc = 0;
        this.codeSize = codeSize;
        this.stackSize = stackSize;
    }
 
    public int pop() {
        sp--;
        return stack[sp];
    }
 
    public void push(int data) {
        stack[sp] = data;
        sp++;
    }

    public void regist(int data) {
        stack[pc] = data;
        pc++;
    }

    public int read() {
        int c = stack[pc];
        pc++;
        return c;
    }

    public void resetPC() {
        pc = 0;
    }

    public String toString(){
        String str = "";
        for(int i=0; i<pc; i++) {
            str = str + "[" + i + "]: " + stack[i] + "\n";
        }
        for(int i=codeSize; i<sp; i++) {
            str = str + "[" + i + "]: " + stack[i] + "\n";
        }
        return str;
    }
}