public class MyLinkedData {
    static private int NODEID = 0;
    private int id;
    private int data;
    MyLinkedData next;

    MyLinkedData(int data){
        this.id = NODEID;
        this.data = data;
        this.next = null;
        NODEID++;
    }

    public int getData(){
        return this.data;
    }

    public int getId(){
        return this.id;
    }

    public void setData(int data){
        this.data = data;
    }

    public String toString(){
        if (this.next == null) {
            return "[" + this.id + "]" + this.data + " -> null";
        } else {
            return "[" + this.id + "]" + this.data + " -> [" + this.next.getId() + "]";
        }
    }
}