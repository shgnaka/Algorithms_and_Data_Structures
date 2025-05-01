public class Ex3_21 {
    public static void main(String[] args) {
        MyStack stack = new MyStack(100);

        String c = "1 2 + 3 4 - *";

        MyTokenList tokenList = new MyTokenList(c);

    for(int i = 0; i < tokenList.size(); i++) {
        MyToken t = tokenList.get(i);
        if (t.isOperator()) {
            int num1 = stack.pop();
            int num0 = stack.pop();
            if (t.getOperator() == '+') {
                stack.push(num0 + num1);
            } else if (t.getOperator() == '-') {
                stack.push(num0 - num1);
            } else if (t.getOperator() == '*') {
                stack.push(num0 * num1);
            } else if (t.getOperator() == '/') {
                stack.push(num0 / num1);
            } else if (t.getOperator() == '%') {
                stack.push(num0 % num1);
            }
            //t の演算子に応じて演算をし，結果を push() する
        } else if (t.isDigit()) {
            stack.push(t.getDigit());
        }
    }

    System.out.println("result: " + stack.pop());
    }
}
