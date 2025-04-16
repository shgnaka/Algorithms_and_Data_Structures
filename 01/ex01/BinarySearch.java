import java.util.Scanner;
public class BinarySearch {
    final static int NUM = 6;
    static int a[] = {2005, 0412, 00, 1, 830, 1102};
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (true) {
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
    int low = 0;
    int high = NUM - 1;
    while (low <= high) {
        int middle = (low + high) / 2;
        if (a[middle] < key) {
            low = middle + 1;
        } else if (a[middle] > key) {
            high = middle - 1;
        } else {
            return middle;
        }
    }
    return -1;
}
}