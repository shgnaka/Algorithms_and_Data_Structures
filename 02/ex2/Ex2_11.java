import java.util.Arrays;
 
public class Ex2_11 {
    public static void main(String args[]) {
        int i;
        int a[] = {0, 1, 4, 9, 16, 25};
        MyLinkedList list = new MyLinkedList();
        System.out.println(Arrays.toString(a)); // (1)
        list.addAll(a);
        System.out.println(list);               // (2)
    }
}