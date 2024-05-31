import java.util.Stack;

public class SymbolBalancing {
    public static void main(String[] args) {

        System.out.println(balanceCheck("(A*C) + ({V-M})"));

    }

    public static boolean balanceCheck(String expr){

        MyStack<Character> myStack = new MyStack<>();

        for (int i = 0; i < expr.length(); i++) {

            Character ch  = expr.charAt(i);

            // filter non player chars
            if (ch != '(' && ch!= '[' && ch!='{' && ch!=')' && ch!=']' && ch !='}' ){
                continue;
            }
            if (ch == '(' || ch== '[' || ch=='{'){
                myStack.push(ch);

            }

            if (myStack.isEmpty()){return  false;}

            switch (ch){
                case ')':
                    if (myStack.pop() != '(' ) return  false;
                    break;
                case ']':
                    if (myStack.pop() != '[' ) return false;
                    break;
                case '}':
                    if (myStack.pop() != '{') return false;
                    break;
            }

        }

        return myStack.isEmpty();


    }

}
// question , page = 30

// 1-  create a stack
// 2- While (end of input is not reached);
    // a- if the character is not a symbol to be balanced (,) - [,] - { - }, ignore it
    // b- if the character is an opening symbol like ( , [ , {, push into the stack
    // c- if its a closing symbol like )- ] -} , and if the stack is empty return false
    // d- if the symbol popped != corresponding opening and closing symbol, return false
// 3- At the end of the input , if the stack is not empty report an error