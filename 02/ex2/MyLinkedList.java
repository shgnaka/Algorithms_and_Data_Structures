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
        if (data == head.getData()) {
            return head;
        } else if (head.next != null) {
            p = head.next;
            while (p != null) {
                if (p.getData() == data) {
                    return p;
                } else {
                    p = p.next;
                }
            }
        }
        return null;
    }

    public MyLinkedData delete (int data) {
        MyLinkedData p;
        MyLinkedData s = search(data);
        if (s == null) {
            return null;
        } else {
            if (s == head) {
                head = head.next;
                return s;
            } else {
                p = head;
                while (p != null) {
                    if (p.next == s) {
                        p.next = s.next;
                        return s;
                    } else {
                        p = p.next;
                    }
                }
            }
        }
        return null;
    }
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