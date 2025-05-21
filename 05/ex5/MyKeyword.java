class MyKeyword{
    private String key;
    private String data;

    MyKeyword(String key, String data){
        this.key  = key;
        this.data = data;
    }

    //getter your code

    //setter your code
    
    public String toString(){
        String str = key + " : ";
        if (data.length()>28){
            str = str + data.substring(0, 27) + "..";
        }else {
            str = str + data;
        }
        return str;
    }

    public String toStringAll(){
        return key + " : " + data;
    }
}
