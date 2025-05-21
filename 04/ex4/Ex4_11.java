class Ex4_11 {
        // フィールド変数
    static int isEmptyCount = 0;
    static int isEmptyCorrectCount = 0;
    static int enqueueCount = 0;
    static int enqueueCorrectCount = 0;
    static int dequeueCount = 0;
    static int dequeueCorrectCount = 0;

    static public void resetCount(){
        isEmptyCount = 0;
        isEmptyCorrectCount = 0;
        enqueueCount = 0;
        enqueueCorrectCount = 0;
        dequeueCount = 0;
        dequeueCorrectCount = 0;
    }

        static public boolean test(String label, String result, String estimated) {
        System.out.print(label + ": result[" + result + "] estimated[" + estimated + "] ");
        if (result.equals(estimated)) { System.out.println("success."); return true;}
        else                     { System.out.println("failure."); return false;}

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

    static public void isEmptyTest(MyQueue q, boolean estimated) {
        isEmptyCount++;
        if (test("isEmpty", q.isEmpty(), estimated)) isEmptyCorrectCount++;
    }

        static public void enqueueTest(MyQueue q, String x, boolean estimated) {
        // Ex3 の pushTest() などを参考に
        enqueueCount++;
        if (test("enqueue", enqueueCount, enqueueCorrectCount)) {
            enqueueCorrectCount++;
        }
    }

    static public void denqueueTest(MyQueue q, String x) {
        // Ex3 の popTest() などを参考に
        dequeueCount++;
        if (test("dequeue", dequeueCount, dequeueCorrectCount)) {
            dequeueCorrectCount++;
        }
    }

    static public void printTestResult(String label, int count, int total) {
        System.out.print(label + ": " + count + "/" + total + " ");
        if (count == total) System.out.println("OK");
        else                System.out.println("NG");
    }

    static public void printAllTestResult() {
        printTestResult("isEmpty", isEmptyCorrectCount, isEmptyCount);
        printTestResult("enqueue", enqueueCorrectCount, enqueueCount);
        printTestResult("dequeue", dequeueCorrectCount, dequeueCount);
    }
    public static void main(String[] args) {
        // オリジナル MyQueue.java にあった，テスト用のメインルーチン
        MyQueue q = new MyQueue(5);

        isEmptyTest(q, true);

        enqueueTest(q, "a", true); // enqueue "a" => [a]
        enqueueTest(q, "b", true); // enqueue "b" => [a b]
        enqueueTest(q, "c", true); // enqueue "c" => [a b c]
        System.out.println(q);

        dequeueTest(q, "a"); // dequeue   => [b c]
        dequeueTest(q, "b"); // dequeue   => [c]
        System.out.println(q);

        enqueueTest(q, "d", true); // enqueue "d" => [c d]
        enqueueTest(q, "e", true); // enqueue "e" => [c d e]
        dequeueTest(q, "c"); // dequeue   => [d e]
        System.out.println(q);

        enqueueTest(q, "f", true); // enqueue "f"  => [d e f]
        dequeueTest(q, "d"); // dequeue    => [e f]
        dequeueTest(q, "e"); // dequeue    => [f]
        System.out.println(q);
        isEmptyTest(q, false);

        q.clear();      // => []
        System.out.println("待ち行列をクリアした");
        isEmptyTest(q, true);

        System.out.println(q);
        enqueueTest(q, "g", true); // enqueue "g" => [g]
        enqueueTest(q, "h", true); // enqueue "h"=> [g h]
        System.out.println(q);
        isEmptyTest(q, false); // => [g h]

        dequeueTest(q, "g"); // dequeue    => [h]
        dequeueTest(q, "h"); // dequeue    => []
        isEmptyTest(q, true);

        printAllTestResult();

        //q.enqueue("a");         System.out.println("aを入れた");
        //q.enqueue("b");         System.out.println("bを入れた");
        //q.enqueue("c");         System.out.println("cを入れた");
        //System.out.println(q);
        //System.out.println(q.dequeue() + "を取り出した");
        //System.out.println(q.dequeue() + "を取り出した");
        //System.out.println(q.dequeue() + "を取り出した");
        //System.out.println(q);
        //System.out.println(q.isEmpty());

        //MyQueue q2 = new MyQueue(5);

        //q2.enqueue("d");         System.out.println("dを入れた");
        //q2.enqueue("e");         System.out.println("eを入れた");
        //q2.enqueue("f");         System.out.println("fを入れた");
        //q2.enqueue("g");         System.out.println("gを入れた");
        //System.out.println(q2);
        //q2.enqueue("h");         System.out.println("hを入れた");
        //System.out.println(q2);
        //System.out.println(q.dequeue() + "を取り出した");
        //System.out.println(q);
        //q.enqueue("f");         System.out.println("fを入れた");
        //System.out.println(q.dequeue() + "を取り出した");
        //System.out.println(q.dequeue() + "を取り出した");
        //System.out.println(q);
        //q.clear();              System.out.println("待ち行列をクリアした");
        //System.out.println(q);
        //q.enqueue("g");         System.out.println("gを入れた");
        //q.enqueue("h");         System.out.println("hを入れた");
        //System.out.println(q);
    }
}
