public class MyLinkedList {
    private MyLinkedData head;
    private MyLinkedData tail;

    MyLinkedList() {
        head = new MyLinkedData(-99999999);
        tail = head;
    }

    public void addAll(int[] list) {
        int i;
        for (i = 0; i < list.length; i++) {
            add(list[i]);
        }
    }

    public void add(int data) {
        MyLinkedData newData = new MyLinkedData(data);
        tail.next = newData;
        tail = newData;
    }

    public MyLinkedData search(int data) {
        MyLinkedData p;
        return null;
    }//TODO:searchメソッドが未完成のため，実装する．

    public String toString() {
        if (head.next == null) {
            return "head: null";
        } else {
            String str = "";
            MyLinkedData p = head.next;
            while(p != null) {
                str = str + p +"\n";
                p = p.next;
            }
            return str;
        }
    }
}