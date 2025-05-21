class MyHashC {
    Entry[] table;
    int elements;

    MyHashC(int size){
        table = new Entry[size];
        for(int i = 0;i < size; i++){
            table[i] = null;
        }
        elements = 0;
    }

    public int hash(String key) {
    int r = 0;
    for (int i = 0; i < key.length(); i++) {
        r += key.charAt(i);
    }
    // 文字列 key のいち文字ずつのアスキーコードの合計を r に保存
    return r % table.length; // (配列 table の長さを示すフィールド)
    }
    private static class Entry{
        MyKeyword keyword;
        Entry next;
        Entry prev;
        Entry(MyKeyword keyword){
            this.keyword = keyword;
        }
    }

    public void insert(MyKeyword k){
        Entry newEntry = new Entry(k);
        int h = hash(k.getKey());
        if (table[h] == null) {
            table[h] = newEntry;
        } else {
            newEntry.next = table[h];
            table[h] = newEntry;
        }
        //elements++;
        return;
    }

    public MyKeyword search(String key){
        int h = hash(key);
        Entry p = table[h];
        while (p != null) {
            if (p.keyword.getKey().equals(key)) {
                return p.keyword;
            }
            p = p.next;
        }
        return null;
    }

    public MyKeyword delete(String key){
        int h = hash(key);
        Entry p = table[h];
        Entry q = p.prev;
        while (p != null) {
            if (p.keyword.getKey().equals(key)) {
            if (q == null) {
                table[h] = p.next;
                return p.keyword;
            } else {
                q.next = p.next;
                return p.keyword;
            }
            }
        p = p.next;
        q = p;
        }
        return null;        
    }

    public String toString(){
        String str = "";
        boolean pef=false;
        boolean  ef=false;

        str = "table[0] -- [" + (table.length - 1) + "]\n";
        str = str + "=============================\n";
        for(int i = 0;i < table.length; i++){
            if (table[i] == null) {
                ef = true;
                if (pef == false){
                    str = str + "   :   \n";
                }
            }else{
                ef = false;
                str = str + "table[" + i + "]";
                Entry t = table[i];
                while(t != null){
                    str = str + "->(" + t.keyword + ") ";
                    t = t.next;
                }
                str = str + "\n";
            }
            pef = ef;
        }
        str = str + "=============================\n";
        return str;
    }
}
