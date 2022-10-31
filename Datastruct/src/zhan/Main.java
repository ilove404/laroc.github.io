package zhan;

public class Main {
    public static void main(String[] args){
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("A");
        stack.push("b");
        stack.push("c");
        System.out.println(stack.pop());
        stack.push("d");
        stack.push("f");
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
