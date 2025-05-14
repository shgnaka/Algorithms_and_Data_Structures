class Ex4_11 {
    public static void main(String[] args) {
        // オリジナル MyQueue.java にあった，テスト用のメインルーチン
        MyQueue q = new MyQueue(5);

        q.enqueue("a");         System.out.println("aを入れた");
        q.enqueue("b");         System.out.println("bを入れた");
        q.enqueue("c");         System.out.println("cを入れた");
        System.out.println(q);
        System.out.println(q.dequeue() + "を取り出した");
        System.out.println(q.dequeue() + "を取り出した");
        System.out.println(q.dequeue() + "を取り出した");
        System.out.println(q);
        System.out.println(q.isEmpty());

        MyQueue q2 = new MyQueue(5);

        q2.enqueue("d");         System.out.println("dを入れた");
        q2.enqueue("e");         System.out.println("eを入れた");
        q2.enqueue("f");         System.out.println("fを入れた");
        q2.enqueue("g");         System.out.println("gを入れた");
        System.out.println(q2);
        q2.enqueue("h");         System.out.println("hを入れた");
        System.out.println(q2);
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