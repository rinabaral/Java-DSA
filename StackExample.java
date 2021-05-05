import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        //to check whether the stack is empty
        System.out.println("Is stack empty?? "+stack.isEmpty());
        //pushing elements to top of the stack
        stack.push(20);
        stack.push(25);
        stack.push(30);

        System.out.println(stack);

        //popping element from the top of the stack
        stack.pop();

        System.out.println("After popping: " + stack);

        // peeking at the top of the stack
        System.out.println("The element in the top of stack is: "+stack.peek());

        //searching for the element in the stack
        System.out.println("The element is at position " + stack.search(30));
        System.out.println("Is stack empty? " + stack.isEmpty());
;    }
}
