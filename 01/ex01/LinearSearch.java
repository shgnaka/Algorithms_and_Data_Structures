import java.util.Scanner;
public class LinearSearch {
    
    static final int NUM = 6;
    static int a[]= {2005, 0412, 00, 1, 830,1102};
    int key;
    public static void main(String args[]) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("整数を入力してください: ");
            int key = sc.nextInt();
            if (key == -999999) {
                break;
            }
            search(key);
            System.out.println("index" + search(key));
        }
    }
    public static int search(int key) {
        for (int i = 0; i < NUM; i++) {
            if (a[i] == key) {
                return i;                 
            }
        }
        return -1;
    }
}