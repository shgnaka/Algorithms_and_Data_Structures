import java.util.Arrays;

public class Ex2_13 {
    public static void test(MyLinkedList mll, int cr, int lastData, int[] count){
        MyLinkedData r;
        r = mll.delete(cr);
        r = mll.search(cr);
        if (r == null) {
            count[0]++;
            System.out.print("  delete success: " + cr);
        } else {
            System.out.print("  delete failure: " + cr);
        }
        r = mll.search(lastData);
        if (r != null) {
            count[1]++;
            System.out.println("  last data search success");
        } else {
            System.out.println("  last data search failure");
        }
    }

    public static void searchTest(MyLinkedData mll, int cr){
    }

    public static void test(MyLinkedList mll, int [] cr){
        int[] count = {0, 0}; // 1つ目：消したものが正しく検索できない数，2つ目：最後のデータが検索できた数
        int i;

        for (i=0; i<cr.length; i++){
            test(mll, cr[i], cr[cr.length-1], count);
        }
        System.out.print("          delete success: " + count[0] + "/" + cr.length);
        if (count[0] == cr.length) System.out.println(" OK");
        else                       System.out.println(" NG");
        System.out.print("last data search success: " + count[1] + "/" + (cr.length-1));
        if (count[1] == cr.length - 1) System.out.println(" OK");
        else                           System.out.println(" NG");
    }

    public static void testAll(int [] a){
        System.out.println("=====\ntest " + Arrays.toString(a));
        MyLinkedList list = new MyLinkedList();
        list.addAll(a);
        test(list, a);
    }

    public static void main(String args[]) {
        int i;

        int a[] = {0, 1, 8, 27, 64, 125, 216, 343, 512, 729, 1000};
        int b[] = {4096, 512, 16, 1};
        int c[] = {0, 1, 412, 830, 1102, 2005}; // ex1 step1.2 で使ったものをコピー

        testAll(a);
        testAll(b);
        testAll(c);
    }
}