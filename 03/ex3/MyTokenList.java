class MyTokenList {
    private int size;
    private MyToken[] tokenList;

    MyTokenList(String data){
        String list[] = data.split(" ");
        size = list.length;
        tokenList = new MyToken[size];
        for (int i = 0; i < size; i++){
            tokenList[i] = new MyToken(list[i]);
        }
    }

    public int size() {
        return size;
    }

    public MyToken get(int i) {
        if (0 <= i && i <= size-1) {
            return tokenList[i];
        } else {
            return null;
        }
    }
}