import java.util.Scanner;
public class LinearSearch {
    
    static final int NUM = 11;
    static int a[]= {0, 1, 8, 27, 64, 125, 216, 343, 512, 729, 1000};
    int key;
    public static void main() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("整数を入力してください: ");
            int key = sc.nextInt();
            search(key);
            System.out.println("index" + search(key));
            if (key == -999999) {
                break;
            }
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