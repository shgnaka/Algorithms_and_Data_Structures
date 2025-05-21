public class Ex5_0 {
    public static void hashTest(MyHashSample mh, String key, int expected) {
        int h = mh.hash(key);
        System.out.print("hash(" + key + ") = " + h + " (expected: " + expected + ") ");
        if (h == expected) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }

    public static void test01() {
        MyHashSample hash = new MyHashSample(100);
        hashTest(hash, "junior", SumAsciiCode.returnAscii("junior") % 100); // **** には hash("junior") の予測値を記入
        hashTest(hash, "your", SumAsciiCode.returnAscii("your") % 100); // **** には hash("your") の予測値を記入 );
    }

    public static void main(String[] argv){
        test01();
    }
}
