import java.util.Arrays;

public class Ex2_12 {
    public static boolean test(MyLinkedList mll, int cr) { // 要素単体テスト
        MyLinkedData r;
        r = mll.search(cr);
        if (r != null && r.getData() == cr) {
            System.err.println("  search success: " + cr);
            return true;
        } else {
            System.err.println("  search failure: " + cr);
            return false;
        }
    }

    public static boolean test(MyLinkedList mll, int[] cr) { // 全データテスト
        int count=0;
        int i;
        for (i=0; i<cr.length; i++){
            if (test(mll, cr[i])) count++;
        }
        System.out.println("success: " + count + "/" + cr.length);
        if (count == cr.length) return true;
        else                    return false;
    }

    public static void testAll(int [] cr) {
        System.out.println("=====\ntest " + Arrays.toString(cr));
        MyLinkedList list = new MyLinkedList();
        list.addAll(cr);
        if (test(list, cr)) System.out.println("OK");
        else                System.out.println("NG");
    }

    public static void main(String args[]) {
        int i;

        int a[] = {0, 1, 8, 27, 64, 125, 216, 343, 512, 729, 1000};
        int b[] = {4096, 512, 16, 1};
        int c[] = {0, 1, 412, 830, 1102, 2005};// ex1 step1.2 で使ったものをコピー

        testAll(a);
        testAll(b);
        testAll(c);
    }
}