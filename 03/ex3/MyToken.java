class MyToken {
    static public final int OPERATOR = 1;
    static public final int DIGIT    = 2;
    private int type;
    private int  digit;
    private char operator;

    MyToken(String data){
        char c = ' ';

        if (data.length() > 0) {
            c = data.charAt(0);
        }

        if (c == '-' || c == '+' || c == '*' || c == '/'){
            type = OPERATOR;
            operator = c;
            digit = 0;
        } else {
            type = DIGIT;
            digit = Integer.parseInt(data);
            operator = ' ';
        }
    }

    public boolean isOperator() {
        if (type == OPERATOR) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDigit() {
        if (type == DIGIT) {
            return true;
        } else {
            return false;
        }
    }

    public char getOperator() {
        return operator;
    }

    public int getDigit() {
        return digit;
    }
}