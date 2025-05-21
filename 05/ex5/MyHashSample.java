class MyHashSample {
    int[] table; // 仮のハッシュテーブル

    MyHashSample(int size) {
        table = new int[size];
    }

    public int hash(String key) {
        int r = 0;
        for (int i = 0; i < key.length(); i++) {
            r += key.charAt(i);
        }
        // 文字列 key のいち文字ずつのアスキーコードの合計を r に保存
        return r % table.length; // (配列 table の長さを示すフィールド)
    }
}
