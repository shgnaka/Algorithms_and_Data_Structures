public class Ex3_21 {

    MyStack stack = new MyStack(100);

    String c = "1 2 + 3 4 - *";

    MyTokenList tokenList = new MyTokenList(c);

    for(int i = 0; i < tokenList.size(); i++) {
        MyToken t = tokenList.get(i);
        if (t.isOperator()) {
            int num2 = stack.pop();
            int num1 = stack.pop();
            t の演算子に応じて演算をし，結果を push() する
        } else if (t.isDigit()) {
            t の数値を push() する
        }
    }

    System.out.println("result: " + stack.pop());

    public static void main(String[] args) {
        Ex3_21 ex = new Ex3_21();
    }
}
