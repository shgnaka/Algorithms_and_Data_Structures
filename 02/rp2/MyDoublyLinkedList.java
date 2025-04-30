public class MyDoublyLinkedList {
    private MyDoublyLinkedData head;
    private MyDoublyLinkedData tail;
    //private MyLinkedData prevCurrent;
    private MyDoublyLinkedData current;
    private int compareCount;

    MyDoublyLinkedList() {
        head = new MyDoublyLinkedData("*header*", "");
        tail = head;
        current = head;
        tail.next = null;
        tail.prev = null;
    }

    public MyDoublyLinkedData getCurrent() {
        return current;
    }

    public void setCurrent(String str) {
        if ("head".equals(str)) {
            current = head;
        } else if ("tail".equals(str)) {
            current = tail;
        }
    }

    public boolean moveNext() {
        if (current.next != null) {
            //prevCurrent = current;
            current = current.next;
            return true;
        } else {
            return false;
        }
    }

    public boolean movePrev() {
        if (current.prev != null) {
            current = current.prev;
            return true;
        } else {
            return false;
        }
    }

    public void resetCompareCount() {
        compareCount = 0;
    }

    public void setCompareCount(int count) {
        compareCount = count;
    }

    public int getCompareCount() {
        return compareCount;
    }

    // current の後ろに新規データを挿入
    public void insert(String key, String data) {
        MyDoublyLinkedData newData = new MyDoublyLinkedData(key, data);
        current.next.prev = newData;
        newData.next = current.next;
        newData.prev = current;
        current.next = newData;
        //prevCurrent = current;
        current = newData;
    }

    // 連結リストの末尾に新規データを挿入
    public void insertLast(String key, String data) {
        MyDoublyLinkedData newData = new MyDoublyLinkedData(key, data);
        newData.next = null;
        newData.prev = tail;
        tail.next = newData;
        //prevCurrent = tail;

        tail = newData;
        current = newData;
    }

    public MyDoublyLinkedData searchByKey(String key) {
        MyDoublyLinkedData p = head;
        while (p != null) {
            if (strcmp(key, p.getKey()) == 0) {
                current = p;
                return p;
            }
            //prevCurrent = p;
            p = p.next;
        }
        //prevCurrent = null;
        current = head;
        return null;
    }

    public MyDoublyLinkedData searchByData(String data) {
        MyDoublyLinkedData p = head;
        while (p != null) {
            if (strcmp(data, p.getData()) == 0) {
                current = p;
                return p;
            }
            //prevCurrent = p;
            p = p.next;
        }
        //prevCurrent = null;
        current = head;
        return null;
    }

    public MyDoublyLinkedData delete() {
        if (current != null) {
            if (current.getKey().equals("*header*")) {
                return null;
            }
            //MyLinkedData prevData = prevCurrent;
            MyDoublyLinkedData prevData = current.prev;
            prevData.next = current.next;
            if (current.next != null) {
                current.next.prev = prevData;
            }
            MyDoublyLinkedData oldCurrent = current;
            current = current.next;
            if (current == null) {
                tail = oldCurrent.prev;
                //prevCurrent = null;
                current = head;
            }
            return oldCurrent;
        } else {
            return null;
        }
    }

    public void printData() {
        MyDoublyLinkedData p = head;
        while (p != null) {
            if (p == current){
                System.out.print("*cur* ");
            }else{
                System.out.print("      ");
            }
            System.out.println(p.toStringSimple());
            p = p.next;
        }
    }

    public int strcmp(String key1, String key2) {
        compareCount++;
        return key1.compareTo(key2);
    }
}
