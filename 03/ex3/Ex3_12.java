public class Ex3_12 {
    static int isEmptyCount = 0;
    static int isEmptyCorrectCount = 0;
    static int isFullCount = 0;
    static int isFullCorrectCount = 0;
    static int pushCount = 0;
    static int pushCorrectCount = 0;
    static int popCount = 0;
    static int popCorrectCount = 0;

    static public void resetCount(){
        isEmptyCount = 0;
        isEmptyCorrectCount = 0;
        isFullCount = 0;
        isFullCorrectCount = 0;
        pushCount = 0;
        pushCorrectCount = 0;
        popCount = 0;
        popCorrectCount = 0;
    }

    static public boolean test(String label, int result, int estimated) {
        System.out.print(label + ": result[" + result + "] estimated[" + estimated + "] ");
        if (result == estimated) { System.out.println("success."); return true;}
        else                     { System.out.println("failure."); return false;}

    }

    static public boolean test(String label, boolean result, boolean estimated) {
        System.out.print(label + ": result[" + result + "] estimated[" + estimated + "] ");
        if (result == estimated) { System.out.println("success."); return true;}
        else                     { System.out.println("failure."); return false;}

    }

    static public void isEmptyTest(MyStack ms, boolean estimated) {
        isEmptyCount++;
        if (test("isEmpty", ms.isEmpty(), estimated)) isEmptyCorrectCount++;
    }

    static public void isFullTest(MyStack ms, boolean estimated) {
        isFullCount++;
        if (test(" isFull", ms.isFull(), estimated)) isFullCorrectCount++;
    }

    static public void pushTest(MyStack ms, int data, boolean estimated) {
        pushCount++;
        if (test("   push("+data+")" , ms.push(data), estimated)) pushCorrectCount++;
    }

    static public void popTest(MyStack ms, int estimated) {
        popCount++;
        if (test("    pop", ms.pop(), estimated)) popCorrectCount++;
    }

    static public void printTestResult(String label, int count, int total) {
        System.out.print(label + ": " + count + "/" + total + " ");
        if (count == total) System.out.println("OK");
        else                System.out.println("NG");
    }

    static public void printAllTestResult() {
        printTestResult(" isFull", isFullCorrectCount , isFullCount);
        printTestResult("isEmpty", isEmptyCorrectCount, isEmptyCount);
        printTestResult("   push", pushCorrectCount   , pushCount);
        printTestResult("    pop", popCorrectCount    , popCount);
    }

    static public void main(String args[]) {
        MyStack ms;

        //case 1
        int array[] = {1, 2, 3, 4, 5};
        ms = new MyStack(5);
        for(int i=0;i<5;i++){
            pushTest(ms, array[i], true);
        }
        for(int i=4;i>=0;i--){
            popTest(ms, array[i]);
        }
        printAllTestResult();

        //case 2
        resetCount();
        ms = new MyStack(5);
        int array2[] = {1, 2, 3, 4, 5};
        for(int i = 0; i < 5; i++) {
            pushTest(ms, array2[i], true);
        }
        pushTest(ms, 6, false);
        printAllTestResult();

        //case 3
        resetCount();
        ms = new MyStack(10);
        int array3[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < 10; i++) {
            pushTest(ms, array3[i], true);
        }
        for(int i = 9; i >= -1; i--) {
            if (i >= 0) {
                popTest(ms, array3[i]);
            } else {
                popTest(ms, MyStack.POPERROR);
            }
        }
        printAllTestResult();

        //case 4
        resetCount();
        ms = new MyStack(100);
        int array4[] = new int[100];
        for(int i = 0; i < 100; i++) {
            array4[i] = i;
        }
        for(int i = 0; i < 100; i++) {
            pushTest(ms, array4[i], true);
        }
        isFullTest(ms, true);
        for(int i = 99; i >= 0; i--) {
            popTest(ms, array4[i]);
        }
        isEmptyTest(ms, true);
        printAllTestResult();
    }
}